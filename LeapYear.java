import java.io.*;
public class LeapYear{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("うるう年をチェックする年を入力してください");
			String line = reader.readLine();
			int year;

			if (line.length()== 2){
			        year = Integer.parseInt(line) + 2000;	
			} else{
				year = Integer.parseInt(line);
			}

			if ((year % 4)==0){
				if((year % 100) != 0 || (year % 400) == 0){
					System.out.println(line+"年はうるう年です。");
				} else{	
				System.out.println(line+"年はうるう年ではありま>せん。");
				}
			} else {
				System.out.println(line+"年はうるう年ではありま>せん。");
			}
		} catch(IOException e){
			System.out.println("error: "+e);
		} catch(NumberFormatException e){
			System.out.print("数字の形式が正しくありません");
		}	
	}
}
