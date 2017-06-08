<%--
  Created by IntelliJ IDEA.
  User: d
  Date: 2017/5/17
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
    <script type="text/javascript"
            src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.1.js"></script>
    <script type="text/javascript">
      function tishi() {
             
      }
    </script>
  </head>
  <body>
  <div>
    <form action="Login_Student.action" method="post">
      <input type="text" name="studentEntity.susername" onblur="tishi()"/><p id="message"></p><br>
      <input type="password" name="studentEntity.spassword"/><br>
      <input type="submit" value="Login"><br>
      Don't have a account<a href="Login_Action.action">Sign</a>
    </form>
  </div>
  </body>
</html>
