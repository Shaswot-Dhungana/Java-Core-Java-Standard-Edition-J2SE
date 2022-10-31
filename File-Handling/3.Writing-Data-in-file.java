import java.io.*;

class writeInFile{
	public static void main(String[] args){
	
	
		try{
			
	FileWriter obj = new FileWriter("myFile.txt");
	
	
	try{
	
	obj.write(" This Sentence is written Via java program....");
	
}
	finally{
		obj.close();
	}
	System.out.println("Written Success");
	
} catch( IOException e ){
	System.out.println(e);
}
	
}
}
