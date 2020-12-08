<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="vo.User" %><%--
  Created by IntelliJ IDEA.
  User: jeongseok
  Date: 2020/12/03
  Time: 11:49 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="./commons/header.jspf" %>

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

<%@ include file="./commons/footer.jspf" %>

</body>
</html>
