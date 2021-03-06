<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ page import="vo.Question" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="kr">
<head>
    <%@ include file="./commons/header2.jspf" %>
</head>

<body>
    <%@ include file="./commons/navigation.jspf" %>

<div class="container" id="main">
    <div class="col-md-12 col-sm-12 col-lg-10 col-lg-offset-1">
        <div class="panel panel-default qna-list">
            <ul class="list">
                <%
                    List<Question> questionList = (List<Question>) request.getAttribute("questionList");
                %>

                <%
                    for (Question question : questionList) {
                %>
                <li>
                    <div class="wrap">
                        <div class="main">
                            <strong class="subject">
                                <a href="/JSPFinalProject/showQuestion?id=<%= question.getId()%>"><%= question.getTitle()%></a>
                            </strong>
                            <div class="auth-info">
                                <i class="icon-add-comment"></i>
                                <span class="time"><%= question.getCreate_date()%></span>
                                <a href="#" class="author"><%= question.getWriter_id()%></a>
                            </div>
                            <div class="reply" title="댓글">
                                <i class="icon-reply"></i>
                                <span class="point"><%= question.getCount_of_answer()%></span>
                            </div>
                        </div>
                    </div>
                </li>
                <%
                    }
                %>
            </ul>
            <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6 text-center">
                    <ul class="pagination center-block" style="display:inline-block;">
                        <li><a href="#">«</a></li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">»</a></li>
                    </ul>
                </div>
                <div class="col-md-3 qna-write">
                    <a href="/JSPFinalProject/questionForm.jsp" class="btn btn-primary pull-right" role="button">질문하기</a>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- script references -->
<script src="js/jquery-2.2.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>