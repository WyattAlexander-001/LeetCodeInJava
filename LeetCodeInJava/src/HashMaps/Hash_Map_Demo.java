package HashMaps;

//Java code to illustrate the size() method 
import java.util.*; 

public class Hash_Map_Demo { 
 public static void main(String[] args) 
 { 

     // Creating an empty HashMap 
     HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 

     // Mapping string values to int keys 
     hash_map.put(10, "Geeks"); 
     hash_map.put(15, "4"); 
     hash_map.put(20, "Geeks"); 
     hash_map.put(25, "Welcomes"); 
     hash_map.put(30, "You");
     //hash_map.put(30, "Yup"); //Overrides 30=You

     // Displaying the HashMap 
     System.out.println("Initial Mappings are: \n" + hash_map); 

     // Displaying the size of the map 
     System.out.println("The size of the map is: \n" + hash_map.size()); 
 } 
}
