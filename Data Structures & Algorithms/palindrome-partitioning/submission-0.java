class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lst = new ArrayList<>();
        if(s==null){
            return lst;
        }

        solve(s,0,new ArrayList<String>(),lst);

        return lst;
    }

    private void solve(String s,int index,List<String> temp,List<List<String>> lst){
        
        if(index==s.length()){
            lst.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<s.length();i++){
            String sub=s.substring(index,i+1);

            if(palindrome(sub)){
                temp.add(sub);
                solve(s,i+1,temp,lst);
                temp.remove(temp.size()-1);
            }
        }
    }

    private boolean palindrome(String str){
        if(str.length()==1){
            return true;
        }

        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }

        return true;
    }


}
