public class countsetbit{
    public static int countsetbits(int num){
        int count = 0;
        while(num>0){
            if((num&1) != 0){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String args[]){
        int num = 0b100;
        System.out.print(countsetbits(num));

    }

}