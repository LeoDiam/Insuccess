package Insuccess.app.model;

import org.apache.poi.xssf.usermodel.XSSFCell;

public class Questions {
    private int id;
    private XSSFCell pronunciation;
    private XSSFCell answer1;
    private XSSFCell answer2;
    private XSSFCell answer3;
    private XSSFCell answer4;
    private XSSFCell rightanswer;


    public Questions(int id,
                     XSSFCell pronunciation, XSSFCell answer1, XSSFCell answer2, XSSFCell answer3, XSSFCell answer4, XSSFCell rightanswer) {
        this.pronunciation = pronunciation;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.rightanswer = rightanswer;
        this.id = id;
    }


    public XSSFCell getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(XSSFCell pronunciation) {
        this.pronunciation = pronunciation;
    }

    public XSSFCell getAnswer1() {
        return answer1;
    }

    public void setAnswer1(XSSFCell answer1) {
        this.answer1 = answer1;
    }

    public XSSFCell getAnswer2() {
        return answer2;
    }

    public void setAnswer2(XSSFCell answer2) {
        this.answer2 = answer2;
    }

    public XSSFCell getAnswer3() {
        return answer3;
    }

    public void setAnswer3(XSSFCell answer3) {
        this.answer3 = answer3;
    }

    public XSSFCell getAnswer4() {
        return answer4;
    }

    public void setAnswer4(XSSFCell answer4) {
        this.answer4 = answer4;
    }

    public XSSFCell getRightanswer() {
        return rightanswer;
    }

    public void setRightanswer(XSSFCell rightanswer) {
        this.rightanswer = rightanswer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "pronunciation='" + pronunciation + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", rightanswer='" + rightanswer + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
