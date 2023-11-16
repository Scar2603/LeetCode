class Solution {
    public String findDifferentBinaryString(String[] nums) {
      int n=nums.length;
      char[] str=new char[n];
      for(int i=0;i<n;i++)
      {
          if(nums[i].charAt(i)=='1')
          {
              str[i]='0';
          }
          else
          {
              str[i]='1';
          }
      }
      return new String(str);
    }
}
