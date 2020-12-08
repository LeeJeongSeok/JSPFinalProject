<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.79.0">
    <title>Signin Template · Bootstrap v5.0</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sign-in/">

    

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    
    <!-- Custom styles for this template -->
    <link href="./css/signin.css" rel="stylesheet">
  </head>
  <body class="text-center">

  <main class="form-signin">
    <form action="/JSPFinalProject/login" method="post">
      <h1 class="h3 mb-3 fw-normal ">로그인 하기</h1>
        <input id="inputEmail" name="userId" class="form-control" placeholder="ID" required autofocus>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
      <button class="w-100 btn btn-lg btn-warning text-light" type="submit">로그인</button>
    </form>
    <br>
    <a href="./form.jsp" class="w-100 btn btn-lg fw-bold border-info bg-info text-light">회원가입</a>
  </main>
  </body>
</html>
