//the difference between treeset and hashset is that treeset stores the data in order that is ascending order whereas hashset stores the data randomly.

import java.util.*;


class Collection_TreeSet
{
     public static void main(String args[])
     {
         TreeSet<String> hs=new TreeSet<String>();

         hs.add("devikesh");
         hs.add("ritesh");
         hs.add("DEVIKESH");
         hs.add("aditya");
         hs.add("sonu");
         hs.add("sonu");

         System.out.println(hs);


         Iterator it=hs.iterator();

         while(it.hasNext())
         {
             System.out.println(it.next());
         }

     }
}