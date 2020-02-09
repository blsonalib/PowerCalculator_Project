public class Calculator {
    public int powerOfNumber(int number,int powerNumber){
        int result = 1;
        for(int value = 1;value<=powerNumber;value++){
            result = result * number;
        }
        return result;
    }
}
