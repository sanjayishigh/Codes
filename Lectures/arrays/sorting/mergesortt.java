public class mergesortt {

    public static void mergesort(int arr[],int l,int h){
        if(l>=h){
            return;
        }

        int mid = l+(h-l)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,h);
        merge(arr,l,h,mid);
    }
    public static void merge(int arr[],int l,int h,int mid){
        int temp[] = new int[h-l+1];

        int i = l;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=h){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=h){
            temp[k++] = arr[j++];
        }

        for(int m=0; m<temp.length;m++){
            arr[l+m] = temp[m];
        }
    }
    public static void main(String args[]){
        int arr[] = {5,7,6,1,3,9};

        mergesort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}

