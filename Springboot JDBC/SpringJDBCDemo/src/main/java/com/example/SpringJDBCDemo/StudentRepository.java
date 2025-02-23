package com.example.SpringJDBCDemo;

import com.example.SpringJDBCDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student){
        // added
        String sql = "INSERT INTO student (id, name, tech) VALUES (?,?,?)";
        int rows = jdbcTemplate.update(sql,student.getId(),student.getName(),student.getTech());
        System.out.println(rows+" rows affected.");
    }


    public List<Student> findAll(){
        String sql = "SELECT * FROM student";
//        RowMapper<Student> rowMapper  = new RowMapper() {
//            @Override
//            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                Student s = new Student();
//                s.setId(rs.getInt(1));
//                s.setName(rs.getString(2));
//                s.setTech(rs.getString(3));
//                return s;
//            }
//        };
        RowMapper<Student> rowMapper = (rs, rowNum) ->{
            Student s = new Student();
            s.setId(rs.getInt(1));
            s.setName(rs.getString(2));
            s.setTech(rs.getString(3));
            return s;
        };

        return jdbcTemplate.query(sql,rowMapper);
    }

}
