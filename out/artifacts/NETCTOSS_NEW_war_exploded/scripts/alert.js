//����ת�ƱʼǶԻ���
function showMoveNoteWindow(){
	$(".opacity_bg").show();
	var url = 
		base_url+"/alert/alert_move.html";
	$("#can").load(url,function(){
		//��loadҳ������#can֮��,ִ�и�function�߼�
		//��ȡ�ʼǱ��б�,����option��ӵ�����ѡ�����
		var bookLis = $("#book_list li");//liԪ�ؼ���
		for(var i=0;i<bookLis.length;i++){
			//bookLis[i]��DOM����,��Ҫת��jQuery����
			var bookName = $(bookLis[i]).text();
			var bookId = $(bookLis[i]).data("bookId");
			//ƴһ��option
			var s_opt = "<option value='"+bookId+"'>"+bookName+"</option>";
			//��option��ӵ���������
			$("#moveSelect").append(s_opt);
		}
	});
	return false;//��ֹli����
}

//����ȷ��ɾ���ʼǶԻ���
function showRecycleNoteWindow(){
	//�����Ի���
	$(".opacity_bg").show();//��ʾ����
	var url = 
		base_url+"/alert/alert_delete_note.html";
	$("#can").load(url);
	return false;//��ֹð��
};
//������ӱʼǱ��Ի���
function showAddBookWindow(){
	//�����Ի���
	$(".opacity_bg").show();//��ʾ����
	var url = 
		base_url+"/alert/alert_notebook.html";
	$("#can").load(url);
};
//������ӱʼǶԻ���
function showAddNoteWindow(){
	//�ж��Ƿ���ѡ�еıʼǱ�
	var $bookLi = $("#book_list a.checked");
	if($bookLi.length==0){
		alert("��ѡ��ʼǱ�");
	}else{
		//�����Ի���
		$(".opacity_bg").show();//��ʾ����
		var url = 
			base_url+"/alert/alert_note.html";
		$("#can").load(url);
	}
};
//�ر����жԻ���
function closeWindow(){
	$(".opacity_bg").hide();//���ر���div
	$("#can").empty();//��նԻ�������
};