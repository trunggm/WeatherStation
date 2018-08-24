package io.weather.teststream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HelloInputStream {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("data.txt");
		OutputStream os = new FileOutputStream("copy.txt");
		copy(is, os);

	}
	
	public static void helloOutputStream() {
		try {
			
			// TODO: viet byte toi file
			OutputStream os = new FileOutputStream("output.txt");
			byte[] data = new byte[] {'H', 'e', 'l', 'l', 'o'};
			
			for (int i = 0; i < data.length; i++) {
				byte b = data[i];
				os.write(b);
			}
			
			os.close();
			
			// TODO: doc file da ghi
			InputStream is = new FileInputStream("output.txt");
			
			int i = -1;
			
			while ((i = is.read()) != -1) {
				System.out.println(i + "  " + (char) i);
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void copy(InputStream is, OutputStream os) throws IOException {
		
		try {
			byte[] buffer = new byte[1024];
			int byteRead;
			byteRead = is.read(buffer);
			while (byteRead != -1) {
				os.write(buffer, 0, byteRead);
				byteRead = is.read(buffer);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			is.close();
			os.close();
		}
	}
}
