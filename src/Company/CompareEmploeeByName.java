package Company;

import java.util.Comparator;

public class CompareEmploeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1 instanceof Employee && o2 instanceof Employee){
			String st1 = ((Employee)o1).getName();
			String st2 = ((Employee)o2).getName();
		return st1.compareTo(st2);
		}
		return 0;
	}

}
