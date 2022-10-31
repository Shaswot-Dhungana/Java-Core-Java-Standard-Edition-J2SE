import java.io.*;

class createFile{
	public static void main(String[] args){
		String fileName ="myFile.txt";
		
		
	System.out.println("Creating File with name :~ "+fileName);
	
	try {

	File f = new File("./"+fileName);
	if(f.createNewFile()){
		System.out.println("File Created.....");
		
		}else{
			System.out.println("File already exists...");
			
		}
	} catch(IOException i){
		System.out.println("EXception is :~ "+i);
	}
	}
}
