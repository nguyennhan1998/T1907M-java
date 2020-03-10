package session6;

import assignment7fix.Product;
import assignment8.Student;
import connector.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDataAccessObject implements DataAccessObjectConcrete<Student> {
    private static StudentDataAccessObject instance;
    private StudentDataAccessObject(){

    }
    public static StudentDataAccessObject getInstance(){
        if(instance ==null){
            instance= new StudentDataAccessObject();
        }
        return instance;
    }
    @Override
    public ArrayList<Student> list() {
        try{
            Connector conn=Connector.getInstance();
            ResultSet rs=conn.getQuery("select * from students");
            ArrayList<Student> ls=new ArrayList<>();
            while(rs.next()){
                ls.add(new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("mark")));
            }
            return ls;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
   public Student getOne(int id){
        try{
            Connector conn=Connector.getInstance();
            ResultSet rs=conn.getQuery("select * from student where id = "+id);
            while(rs.next()){
                return new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getInt("mark"));

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
   }
    @Override
    public Boolean create(Student student) {
        try{
            Connector conn=Connector.getInstance();
            String sql="insert into students(name,age,mark) values('"+student.getName()+"',"+student.getAge()+","+student.getMark()+")";
            return conn.excuteUpdate(sql);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean update(Student student) {
        try{
            Connector conn=Connector.getInstance();
            String sql="update students set name = "+student.getName()+
                    " age = "+student.getAge()+
                    " mark = "+student.getMark()+"where id = "+student.getId();
            return  conn.excuteUpdate(sql);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  false;
    }

    @Override
    public Boolean delete(Student student) {
        try{
            Connector conn=Connector.getInstance();
            String sql="delete from students where id="+student.getId();
            return conn.excuteUpdate(sql);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
