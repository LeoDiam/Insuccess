package Insuccess.app.main;


import Insuccess.app.data.DaoImpl;
import Insuccess.app.manager.DBConnectionManager;
import Insuccess.app.model.Questions;


public class Main {


    public static void main(String[] args) {
         DBConnectionManager manager = new DBConnectionManager();
        DaoImpl impl = new DaoImpl(manager);
      //  impl.insertQuestions(q);

    }
}
