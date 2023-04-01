/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClasses;

import EntityClasses.StudentDetails;
import EntityClasses.StudentDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class StudentDetailsDAO {
   public static boolean addStudent(Connection conn,StudentDetails obj)throws SQLException
   {
      PreparedStatement ps=conn.prepareStatement("insert into student_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
      ps.setString(1,obj.getId());
      ps.setString(2,obj.getInstitute_id());
      ps.setString(3,obj.getGender());
      ps.setString(4,obj.getFname());
      ps.setString(5,obj.getLname());
      ps.setString(6,obj.getMname());
      ps.setString(7,obj.getFather_name());
      ps.setString(8,obj.getMother_name());
      ps.setString(9,obj.getAddress());
      ps.setString(10,obj.getEmail());
      ps.setLong(11,obj.getPhone());
      ps.setDouble(12,obj.getXthPercent());
      ps.setDouble(13,obj.getXiiPercent());
      ps.setDate(14,obj.getAdmissionDate());
      ps.setString(15,obj.getCourse());
      ps.setString(16,null);
      ps.setDouble(17,obj.getDeg_percent());
      
      boolean result=ps.executeUpdate()==1;
      if(result==true)
      {
          ps=conn.prepareStatement("insert into student_registered values(?,?)");
          ps.setString(1,obj.getId());
          ps.setString(2,obj.getPwd());
          
          result=ps.executeUpdate()==1;
      }
      return result;
   }
   public static boolean validateStudent(Connection conn,String stdid,String pwd)throws SQLException{
         PreparedStatement ps=conn.prepareStatement("select student_id from student_registered where student_password=?");
         ps.setString(1,pwd);
         ResultSet rs=ps.executeQuery();
         return rs.next();
     }
}
