//the difference between treemap and hashsmap is that treemap stores the data in order that is ascending order whereas hashmap stores the data randomly.

import java.util.*;

class Collection_Treemap
{
    public static void main(String args[])
    {
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>();

        tm.put("devikesh",3);
        tm.put("dipendra",2);
        tm.put("dipak",1);

        System.out.println(tm);

        tm.remove("dipak");

        System.out.println(tm);

         for(Map.Entry m:tm.entrySet())
         {
             System.out.println(m.getKey()+" "+m.getValue());      

         }

    }
}