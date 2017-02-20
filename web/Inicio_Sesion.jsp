<%-- 
    Document   : Inicio_Sesion.jsp
    Created on : 30/01/2017, 11:47:44 AM
    Author     : GREG-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        
body {
	background: #eaeaea;
	color: #999;
	font: 100%/1.5em sans-serif;
	margin: 0;
}

h1 { margin: 0; }

a {
	color: #999;
	text-decoration: none;
}

a:hover { color: #1dabb8; }

fieldset {
	border: none;
	margin: 0;
}

input {
	border: none;
	font-family: inherit;
	font-size: inherit;
	margin: 0;
	outline: none;
	-webkit-appearance: none;
}

input[type="submit"] { cursor: pointer; }

.clearfix { *zoom: 1; }
.clearfix:before, .clearfix:after {
	content: "";
	display: table;	
}
.clearfix:after { clear: both; }

/* ---------- LOGIN-FORM ---------- */

#login-form {
	margin: 50px auto;
	width: 300px;
}

#login-form h1 {
	background-color: #282830;
	border-radius: 5px 5px 0 0;
	color: #fff;
	font-size: 14px;
	padding: 20px;
	text-align: center;
	text-transform: uppercase;
}

#login-form fieldset {
	background: #fff;
	border-radius: 0 0 5px 5px;
	padding: 20px;
	position: relative;
}

#login-form fieldset:before {
	background-color: #fff;
	content: "";
	height: 8px;
	left: 50%;
	margin: -4px 0 0 -4px;
	position: absolute;
	top: 0;
	-webkit-transform: rotate(45deg);
	-moz-transform: rotate(45deg);
	-ms-transform: rotate(45deg);
	-o-transform: rotate(45deg);
	transform: rotate(45deg);
	width: 8px;
}

#login-form input {
	font-size: 14px;
}

#login-form input[type="text"],
#login-form input[type="password"] {
	border: 1px solid #dcdcdc;
	padding: 12px 10px;
	width: 238px;
}

#login-form input[type="text"] {
	border-radius: 3px 3px 0 0;
}

#login-form input[type="password"] {
	border-top: none;
	border-radius: 0px 0px 3px 3px;
}

#login-form input[type="submit"] {
	background: #1dabb8;
	border-radius: 3px;
	color: #fff;
	float: right;
	font-weight: bold;
	margin-top: 20px;
	padding: 12px 20px;
}

#login-form input[type="submit"]:hover { background: #198d98; }

#login-form footer {
	font-size: 12px;
	margin-top: 16px;
}

.info {
	background: #e5e5e5;
	border-radius: 50%;
	display: inline-block;
	height: 20px;
	line-height: 20px;
	margin: 0 10px 0 0;
	text-align: center;
    </style>
    <body>

    <div id="login-form">

        <h1>Inicio de Sesión</h1>

        <fieldset>

            <form action="Comprobar_Usuario" method="get">

                <input id="DNI" name="DNI" type="text" required value="Usuario"> <!-- JS because of IE support; better: placeholder="Email" -->

                <input id="Password" name="Password" type="password" required value="Password" onBlur="if(this.value=='')this.value='Password'" onFocus="if(this.value=='Password')this.value='' "> <!-- JS because of IE support; better: placeholder="Password" -->

                <input href="" type="submit" value="Ingresar">

                <footer class="clearfix">
                    <p><span class="info">?</span><a href="#">¿Olvidaste tu contraseña?</a></p>

                </footer>

            </form>

        </fieldset>

    </div> <!-- end login-form -->

</body>
    <body>
        
    </body>
</html>
