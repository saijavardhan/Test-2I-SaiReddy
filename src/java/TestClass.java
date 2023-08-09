package test;

import java.util.Arrays;
import java.util.List;

public class TestClass {


    public static void main(String[] args) {

        List<String> listWithValidValues = Arrays.asList("13", "10", "10", "20", "2", "4", "1", "1", "13", "9", "99");
        List<String> listWithInValidValues = Arrays.asList("3", "5", "10", "18", "12", "abc");
        List<String> listWithOutOfRangeValues = Arrays.asList("3", "5", "10", "120", "12", "12");


        System.out.println("Result for "+listWithValidValues);
        // call the sortInDescOrder method passing all valid integers along with duplicates in an array list.
        System.out.println("Sorted list is : " + SortNumbersDescendingOrder.sortInDescOrderRemovingDuplicates(listWithValidValues));


        System.out.println("Result for "+listWithInValidValues);
        try{
            // call the sortInDescOrder method passing invalid input and expect an error
            System.out.println("Sorted list is : " + SortNumbersDescendingOrder.sortInDescOrderRemovingDuplicates(listWithInValidValues));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Result for "+listWithOutOfRangeValues);
        try{
            System.out.println("Sorted list is : " + SortNumbersDescendingOrder.sortInDescOrderInRangeOfNumbers(listWithOutOfRangeValues, 1, 100));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
