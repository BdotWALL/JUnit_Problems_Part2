package averagemethodjunit5;

public class AverageMethod {
    public static void main(String[] args) throws Exception {

        double avgs = average(8, 7, 5);
        System.out.println("The average is: " + avgs);
    }

    public static int sum(int num1, int  num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double average(int num1, int  num2, int num3) {
        int sum = sum(num1,  num2, num3);
        double avg = sum/3.0;
        return  avg;

    }
}
