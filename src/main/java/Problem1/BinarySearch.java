package Problem1;

public class BinarySearch
{
    public static int binarySearch(int[] data, int target)
    {
        return binaryHelper(data, target, 0, data.length-1);
    }

    private static int binaryHelper(int[] data, int target, int front, int back)
    {
        if(data == null || data.length == 0 || (data.length == 1 && data[0] != target))
            return -1;

        int half = front + (back - front) / 2;

        if(target == data[half])
            return half;
        else if(target > data[half])
            return binaryHelper(data, target, half+1, back);
        else
            return binaryHelper(data, target, front, half);
    }
}
