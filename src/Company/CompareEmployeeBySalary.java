package Company;

import java.util.Comparator;

public class CompareEmployeeBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1 instanceof Employee && o2 instanceof Employee){
		return ((int) ((Employee)o1).getSalary()-(int) ((Employee)o2).getSalary());
		}
		return 0;
	}

	

}
