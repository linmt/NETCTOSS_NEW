//弹出添加笔记本对话框
function showAddBookWindow(){
    //弹出对话框
    $(".opacity_bg").show();//显示背景
    //var url = base_url+"/alert/alert_notebook.html";
    var url = "/alert/alert_notebook.html";
    $("#can").load(url);
};

//关闭所有对话框
function closeWindow(){
    $(".opacity_bg").hide();//隐藏背景div
    $("#can").empty();//清空对话框内容
};

//弹出添加笔记对话框
function showAddNoteWindow(){
    //判断是否有选中的笔记本
    var $bookLi = $("#book_list a.checked");
    if($bookLi.length==0){
        alert("请选择笔记本");
    }else{
        //弹出对话框
        $(".opacity_bg").show();//显示背景
        //var url = base_url+"/alert/alert_note.html";
        var url = "/alert/alert_note.html";
        $("#can").load(url);
    }
};

//弹出确认删除笔记对话框
function showRecycleNoteWindow(){
    //弹出对话框
    $(".opacity_bg").show();//显示背景
    //var url = base_url+"/alert/alert_delete_note.html";
    var url ="/alert/alert_delete_note.html";
    $("#can").load(url);
    return false;//阻止冒泡
};

//单击恢复区笔记，变成被选中状态

//弹出恢复对话框，加载笔记本列表
function showReplayNoteWindow(){
    //弹出对话框
    $(".opacity_bg").show();//显示背景
    var url = "/alert/alert_replay.html";
    $("#can").load(url);

    //加载笔记本列表
    $.ajax({
        url:"/notebook/loadbooks.form",
        type:"post",
        data:{"userId":userId},
        dataType:"json",
        success:function(result){
            if(result.status==0){
                var books = result.data;//笔记本数组
                for(var i=0;i<books.length;i++){
                    var bookName = books[i].cn_notebook_name;
                    var bookId = books[i].cn_notebook_id;
                    //拼一个option元素
                    var s_opt ='<option value="'+bookId+'">'+bookName+'</option>';
                    //将option元素添加到select   这是加到最前
                    $("#replaySelect").prepend(s_opt);
                }
            }
        },
        error:function(){
            alert("加载笔记本列表失败");
        }
    });
};

//弹出转移笔记对话框
function showMoveNoteWindow(){
    $(".opacity_bg").show();
    var url =
        base_url+"/alert/alert_move.html";
    $("#can").load(url,function(){
        //在load页面载入#can之后,执行该function逻辑
        //获取笔记本列表,生成option添加到下拉选择框中
        var bookLis = $("#book_list li");//li元素集合
        for(var i=0;i<bookLis.length;i++){
            //bookLis[i]是DOM对象,需要转成jQuery对象
            var bookName = $(bookLis[i]).text();
            var bookId = $(bookLis[i]).data("bookId");
            //拼一个option
            var s_opt = "<option value='"+bookId+"'>"+bookName+"</option>";
            //将option添加到下拉单中
            $("#moveSelect").append(s_opt);
        }
    });
    return false;//阻止li单击
}
