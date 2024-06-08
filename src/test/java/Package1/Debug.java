package Package1;

public class Debug {


    public int factorial (int num) {
        int fact = 1;
        for (int i=1; i <= num; i++)
        {
            fact = fact*i; // 1 * 1 = 1,  1 * 2 = 2, 2 * 3 = 6, 6 * 4 = 24, 24 * 5 = 120
        }
        return fact;
    }


    public static void main(String[] args) {
        Debug db = new Debug();
//        System.out.println(db.factorial(5));

        int a = 10, b = 20;
        if (a>b){
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }

    }
}
