public class Main{
    public static void main(String[] args){
       

/*
 Multi Dimensional arrays are Array of Arrays.
 Each Elements of Multi Dimensional Araay is an 
 array itself.
 */

int [] [] flats;
flats = new int [2] [3];

flats[0][0] = 11;
flats[0][1] = 21;
flats[0][2] = 31;
flats[1][0] = 41;
flats[1][1] = 51;
flats[1][2] = 61;

// displaying elements of Array using forEach Loop

for (int i = 0; i<flats.length; i++ ) {
    for (int j = 0; j<flats[i].length; j++) {
        
        System.out.print(flats[i][j]);
System.out.print("  ");

    }
System.out.println("\n");

}





    }
}