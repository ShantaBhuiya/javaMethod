package method;

public class MethodDemo {
    //method is 2 type,  void and return
    // void method demo

    int time = 12;

    public void cook() {
        if (time == 12) {
            System.out.println("please cook");
        } else {
            System.out.println("cook the snacks");
        }
    }

    public void helloGoodMorning() {
        System.out.println("hello good morning, today was august 7th 2022");

    }

    public void helloGoodAfternoon() {
        System.out.println("hello good afternoon, today was august 7th 2022");

    }

    public void helloGoodEvening() {
        System.out.println("hello good Evening, today was august 7th 2022");

    }

    // return method
    public String goodMorning() {
        return "hello good morning, today was august 7th 2022";
    }

    public int add() {
        return 2 + 2;
    }

    public double price() {
        return 1.2 + 2.3;
    }

}























