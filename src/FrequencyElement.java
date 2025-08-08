public class FrequencyElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] arry={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arry.length;j++){
                if(arr[i]==arry[j]){
                    count++;
                }
            }
            System.out.print(arr[i]+"="+count+", ");
        }

    }
}


