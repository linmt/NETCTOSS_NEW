$(function(){
	$("#regist_button").click(function(){
		//�����ʾ��Ϣ
		$("#warning_1").hide();
		$("#warning_2").hide();
		$("#warning_3").hide();
		$("#warning_4").hide();
		//��ȡ�������
		var name = $("#regist_username").val().trim();
		var nick = $("#nickname").val().trim();
		var password = $("#regist_password").val().trim();
		var final_password = $("#final_password").val().trim();
		//����ʽ
		var ok = true;
		if(name==""){
			ok = false;
			$("#warning_1 span").html("�û���Ϊ��");
			$("#warning_1").show();
		}
		if(nick==""){
			ok = false;
			$("#warning_4 span").html("�ǳ�Ϊ��");
			$("#warning_4").show();
		}
		if(password==""){
			ok = false;
			$("#warning_2 span").html("����Ϊ��");
			$("#warning_2").show();
		}else{
			if(password.length<6){
				ok = false;
				$("#warning_2 span").html("������Ҫ6λ����");
				$("#warning_2").show();
			}
		}
		if(final_password != password){
			ok = false;
			$("#warning_3 span").html("�����벻һ��");
			$("#warning_3").show();
		}
		//����Ajax
		if(ok){
			$.ajax({
				url:base_url+"/user/regist.do",
				type:"post",
				data:{"name":name,"password":password,"nick":nick},
				dataType:"json",
				success:function(result){
					if(result.status==0){//�ɹ�
						alert(result.msg);//��ʾ
						$("#back").click();//�л�����¼����
					}else if(result.status==1){//�û���ռ��
						$("#warning_1 span").html(result.msg);
						$("#warning_1").show();
					}
				},
				error:function(){
					alert("ע��ʧ��,�Ժ�����");
				}
			});
		}
	});
});