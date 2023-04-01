/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClasses;

import EntityClasses.InstituteDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class InstituteDetailsDAO {
    public static boolean addInstitute(Connection conn,InstituteDetails obj)throws SQLException
    {
       PreparedStatement ps=conn.prepareStatement("insert into institute_details values(?,?,?,?,?,?,?,?)");
       ps.setString(1, obj.getId());
       ps.setString(2,obj.getName());
       ps.setString(3,obj.getAddress());
       ps.setString(4,obj.getDirector());
       ps.setString(5,obj.getWebsite());
       ps.setString(6,obj.getPhone());
       ps.setString(7,obj.getUniversity());
       ps.setString(8,obj.getEmail());
       
       boolean result= ps.executeUpdate()==1;
       if(result){
           ps=conn.prepareStatement("insert into institute_registered values(?,?)");
           ps.setString(1,obj.getId());
           ps.setString(2,obj.getPwd());
           
           result=ps.executeUpdate()==1;
       }
       return result;
    }
     public static boolean validateInstitute(Connection conn,String instituteid,String pwd)throws SQLException{
         PreparedStatement ps=conn.prepareStatement("select institute_id from institute_registered where institute_password=?");
         ps.setString(1,pwd);
         ResultSet rs=ps.executeQuery();
         return rs.next();
     }
     public static List<InstituteDetails>getAllInstitute(Connection conn)throws SQLException
     {
         Statement st=conn.createStatement();
         ResultSet rs=st.executeQuery("select institute_id,institute_name from institute_details");
         List<InstituteDetails>li=new ArrayList<>();
          while(rs.next()){
             InstituteDetails obj=new InstituteDetails();
             obj.setId(rs.getString(1));
             obj.setName(rs.getString(2));
             li.add(obj);
         }
          return li;
     }
}
