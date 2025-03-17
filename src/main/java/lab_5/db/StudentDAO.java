package lab_5.db;

import lab_5.model.Sex;
import lab_5.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public static List<Student> getStudentsByMonth(int month) {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM STUDENT_DB WHERE MONTH(birth_date) = ?";//? is a placeholder for month

        try(Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, month); //change ? to a specific month
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("Id"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("middle_name"),
                        resultSet.getDate("birth_date"),
                        resultSet.getString("student_card_number"),
                        Sex.valueOf(resultSet.getString("sex"))//Convert to enum Sex
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
