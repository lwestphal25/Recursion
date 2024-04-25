public class Main {

    public static void main(String[] args) {
Main main = new Main();
    }

    public Main(){
        System.out.println(factorial(5));
    }

    public int factorial(int i){
        if (i==1){
            return i;
        }else{
            return i*factorial(i-1);
        }

    }
}
