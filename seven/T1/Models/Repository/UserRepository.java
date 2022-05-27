package seven.T1.Models.Repository;

import seven.T1.Models.Entity.UserEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserRepository implements AutoCloseable{
    //    public class PersonRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserRepository() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "system", "university");
        connection.setAutoCommit (false);
    }



    public void update (UserEntity personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("UPDATE files.user SET username=?,password=?,RDV=?,Liability=? WHERE id=? ");
        preparedStatement.setString (1,personEnti.getUsername());
        preparedStatement.setString (2,personEnti.getPassword());
        preparedStatement.setDouble (3,personEnti.getRDV());
        preparedStatement.setDouble (4,personEnti.getLiability());
        preparedStatement.setLong (5,personEnti.getId ());
        preparedStatement.executeUpdate ();
    }

//    public void delete(Long id) throws Exception{
//        preparedStatement=connection.prepareStatement ("DELETE FROM files.user WHERE id=?");
//        preparedStatement.setLong (1,id);
//        preparedStatement.executeUpdate ();
//    }

    public List<UserEntity> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM files.user");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<UserEntity> personEntiList=new ArrayList <> ();
        while (resultSet.next ()){
            UserEntity personEnti=new UserEntity (); // call by reference
            personEnti.setId (resultSet.getLong ("id"));
            personEnti.setUsername (resultSet.getString ("username"));
            personEnti.setPassword (resultSet.getString ("password"));
            personEnti.setRDV (resultSet.getDouble ("RDV"));
            personEnti.setLiability (resultSet.getDouble ("Liability"));
            personEntiList.add (personEnti);
        }
        return personEntiList;
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
}
