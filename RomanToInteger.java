class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('C',500);
        map.put('M',1000);


        int total=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            // int curr=map.get(s.charAt(i));
            char curr = s.charAt(i);
            
    
            if (!map.containsKey(curr)) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + curr);
            }

            int currr = map.get(curr);

            if(currr<prev){
                total-=currr;
            }
            else{
                total+=currr;
            }
            prev=currr;
        }
          return total;
        
    }
  
}
