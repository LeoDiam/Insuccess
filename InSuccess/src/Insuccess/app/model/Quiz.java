package Insuccess.app.model;

import Insuccess.app.data.DaoImpl;
import Insuccess.app.manager.DBConnectionManager;


public class Quiz {
public void createRandomQuiz(){
    DBConnectionManager manager = new DBConnectionManager();
    DaoImpl impl = new DaoImpl(manager);
    Question[] a = impl.createRandomQuizes(); // this create a quiz containing 60 random questions

}

}
