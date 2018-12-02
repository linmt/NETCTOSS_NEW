//�����û��ʼǱ��б�
function loadUserBooks(){
 $.ajax({
	url:base_url+"/notebook/loadbooks.do",
	type:"post",
	data:{"userId":userId},
	dataType:"json",
	success:function(result){
		if(result.status==0){
			var books = result.data;//�ʼǱ�����
			for(var i=0;i<books.length;i++){
				var bookName = books[i].cn_notebook_name;
				var bookId = books[i].cn_notebook_id;
				//ƴһ��liԪ��
				createBookLi(bookName,bookId);
			}
		}
	},
	error:function(){
		alert("���رʼǱ��б�ʧ��");
	}
});
};
//׷��һ���ʼǱ�li
function createBookLi(bookName,bookId){
	var s_li ='<li class="online">';
		s_li+='	<a>';
		s_li+='	<i class="fa fa-book" title="online" rel="tooltip-bottom">';
		s_li+='	</i>'+bookName;
		s_li+='	</a>';
		s_li+='</li>';
		//��bookId��liԪ�ذ�
		var $li = $(s_li);
		$li.data("bookId",bookId);
		//��liԪ����ӵ�ul
		$("#book_list").append($li);
};

//ȷ�ϴ����ʼǱ�
function sureAddBook(){
	//��ȡ�������
	var bookName = $("#input_notebook").val().trim();
	//TODO ����ʽ
	//����Ajax����
	$.ajax({
		url:base_url+"/notebook/add.do",
		type:"post",
		data:{"userId":userId,"bookName":bookName},
		dataType:"json",
		success:function(result){
			if(result.status==0){
				//�رնԻ���
				closeWindow();
				//���һ���ʼǱ�li
				var bookId = result.data;
				createBookLi(bookName,bookId);
				//��ʾ�ɹ�
				alert(result.msg);
			}
		},
		error:function(){
			alert("�����ʼǱ�ʧ��");
		}
	});
};
