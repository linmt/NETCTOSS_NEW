function sureRecycleNote(){
	//��ȡ�ʼ�ID
	var $li = $("#note_list a.checked").parent();
	var noteId = $li.data("noteId");
	//����Ajax����
	$.ajax({
		url:base_url+"/recycle/recycle.do",
		type:"post",
		data:{"noteId":noteId},
		dataType:"json",
		success:function(result){
			if(result.status==0){
				$li.remove();//ɾ��li
				alert(result.msg);//��ʾ
			}
		},
		error:function(){
			alert("���ʼǷ������վʧ��");
		}
	});
	return false;
};