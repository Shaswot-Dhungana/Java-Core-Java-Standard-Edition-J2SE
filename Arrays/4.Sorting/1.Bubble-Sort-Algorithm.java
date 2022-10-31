class Main{
	public static void main(String[] args) {
		

// Bubble sort Algorithm... 
// Aranging in ascending order....


		int flag = 0;
		int temp;
		int [] a = {98,45,67,10,4,7,58};


for(int i=0;  i<a.length;  i++){
	
for(int j=0; j<a.length-1; j++){
	
	if( a[i] > a[j+1]){
		temp = a[j];
		a[j] = a[j+1];
		a[j+1] = temp;
		
		flag =1;
		}

	}

		}

for(int i=0; i<a.length; i++ ){
	System.out.println(a[i]);
	}

	}
	
	
}
