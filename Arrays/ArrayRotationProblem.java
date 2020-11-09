import java.util.*;
public class ArrayRotationsProblem {

    //ARRAY QUESTION 2
    //PEFORM X NUMBER OF ROTATIONS TO THE LEFT ON AN ARRAY
    //EXAMPLE [1,2,3,4,5] -- 2 ROTATIONS --> [3,4,5,1,2]
    static int[] rotLeft(int [] array, int numOfRotations){
        int size = array.length;
        int [] rotatedArray = new  int[size];
        int i =0;
        int rotate_ixdex=numOfRotations;

        while(rotate_ixdex < size){
            rotatedArray[i] = array[rotate_ixdex];
            i++;
            rotate_ixdex++;
        }
        rotate_ixdex=0;
        while(rotate_ixdex < numOfRotations){
            rotatedArray[i] = array[rotate_ixdex];
            i++;
            rotate_ixdex++;
        }

        return rotatedArray;
    }

    }

	//Write some tests here 
	public static void main (String args[])
	{

	}
}