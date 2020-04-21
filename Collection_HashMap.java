//in order to iterate a hashmap we use iterator whereas in order to iterate a Hashtable we use enumweration we can also use iterator in case of hashtable by using keys method..


import java.util.*;

class Collection_HashMap
{
    public static void main(String args[])
    {
        HashMap<String,Integer> hp=new HashMap<String,Integer>();

        hp.put("devikesh",3);
        hp.put("dipak",1);
        hp.put("dipendra",2);

        System.out.println(hp);

         System.out.println("Iterating the elements in an Hashmap");

         Set keys=hp.keySet();

         Iterator it=keys.iterator();

         while(it.hasNext())
         {
             System.out.println(hp.get(it.next()));
         }

         hp.remove("dipendra");

        System.out.println(hp);


        

    }
}