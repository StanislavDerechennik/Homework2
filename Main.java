public class Main {

    public static void main(String[] args){
        Test1 test1 = new Test1();
        test1.displayInfo();
        test1.changeFirstNumber(5);
        test1.changeSecondNumber(7);
        test1.displayInfo();
        System.out.println("Sum of numbers is " + test1.sumOfNumbers());
        System.out.println("Maximum of numbers is " + test1.maxOfNumbers());

        Test2 test2 = new Test2();
        System.out.println(test2.getNumber1() + " " + test2.getNumber2());
        test2.setNumber1(23);
        test2.setNumber2(42);
        System.out.println(test2.getNumber1() + " " + test2.getNumber2());
        test2 = new Test2(-78, -56);
        System.out.println(test2.getNumber1() + " " + test2.getNumber2());
    }
}

class Test1 {
    private int number1 = 1, number2 = 2;

    public void displayInfo() {
        System.out.println("First number is " + number1 + ", second number is " + number2);
    }
    public void changeFirstNumber(int number1) {
        this.number1 = number1;
    }
    public void changeSecondNumber(int number2) {
        this.number2 = number2;
    }
    public int sumOfNumbers() {
        return number1 + number2;
    }
    public int maxOfNumbers() {
        return Math.max(number1, number2);
    }
}

class Test2 {
    private int number1, number2;

    public Test2() {
        number1 = 3;
        number2 = -6;
    }

    public Test2(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}