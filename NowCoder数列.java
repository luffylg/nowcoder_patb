package newcoder_patb;

import java.util.ArrayList;
import java.util.Scanner;

public class NowCoderÊýÁÐ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(11);
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			int num=NowCoder(list,n);
			if (num%3==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		scanner.close();
	}

	private static int NowCoder(ArrayList<Integer> list, int n) {
		// TODO Auto-generated method stub
		while (list.size()<=n) {
			list.add(list.get(list.size()-1)+list.get(list.size()-2));
		}
		return list.get(n);
	}

}
