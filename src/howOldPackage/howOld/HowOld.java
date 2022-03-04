package howOldPackage.howOld;

public class HowOld {
	
	public void FutureYear(int birthYear, int yearToCount) {

		int futureAge = yearToCount - birthYear;
		int yearBorn = yearToCount - futureAge;
		
		System.out.println("You will be " + futureAge + " in the year " + yearToCount);
		System.out.println("You were born in " + yearBorn);
	}
}
