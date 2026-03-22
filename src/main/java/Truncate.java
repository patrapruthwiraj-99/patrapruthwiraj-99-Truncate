import Util.ConnectionUtil;
import Util.FileUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Truncate {

    /**
     *      Song Table Diagram:
     *      |      title        |        artist         |
     *      ---------------------------------------------
     *      |'Let it be'        |'Beatles'              |
     *      |'Imagine'          |'Beatles'              |
     *      |'Kashmir'          |'Led Zeppelin'         |
     */
    public void problem2(){
        /**
         * problem2: remove all the records from the table "song". Please refer to the README.MD for where to place your code. 
         */
        String sql = FileUtil.parseSQLFile("problem2.sql");



        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement s = connection.createStatement();
            s.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("problem2: " + e.getMessage() + '\n');
        }
    }
}
