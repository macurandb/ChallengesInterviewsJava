package cu.duany.challenges;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;
public class DirReduction {

    private static final String NORTH = "NORTH";
    private static final String SOUTH = "SOUTH";
    private static final String WEST = "WEST";
    private static final String EAST = "EAST";

    public static String[] dirReduc(String[] arr) {

        List<String> keys = asList(NORTH, SOUTH, WEST,EAST);

        boolean invalidKeyExist =  Arrays.stream(arr).anyMatch(word -> !keys.contains(word));
        if(invalidKeyExist)
            throw new IllegalArgumentException("All word should be valid. The valid words are \"NORTH\", \"SOUTH\", \"WEST\",\"EAST\".");

        int oldLength = arr.length;
        int newLength = 0;
        while(newLength != oldLength){
            oldLength = arr.length;
            arr = reducWord(arr);
            newLength = arr.length;
        }
        return arr;
    }
    public static String[] reducWord(String[] arr){

        List<String> newDirectionList = new ArrayList<>();
        for(int i= 0; i<arr.length;i++){
            if(i != arr.length-1 && ((arr[i].equals(NORTH) && arr[i+1].equals(SOUTH)) || (arr[i].equals(SOUTH) && arr[i+1].equals(NORTH)))){
                i++;
            } else if(i != arr.length-1 && ((arr[i].equals(WEST) && arr[i+1].equals(EAST)) || (arr[i].equals(EAST) && arr[i+1].equals(WEST)))){
                i++;
            } else{
                newDirectionList.add(arr[i]);
            }
        }

        return newDirectionList.toArray(new String[newDirectionList.size()]);
    }

}