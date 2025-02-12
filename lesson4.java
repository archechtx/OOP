import java.util.*;

public class lesson4 {
    ArrayList<Human> list = new ArrayList<Human>();
    public lesson4() {
        list.add(new Student());
        list.add(new Worker());
    }
    public static void main(String[] args) {
        new lesson4();
    }
}
class Human{
    private String nim;
    public Human(){}
    public Human(String nim){
        this.nim = "9";
        // nim = _nim; kalau mau diganti namanya
    }

    //setter
    public void setNim(String v){
        nim = v;
    }

    //getter
    public String getNim(){
        return nim;
    }
}

class Student extends Human{
    public Student(){}
}

class Worker extends Human{
    public Worker(){}
}
