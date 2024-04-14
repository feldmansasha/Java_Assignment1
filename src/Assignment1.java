/*
* @author Alex Feldman
* @student id: 200544581
* @since: 2024-09-24
* */
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        task1();
        task4();
    }
    static void task1(){
        Scanner input=new Scanner(System.in);
        System.out.println("How many elements do you want?");
        int numElements=input.nextInt();
        input.nextLine();
        Object[] array = new Object[numElements];

        System.out.println("Enter all elements ");

        for (int i=0; i<array.length; i++) {
            int userInput = input.nextInt();
            if (userInput==0) {
                array[i] = false;
            }
            else if (userInput==1) {
                array[i] = true;
            }
            else if (userInput >= -128 && userInput <= 127) {
                array[i] = (byte) userInput;
            }
            else if (userInput >= -32768 && userInput <= 32767) {
                array[i] = (short) userInput;
            }
            else {
                array[i] = userInput;
            }
        }
    }
    static void task2(int[] array){
        System.out.println("Your array:");
        for (int i : array) {
            System.out.println(i);
        }
    }
    static void task3(int[] array){
        Scanner input=new Scanner(System.in);
        System.out.println("Please fill in the values with integers");
        for(int i=0; i<array.length; i++)
        {
            array[i]=input.nextInt();
        }
    }
    static void task4()
    {
        System.out.println("Enter the length of the array");
        Scanner input=new Scanner(System.in);
        int lengthArray=input.nextInt();
        int[] array= new int[lengthArray];
        task3(array);
        task2(array);
    }
}
