class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String S){
        Stack<Character> stack = new Stack<>();
        for(char ch : S.toCharArray()){
            if(ch!='#'){
                stack.push(ch);
            }else if(!stack.empty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}