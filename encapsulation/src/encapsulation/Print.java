package encapsulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Print {
	
	public void print() throws IOException {
		FileWriter fw = new FileWriter("/home/user/java/test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int x=0;x<10;x++) {
			bw.write("#"+ x);
		}
		bw.close();
	
		
	}

	public void read() throws IOException {
		FileReader fr = new FileReader("/home/user/java/test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
	}
}
