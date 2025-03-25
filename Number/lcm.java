class solution{
    public static void main(String[] args) {
        int num1= 3;
        int num2 = 4;
        int lcm = (int)Math.max(num1,num2);

        while(true){
            if(lcm % num1 == 0 && lcm %num2 == 0){
                break;
            }
            lcm+=1;
        }
        System.out.println("the lcm of the two number is = "+lcm);
    }
}