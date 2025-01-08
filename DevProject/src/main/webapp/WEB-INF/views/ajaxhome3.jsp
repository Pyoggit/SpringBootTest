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
    $("#getBtn").on("click", function () {
    	//사용자가 입력한 데이터를 읽어와서 객체를 만들것
		//let boardNo = $("#boardNo").Val; 한번에 가져오는 방법
        let boardNo = $("#boardNo");       
      	//객체에서 값을 가져온다.
        let boardNoVal = boardNo.val();
      	//비동기방식으로 서버에 전송 (4가지 정보)
        $.get("/board/" + boardNoVal, function (result) {
                console.log("result = " + result);
                const obj = JSON.stringify(result);
                console.log("result.obj = " + obj);
                alert("result = " + obj);
            }
        );
    });
});
</script>

<body onLoad="함수">
	<h2>ajaxhome3 page</h2>
	<form>
		boardNo: <input type="text" name="boardNo" value="" id="boardNo"><br>
		title: <input type="text" name="title" value="" id="title"><br>
		content: <input type="text" name="content" value="" id="content"><br>
		writer: <input type="text" name="writer" value="" id="writer"><br>
	</form>
	<div>
		<button id="getBtn">객체요청(getType)</button>
	</div>

</body>
</html>