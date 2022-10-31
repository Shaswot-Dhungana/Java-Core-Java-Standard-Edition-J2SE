import java.io.*;

class renameFileName{
	public static void main(String args[]){
	
	File oldName = new File("demoFile.txt");
	File newName = new File("demoFile-Renamed.txt");
	
	if(oldName.exists()){
	System.out.println("Renaming File....");
	oldName.renameTo(newName);
	
}else{
	System.out.println("File doesnt exists...");
}
}
}
