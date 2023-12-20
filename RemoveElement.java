import java.util.Arrays;
public class RemoveElement {

    public static void main( String[] args)
    {
int[]nums={0,0,1,1,1,2,2,3,3,4};
int val=2;

  System.out.println( removeElement (nums,val));

    }
    static int  removeElement( int nums[], int val)
    {
        int count =0;
        for (int i=0;i<nums.length; i++)
        {
            if (nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
    return count;
    }
}
