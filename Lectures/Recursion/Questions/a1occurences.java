public class a1occurences {
    public static void alloccurences(int arr[],int i,int key){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println(i);
        }

        alloccurences(arr,i+1,key);   
    }
    public static void main(String args[]){
        int arr[] = {1,4,5,6,7,8,5,5,5,6};
        int key =5;
        alloccurences(arr,0,key);
    }
    
}
