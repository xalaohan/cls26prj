<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
</head>
<body>
<table border="1" width="100%" id="tab">
    <tr>
        <td>uid</td>
        <td>uname</td>
        <td>upass</td>
        <td>role</td>
        <td>状态</td>
        <td>Update</td>
    </tr>
</table>
<a href="input.jsp">save</a>
</body>
</html>
<script>
    $(function(){
        findAll();
    })

    function findAll(){
        $.getJSON("findAll",{},function(json){
            $.each(json, function(i,item){
                let state = "已删除";
                if(item.isdelete==null||item.isdelete==true){
                    state = "正常";
                }

                let rolenames = "";
                $.each(item.roles, function(i,it){
                    rolenames += it.rolename;
                    if(i<item.roles.length-1)
                        rolenames +=","
                });

                $("#tab").append("<tr><td>"+item.uid+"</td><td>"+item.uname+"</td><td>"+item.upass+"</td><td>"+rolenames+"</td><td>"+state+"</td><td><a href='input.jsp?uid="+item.uid+"'>Update</a></td></tr>");
            });
        })
    }
</script>
