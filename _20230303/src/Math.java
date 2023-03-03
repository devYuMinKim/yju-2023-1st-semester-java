public class Math {
    int add(int x, int y) {
        return x + y;
    }

    int square(int i) {
        return i * i;
    }

    double square(double i) {
        return i * i;
    }

    public static void main(String[] args) {
        int sum;
        Math math = new Math();
        sum = math.add(2, 3);
        System.out.println("2와 3의 합은 " + sum + "입니다."); // 2와 3의 합은 5입니다.
        sum = math.add(7, 8);
        System.out.println("7과 8의 합은 " + sum + "입니다."); // 7과 8의 합은 15입니다.

        Math obj = new Math();
        System.out.println(obj.square(10));             // 100
        System.out.println(obj.square(3.14));           // 9.8596
    }
}
