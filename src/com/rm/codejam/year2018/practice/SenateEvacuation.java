package com.rm.codejam.year2018.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SenateEvacuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0;i<T;i++){
			int N  = sc.nextInt();
			List<Senate> lt =new ArrayList<>();
			char c = 'A';
			for(int j=0;j<N;j++){
				Senate s = new Senate();
				s.party = c++;
				s.number = sc.nextInt();
				lt.add(s);
			}
			Collections.sort(lt);
			System.out.print("Case #"+(i+1)+": ");
			while(lt.get(0).number!=0){
				Senate third  = null;
				try{
					third = lt.get(2);
				}catch(Exception ex){
					
				}
				if(lt.get(0).number>=lt.get(1).number+2 || (third!=null && third.number>0) ){
					System.out.print(lt.get(0).party+""+lt.get(0).party+" ");
					lt.get(0).number = lt.get(0).number-2;
					
				}
				else if(lt.get(0).number==lt.get(1).number && (third==null || third.number<lt.get(1).number)){
					System.out.print(lt.get(0).party+ ""+lt.get(1).party+" ");
					lt.get(0).number = lt.get(0).number-1;
					lt.get(1).number = lt.get(1).number-1;
				}
				else if(lt.get(0).number==1){
					System.out.print(lt.get(0).party);
					break;
				}
				else{
					System.out.print(lt.get(0).party+" ");
					lt.get(0).number = lt.get(0).number-1;
				}
				Collections.sort(lt);
			}
			System.out.println();
		}
		
		
		
		
	}

}


class Senate implements  Comparable<Senate>{
	int number;
	char party;

	@Override
	public int compareTo(Senate o) {
		// TODO Auto-generated method stub
		if(o.number>number){
			return 1;
		}
		else if(o.number<number){
			return -1;
		}
		return 0;
	}

	
	
}