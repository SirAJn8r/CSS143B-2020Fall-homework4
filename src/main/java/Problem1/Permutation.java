package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation
{
    public static List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) { result.add(new ArrayList<Integer>()); return result; }
        permute(nums, 0, result);
        return result;
    }

    private static void permute(int[] nums, int pos, List<List<Integer>> result)
    {
        if(pos == nums.length-1)
        {
            List<Integer> baseCase = new ArrayList<>();
            for(int i = 0; i < nums.length; i++)
                baseCase.add(nums[i]);
            result.add(baseCase);
            return;
        }
        for(int i = pos; i < nums.length; i++)
        {
            swap(nums, i, pos);
            permute(nums, pos+1, result);
            swap(nums, i, pos);
        }
    }

    private static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
