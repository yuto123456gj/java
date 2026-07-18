public class kadai {

    public static void main(String[] args) {
        
     
        double height = 170.5; // 170.5 cm
        double weight = 65.2;  // 65.2 kg
        
        double result = bmi(height, weight);
        
        System.out.println("--- BMI計算結果 ---");
        System.out.println("身長: " + height + "cm, 体重: " + weight + "kg");
        System.out.printf("BMI値: %.2f\n\n", result); 


        System.out.println("--- 平均値計算結果 ---");
        System.out.println("average(10, 20)           // " + average(10, 20));
        System.out.println("average(10, 20, 30)       // " + average(10, 20, 30));
        System.out.println("average(10, 20, 30, 40)   // " + average(10, 20, 30, 40));
        System.out.println("average(10, 20, 30, 40, 50) // " + average(10, 20, 30, 40, 50));
    }

    public static double bmi(double height, double weight) {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

  
    public static double average(int n1, int n2) {
        return (double)(n1 + n2) / 2;
    }

    public static double average(int n1, int n2, int n3) {
        return (double)(n1 + n2 + n3) / 3;
    }

    public static double average(int n1, int n2, int n3, int n4) {
        return (double)(n1 + n2 + n3 + n4) / 4;
    }

    public static double average(int n1, int n2, int n3, int n4, int n5) {
        return (double)(n1 + n2 + n3 + n4 + n5) / 5;
    }
}