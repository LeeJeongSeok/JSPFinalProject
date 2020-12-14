<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ page import="java.util.List" %>
<%@ page import="vo.User" %>

<!DOCTYPE html>
<html lang="kr">
<head>
    <%@ include file="./commons/header2.jspf" %>
</head>

<body>
<%@ include file="./commons/navigation.jspf" %>

<div class="container" id="main">
    <div class="col-md-10 col-md-offset-1">
        <div class="panel panel-default">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>#</th> <th>사용자 아이디</th> <th>이름</th> <th>이메일</th><th></th>
                </tr>
                </thead>
                <tbody>
                <%
                    List<User> list = (List<User>) request.getAttribute("users");
                %>
                <%
                    for (User user : list) {
                %>
                <tr>
                    <th scope="row"><%= user.getId()%></th>
                    <td><%= user.getUser_id()%></td>
                    <td><%= user.getName()%></td>
                    <td><%= user.getEmail()%></td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>

