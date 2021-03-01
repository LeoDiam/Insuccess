package Insuccess.app.main;


import Insuccess.app.data.DaoImpl;
import Insuccess.app.manager.DBConnectionManager;
import Insuccess.app.model.Question;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        DBConnectionManager manager = new DBConnectionManager();
        DaoImpl impl = new DaoImpl(manager);
        Question[] a = impl.createRandomQuizes();
        Scanner sc = new Scanner(System.in);
        int right = 0;
        int wrong = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ερώτηση "+(i + 1) + ") " + a[i].getPron());
            System.out.println("a)"+a[i].getA1());
            System.out.println("b)"+a[i].getA2());
            System.out.println("c)"+a[i].getA3());
            System.out.println("d)"+a[i].getA4());
            System.out.println("Choose your answer: 1,2,3 or 4");
            int ans = sc.nextInt();
            if (ans == 1) {
                if(a[i].getA1().equals(a[i].getRa())){
                 ++right;
                }else{
                    ++wrong;
                }
            } else if (ans == 2) {
                if(a[i].getA2().equals(a[i].getRa())){
                    ++right;
                }else{
                    ++wrong;
                }
            } else if (ans == 3) {
                if(a[i].getA3().equals(a[i].getRa())){
                    ++right;
                }else{
                    ++wrong;
                }
            } else if (ans == 4) {
                if(a[i].getA4().equals(a[i].getRa())){
                    ++right;
                }else{
                    ++wrong;
                }
            }


        }
        System.out.println("You got "+right+"/"+(wrong+right));
        if(right < (right+wrong) * 0.9){
            System.out.println("Failed");
        }else{
            System.out.println("Passed");
        }
    }
}
