<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="vo.User" %>

<!DOCTYPE html>
<html lang="kr">
<head>
    <%@ include file="./commons/header2.jspf" %>
</head>

<body>
    <%@ include file="./commons/navigation.jspf" %>


<div class="container" id="main">
    <div class="col-md-6 col-md-offset-3">
        <div class="panel panel-default content-main">

            <%
                session = request.getSession();
                User user = (User) session.getAttribute("user");
            %>

            <form action="/JSPFinalProject/user/update" method="post">

                <input type="hidden" name="id" value="<%= user.getId() %>">

                <div class="form-group">
                    <label for="userId">사용자 아이디</label>
                    <input class="form-control" id="userId" name="userId" placeholder="User ID" value="<%= user.getUser_id() %>">
                </div>
                <div class="form-group">
                    <label for="password">비밀번호</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                </div>
                <div class="form-group">
                    <label for="name">이름</label>
                    <input class="form-control" id="name" name="name" placeholder="Name" value="<%= user.getName() %>">
                </div>
                <div class="form-group">
                    <label for="email">이메일</label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="Email" value="<%= user.getEmail() %>">
                </div>
                <button type="submit" class="btn btn-success clearfix pull-right">정보 수정</button>
                <div class="clearfix" />
            </form>
        </div>
    </div>
</div>

    <!-- script references -->
<script src="js/jquery-2.2.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>

</body>
</html>
