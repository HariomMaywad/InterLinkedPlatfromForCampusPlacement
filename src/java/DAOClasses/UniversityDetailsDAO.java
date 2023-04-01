/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClasses;

import EntityClasses.UniversityDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hmayw
 */
public class UniversityDetailsDAO {
    public static boolean addUniversity(Connection conn,UniversityDetails obj)throws SQLException{
        PreparedStatement ps=conn.prepareStatement("insert into university_details values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,obj.getId());
        ps.setString(2,obj.getName());
        ps.setString(3,obj.getVice_chancelor());
        ps.setString(4,obj.getPhone());
        ps.setString(5,null);
        ps.setString(6,obj.getEmail());
        ps.setString(7,obj.getAddress());
        ps.setString(8,obj.getRegion());
        ps.setString(9,obj.getState());
        ps.setString(10,obj.getCity());
        ps.setString(11,obj.getWebsite());
        ps.setString(12,obj.getType());
        ps.setString(13,obj.getPwd());
        
        return ps.executeUpdate()==1;
    }
    public static boolean validateUniversity(Connection conn,String id,String pwd)throws SQLException{
         PreparedStatement ps=conn.prepareStatement("select university_id from university_details where university_password=?");
         ps.setString(1,pwd);
         ResultSet rs=ps.executeQuery();
         return rs.next();
     }
     public static List<UniversityDetails>getAllUniversity(Connection conn)throws SQLException
     {
         Statement st=conn.createStatement();
         ResultSet rs=st.executeQuery("select university_id,university_name from university_details");
         List<UniversityDetails>li=new ArrayList<>();
          while(rs.next()){
             UniversityDetails obj=new UniversityDetails();
             obj.setId(rs.getString(1));
             obj.setName(rs.getString(2));
             li.add(obj);
         }
          return li;
     }
     public static UniversityDetails getUniversityDetails(Connection conn,String id)throws SQLException{
         PreparedStatement ps=conn.prepareStatement("select * from university_details where university_id=?");
         ps.setString(1,id);
         ResultSet rs=ps.executeQuery();
         rs.next();
         UniversityDetails obj=new UniversityDetails();
         obj.setId(rs.getString(1));
         obj.setName(rs.getString(2));
         obj.setVice_chancelor(rs.getString(3));
         obj.setPhone(rs.getString(4));
         obj.setEmail(rs.getString(5));
         obj.setAddress(rs.getString(6));
         obj.setRegion(rs.getString(7));
         obj.setState(rs.getString(8));
         obj.setCity(rs.getString(9));
         obj.setWebsite(rs.getString(10));
         obj.setType(rs.getString(11));
         obj.setPwd(rs.getString(12));
         obj.setYear(rs.getString(13));
         
         return obj;
 }
      public static boolean updateUniversity(Connection conn,UniversityDetails obj)throws SQLException{
        PreparedStatement ps=conn.prepareCall("delete from university_details where university_id=?");
        ps.setString(1,obj.getId());
        ps.executeUpdate();
        ps=conn.prepareStatement("insert into university_details values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,obj.getId());
        ps.setString(2,obj.getName());
        ps.setString(3,obj.getVice_chancelor());
        ps.setString(4,obj.getPhone());
        ps.setString(5,obj.getEmail());
        ps.setString(6,obj.getAddress());
        ps.setString(7,obj.getRegion());
        ps.setString(8,obj.getState());
        ps.setString(9,obj.getCity());
        ps.setString(10,obj.getWebsite());
        ps.setString(11,obj.getType());
        ps.setString(12,obj.getPwd());
        ps.setString(13, obj.getYear());
        
        return ps.executeUpdate()==1;
    }
}
