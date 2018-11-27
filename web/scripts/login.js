$(function(){
	$("#login").click(function(){
		//�����ʾ��Ϣ
		$("#count_span").html("");
		$("#password_span").html("");
		//��ȡ�����ύ�Ĳ���
		var name = $("#count").val().trim();
		var password = $("#password").val().trim();
		//��������ʽ
		var ok = true;//������ͨ�����
		if(name==""){
			ok = false;
			$("#count_span").html("�û���Ϊ��");
		}
		if(password==""){
			ok = false;
			$("#password_span").html("����Ϊ��");
		}
		//����Ajax����
		if(ok){//ͨ�����
			$.ajax({
				url:base_url+"/user/login.do",
				type:"post",
				data:{"name":name,"password":password},
				dataType:"json",
				success:function(result){
					if(result.status==0){//��ȷ
						//���û�ID����Cookie
						var userId = result.data;
						addCookie("userId",userId,0.5);
						window.location.href="edit.html";
					}else if(result.status==1){//�û�������
						$("#count_span").html(result.msg);
					}else if(result.status==2){//�������
						$("#password_span").html(result.msg);
					}
				},
				error:function(){
					alert("��¼ʧ��,�Ժ�����");
				}
			});
		}
	});
});