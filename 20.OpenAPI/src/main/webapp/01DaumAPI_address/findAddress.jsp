<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ page pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="EUC-KR">
	
	<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
	
	<script type="text/javascript">
	
		function execDaumPostcode() {
			
	        new daum.Postcode({
	            oncomplete: function(data) {
	            	
	                // �˾����� �˻���� �׸��� Ŭ�������� ������ �ڵ带 �ۼ��ϴ� �κ�.
	
	                // �� �ּ��� ���� ��Ģ�� ���� �ּҸ� �����Ѵ�.
	                // �������� ������ ���� ���� ��쿣 ����('')���� �����Ƿ�, �̸� �����Ͽ� �б� �Ѵ�.
	                var fullAddr = ''; // ���� �ּ� ����
	                var extraAddr = ''; // ������ �ּ� ����
	
	                // ����ڰ� ������ �ּ� Ÿ�Կ� ���� �ش� �ּ� ���� �����´�.
	                if (data.userSelectedType === 'R') { // ����ڰ� ���θ� �ּҸ� �������� ���
	                    fullAddr = data.roadAddress;
	
	                } else { // ����ڰ� ���� �ּҸ� �������� ���(J)
	                    fullAddr = data.jibunAddress;
	                }
	
	                // ����ڰ� ������ �ּҰ� ���θ� Ÿ���϶� �����Ѵ�.
	                if(data.userSelectedType === 'R'){
	                    //���������� ���� ��� �߰��Ѵ�.
	                    if(data.bname !== ''){
	                        extraAddr += data.bname;
	                    }
	                    // �ǹ����� ���� ��� �߰��Ѵ�.
	                    if(data.buildingName !== ''){
	                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
	                    }
	                    // �������ּ��� ������ ���� ���ʿ� ��ȣ�� �߰��Ͽ� ���� �ּҸ� �����.
	                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
	                }
	
	                // �����ȣ�� �ּ� ������ �ش� �ʵ忡 �ִ´�.
	                document.getElementById('postcode').value = data.zonecode; //5�ڸ� �������ȣ ���
	                document.getElementById('address').value = fullAddr;
	
	                // Ŀ���� ���ּ� �ʵ�� �̵��Ѵ�.
	                document.getElementById('address_detail').focus();
	            },
	        
	            theme: {
	    	 		bgColor: "#ECECEC", //���� ����
	    	 		searchBgColor: "#0B65C8", //�˻�â ����
	    	 		contentBgColor: "#FFFFFF", //���� ����(�˻����,��l������,ùȭ��,�˻�������Ʈ)
	    	 		pageBgColor: "#FAFAFA", //������ ����
	    	 		textColor: "#333333", //�⺻ ���ڻ�
	    	 		queryTextColor: "#FFFFFF", //�˻�â ���ڻ�
	    	 		postcodeTextColor: "#FA4256", //�����ȣ ���ڻ�
	    	 		emphTextColor: "#008BD3", //���� ���ڻ�
	    	 		outlineColor: "#E0E0E0" //�׵θ�
	    		}   
            
	        }).open();
	    }
	</script>
	
</head>

<body>

	<br/><br/><br/>
	<input type="text" id="postcode" placeholder="�����ȣ" readonly="readonly"  >
	<input type="button" onclick="execDaumPostcode()" value="�����ȣ ã��" readonly="readonly" ><br>
	<input type="text" id="address" placeholder="�ּ�">
	<input type="text" id="address_detail" placeholder="���ּ�">
	
	<br/><br/><hr/><br/><br/>
	
	<h1>���� : http://postcode.map.daum.net/guide</h1>

</body>

</html>