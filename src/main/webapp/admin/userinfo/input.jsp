<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>

<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>

<form method="post" action="">
    uname	<input type="text" id="uname"><br>
    upass	<input type="text" id="upass"><br>
    请选择你要的角色：
    <div id="roles">
    </div>
    是否删除：
    <input type="radio" name="isdelete" value="1" checked>正常
    <input type="radio" name="isdelete" value="0">删除
    <br>
    <input type="button" value="增加" onclick="dosave()">
</form>
<script>
    function getQueryVariable(variable)
    {
        var query = window.location.search.substring(1);
        var vars = query.split("&");
        for (var i=0;i<vars.length;i++) {
            var pair = vars[i].split("=");
            if(pair[0] == variable){return pair[1];}
        }
        return(false);
    }
    $(function(){
       findRoles();
       let uid = getQueryVariable("uid");
       if(uid!=false){//查询所有值
           findById(uid);
       }

    });

    function findById(uid)
    {
        $.getJSON("findById",{uid:uid},function(json){
            console.log(json);
            $("#uname").val(json.uname);
            $("#upass").val(json.upass);
        });
    }

    function dosave(){
        var  uname = $("#uname").val();
        var  upass = $("#upass").val();
        var  isdelete =  $('input:radio:checked').val();

        var rids = [];
        $("input[name='rids']:checked").each(function(i){
            rids.push($(this).val())
        })
        rids =  rids+"";
        console.log(uname+"   "+upass+" "+rids);

        $.post("save",{uname:uname,upass:upass,isdelete:isdelete,rids:rids},function(){
            window.location="index.jsp";
            console.log("success");
        });
    }

    function findRoles(){
        $.getJSON("findRoles",{},function(json){
            $.each(json, function(i,item){
               $("#roles").append("<input type=\"checkbox\" name=\"rids\" value=\""+item.rid+"\">"+item.rolename+"");
            });
        });
    }
</script>
