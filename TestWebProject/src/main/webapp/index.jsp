<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="/js/common.js"></script>
<script type="text/javascript" src="/js/jquery-2.1.1.min.js"></script>
<style>
@font-face {
    font-family: pen;
    src: url('/font/NanumPen.otf');
}

#testBtn1 {width: 10rem; height: 5rem; font-size: 2rem;}
</style>
<script>
$(document).ready(function() {
	$("#testBtn1").click(function() {	
		var arr = [];
		arr.push("ace");
		arr.push("bic");
		arr.push("cce");
		
		arr.map(function(item, idx, not) {
			if(item == "ace") {
				return item;
			}
		});
		
		console.log(arr);
	});
});




</script>
</head>
<body>
	<div class="contents-wrap">
		<div>
			<button id="testBtn1" type="button">테스트1</button>
		</div>
	</div>
</body>
</html>