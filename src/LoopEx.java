import java.util.*; //everything in the Java util library

public class LoopEx {
    public static void main(String[] args){

        //creating an array list to store the user input
        ArrayList<Integer> num = new ArrayList<Integer>();

        //getting user input
        Scanner userin = new Scanner(System.in);
        System.out.println("Enter five numbers");

        //setting the sum and product to equal something before starting so the system has something to go off of
       int sum = 0;
       int prod = 1;
        //creating a for loop to store and add in the integers to the arraylist, finding sum and product
        for(int i = 0; i < 5; i++){
            int a = userin.nextInt();

            //storing into array list
            num.add(a);

            //summing up
            sum = sum +a;

            //product.
            prod = prod * a;

        }

        //finding the smallest and largest number using the sort function

        Collections.sort(num);
        System.out.println("Largest number " + num.get(4)); //num.size() -1 -> can also be used interchang.
        System.out.println("Smallest number " + num.get(0));
        //displaying the outputs for the sum, product, and the general sorted arraylist
        System.out.println("Sum of the numbers " + sum);
        System.out.println("Product of the numbers " + prod);
        System.out.println(num);
    }

}
