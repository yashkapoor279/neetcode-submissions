class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int len = Math.min(prefix.length(), strs[i].length());

            if(len==0){
                return "";
            }

            for (int j = 0; j < len; j++) {
                if(prefix.charAt(j)!=strs[i].charAt(j)){
                    prefix=prefix.substring(0,j);
                    
                    if(prefix.isEmpty()){
                        return "";
                    }

                    break;


                }

            }

            if(prefix.length()>len){
                prefix=prefix.substring(0,len);
            }
        }

        return prefix;

    }
}