// BinarySearch: ICSE Java worked example.
public class BinarySearch {
    public static void main(String[] args) {
        int[] a={2,4,6,8,10};int key=8,low=0,high=a.length-1,index=-1;while(low<=high){int mid=low+(high-low)/2;if(a[mid]==key){index=mid;break;}if(a[mid]<key)low=mid+1;else high=mid-1;}System.out.println(index);
    }
}
