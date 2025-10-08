package BT_JavaBasic2;

public class Calculator {
    //Hàm tính tổng 2 số nguyên
    public int sum(int a, int b) {
        return a + b;
    }

    //Hàm tính tích 2 số thực
    public float tich(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 3));
        System.out.println(calculator.tich(2, 3));

        int soA = 2;
        int soB = 3;
        int tong = calculator.sum(soA, soB);
        System.out.println("Tổng của "+soA + " và " + soB + " = "+tong);
        float soC = 2;
        float soD = 3;
        float tich = calculator.tich(soC, soD);
        System.out.println("Tích của "+soC + " và " + soD + " = "+tich);

    }
}
