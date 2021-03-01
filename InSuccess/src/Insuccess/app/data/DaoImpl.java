package Insuccess.app.data;

import Insuccess.app.manager.DBConnectionManager;
import Insuccess.app.model.Question;
import Insuccess.app.model.Questions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoImpl {

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

    public Question[] createRandomQuizes() {
        String query = "SELECT pronunciation,answer1,answer2,answer3,answer4,rightanswer FROM questions ORDER BY random() LIMIT 60";

        Connection con = this.manager.getCon();
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet i = ps.executeQuery();
            Question[] a = new Question[60];
            int count = 0;
            while (i.next()) {
                String pron = i.getString("pronunciation");
                String a1 = i.getString("answer1");
                String a2 = i.getString("answer2");
                String a3 = i.getString("answer3");
                String a4 = i.getString("answer4");
                String ra = i.getString("rightanswer");
                a[count++] = new Question(pron,a1 , a2, a3, a4, ra);

            }
            return a;
        } catch (SQLException sqlException) {
            System.out.println("Error");
        }
        return null;
    }
}
