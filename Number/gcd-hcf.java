
class solution{
    public static void main(String args[]){
        int num1 = 50;
        int num2 = 52;
        int gcd = 1;

        for(int i = 1; i<=(int)Math.min(num1,num2); i++){
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }

        
        System.out.println(gcd);
    }
}