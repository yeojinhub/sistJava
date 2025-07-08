package day0120;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class day0120 {

	public static void main(String[] args) {

		for(int i=0; i<4; i++) {
			for(int j=i+1; j<5; j++) {
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		} //end for
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String transfer=args[0];
		
		System.out.print("입력하신 교통수단은 ");
		if (transfer.equals("버스")) {
			System.out.print(transfer+"이고 ");
		} else if(transfer.equals("지하철")){
			System.out.print(transfer+"이고 ");
		} else {
			System.out.println(transfer+"대중교통 수단이 아닙니다.");
		}

		int km = Integer.parseInt(args[1]);
		System.out.println("이동 거리는 "+km+"km 입니다.");
		
		int halfTransFee = 0;
		System.out.print(transfer+"의 기본 요금은 ");
		if (transfer.equals("버스")) {
			halfTransFee = 1500;
			System.out.println("1500원,");
		} else if(transfer.equals("지하철")){
			halfTransFee = 1400;
			System.out.println("1400원,");
		} else {
			System.out.println(transfer+"대중교통 수단이 아닙니다.");
		}
		
		halfTransFee = halfTransFee+((km-10)/5*100);
		System.out.println("편도 요금 "+ halfTransFee+"원,");
		System.out.println("왕복 요금 "+ halfTransFee*2 +"원,");
		System.out.println("한달 20일 기준 총 교통요금은 "+ halfTransFee*2*20 +"원 입니다.");
		
	} //main

} //class
