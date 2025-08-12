public class mergesortt {
    public static void mergesort(int arr[],int l,int h){
        if(l>=h){
            return;
        }
            int mid = l+(h-l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,h);
            merge(arr,l,mid,h);
    }
    public static void merge(int arr[],int l,int mid,int h){
        int temp[] = new int[h-l+1];

        int i = l;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=h){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
         while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= h) {
            temp[k++] = arr[j++];
        }

        for (i = 0; i < temp.length; i++) {
            arr[l+i] = temp[i];
        }

    }
    public static void main(String args[]){
        int arr[] = {8,4,6,5,2,3,5,8};
        mergesort(arr,0,arr.length-1);
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
