<%--
  Created by IntelliJ IDEA.
  User: Hanwei
  Date: 2020/5/27
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String uname = request.getParameter("uname");
    String upass = request.getParameter("upass");
    out.print(uname+" "+upass);
%>
