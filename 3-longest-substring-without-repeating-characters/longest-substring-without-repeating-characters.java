import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

     
    //     String str = "";
    //    int l=0;
        
       

    //     for (int i = 0; i < s.length(); i++) {
            
    //     str = ""; 
    //     boolean arr[] = new boolean[256];
    //         for (int j = i; j < s.length(); j++) {
    //             int idx = s.charAt(j);
    //             if (arr[idx]) {
    //                 break;
    //                 }
    //                 else{
    //                 //System.out.println(arr[idx]);
    //                 str += s.charAt(j);
    //                 arr[idx]=true;
    //                //System.out.println(str);
    //                l=Math.max(l,str.length());
    //             }

    //         }

    //     }

    //     return l;





    HashSet<Character> set= new HashSet<>();

    int ln = Integer.MIN_VALUE;
    int r=0;
    int l=0;
  
    int n= s.length();

    if(n==0){
        return 0;
    }
while(r<n){
    if(set.contains(s.charAt(r))){
        set.remove(s.charAt(l));
        l++;
    }else{
        set.add(s.charAt(r));
        r++;

    }
    ln=Math.max(r-l,ln);
}



  






















return ln;


    }
}