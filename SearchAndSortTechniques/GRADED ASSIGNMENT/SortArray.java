import java.util.Arrays;

public class SortArray {

public static void sortArr (int[] arrayNum){
int[] counter = new int[3];

//To count how much times 0,1 & 2 are obtaining

for (int number : arrayNum) {

    counter [number]++;

    }

int index = 0;

// Now we sort array

for (int i = 0 ; i < 3; i++){
while (counter [i] > 0)
{
arrayNum[index] = i;
counter[i]--;
index++;
}}}

    public static void main(String[] args) {
 int[] arrayNum = {0, 2, 1, 2, 1};
        
        System.out.println("Old array: " + Arrays.toString(arrayNum));
        
        sortArr(arrayNum);
        
        System.out.println("New Sorted array: " + Arrays.toString(arrayNum));

    




}
}