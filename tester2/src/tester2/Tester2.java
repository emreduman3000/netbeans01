package tester2;

import java.util.Random;
import java.util.Scanner;

public class Tester2
{
	public static void main(String[] args)
	{
	
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the number of students:");
		int studentNum=scan.nextInt();
		System.out.print("Please enter the number of questions:");
		int questionNum=scan.nextInt();
		
		char [][] allAnswers=new char [studentNum][questionNum];//student answers	
		char [] answerKey= new char[questionNum];//answerkey
		
		createAnswerKey(answerKey);//randomAnswers()
		showAnswerKey(answerKey);

		put (allAnswers);	
		showAllAnswers(allAnswers);//of students
		
		compareStudent(answerKey,allAnswers);
		
	}
	
	

	public static char randomAnswers()//create random answers
	{
            int randomNum=(int)(65+(Math.random()*5));//65-66-67-68-69- A B C D E 
            char randomAnswer=(char) randomNum;
            return randomAnswer;	
	}

	private static void createAnswerKey(char [] array)//put random answers in a array
	{
            for(int i=0 ; i < array.length ; i++)
            {
                array[i]=randomAnswers();
            }
	}

	private static void showAnswerKey(char[] answerKey) 
	{
		System.out.println("Answer Key:");
		int count=1;
		for(char answer: answerKey)
		{
                    System.out.printf("%d.Qestion's Answer is: %c%n",count,answer);
                    count++;
		}
		System.out.println();
	}

	
	/*
	 * puts random answers of students
	 */
	private static void put(char[][] allAnswers)
	{
		for(int line=0 ; line<allAnswers.length ; line++)
		{
			for(int coloum=0 ; coloum<allAnswers[line].length ; coloum++)
			{
				allAnswers[line][coloum]=randomAnswers();
			}

		}
	}

	
	private static void showAllAnswers(char[][] allAnswers) 
	{
		for(int line=0 ; line<allAnswers.length ; line++)
		{
			for(int coloum=0 ; coloum<allAnswers[line].length ; coloum++)
			{
				System.out.printf("%d.Student's of %d.answer::%c%n",line+1,coloum+1,allAnswers[line][coloum]);
			}
			System.out.println();
		}
	}



	private static void compareStudent(char[] answerKey, char[][] allAnswers)
	{
		for(int line=0 ; line<allAnswers.length ; line++)
		{
			int correctAnswer=0;
			for(int coloum=0 ; coloum<allAnswers[line].length ; coloum++)
			{
				if(allAnswers[line][coloum] == answerKey[coloum])
				{
					correctAnswer++;
				}
			}
			System.out.printf("The Number of %d.Student's correct answers:%d%n",line+1,correctAnswer);
		}
	}
}
