public class Main {
    public static void main(String[] args) {

        //1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(" ");
        //2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println(" ");
        //3
        for (int i = 0; i <= 17; i=i+2) {
            System.out.println(i);
        }
        System.out.println(" ");
        //4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println(" ");
        //5
        for (int i = 1904; i <= 2096; i = i+4){
            System.out.println(i + " год является високосным.");
        }
        System.out.println(" ");
        //6
        for (int i = 7; i < 100; i = i+7){
            System.out.println(i);
        }
        System.out.println(" ");
        //7
        for (int i = 1; i <= 512; i=i*2){
            System.out.println(i);
        }
        System.out.println(" ");
        //8
        int moneyAmount = 29000;
        int banka = 0;
        for (int i = 1; i <= 12; i++){
            banka = banka + moneyAmount;
            System.out.println("Месяц " + i + " сумма накоплений равна "+ banka + "рублей");
        }
        System.out.println(" ");
        //9
        int bank = 0;
        for (int i = 1; i <= 12; i++){
            bank = bank + bank/100;
            bank = bank + moneyAmount;
            System.out.println("Месяц " + i + " сумма накоплений равна "+ bank + "рублей");
        }
        System.out.println(" ");
        //10
        for(int i = 1; i <= 10; i++){
            int result = 2*i;
            System.out.println("2*"+i+"="+result);
        }
    }
}