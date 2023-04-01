<%--<%@page import="DAOClasses.UniversityDAO"%>--%>
<%@page import="java.util.List,java.sql.Connection,java.sql.SQLException"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="aicte.css" />
    <title>Collage Registration Page</title>
  </head>
    <body class="form-body">
      <div>
        <form action="CollageRegistration">
          <fieldset class="signup">
            <legend>Collage Registration</legend>
            <label for="id"
              >College ID <input id="id" type="text" name="id" required
            /></label>
            <label for="collage_name"
              >College Name <input id="collage_name" type="text" name="collage_name" required
            /></label>
            <label for="university_name"
                    >University Name <select id="university_name" name="uni_names" required>
                    <option selected disabled>--select--</option>
                    <%
                        
                        try{
//                            List<String>list=UniversityDAO.getAllUniveristiyNameWithId((Connection)application.getAttribute("conn"));
//                            System.out.println(list);
//                            for(String x:list)
                            {
//                                out.println("<option>"+x+"</option>");
                            }
                        }
                        catch(Exception ex)
                        {
                           ex.printStackTrace(); 
                        }
                     %>
                </select></label>
            <label for="email"
              >Email<input type="email" id="email" name="email" required
            /></label>
            <label for="password"
              >Password
              <input id="password" type="password" name="password" required
            /></label>
            <label for="cpassword"
              >Confirm Password
              <input id="cpassowrd" type="password"  required
            /></label>
            <label for="courses"
              >Courses
              <select required name="courses">
                <option disabled selected>--select--</option>
                <option value="B.tech">B.tech</option>
                <option value="M.tech">M.tech</option>
              </select></label
            >
            <label for="address"
              >Address <input id="address" type="text" name="address" required
            /></label>
            <label for="city"
              >City <input id="city" type="text" name="city" required
            /></label>
            <label for="state"
              >State
              <select required name="state">
                <option disabled selected>--select--</option>
                <option value="Madhya Pradesh">Madhya Pradesh</option>
                <option value="Uttar Pradesh">Uttar Pradesh</option>
              </select></label
            >
            <label for="code"
              >Pincode <input id="code" type="text" name="pincode" required
            /></label>
            <label for="number"
              >Contact Number <input id="number" type="text" name="number"required
            /></label>
            <input
              type="submit"
              name="submit"
              value="SignUp"
              id="signup"
              required
            />
          </fieldset>
        </form>
      </div>
    </body>
</html>
