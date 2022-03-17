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
	
		var map = null;
	
		$(function() {
			
			var mapContainer = document.getElementById('map'), // ������ ǥ���� div 
		   
			mapOption = { 
		        center: new daum.maps.LatLng(33.450701, 126.570667), // ������ �߽���ǥ
		        level: 3 // ������ Ȯ�� ����
		    };
	
			map = new daum.maps.Map(mapContainer, mapOption); // ������ �����մϴ�
	
		});
		
		function setCenter() {            
		    // �̵��� ���� �浵 ��ġ�� �����մϴ� 
		    var moveLatLon = new daum.maps.LatLng(33.452613, 126.570888);
		    
		    // ���� �߽��� �̵� ��ŵ�ϴ�
		    map.setCenter(moveLatLon);
		}
	
		function panTo() {
		    // �̵��� ���� �浵 ��ġ�� �����մϴ� 
		    var moveLatLon = new daum.maps.LatLng(33.450580, 126.574942);
		    
		    // ���� �߽��� �ε巴�� �̵���ŵ�ϴ�
		    // ���� �̵��� �Ÿ��� ���� ȭ�麸�� ũ�� �ε巯�� ȿ�� ���� �̵��մϴ�
		    map.panTo(moveLatLon);            
		}        
	
	</script>		
	
</head>

<body>

	<div id="map" style="width:100%;height:350px;"></div>
	<p>
	    <button onclick="setCenter()">���� �߽���ǥ �̵���Ű��</button> 
	    <button onclick="panTo()">���� �߽���ǥ �ε巴�� �̵���Ű��</button> 
	</p>

</body>

</html>