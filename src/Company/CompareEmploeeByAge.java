package Company;

import java.util.Comparator;

public class CompareEmploeeByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1 instanceof Employee && o2 instanceof Employee) {
			return ((Employee)o1).getAge()-((Employee)o2).getAge();
		}
		return 0;
	}

}
