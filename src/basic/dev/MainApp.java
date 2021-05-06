package basic.dev;
/**
 * Lab14
 */
import java.util.Scanner;
import java.util.regex.Pattern;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final char SPACE = ' ';
		String string ;
		
		System.out.println("Nhap vao mot chuoi: ");
		string = sc.nextLine();
		
		int count=0;
		char text ;
		string = string.trim();
		
		for(int i = 0; i < string.length() ; i++) {
			text = string.charAt(i);
			if( Character.isSpace(text)) {
			count++;
			}else {
				
		}	
			
	}
		count +=1;
		System.out.println("Chuoi co so tu la: " + count);
		
		String [] output = string.split("\\s");
		count -=1;
	while(count >= 0) {
		System.out.print(output[count]+ " ");
		count--;
	}
		String tempSt  = " ";
		for (int i = 0; i < output.length; i++) {
			for (int j = i+1; j < output.length; j++) {
				if(output[i].hashCode()< output[j].hashCode()) {
					tempSt = output[i];
					output[i] = output[j];
					output[j] = tempSt;
				}
				
			}
		}
		System.out.println("\n");
		for (int i = 0; i < output.length; i++) {
			System.out.print(""+ output[i]);
		}
		int currentIndex = 0;
		int countSt = 1;
		String prevValue = output[0];
		int prevCount = 0;
		
		for (int i = 0; i < output.length-1; i++) {
			if(output[i].hashCode() == output[i+1].hashCode()) {
				countSt++;
			}else {
				if(countSt > prevCount) {
					prevCount = countSt;
					prevValue = output[i];
					countSt = 1;
				}

				currentIndex = i;
			}
		}
		
		if(countSt > prevCount) {
			prevCount = countSt;
			prevValue = output[currentIndex + 1];
		}
		System.out.println(String.format("\nchu %s xuat hien %d lan", prevValue, prevCount));
	}
	}


