let useReadObject = {
	init: function() {
		let _this = this;
		let formObj = $("#member");
		console.log(formObj);
		$("#btnEdit").on("click", function() {
			let userNo = $("#userNo");
			let userNoVal = userNo.val();
			self.location = "/user/modify?userNo=" + userNoVal;
		});
		$("#btnRemove").on("click", function() {
			formObj.attr("action", "remove");
			formObj.submit();
		});
		$("#btnList").on("click", function() {
			self.location = "list";
		});

		//서버에 AJAX로 보내서 리턴값을 받는 경우
		$("#btnAjax").on("click", function() {
			_this.listReply();
		});

	},

	listReply: function() {
		alert('내용 리스트 요청'+ userNo);
		/*let userNo = $("#userNo").val();
		$.ajax({
			type: "GET",
			url: "/user/member/" + userNo
		}).done(function(response) {
			let message = response["dataList"];
			alert(message);
			location = "/user";
		}).fail(function(error) {
			alert("error 발생" + error)
			location = "/home";
		});*/
	}
};

useReadObject.init();