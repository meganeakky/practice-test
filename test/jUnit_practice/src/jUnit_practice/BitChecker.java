package jUnit_practice;

import java.util.ArrayList;
import java.util.List;

public class BitChecker{
	private static final int BIT_1 = 0b001;
	private static final int BIT_2 = 0b010;
	private static final int BIT_3 = 0b100;
	private static final int MIN = 1;
	private static final int MAX = 7;
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BinaryChecker bc = new BinaryChecker();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("整数を入力：");
//			int num = Integer.parseInt(new String(br.readLine()));
//			List<String> list = bc.checkListMaker(num);
//			for(int i = 0;i<list.size();i++){
//				System.out.println(list.get(i));
//			}
//	}

	public List<String> checkListMaker(int n) {
		if(n < MIN || MAX < n) throw new BitCheckerException("扱えない整数が入力されました");
//		JUnitはブラックボックステスト
		List<String> checkList = new ArrayList<>();

		if(0 < (n & BIT_1)) {
			checkList.add("checkA");
		}
		if(0 < (n & BIT_2)) {
			checkList.add("checkB");
		}
		if(0 < (n & BIT_3)){
			checkList.add("checkC");
		}
		return checkList;
	}

}
