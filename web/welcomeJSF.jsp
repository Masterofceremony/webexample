<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Library Management System</title>
        </head>
        <body bgcolor="badge" align ="center">
<section class ="Container">
<div class="Login">
<h3 style="color:lime">Login to Library Management System</h3>
<form method ="post" action ="home.html">
<p>username/Email<input type ="text" name="username" placeholder="username@domain.com"></p>
<p>password <input type ="password" name ="passwod" value="" placeholder="*****"</p>
<p class ="remember_me">
<label>
<input type="checkbox" name ="remember_me" id ="remember_Me">
Remember me on this device
</label>
</p>
<p class ="submit"><input type="submit" name ="commit" value="login"></p>
<p class ="submit"><input type ="submit" name="commit" value="cancel"></p>
</form>
<form method ="post" action ="register.html">
<h4 style="color:gray">Or click here to be a member:
<p class ="submit"><input type ="submit" commit="commit" value="Register"></p>
</form>
<form method ="post" action="Login.html">
</form>
</div>
<div style="position :absolute;Left:350px;top:70px;">
<img src="C:\Users\kock\Videos\books.jpg" width="260" height="180">

</div>
<div style ="position:absolute;right:350px;top:250;">
<img src="C:\Users\kock\Videos\BK.jpg" width="260" height="180">
</div>
<div style ="position:absolute;right:350px;top:250;">
<img src="C:\Users\kock\Videos\BK.jpg" width="260" height="180">
</div>
<p class="about-author">Click here to send us an email:<a  href ="https://accounts.google.com/ServiceLogin"></p>
</section>
&copy;2016&ndash;2017
</body>
    </html>
</f:view>
