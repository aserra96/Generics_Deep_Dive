package hw_02;

public class MyArray<E extends Comparable<E>> {
    //No other data fields necessary.
    private E[] data;

    public MyArray(int size) {
        this.data = (E[])(new Comparable[size]);
    }

    //This constructor can accept an array or a comma-separated list of values.
    public MyArray(E ... elements) {
        this.data = (E[])(new Comparable[elements.length]);
        //Make a deep copy to prevent shared references.
        System.arraycopy(elements, 0, this.data, 0, elements.length);
    }
    
    //Add other methods.'
    
    public E get(int index) {
    	if (index < data.length) {
    		return data[index];
    	}
    	else throw new IndexOutOfBoundsException();
    }

    public MyArray<E> get(int start, int end) {
    	MyArray<E> newArray = new MyArray<>((end - start) + 1);
		int j = 0;
    	if (start < end || start > 0 || end < data.length-1) {
    		for (int i = start; i <= end; i++) {
    			newArray.put(j, data[i]);
    			j++;
    		}
    	} else {
    		throw new IndexOutOfBoundsException();
    	}
    	return newArray;
    }
    
    public void put(int index, E value) {
    	if (index < 0 || index > data.length) {
    		throw new IndexOutOfBoundsException();
    	}
    	data[index] = value;
    }
    
    public void put(int start, int end, E ... array) {
    	if (start > end || start < 0 || end > data.length-1) {
    		throw new IndexOutOfBoundsException();
    	}
    	if (array.length != (end-start + 1)) {
    		throw new InvalidNumberOfValuesException("You are trying to add too many or too few values!");
    	}
    	System.arraycopy(array, 0, this.data, start, array.length);
    }
 
    public static <E> void equals() {
    	
    }
    
    public static void max() {
    	
    }
    
    public static void min() {
    	
    }
    
    public void reverse() {
    	E temp;
    	for (int i = 0; i < (data.length/2); i++) {
    		temp = data[i];
    		data[i] = data[data.length - i - 1];
    		data[data.length - i - 1] = temp;
    	}
    }
    
    public static void shuffle() {
    	
    }
    
    public static void leftShift(int shiftDistance) {
    	
    }
    
    public static void rightshift(int shiftDistance) {
    	
    }
    
    public int size() {
    	return data.length;
    }
    
	@Override
	public String toString() {
		String out = "";
		for (int i = 0; i < data.length; i++) {
			out += String.valueOf(data[i] + ", ");
		}
		return out;
	}
    
    public static <E> void sort(E[] list) {
    	
    }
    
}
