package lab2;

import java.util.Scanner;


import lab2.mergeSort;
import lab2.notesCount;

public class denominations {
public static void main(String[] args) {
	
	mergeSort mergeSortobj= new mergeSort();
	notesCount NotesCountobj = new notesCount();
	
		System.out.println("Enter the size of currency denominations ");
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int[] arr=new int[size];
			
		
			System.out.println("Enter the currency denominations value ");
			for(int i=0;i<size;i++) 
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the amount you `want to pay");
			int amount=sc.nextInt();
			
			mergeSortobj.sort(arr,0,arr.length-1);
			NotesCountobj.notesCountImplementation(arr, amount);
			
		}

	}

