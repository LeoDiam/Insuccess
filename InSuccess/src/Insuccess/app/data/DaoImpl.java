package Insuccess.app.data;

import Insuccess.app.manager.DBConnectionManager;
import Insuccess.app.model.Questions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoImpl  {

    private final DBConnectionManager manager;

    public DaoImpl(DBConnectionManager manager) {
        this.manager = manager;
    }
    public void insertQuestions(Questions q) {
        String query = "insert into questions(qid,pronunciation, answer1, answer2, answer3, answer4, rightanswer) values('"
                + q.getId() + "','"
                + q.getPronunciation() + "','"
                + q.getAnswer1() + "','"
                + q.getAnswer2() + "','"
                + q.getAnswer3() + "','"
                + q.getAnswer4() + "','"
                + q.getRightanswer() +
                "')";

        Connection con = this.manager.getCon();
        try {
            PreparedStatement ps = con.prepareStatement(query);
            int i = ps.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println("Input jar");
        }

    }
}
