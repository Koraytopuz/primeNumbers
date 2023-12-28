public class Main {
    public static void main{
        int number;
        if (number <=0 || number<=1){
            return -1;

        }
        else {
            int primeNumbers =2;
            while (primeNumbers<number){
                if (number%primeNumbers !=0){
                    primeNumbers++;
                }
                else {
                    number=number/primeNumbers;
                }
            }
            return number;
        }
    }
}