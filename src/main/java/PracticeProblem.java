import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeProblem{

	static String getName(int line, String file){
		FileReader inputStream = null;
		BufferedReader buf = null;
		try{
			inputStream = new FileReader(file);
			buf = new BufferedReader(inputStream);
			String name = "";
			for(int i = 0; i < line; i++){
				String str = buf.readLine();
				if(str == null){
					name = "";
					break;
				}
				String[] words = str.split(" ");
				name = words[0] + " " + words[1];
			}
			buf.close();
			inputStream.close();
			return name;
		}catch(IOException e){
			try{
				if(buf != null){
					buf.close();
				}
				if(inputStream != null){
					inputStream.close();
				}
			}catch(IOException e1){
				System.out.println(e1);
			}
			System.out.println(e);
		}
		return "";
	}

	static int getAge(int line, String file){
		FileReader inputStream = null;
		BufferedReader buf = null;
		try{
			inputStream = new FileReader(file);
			buf = new BufferedReader(inputStream);
			int age = -1;
			for(int i = 0; i < line; i++){
				String str = buf.readLine();
				if(str == null){
					age = -1;
					break;
				}
				String[] words = str.split(" ");
				age = Integer.parseInt(words[2]);
			}
			buf.close();
			inputStream.close();
			return age;
		}catch(IOException e){
			try{
				if(buf != null){
					buf.close();
				}
				if(inputStream != null){
					inputStream.close();
				}
			}catch(IOException e1){
				System.out.println(e1);
			}
			System.out.println(e);
		}
		return -1;
	}

	static int getNumber(int line, String file){
		FileReader inputStream = null;
		BufferedReader buf = null;
		try{
			inputStream = new FileReader(file);
			buf = new BufferedReader(inputStream);
			int num = -1;
			for(int i = 0; i < line; i++){
				String str = buf.readLine();
				if(str == null){
					num = -1;
					break;
				}
				String[] words = str.split(" ");
				num = Integer.parseInt(words[3]);
			}
			buf.close();
			inputStream.close();
			return num;
		}catch(IOException e){
			try{
				if(buf != null){
					buf.close();
				}
				if(inputStream != null){
					inputStream.close();
				}
			}catch(IOException e1){
				System.out.println(e1);
			}
			System.out.println(e);
		}
		return -1;
	}

	static void fileAppend(String output, String filename){
		FileWriter outputStream = null;
		BufferedWriter buf = null;
		try{
			outputStream = new FileWriter(filename, true);
			buf = new BufferedWriter(outputStream);
			buf.write(output);
			buf.close();
			outputStream.close();
		}catch(IOException e){
			try{
				if(buf != null){
					buf.close();
				}
				if(outputStream != null){
					outputStream.close();
				}
			}catch(IOException e1){
				System.out.println(e1);
			}
			System.out.println(e);
		}
	}

	public static void main(String args[]){}
}
