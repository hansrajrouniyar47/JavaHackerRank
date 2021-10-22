public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int start = 0;
        for(int i = 0; i <= s.length(); i++){
            String temp = "";
            if(i >= k){
               temp = s.substring(start, i);
               start++;
               if(temp.compareTo(largest)>0){
                   largest = temp;
               }
               if(temp.compareTo(smallest)<0){
                   smallest = temp;
               }
            }
            
        }
        return smallest + "\n" + largest;
    }
