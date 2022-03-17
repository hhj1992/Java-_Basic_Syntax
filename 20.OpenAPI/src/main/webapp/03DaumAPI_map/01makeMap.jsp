<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ page pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="EUC-KR">
	
	<!-- CDN(Content Delivery Network) ȣ��Ʈ ��� -->
	<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=34f1cc149d300066b08070b881305631"></script>
	
	<script type="text/javascript">
	
		$(function() {
			
			var container = document.getElementById('map'); //������ ���� ������ DOM ���۷���
			var options = { //������ ������ �� �ʿ��� �⺻ �ɼ�
				center: new daum.maps.LatLng(33.450701, 126.570667), //������ �߽���ǥ.
				level: 3 //������ ����(Ȯ��, ��� ����)
			};

			var map = new daum.maps.Map(container, options); //���� ���� �� ��ü ����

		});
	
	</script>		
	
</head>

<body>

	<!-- ������ ǥ���� div �Դϴ� -->
	<div id="map" style="width:500px;height:400px;"></div>

</body>

</html>