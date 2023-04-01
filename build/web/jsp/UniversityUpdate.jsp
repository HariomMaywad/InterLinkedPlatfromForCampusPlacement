<%-- 
    Document   : UniversityUpdate
    Created on : Aug 25, 2022, 10:53:56 AM
    Author     : hmayw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAOClasses.UniversityDetailsDAO,java.util.ArrayList,java.util.List" %>
<%@page import="EntityClasses.UniversityDetails,java.sql.Connection"%>
<%@include file="../htmlPages/MultipleLanguage.html"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>University details</title>
    <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet">
    <link rel="stylesheet" href="../css/deshboard.css">
    <link rel="stylesheet" href="../css/studentdashboard.css">

</head>
<body>
    <%
                UniversityDetails obj=new UniversityDetails();
                HttpSession mySession=request.getSession();
//                String id=(String)mySession.getAttribute("id");
//                System.out.println(id);
                obj=UniversityDetailsDAO.getUniversityDetails((Connection)application.getAttribute("conn"),"234534");
             %>
    <div id="bg">
        <div id="left">
            <div id="logo">
                <div id = "smaldiv">
                    <!-- <img src="https://www.kindpng.com/picc/m/133-1337806_job-vector-seeker-job-logo-magnifying-glass-png.png" alt=""> -->
                    <h2>J</h2>
                </div>
                <h4>Inter <span>linkded</span></h4>
                
            </div>
            <div id="leftHalf">
                <div id="list">
                    <div class="details">
                        <i id="dash" class="ri-dashboard-fill"></i>
                        <a href="Institute_detail.html"><h5 id="dash" >University Info</h5></a>
                    </div>
                </div>
                <div id="downList">
                    <img src="https://ouch-cdn2.icons8.com/i60mWXyYo0NUDg6fCdoCvfC2JLhy2qV4abxwMPXx6hQ/rs:fit:256:256/czM6Ly9pY29uczgu/b3VjaC1wcm9kLmFz/c2V0cy9zdmcvNDE5/Lzg3YTNlOTE3LWNl/ZjAtNDg5OC04NDhi/LWE4ODk5ODMwMWZl/ZC5zdmc.png" alt="">
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
                </div>
            </div>
        </div>
        <div id="center">
            <nav>
                <div id="one">
                    <i class="ri-search-line"></i>
                    <input type="text" placeholder="Search">
                </div>
                <div id="two">
                    <i class="ri-notification-2-fill"></i>
                </div>
            </nav>
            <div id="detailList">
                <h3>Institute Information</h3>
            </div>
            <form mehtod="post" action="../UniversityUpdateServlet">
                <div><br>
                <table>
                    <tr>
                        <th>University id</th>
                        <td><input type="id" value="<%=obj.getId() %>" name="id"> </td>
                    </tr>
                    <tr>
                        <th>University Name</th>
                        <td><input type="text" value="<%=obj.getName() %>" name="name"> </td>
                    </tr>
                    
                    <tr>
                        <th>University vice-chancelor Name</th>
                        <td><input type="text" value="<%=obj.getVice_chancelor() %>" name="chanceler_name"> </td>
                    </tr>
                    <tr>
                        <th>Esimated Year</th>
                        <td><input type="year" value="<%=obj.getYear() %>" name="year"> </td>
                    </tr>
                    <tr>
                        <th>Address</th>
                        <td><input type="text" value="<%=obj.getAddress() %>" name="address"></td>
                     </tr>
                     <tr>
                        <th>Region</th>
                        <td><input type="text" value="<%=obj.getRegion() %>" name="region"></td>
                     </tr>
                     <tr>
                        <th>State</th>
                        <td><input type="text" value="<%=obj.getState() %>" name="state"></td>
                     </tr>
                     <tr>
                        <th>City</th>
                        <td><input type="text" value="<%=obj.getCity() %>" name="city"></td>
                     </tr>
                     <tr>
                        <th>University Type</th>
                        <td><input type="text" value="<%=obj.getType() %>" name="type"></td>
                    </tr>
                   
                    <tr>
                    <th>Website</th>
                        <td><input type="text" value="<%=obj.getWebsite() %>" name="website"></td>
                    </tr>
                    <tr>
                        <th>Contact No.</th>
                        <td><input type="text" value="<%=obj.getPhone() %>" name="phone"></td>
                    </tr>
                    <tr>
                        <th>Email Id</th>
                        <td><input type="email" value="<%=obj.getEmail() %>" name="email"></td>
                    </tr>            
                    <th>Password</th>
                        <td><input type="password" value="<%=obj.getPwd() %>" name="pwd"></td>
                    </tr>            
                </table></div>
                    <div class="edit"><br>
                   <input type='submit' value="update"/>
                </div>
            </form> 
                
                <!-- <div id="about">
                    <a href="#">About US</a>
                    <a href="#"> Help</a>
                </div> -->

            </div>
        </div>
    </div>
</body>
</html>