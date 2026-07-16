package WEEK_1;

public class jump {

    public static int jump(int nums[]){
        int i = 0, t = 0;
        while(i < nums.length){
            if(nums[i] == 0)
                return -1;
            t += 1;
            i += nums[i];
        }
        return t;
    }
    public static void main(String[] args) {
        int[] num = {1,3,2,1,0,4};
        System.out.println(jump(num));
    }
}
