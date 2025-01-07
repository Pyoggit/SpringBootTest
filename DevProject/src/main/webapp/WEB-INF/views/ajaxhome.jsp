<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
<script type="text/javascript">
$(document).ready(function () {
	//putbtn을 클릭하면 함수 작동. (서버에 데이터를 전송(ajax방식)하고, 전송성공유무를 리턴받아 출력.)
    $("#putBtn").on("click", function () {
    	//사용자가 입력한 데이터를 읽어와서 객체를 만들것
		//let boardNo = $("#boardNo").Val; 한번에 가져오는 방법
        let boardNo = $("#boardNo");
        let title = $("#title");
        let content = $("#content");
        let writer = $("#writer");

      	//객체에서 값을 가져온다.
        let boardNoVal = boardNo.val();
        let titleVal = title.val();
        let contentVal = content.val();
        let writerVal = writer.val();

      	//전송할 객체를만든다.
        let boardObject = {
            boardno: boardNoVal, 
            title: titleVal, 
            content: contentVal, 
            writer: writerVal
        };

      	//비동기방식으로 서버에 전송 (4가지 정보)
        $.ajax({
            type: "put",
            url: "/board/" + boardNoVal,
            data: JSON.stringify(boardObject),
            contentType: "application/json; charset=utf-8",
            success: function (result) {
                alert("result = " + result);
                console.log("result = " + result);
            }
        });
    });
});
</script>

<body onLoad="함수">
	<h2>ajaxhome page</h2>
	<form>
		boardNo: <input type="text" name="boardNo" value="" id="boardNo"><br>
		title: <input type="text" name="title" value="" id="title"><br>
		content: <input type="text" name="content" value="" id="content"><br>
		writer: <input type="text" name="writer" value="" id="writer"><br>
	</form>
	<div>
		<button id="putBtn">수정(put)</button>
	</div>

</body>
</html>