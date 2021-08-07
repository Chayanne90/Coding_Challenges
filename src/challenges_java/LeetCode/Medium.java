package challenges_java.LeetCode;


import org.w3c.dom.Node;

import java.util.*;

class ListNode {


   int val;
   ListNode next;

   ListNode() { }

   ListNode(int val) {

       this.val = val;
   }

   ListNode(int val, ListNode next) {

       this.val = val;
       this.next = next;
   }
}

public class Medium {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newNode = new ListNode();
        ListNode current = newNode;
        int total = 0;
        int oneDigit = 0 ;

        while( (l1 != null) || (l2 != null)) {

            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;

            total = oneDigit+ a + b;

            oneDigit = total / 10;
            current.next = new ListNode(total % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (oneDigit > 0) {
            current.next = new ListNode(oneDigit);
        }
        return newNode.next;
    }


    public static List<Integer> meanderingArray(List<Integer> unsorted) {
        int [] sortedArray = new int [unsorted.size()];
        for (int i = 0; i < unsorted.size(); i++) {
            sortedArray[i] = unsorted.get(i);


        }
        Arrays.sort(sortedArray);
        List<Integer> meanderingList = new ArrayList<Integer>();
        int lastIndex =1;
        int large, small;
        small=large=0;
        int mid = sortedArray.length/2;
        for (int i = 0; i < mid; i++) {
            large = sortedArray[sortedArray.length-lastIndex];
            small = sortedArray[i];
            if(mid % 2==0){
                meanderingList.add(large);
                meanderingList.add(small);
                lastIndex++;
            } else {

                if (i == mid-1) {
                    meanderingList.add(sortedArray[small]);
                }
                meanderingList.add(large);
                meanderingList.add(small);
                lastIndex++;
            }
        }
        return meanderingList;
    }




    public static int lengthOfLongestSubstring(String s) {

        int count = 0;
        char prevIHolder = ' ';
        boolean sequenceBreak = false;
        HashMap<Character,Character> substringMap = new HashMap<Character,Character>();

        if (s.isBlank()){
            if (s.length() < 1) {
                return 0;
            }
            return 1;
        }


        for (int i = 0; i <= s.length()-1; i++) {

            if (!substringMap.containsKey(s.charAt(i))) {
                if (sequenceBreak){
                    prevIHolder = ' ';
                }
                if (s.charAt(i) != s.charAt(i+1)) {

                    prevIHolder =s.charAt(i);
                    substringMap.put(s.charAt(i), s.charAt(i));
                    count = 0;
                } else {
                    count++;
                    sequenceBreak = true;
                    System.out.println("previuos item:" +prevIHolder);
                    substringMap.remove(prevIHolder);
                }
            }
        }


        if (count == s.length()-1){return 1;}
        /*substringMap.entrySet().forEach(entry -> {
            System.out.print(entry.getValue()+ " ");
        });
        System.out.println();
       // System.out.println(substringMap.size());*/
        return substringMap.size();
    }



    public static void main(String[] args) {

        String s = "a";
        //lengthOfLongestSubstring(s);
        System.out.println(lengthOfLongestSubstring(s));

    }
}
