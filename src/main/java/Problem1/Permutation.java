package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation
{
    /*public static List<List<Integer>> permute(int[] nums)
    {
        List<Integer> newNums = new ArrayList<>();
        for(int i : nums)
            newNums.add(i);
        return makePermute(newNums);
    }

    private static List<List<Integer>> makePermute(List<Integer> nums)
    {
        if(nums.size() == 1)
        {
            List<List<Integer>> temp = new ArrayList<>();
            temp.add(nums);
            return temp;
        }
        if(nums.size() == 2)
        {
            List<List<Integer>> toRet = new ArrayList<>();
            toRet.add(nums);
            List<Integer> toAdd = new ArrayList<Integer>();
            toAdd.add(nums.get(1));
            toAdd.add(nums.get(0));
            toRet.add(toAdd);
            return toRet;
        }

        List<List<Integer>> toRet = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++)
        {
            List<List<Integer>> temp = makePermute(removeIndex(nums, i));
            for(int j = 0; j < temp.size(); j++)
            {
                toRet.add(addToFront(temp.get(j), nums.get(i)));
            }
        }
        return toRet;
    }

    private static List<Integer> removeIndex(List<Integer> data, int i)
    {
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j < data.size(); j++)
        {
            if(i == j) continue;
            list.add(data.get(j));
        }
        return list;
    }

    */

    public static List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    public static void permute(int[] nums, int position, List<List<Integer>> result)
    {
        //stopping condition
        if(position == nums.length-1)
        {
            List<Integer> oneResult = new ArrayList<>();
            for(int i = 0; i < nums.length; i++)
            {
                oneResult.add(nums[i]);
            }
            return;
        }
        // put number at position in the front
        // call the same private permute with position+1
        // put the number back to its original position
    }

    private static List<Integer> addToFront(List<Integer> data, int val)
    {
        List<Integer> list = new ArrayList<>();
        list.add(val);
        for(Integer i : data)
            list.add(i);
        return list;
    }
}
