class Solution {
    public String reverseWords(String s)
    {
        String words[] = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i = words.length - 1 ; i >= 0 ; i--)
        {
            ans.append(words[i]);
            if(i!=0) ans.append(" ");
        }
        return ans.toString();
    }
}
//     public String reverseWords(String s)
//     {
//         char[] arr = s.toCharArray();
//         int n = arr.length;
//         int start = 0;
//         for(int i = 0 ; i < n ; i++)
//         {
//             if(s.charAt(i)==' ')
//             {
//                 rev(arr,start,i-1);
//                 start = i+1;
//             }
//         }
//         rev(arr, start, n-1);
//         rev(arr, 0 , n-1);
//         return new String(arr);
//     }
//     public void rev(char[] arr , int low, int high)
//     {
//         while(low<high)
//         {
//             char temp = arr[low];
//             arr[low] = arr[high];
//             arr[high] = temp;
//             low++;
//             high--;
//         }
//     }
// }