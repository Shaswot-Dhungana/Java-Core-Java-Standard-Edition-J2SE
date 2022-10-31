import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class copyData{
	public static void main(String[] args) throws IOException{
	
	FileInputStream f1 = new FileInputStream("myFile.txt");
	FileOutputStream f2 = new FileOutputStream("demoFile.txt");
	
	int i;
	while((i=f1.read())!=-1){
		
		f2.write((char)i);
		
		System.out.println("Copied Succesfully");
		
	
		
	}
	
	
}
}
