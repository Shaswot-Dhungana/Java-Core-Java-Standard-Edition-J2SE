import java.io.*;

class printFileInfo{
	public static void main(String[] args){
		System.out.println("Printing file INfo...");

String fileName = "myFile.txt";
		File obj = new File(fileName);
		
		if(obj.exists()){
			System.out.println(" Extracting Informations From File... ");
			System.out.println(" File Name :~ "+obj.getName());
			System.out.println("File Path :~ "+obj.getAbsolutePath());
			System.out.println("File Status :~ "+obj.canWrite()+" , "+obj.canWrite());
			System.out.println("File Size :~ "+obj.length());
			
			
				
			
		}else{
			
			System.out.println("File doesnot exists");
			
		}
		
		
	}
	
	
	
}
