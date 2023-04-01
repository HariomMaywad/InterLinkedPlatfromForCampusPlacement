<%-- 
    Document   : navbar
    Created on : 20 Aug, 2022, 4:49:03 PM
    Author     : soura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/aicte.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header class="header">
        <a href="https://www.therockshivam.blogspot.com" style="padding-left:2%;"><img
                style="width:7vh; border-radius:30px; border:2px solid red" src="../images/aicte logo.jpg"></a>
        <h1 style="color: white; font-size:40px;">AICTE</h1>
        <label class="search" for="search">Search
            <input type="search" class="searchh" id="search" name="search" placeholder="Use Me..."
                style="font-size:16px"> </label>

        <div id="mee" class="mee" onclick="myfun()">
            <div class="mee1"></div>
            <div class="mee2"></div>
            <div class="mee3"></div>
        </div>

        <h1 class="close" id="close" onclick="close()">X</h1>

    </header>
        <menu class="menu" id="menu">

        <ul>


            <li><a href="index.jsp">
                    Home
                </a></li>

                <li> <a href="about.jsp">
                    About Us
                </a></li>

                <li><a href="privacypolicy.html">
                    Privacy Policy
                </a></li>

                <li><a href="../htmlPages/desclaimer.html">
                    Disclaimer
                </a></li>

            <li><a href="#notice">
                    Notices
                </a></li>
            <li><a href="#">
                    FAQ
                </a></li>
            <li><a href="#">
                    Contact Us
                </a></li>
                <li><a href="#">
                    Terms and Condition
                </a></li>
        </ul>

    </menu>
    </body>
</html>
