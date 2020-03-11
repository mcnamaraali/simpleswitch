package letter;
/**
 * @author alimcnamara
 *
 */
import java.util.Scanner;


public class LetterGrades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aCount = 0; //number of A grades
		int bCount = 0; //number of B grades
		int cCount = 0; //number of C grades
		int fCount = 0; //number of F grades
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("%s%n%s%n", 
				"Enter the integer grades in a range 0-100", " type CTRL d and enter");
		
		while (input.hasNext() ) {
			int grade = input.nextInt();
			
			switch (grade / 10) {
			case 9:
			case 10:
				++aCount;
				break;
			case 8:
				++bCount; //grades between 80 and 89 
				break;
			case 6:
				++cCount;
				break; //exits switch
			default:
				++fCount;
				break;
			}
			
		}
		
		System.out.printf("%n%s%n%d%n%s%n%d%n%s%n%d%n%s%n%d", 
				"A: ", aCount,
				"B: ", bCount,
				"C: ", cCount,
				"F: ", fCount);

	}

}
