import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Program {
	
	public static void main(String[] args){ 
		
		try{
	
	readFile("C:/Users/student/Desktop/Zadanie03/Lista.csv");
		}
		catch(IOException e){
			
		}

}
	public static void readFile(String filePath) throws IOException {
		  FileReader fileReader = new FileReader(filePath);
		  BufferedReader bufferedReader = new BufferedReader(fileReader);
		  
		  String textLine = bufferedReader.readLine();
		  do {
		    System.out.println(textLine);
		  
		    textLine = bufferedReader.readLine();
		  } while(textLine != null);

		  bufferedReader.close();
		}
	
}