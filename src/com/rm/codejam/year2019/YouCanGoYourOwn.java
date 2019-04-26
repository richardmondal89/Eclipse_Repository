package com.rm.codejam.year2019;

import java.util.Scanner;

public class YouCanGoYourOwn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine()),N=0;
		String path;
		for(int i=0;i<T;i++){
			N=sc.nextInt();
			path = sc.next();
			printAlterPath(path,N,i);
		}
		
	}

	private static void printAlterPath(String path, int n,int t) {
		// TODO Auto-generated method stub
		int l = path.length();
		StringBuilder newPath = new StringBuilder();
		int a=0,b=0,newa=0,newb=0,tempa =0,tempb=0,preva=-1,prevb=-1;
		char current ;
		for(int i=0;i<l;i++){
			tempa =0;tempb=0;
			current = path.charAt(i);
			if('E' == current){
				b++;
			}
			else{
				a++;
			}
			if((newa == n-1 && newb == n-2)){
				newPath.append("E");
				break;
			}
			else if((newb == n-1 && newa == n-2)){
				newPath.append("S");
				break;
			}
			if((newa==preva && newb == prevb) || (preva==-1)){
				if('E' == current){
					newPath.append("S");
					newa++;
				}
				else{
					newPath.append("E");
					newb++;
				}
				preva =a;prevb=b;
			}
			else{
				if((newa+1)<n){
					tempa=newa+1;
					if(tempa == a ){
						newPath.append("S");
						newa++;
						preva =a;prevb=b;
						continue;
					}
				}
				if(newb+1<n){
					tempb = newb+1;
					if(tempb == b){
						newPath.append("E");
						newb++;
						preva =a;prevb=b;
						continue;
					}
					
				}
				if((newa+1)<n){
					tempa=newa+1;
					tempa = tempa -a;
				}
				if(newb+1<n){
					tempb = newb+1;
					tempb = tempb-b;
				}
				if(tempa<=tempb){
					newPath.append("S");
					newa++;
					preva =a;prevb=b;
					continue;
				}
				else{
					newPath.append("E");
					newb++;
					preva =a;prevb=b;
					continue;
				}
			}
		}
		
		System.out.println("Case #"+(t+1)+": "+newPath.toString());
		
	}

}
