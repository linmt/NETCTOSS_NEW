//���رʼ��б�
function loadBookNotes(){
	//�л��м��б���ʾ
	showNoteList(2);//ȫ���б���ʾ,�����б�����
	//�л��ɱ༭��
	$("#pc_part_3").show();
	$("#pc_part_5").hide();
	//����ǰ�ʼǱ�li���ó�ѡ��״̬
	$("#book_list li a").removeClass("checked");
	$(this).find("a").addClass("checked");
	//��ȡ�������
	var bookId = $(this).data("bookId");
	//����Ajax����
	$.ajax({
		url:base_url+"/note/loadnotes.do",
		type:"post",
		data:{"bookId":bookId},
		dataType:"json",
		success:function(result){
			if(result.status==0){
				var notes = result.data;//�ʼ�����
				$("#note_list").empty();//���ԭ�бʼ��б�
				//ѭ���ʼ�����,���ɱʼ��б�
				for(var i=0;i<notes.length;i++){
					var noteTitle = notes[i].cn_note_title;
					var noteId = notes[i].cn_note_id;
					//����һ���ʼ�li
					createNoteLi(noteTitle,noteId);
				}
			}
		},
		error:function(){
			alert("���رʼ��б�ʧ��");
		}
	});
};

//���һ���ʼ�li
function createNoteLi(noteTitle,noteId){
	var s_li ='<li class="online">';
		s_li +='	<a>';
		s_li +='		<i class="fa fa-file-text-o" title="online" rel="tooltip-bottom"></i>'+noteTitle+'<button type="button" class="btn btn-default btn-xs btn_position btn_slide_down"><i class="fa fa-chevron-down"></i></button>';
		s_li +='	</a>';
		s_li +='	<div class="note_menu" tabindex="-1">';
		s_li +='	<dl>';
		s_li +='		<dt><button type="button" class="btn btn-default btn-xs btn_move" title="�ƶ���..."><i class="fa fa-random"></i></button></dt>';
		s_li +='		<dt><button type="button" class="btn btn-default btn-xs btn_share" title="����"><i class="fa fa-sitemap"></i></button></dt>';
		s_li +='		<dt><button type="button" class="btn btn-default btn-xs btn_delete" title="ɾ��"><i class="fa fa-times"></i></button></dt>';
		s_li +='   </dl>';
		s_li +='   </div>';
		s_li +='</li>';
	//��noteId�󶨵�li��
	var $li  = $(s_li);
	$li.data("noteId",noteId);
	//��li��ӵ�ul�б���
	$("#note_list").append($li);
};


//���رʼ�����
function loadNoteDetail(){
	//���ʼ����ó�ѡ��״̬
	$("#note_list li a").removeClass("checked");
	$(this).find("a").addClass("checked");
	//��ȡ�������
	var noteId = $(this).data("noteId");
	//����Ajax����
	$.ajax({
		url:base_url+"/note/load.do",
		type:"post",
		data:{"id":noteId},
		dataType:"json",
		success:function(result){
			if(result.status==0){
				var noteTitle = result.data.cn_note_title;
				var noteBody = result.data.cn_note_body;
				//���ñ���
				$("#input_note_title").val(noteTitle);
				//��������
				um.setContent(noteBody);
			}
		},
		error:function(){
			alert("���رʼ�����ʧ��");
		}
	});
};

//ȷ�ϴ����ʼ�
function sureAddNote(){
	//��ȡ�������
	var noteTitle = $("#input_note").val().trim();
	var $li = $("#book_list li a.checked").parent();
	var bookId = $li.data("bookId");
	//TODO ��������ʽ
	//����Ajax����
	$.ajax({
		url:base_url+"/note/add.do",
		type:"post",
		data:{"bookId":bookId,"userId":userId,"noteTitle":noteTitle},
		dataType:"json",
		success:function(result){
			if(result.status==0){
				//�رնԻ���
				closeWindow();
				//���һ���ʼ�li
				var noteId = result.data;
				createNoteLi(noteTitle,noteId);
				//��ʾ�ɹ�
				alert(result.msg);
			}
		},
		error:function(){
			alert("�����ʼ�ʧ��");
		}
	});
};

function sureUpdateNote(){
	//����Ƿ�ѡ�бʼ�
	var $li = $("#note_list li a.checked").parent();
	if($li.length==0){
		alert("��ѡ��Ҫ����ıʼ�");
	}else{
		//��ȡ�������
		var noteId = $li.data("noteId");
		var noteTitle = 
			$("#input_note_title").val().trim();
		var noteBody = um.getContent();
		//TODO ����ʽ
		//����Ajax����
		$.ajax({
			url:base_url+"/note/update.do",
			type:"post",
			data:{"noteTitle":noteTitle,"noteBody":noteBody,"noteId":noteId},
			dataType:"json",
			success:function(result){
				if(result.status==0){
					//���±ʼ�li������
					var str = '<i class="fa fa-file-text-o" title="online" rel="tooltip-bottom"></i>'+noteTitle+'<button type="button" class="btn btn-default btn-xs btn_position btn_slide_down"><i class="fa fa-chevron-down"></i></button>';
					$li.find("a").html(str);
					//��ʾ�ɹ�
					alert(result.msg);
				}
			},
			error:function(){
				alert("����ʼ�ʧ��");
			}
		});
	}
};

//�ʼǲ˵�����
function showNoteMenu(){
	$("#note_list").on("click",".btn_slide_down",function(){
		//�����бʼǲ˵�����
		$("#note_list .note_menu").hide();
		//����ǰ�����ť�Ĳ˵���ʾ
		var $li = $(this).parents("li");
		var $menu = $li.find(".note_menu");
		$menu.slideDown(1000);
		//����ǰ�ʼ�liѡ��
		$("#note_list li a.checked").removeClass("checked");
		$li.find("a").addClass("checked");
		return false;//��ֹð��
	});
	//׷������ƶ��Աʼǲ˵��Ĵ���
	$("#note_list").on("mouseover",".note_menu",function(){
		$(this).show();//������ʾ״̬
	});
	$("#note_list").on("mouseout",".note_menu",function(){
		$(this).hide();//���ز˵�
	});
	//���body�������ز˵�
	$("body").click(function(){
		$("#note_list .note_menu").hide();
	});
};

//ȷ�Ϸ���ʼǲ���
function sureShareNote(){
	//��ȡ�������
	var $li = $("#note_list a.checked").parent();
	var noteId = $li.data("noteId");
	//����Ajax����
	$.ajax({
		url:base_url+"/note/share.do",
		type:"post",
		data:{"noteId":noteId},
		dataType:"json",
		success:function(result){
			//if(result.status==0){
			//	alert(result.msg);
			//}else if(result.status==1){
				alert(result.msg);
			//}
		},
		error:function(){
			alert("����ʼ�ʧ��");
		}
	});
	return false;//��ֹð��
};

//�л��б���ʾ
function showNoteList(index){
	//�������б�����
	$(".col-xs-3:not('#save_button_div')").hide();
	//��ָ���б���ʾ
	$("#pc_part_"+index).show();
};
//ȷ����������ʼ�
function sureSearchShare(event){
	var code = event.keyCode;
	if(code==13){//���س���
		//��ȡ��ѯ�ؼ���
		var keyword = $("#search_note").val().trim();
		//����Ajax����
		$.ajax({
			url:base_url+"/note/search.do",
			type:"post",
			data:{"keyword":keyword},
			dataType:"json",
			success:function(result){
				if(result.status==0){
					//�л��б���ʾ��
					showNoteList(6);//��������б���ʾ,��������
					//�л���Ԥ��״̬
					$("#pc_part_5").show();
					$("#pc_part_3").hide();
					//���ԭ�в�ѯ����б�
					$("#search_list").empty();
					//ѭ�����ɱʼ��б�
					var notes = result.data;
					for(var i=0;i<notes.length;i++){
						var title = notes[i].cn_share_title;
						var shareId = notes[i].cn_share_id;
						//ƴһ��li
						var s_li ='<li class="online">';
							s_li +='	<a>';
							s_li +='		<i class="fa fa-file-text-o" title="online" rel="tooltip-bottom"></i>';
							s_li += title;
							s_li +='	</a>';
							s_li +='</li>';
						//��shareId
						var $li = $(s_li);
						$li.data("shareId",shareId);
						//��li��ӵ���������б���
						$("#search_list").append($li);
					}
				}
			},
			error:function(){
				alert("�����ʼ�ʧ��");
			}
		});
	}
};

//Ԥ������ʼ�����
function viewShareNote(){
	//��ȡ�������
	var shareId = $(this).data("shareId");
	//����Ajax����
	$.ajax({
		url:base_url+"/note/loadShare.do",
		type:"post",
		data:{"shareId":shareId},
		dataType:"json",
		success:function(result){
			if(result.status==0){
				var title = result.data.cn_share_title;
				var body = result.data.cn_share_body;
				$("#noput_note_title").html(title);
				$("#noput_note_body").html(body);
			}
		},
		error:function(){
			alert("���رʼ���Ϣʧ��");
		}
	});
};


