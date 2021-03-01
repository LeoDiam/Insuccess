package Insuccess.app.model;

public class Question {
    private String pron;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String ra;
    public Question(String pron, String a1, String a2,String a3, String a4, String ra) {
        this.pron = pron;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.ra = ra;
        if(ra.equals("α")){
            this.ra = this.a1;
        }else if(ra.equals("β")){
            this.ra = this.a2;
        }else if(ra.equals("γ")){
            this.ra = this.a3;
        }else if(ra.equals("δ")){
            this.ra = this.a4;
        }
    }

    public String getPron() {
        return pron;
    }

    public void setPron(String pron) {
        this.pron = pron;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Question{" +
                "pron='" + pron + '\'' +
                ", a1='" + a1 + '\'' +
                ", a2='" + a2 + '\'' +
                ", a3='" + a3 + '\'' +
                ", a4='" + a4 + '\'' +
                ", ra='" + ra + '\'' +
                '}';
    }
}
