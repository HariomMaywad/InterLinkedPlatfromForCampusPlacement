<%-- 
    Document   : UniversityDashboard
    Created on : Aug 9, 2022, 1:40:14 PM
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
   
    <link rel="stylesheet" type="text/css" href="../css/studentdashboard.css">
    <link rel="stylesheet" type="text/css" href="../css/deshboard.css" />

</head>
<body>
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
            <%
                UniversityDetails obj=new UniversityDetails();
                HttpSession mySession=request.getSession();
//                String id=(String)mySession.getAttribute("id");
//                System.out.println(id);
                obj=UniversityDetailsDAO.getUniversityDetails((Connection)application.getAttribute("conn"),"234534");
             %>
            <div><br>
                <table>
                    <tr>
                        <th>University id</th>
                        <td><%= obj.getId() %> </td>
                    </tr>
                    <tr>
                        <th>University Name</th>
                        <td><%= obj.getName() %> </td>
                    </tr>
                   
                    <tr>
                        <th>University vice-chancelor Name</th>
                        <td><%= obj.getVice_chancelor() %></td>
                    </tr>
                    <tr>
                        <th>Esimated Year</th>
                        <td><%=obj.getYear() %>  </td>
                    </tr>
                    <tr>
                        <th>Address</th>
                        <td> <%=obj.getAddress() %></td>
                     </tr>
                     <tr>
                        <th>Region</th>
                        <td><%= obj.getRegion() %> </td>
                     </tr>
                     <tr>
                        <th>State</th>
                        <td> <%= obj.getState() %></td>
                     </tr>
                     <tr>
                        <th>City</th>
                        <td> <%= obj.getCity() %>  </td>
                     </tr>
                     <tr>
                        <th>University Type</th>
                        <td> <%= obj.getType() %></td>
                    </tr>
                    
                    <tr>
                    <th>Website</th>
                        <td> <%= obj.getWebsite() %>  </td>
                    </tr>
                    <tr>
                        <th>Contact No.</th>
                        <td><%= obj.getPhone() %> </td>
                    </tr>
                    <tr>
                        <th>Email Id</th>
                        <td> <%= obj.getEmail() %> </td>
                    </tr>            
                    <th>Password</th>
                    <td> <%= obj.getPwd() %> </td>
                    </tr>            
                </table></div>
                <div class="edit"><br>
                    <a href="Unyversity_detail update.html"><button>Edit</button></a>
                    <button>Save</button>
                <!-- <div id="about">
                    <a href="#">About US</a>
                    <a href="#"> Help</a>
                </div> -->

            </div>
        </div>
    </div>
</body>
</html>