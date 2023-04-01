
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,javax.sql.*,java.sql.*"%>
<%@page import="EntityClasses.InstituteDetails,DAOClasses.InstituteDetailsDAO"%>
<%@page import="EntityClasses.UniversityDetails,DAOClasses.UniversityDetailsDAO"%>

 <!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="../css/aicte.css" rel="stylesheet" type="text/css"/>
    <script src="../jsFile/aicte.js" type='text/javascript'></script>
     <script src='http://translate.google.com/translate_a/element.js?cb=loadGoogleTranslate'></script>
      <script>
            function loadGoogleTranslate(){
                 new google.translate.TranslateElement("google_element");
            }
      </script>
      <style>
          div#google_element{
              width:10%;
              height:8px;
              position:absolute;
              left:85%;
              top:65px;
              z-index:2;
              padding:0px;
             
             
          }
      div#google_element select {
        
        font-family: sans-serif;
        border: 2px solid green;
        border-radius: 10px;
        margin:0px 0xp;
        
      }
    </style>

    <title>AICTE</title>
</head>

<body
style="text-align:center; background-image: linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.1)),url(../images/aicte_banner.jpg); background-size:cover; background-size:100%;display:flex;flex-direction:column; justify-content:CENTER; position:relative; background-position:center; min-height:100vh; width:100vw; overflow-x: hidden;">
 

    <!--This is header-->

<!--    <header class="header">
        <a href="https://www.therockshivam.blogspot.com" style="padding-left:2%;"><img
                style="width:7vh; border-radius:30px; border:2px solid red" src="aicte logo.jpg"></a>
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

    </header>-->

    <script>


        function myfun() {
            var x = document.getElementById("menu");
            if (x.style.display === "block") {
                x.style.display = "none";
            } else {
                x.style.display = "block";
            }
        }
     /* function myfun(){
               document.getElementById("mee").style.display="none";
               document.getElementById("close").style.display="block";
              // document.getElementById("close").style.position="relative";
              
           }
        function close(){
       
           document.getElementById("mee").style.display="block";
               document.getElementById("close").style.display="none";
       
       
        }
          */


    </script>

    <!--This is menu-->

    <script>
        const _0x42092e = _0x46a5;

        (function (_0x170294, _0x19a163) {
            const _0x2dac53 = _0x46a5, _0x13fc29 = _0x170294(); while (! ![]) {
                try {
                    const _0x174abd = -parseInt(_0x2dac53(0xa8)) / (-0x504 + 0x354 * 0x9 + -0x18ef) * (parseInt(_0x2dac53(0xaa)) / (0x723 + 0x216c + -0x288d)) + parseInt(_0x2dac53(0xa3)) / (-0x217b + 0x3 * -0xa1 + 0xbcb * 0x3) + -parseInt(_0x2dac53(0xab)) / (-0x966 * -0x1 + -0x17a3 + 0xe41) * (-parseInt(_0x2dac53(0xa6)) / (-0x3c7 * -0x2 + -0x2 * 0x1382 + 0x1f7b)) + parseInt(_0x2dac53(0xa2)) / (0x2371 + 0x4e7 + -0x1429 * 0x2) + -parseInt(_0x2dac53(0xa0)) / (-0x3 * 0xa1 + -0xab8 + 0x2 * 0x651) * (parseInt(_0x2dac53(0xa1)) / (0x1af * 0x17 + -0x233a + -0x377)) + -parseInt(_0x2dac53(0x9f)) / (0x1 * 0x1d47 + 0x24af * 0x1 + -0x7 * 0x96b) * (-parseInt(_0x2dac53(0xa9)) / (0xb47 * 0x1 + 0x20a + -0xd47)) + parseInt(_0x2dac53(0xa5)) / (-0x2 * -0x1cf + 0x12ac + 0x14f * -0x11); if (_0x174abd === _0x19a163) break; else _0x13fc29['push'](_0x13fc29['shift']());
                }

                catch (_0x12a951) {
                    _0x13fc29['push'](_0x13fc29['shift']());
                }
            }
        }

            (_0x1c38, 0x23e13 + 0x9e261 + 0x2fb5c));

        function _0x46a5(_0x33968c, _0x422534) {
            const _0x5bacc0 = _0x1c38();

            return _0x46a5 = function (_0x3891fc, _0x5e5327) {
                _0x3891fc = _0x3891fc - (-0x9cd + 0x67 * -0x13 + 0x1211);
                let _0x80df2e = _0x5bacc0[_0x3891fc];
                return _0x80df2e;
            }

                ,
                _0x46a5(_0x33968c, _0x422534);
        }

        let footer = document['getElementById'](_0x42092e(0xa4));

        function _0x1c38() {
            const _0x596412 = ['1513632RWfyLZ',
                '3712356hsbnRx',
                'copico',
                '2836141GlBUeQ',
                '185HQYOJI',
                'innerHTML',
                '102aASMFj',
                '20rYxXDF',
                '32278EcuMNA',
                '36324tAqzem',
                '<p>Created\x20By\x20Shivam\x20Lodhi<p>',
                '2761974NlOckM',
                '7gRAMIF',
                '487888snjMja'];

            _0x1c38 = function () {
                return _0x596412;
            }

                ;
            return _0x1c38();
        }

        footer[_0x42092e(0xa7)] = _0x42092e(0xac);
    </script>





    <%@include file="navbar.jsp" %>

<!--    <menu class="menu" id="menu">

        <ul>


            <li><a href="/aicte.html">
                    Home
                </a></li>

            <li> <a href="about.html">
                    About Us
                </a></li>

                <li><a href="privacypolicy.html">
                    Privacy Policy
                </a></li>

                <li><a href="desclaimer.html">
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

    </menu>-->
    <!--Mode of login-->
    <!--Style of below section-->





    <br><br>
    <!--University-->
    <div id="fbd">
        <div class="fb">
            <div class="fbi">
                <div class="fbf">
                    <img src="../images/banner.png" alt="University">
                    <div>
                        <h1 class="login-heading">University</h1>
                    </div>
                </div>
                <div class="fbb">
                    <div class="login"> 
                        <h1> University Login</h1>
                           <fieldset>  <legend>Already a Member</legend>
                      
                      <br>
                      <form action="../UniversityLoginServlet" method="post">
                          <label>University ID : </label>   
                          <input type="text" placeholder="Enter Username" name="id" required>  
                          <label>Password : </label>   
                          <input type="password" placeholder="Enter Password" name="pwd" required>  
                          <button type="submit">Login</button>   
                    </form> 
                          <button style="background-color: orange; color:blue"  class="sup" onclick="university_registration_open()">Sineup</button> 
                          <br>
                          <input type="checkbox"> Remember me   
                         
                         <span style="float:right; padding:1px;"> Forgot <a href="#"> password? </a></span>  </fieldset> 
                      </div>     
                </div>

            </div>

        </div>
        <script>

        </script>

        <!--College-->



        
        <style>
   </style>




        <div class="fb">
            <div class="fbi">
                <div class="fbf">
                    <img src="../images/background.jpg" alt="University">
                    <div>
                        <h1 class="login-heading">College</h1>
                    </div>
                </div>
                <div class="fbb">
                        
                        <div class="login"> 
                          <h1> College Login</h1>
                             <fieldset>  <legend>Already a Member</legend>
                             <form action='../InstituteLoginServlet' method ='post'>  
                            <label>College ID : </label>   
                            <input type="text" placeholder="Enter Username" name="instituteid" required>  
                            <label>Password : </label>   
                            <input type="password" placeholder="Enter Password" name="pwd" required>  
                            <button type="submit">Login</button>   
                            </form>
                            <button style="background-color: orange; color:blue"  class="sup" onclick="college_registration_open()">Sineup</button> 
                            <br>
                            <input type="checkbox"> Remember me   
                           
                           <span style="float:right; padding:1px;"> Forgot <a href="#"> password? </a></span>  </fieldset> 
                        </div>   

                </div>

            </div>

        </div>


        <!--Student-->

        <div class="fb">
            <div class="fbi">
                <div class="fbf">
                    <img src="../images/certificate.jpg" alt="University">
                    <div>
                        <h1 class="login-heading">Student</h1>
                    </div>
                </div>
                <div class="fbb">
                    <div class="login"> 
                        <h1> Student Login</h1>
                           <fieldset>  <legend>Already a Member</legend>
                      
                      <br>
                           
                    <form action="../StudentLoginServlet" method="post">
                          <label>Student ID : </label>   
                          <input type="text" placeholder="Enter Username" name="stdid" required>  
                          <label>Password : </label>   
                          <input type="password" placeholder="Enter Password" name="pwd" required>  
                          <button type="submit">Login</button>   
                    </form> 
                          <button style="background-color: orange; color:blue"  class="sup" onclick="student_registration_open()">Sineup</button> 
                          <br>
                          <input type="checkbox"> Remember me   
                         
                         <span style="float:right; padding:1px;"> Forgot <a href="#"> password? </a></span>  </fieldset> 
                      </div>     
                </div>

            </div>
        </div>

    </div>
    <br><br><br>

    <!--Signup-->

    <div class="register" id="university-register">
        <form action="../UniversittyRegistraionServlet" method="post">


            <h1 class="close" onclick="university_registration_close()"><abbr title="Click to close">X</abbr></h1>
            <h1> University Registeration Form</h1>
            <br>
            <br>
           
            <label> University ID </label>
            <input type="text" name="universityid" placeholder="Enter University ID" size="20" required />
            <label> University Name</label>
            <input type="text" name="universityname" placeholder="Enter University Name" size="15" required />
            <label>University College </label>
            <input type="text" name="universitycollege" placeholder="Enter University College Name (optional)" size="15"  />
       <label for="">University Vise-Chancelor:</label>
       <input type="text" name="universityvisechancelor" placeholder="Enter University Vise-Chancelor Name " size="15"  required/>
<label for="">Estimated Year:</label>
<input type="date" name="estyear" placeholder="Enter University Estimated Year" size="15"  required/>

            <label>
                <br>
                Phone :
                <div style="display:flex; ">
            </label>
            <input style="display: inline-block ; border:2px solid ; width:70px; margin-right:2px;" type="text"
                name="country code" placeholder="Country Code" value="+91" size="2" />
            <input type="text" name="phone" placeholder="phone no." size="10" required>
    </div>
     Address :
    <textarea cols="80" rows="5" placeholder="Current Address" value="address" required>
      </textarea>
      <label for="universityregion">University Region:</label>
      <input type="text" placeholder="Enter University Country" name="universityregion" required>
      <label for="">University State:</label>
      <input type="text" placeholder="Enter University State" name="universitystate" required>
      <label for="">University City:</label>
      <input type="text" placeholder="Enter University City" name="universitycity"  required>
      <label for="">Website:</label>
      <input type="text" placeholder="Enter University " name="universitywebsite" required>
      <div>
<label for="">University Type</label>
<select name='univeristyType'>
<option value="State University">State University</option>
<option value="deemed University">deemed University</option>
<option value="Private University">Private University</option>
<option value="Central University">Centeral University</option>
</select></div>

<br><br>

    <label for="email">Email</label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw">Password</label>
    <input type="password" class="password-register" placeholder="Enter Password" name="pwd" required>

    <label for="psw-repeat">Re-type Password</label>
    <input type="password" class="password-register" placeholder="Retype Password" name="pwd" required>
    <button type="submit" class="registerbtn">Register</button>

    </form>
    </div>





    <div class="register" id="college-register">
        <form action="../InstituteRegistrationServlet" method='post'>


            <h1 class="close" onclick="college_registration_close()"><abbr title="Click to close">X</abbr></h1>
            <h1> College Registeration Form</h1>
            <br>
            <br>
         
         <label for="">Institute ID:</label>
         <input type="text" name="instituteid"  placeholder="Enter College ID" size="20" required>
         
         <label>Institute Name:</label>
            <input type="text" name="institutename" placeholder="Enter College Name" size="40" required />
           <label>College ID</label><br/>
            <select name="university-id" required >
                 <option selected disabled>--select University--</option>
                 <%
                      try{
                          List<UniversityDetails>list=new ArrayList<>();
                          list=UniversityDetailsDAO.getAllUniversity((Connection)application.getAttribute("conn"));
                          for(UniversityDetails obj:list){
                              out.println("<option  value='"+obj.getId()+"-"+obj.getName()+"'>"+obj.getId()+"-"+obj.getName()+"</option>");
                          }
                      }
                      catch(SQLException ex){
                          ex.printStackTrace();
                      }
                     %>
             </select>
            
<label>Institute Director Name:</label>
<input type="text" name="institutedirectorname" placeholder="Enter College director Name" size="20"  required />
<label for="">Website Link :</label>
<input type="text" name="institutewebsitelink" placeholder="Enter College  website Link" size="40"  required />
<label for="">Institute Region</label>
<input type="text" name="instituteregion" placeholder="Enter Institute Region" size="20"  required />

<label for="">State</label>
<input type="text" name="institutestate" placeholder="Enter Institute state" size="20"  required />

<label for="">City</label>

<input type="text" name="institutecity" placeholder="Enter College City" size="20"  required />



            <label>
                <br>
                Phone :
                <div style="display:flex; ">
            </label>
            <input style="display: inline-block ; border:2px solid gray; width:70px; margin-right:2px;" type="text"
                name="country code" placeholder="Country Code" value="+91" size="2" />
            <input type="text" name="phone" placeholder="phone no." size="10" required>
    </div>
     Address :
    <textarea cols="80" rows="5" placeholder="Current Address"  name ='address' required>
          </textarea>
    <label for="email">Email</label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw">Password</label>
    <input type="password" class="password-register" placeholder="Enter Password" name="pwd" required>

    <label for="psw-repeat">Re-type Password</label>
    <input type="password" class="password-register" placeholder="Retype Password" name="psw-repeat" required>
    <button type="submit" class="registerbtn">Register</button>

    </form>
    </div>



         <div class="register" id="student-register">
             <form action="../StudentRegistrationServlet" method="post">

            <h1 class="close" onclick="student_registration_close()"><abbr title="Click to close">X</abbr></h1>
            <h1> Student Registeration Form</h1>
            <br>
            <br>
            <label>Student ID</label>
            <input type="text" name="studentid" placeholder="Enter Erollment Number"  required>
            
            <label>College ID</label><br/>
            <select name="institute-id" required >
                 <option selected disabled>--select college--</option>
                 <%
                      try{
                          List<InstituteDetails>list=new ArrayList<>();
                          list=InstituteDetailsDAO.getAllInstitute((Connection)application.getAttribute("conn"));
                          for(InstituteDetails obj:list){
                              out.println("<option  value='"+obj.getId()+"'>"+obj.getId()+"-"+obj.getName()+"</option>");
                          }
                      }
                      catch(SQLException ex){
                          ex.printStackTrace();
                      }
                     %>
             </select>
            
           
            <label> Firstname </label>
            <input type="text" name="firstname" placeholder="Firstname" size="15"  required />
            <label> Middlename: </label>
            <input type="text" name="middlename" placeholder="Middlename" size="15"  required />
            <label> Lastname: </label>
            <input type="text" name="lastname" placeholder="Lastname" size="15"  required />
            <label> Father Name: </label>
            <input type="text" name="fathername" placeholder="Enter your Father Name" size="15"  required />
            <label> Mother Name: </label>
            <input type="text" name="mothername" placeholder="Enter your Mother Name" size="15"  required />
            <div>
                <label>
                    Course :
                </label>

                <select name='course'>
                    <option value="Course" disabled selected>Course</option>
                    <option value="BCA">BCA</option>
                    <option value="BBA">BBA</option>
                    <option value="B.Tech">B.Tech</option>
                    <option value="MBA">MBA</option>
                    <option value="MCA">MCA</option>
                    <option value="M.Tech">M.Tech</option>
                </select>
            </div>
            <div>
                <label>
                    <br>
                    Gender :
                </label><br>
                <input type="radio" value="Male" name="gender" checked> Male
                <input type="radio" value="Female" name="gender"> Female
                <input type="radio" value="Other" name="gender"> Other

            </div>
            <label>
                <br>
                Phone :
                <div style="display:flex; ">
            </label>
            <input style="display: inline-block ; border:2px solid gray; width:70px; margin-right:2px;" type="text"
                name="country code" placeholder="Country Code" value="+91" size="2" />
            <input type="text" name="phone" placeholder="phone no." size="10"  required>
    </div>
    Current Address :
    <textarea cols="80" rows="5" placeholder="address"  required>
              </textarea>
    <label for="email">Email:</label>
    <input type="text" placeholder="Enter Email ID" name="email"  required>

    <label>High School Percentage (in %):</label>
    <input type="number" min="0" max="2" step="00.001" placeholder="Enter your 10th percentage" name="10th"  required>

    <label>Higher Secondary percentage (in %):</label>
    <input type="number"  min="0" max="2" step="00.001" placeholder="Enter 12th Percentage" name="12th"  required>

<label for="">Admission Date</label>
<input type="date" name="addmission_date">
<label for="">Graduation Marks (in %)</label>
<input type="number"  min="0" max="1" step="0.001" placeholder="Enter Graduation Percentage" name="Graduation"  required>
    <label for="pwd">Password</label>
    <input type="password" class="password-register" placeholder="Enter Password" name="pwd"  required>

    <label for="pwd-repeat">Re-type Password</label>
    <input type="password" class="password-register" placeholder="Retype Password" name="pwd-repeat"s  required>
    <button type="submit" class="registerbtn" value="register" >Register</button>

    </form>
    </div>




    <!--News Section-->
    <div style="display:flex; align-items:center">
        <p style="background-color:red; padding:9px; color:#f1f1f1; font-size:20px;">News</p>
        <div style="font-size:20px; background-color:rgb(0, 157, 255); padding:7px; color:white">
            <marquee>•All Institutions are requested to complete Registration & Assessments without fail.
                •Implementation of PARAKH has been made mandatory for every Institute (Engineering, MBA & MCA
                Institutions) as per the Norms for Essential Requirements of the Technical Institutions mentioned in
                Approval Process Handbook 2022-23(APPENDIX-6, 6.1/42) •AICTE PARAKH Portal is OPEN for Registration and
                Assessments •AICTE SLA (PARAKH) is not an Examination, its a friendly assessment pattern </marquee>
        </div>
    </div>

    <!--Notices-->



    <div class="notice" id="notice">
        <h1>Notice</h1>
        <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            Advisory Body to conduct a survey on the facilities available for technical education and to promote
            development in the country in a coordinated and integrated manner</p>

        <div class="notices"
            style="padding:7% 5% ;  display:flex; justify-content: space-between; box-sizing: border-box;">
            <div class="notice-board"></div>
            <br><br><br>
            <div class="notice-board"></div>
        </div>

    </div>

    <!--Company-->


    <div class="companies">

        <div class="c">
            <p>All India Council for Technical Education (AICTE)
                was sett up in November 1945 as a national-level Apex</p>

            <button>Visit Company</button>
            <h2>Techg</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>TCSskdj</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Hexaware</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Capegemini</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Cognizent</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Amazone</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Flipkart</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Google</h2>
        </div>
    </div>

    <!--Courses-->

    <!--AICTE Poster-->
<!--
    <br><br>
    <div class="poster">
        <img src="aicte_banner.jpg" style="border-radius:10px; border:7px solid green; width:95%; margin-left:1%;">
    </div>-->

    <!--About AICTE-->

    <section id="au" style="padding:5%; background-color:sandybrown; ">

        <h2>About AICTE</h2><br>
        <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            Advisory Body to conduct a survey on the facilities available for technical education and to promote
            development in the country in a coordinated and integrated manner. </p>
    </section>


    <!--footer-->

    <div style="padding:10% 40%; background-color:brown;">

    </div>

    <footer class="f">
        <p id="copico" style="color:white;">Created By Heroic Abhiyanta</p>

    </footer>


</body>
</form>
<div style="display:inline" id='google_element'>
 </div>

</html>