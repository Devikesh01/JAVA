import java.util.*;


class Collection_Hashset
{
     public static void main(String args[])
     {
         HashSet<Integer> hs=new HashSet<Integer>();

         hs.add(104);
         hs.add(105);
         hs.add(109);
         hs.add(101);
         hs.add(109);

         System.out.println(hs);

         hs.remove(104);

         Iterator it=hs.iterator();

         while(it.hasNext())
         {
             System.out.println(it.next());
         }

     }
}