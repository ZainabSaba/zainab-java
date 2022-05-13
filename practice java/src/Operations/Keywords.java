package Operations;

public class Keywords {
	public static void main(String[] args) {

	    int number = 2;
	    String size;

	    
	    switch (number) {

	      case 0:
	        size = "Small";
	        break;

	      case 1:
	        size = "Medium";
	        break;

	      case 2:
	        size = "Large";
	        break;

	      case 3:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size);
	  }

}
