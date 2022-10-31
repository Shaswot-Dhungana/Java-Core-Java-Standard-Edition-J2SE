import java.io.*;

class ReadDataFromFile{
	public static void main(String[] args) throws IOException {
	
	

	FileReader obj = new FileReader("myFile.txt");
		
		
		int a;
		while((a = obj.read())!=-1)
		{
			System.out.print((char)a);
		}
		
	
	
		
	obj.close();
	


	
	
}
}
