
import java.util.*;

public class ArrayListTest 
{
	
	
	public static void main(String args[])
	{
		
	/*	ArrayList<String> l= new ArrayList<>();
		
		// 1. add method
		l.add("hello");
		
		l.add("dsa");
		l.add("s212");
		
		
		// 1 traversing through for each
		for(Object obj: l)
		{
			System.out.println(obj);
		} 
		
		
		// 2 traversing through simple for
		for(int i=0; i<l.size(); i++)
		{
			
			System.out.println(l.get(i));
			
			
		} 
		
		// 3 Traversing through Iterator 
		Iterator itr= l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		} 
		
		
		// 4 Traversing through List Iterator in forward and in backword 
		ListIterator<String> litr= l.listIterator(l.size());
		
		// in forward 
		
		while(litr.hasNext())
		{
			
			System.out.println(litr.next());
		}
		
	
		
		// in backward
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
			
		} 
		
		// more methods 
		// 2. change an item , set method
		l.set(1, "new item");
		
		
		// 3. remove an item, remove method
		// removing via indexes
		l.remove(0);
		System.out.println(l);
		
		// 4. get an item , get method
		System.out.println(l.get(1) );
		
		// 5. add at specific index
		
		l.add(1, "hhaha");
		System.out.println(l);
		
		// 6. add all method, works as concate
		
		ArrayList<String> l1= new ArrayList<>();
		l1.add("ds");
		l1.add("fdfsd");
		l1.add("dfsdfs");
		
		l.addAll(l1);
		System.out.println(l);
		
		// 7. clone method, put the data to an object  (copy to object)
		
		Object ob=l.clone();
		System.out.println(ob);
		
		// 8. contains method
		
		System.out.println(l.contains("s212"));
		System.out.println(l.contains("dsd"));
		
		
		// 9. ensureCapacity
		
		
		// 10. indexOf method
		
		System.out.println( l.indexOf("hhaha") );
		
		// 11. lastIndexOf
		
		System.out.println( l.lastIndexOf("ds") );
		
		// 12. removeRange(start, end);
		
		//13 . toArray method
		
		Object arr[] = l.toArray();
		
		System.out.println(arr[2]);
		
		// 14 isEmpty
		
		System.out.println(l.isEmpty());
		
		// 15 remove method by passing the value
		
		l.remove("s212");
		
		System.out.println(l);
		
		//16  add all from index
		// l.addall(2,l2);
		
		// 17.  sublist
		System.out.println( l.subList(2, 4) );
		
		
		
		// linked list starts

		System.out.println("***Linked List Starts***");
		LinkedList link = new LinkedList();
		
		link.add(5);
		link.add("323");
		link.add('d');
		
		System.out.println(link);
		
		// through for each
		for(Object o: link)
		{
			System.out.println(o);
		} 
		
		
		link.addFirst("hahaha");
		
		
		link.addLast("kaluuuuuuuuuuu");
		

		System.out.println(link);
	
		*/
		// vector starts
		
		Vector vectorObj= new Vector(5);
		vectorObj.add(4);
		vectorObj.add(5);
		System.out.println( vectorObj.capacity() );
		System.out.println(vectorObj.size());
		
		
		
		
		// Set skipped
		
		
		
		
		
		
		// Map interface
		
	/*	Map phoneBook= new HashMap<>();
		
		phoneBook.put("Haseeb", 0002332424);
		phoneBook.put("Sami", 0233223);
		phoneBook.put("Amir", 02323232311);
		phoneBook.put("Ghulam", 42424242);
		
		phoneBook.remove("Amir");
		
		
		// first method of traversing
		System.out.println("Traversing by keySet Method");
		Set<String> keys = phoneBook.keySet();
		for(String key: keys)
		{
			System.out.println(key+ " : "+ phoneBook.get(key));
		} 
		
		System.out.println("\n\n");
		
		// second method of traversing
		System.out.println("Traversing by Map.Entry sub-interface");
		Set st= phoneBook.entrySet();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Map.Entry me= (Map.Entry) itr.next();
			
			System.out.println(me.getKey() + ":"+ me.getValue());
		}
		
		System.out.println("\n");
		System.out.println(phoneBook.containsValue(0002332424));
		System.out.println(phoneBook.containsKey("Ali"));
		
		
		Map mp= new LinkedHashMap();
		mp.put(1, "Ali");
		mp.put(2, "Ahsan");
		mp.put(3, "Samad");
		mp.put(3, "Asad");
		
		System.out.println(mp);
		
		System.out.println ( mp.containsKey(3) );
		System.out.println(mp.containsValue("Aliza"));
		System.out.println(  mp.values() );
		System.out.println(mp.keySet());
		System.out.println(  mp.size() );
		
		
		
		Set<Integer> keys= mp.keySet();
		
		for(int x : keys)
		{
			System.out.println("key : "+ x + " Value: "+ mp.get(x));
			
		}
		
		mp.replace(1, "Sami");
		System.out.println(mp);
		
		*/
		
		
		/*Map mp = new TreeMap();
		mp.put(4, "C++");
		mp.put(10, "Java");
		mp.put(2, "C#");
		mp.put(1, "Python");
		
		System.out.println(mp);
		
		System.out.println ( mp.containsKey(3) );
		System.out.println(mp.containsValue("Python"));
		System.out.println(  mp.values() );
		System.out.println(mp.keySet());
		
		
		
		
		Set<Integer> keys= mp.keySet();
		
		for(int x : keys)
		{
			System.out.println("key : "+ x + " Value: "+ mp.get(x));
			
		}
		
		mp.replace(3, "Basic");
		System.out.println(mp);
		
		System.out.println(  mp.size() );
		
		
		
		
		*/
		
	
		
		
		
	
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
