public class lastoccurence {
    public static int lastocc(int[] arr,int i,int key){
    if(i == arr.length - 1){
        return -1;
    }
    int isFound = lastocc(arr,i+1,key);
    if(isFound==-1 && arr[i]==key){
        return i;
    }
    return isFound;
}
    public static void main(String args[]){
        int[] arr = {1,3,5,6,3,8};
        System.out.println(lastocc(arr,0,3));
    }
}
