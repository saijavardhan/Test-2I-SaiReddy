package test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersDescendingOrder {

    /**
     * @param values - Integers of any range and can have any number of duplicates
     *               If any non integer values are passed then an error will be thrown
     * @return Descending order sorted unique numbers
     */
    public static List<Integer> sortInDescOrderRemovingDuplicates(List<String> values) {
        return values
                .stream()
                .map(k -> {
                    try {
                        return Integer.parseInt(k);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException(k + " isn't an integer");
                    }
                })
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    /**
     * @param values - list of values
     * @param minVal - minimum value for the range of numbers to be sorted
     * @param maxVal - maximum value for the range of numbers to be sorted
     * @return - If all the list of values are in between minVal to maxVal, then return a descending sorted numbers after removing duplicates
     */
    // Verification of numbers between min and max can be done using streams, but I feel verification during parsing of int is efficient way as
    // we don't need to parse rest of the numbers if we found out of range number
    public static List<Integer> sortInDescOrderInRangeOfNumbers(List<String> values, int minVal, int maxVal) {
        return values
                .stream()
                .map(k -> {
                    try {
                        int i = Integer.parseInt(k);
                        if (i < minVal || i > maxVal) {
                            throw new IllegalArgumentException(i + " isn't in range of " + minVal + " to " + maxVal);
                        }
                        return i;
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException(k + " isn't an integer");
                    }
                })
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
