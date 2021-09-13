package hw_02;

public class GenericMain {

	public static void main(String[] args) {
		MyArray<Integer> intArray = new MyArray<>(10, 25, 1, 69, 4, 20);
		MyArray<String> strArray = new MyArray<>("joe", "Bre", "John", "Coby", "Luna", "Ray");
		MyArray<Double> douArray = new MyArray<>(2.7, 1.4, 1.69, 4.2, 3.8, 9.99);
				
		System.out.println("Integer Array: " + intArray.toString());
		System.out.println("There are " + intArray.size() + " pieces of data in this Array");
		
		System.out.println("String Array: " + strArray.toString());
		System.out.println("There are " + intArray.size() + " pieces of data in this Array");
		
		System.out.println("Double Array: " + douArray.toString());
		System.out.println("There are " + intArray.size() + " pieces of data in this Array\n");
		
		System.out.println("Get index 5 of Integer Array " + intArray.get(5));
		System.out.println("Get index 2 of String Array " + strArray.get(2));
		System.out.println("Get index 3 of Double Array " + douArray.get(3) + "\n");
		
		System.out.println("Index 3 - 5 in Integer Array: " + intArray.get(3, 5));
		System.out.println("Index 0 - 3 in String Array: " + strArray.get(0, 3));
        System.out.println("Index 1 - 5 in Integer Array: "+ douArray.get(1, 5));
        
        intArray.put(2, 42);
        System.out.println("\nputing 42 in the 3rd index: " + intArray.toString());
        strArray.put(3, "Beetle");
        System.out.println("puting Beetle in the 4th index: " + strArray.toString());
        douArray.put(0, 53.89);
        System.out.println("putting 53.89 in the 0th index: " + douArray.toString());
	} 

}
