public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.penTip);

    }
}

class Pen {
    String color;
    int penTip;

    void setColor(String newColor){
        color =  newColor;
    }
    void setTip(int newTip){
        penTip = newTip;
    }
}