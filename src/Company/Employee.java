package Company;

import java.util.Map;
import java.util.TreeMap;

public class Employee{
	private String name;
	private int age;
	private int salary;
	private static int ids = 0;
	private int id;
	private Map<Integer, Integer> monthlySalary;
	
	public Employee(String name, int age, int salary) {
		this.monthlySalary = new TreeMap<Integer, Integer>();
		this.setName(name);
		this.setAge(age);
		this.setId();
		ids++;
		this.setSalary(salary);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		
		return salary;
		
	}

	public void setSalary(int salary) {
		if(salary>0){
		this.salary = salary;
		}
	}

	public int getId() {
		return id;
	}

	private void setId() {
		this.id = ids;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", salary=" + salary + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public void setMonthlySalary(int salary, int monthNumber){
		if(monthNumber>0&&monthNumber<=12&&salary>0){
			Integer s = new Integer(salary);
			Integer m = new Integer(monthNumber);
		this.monthlySalary.put(m, s);
		}
	}
	
	public void getMonthlySalary(int monthNumber){
		if(monthNumber>0&&monthNumber<12){
			System.out.println(this.getName()+" takes "+this.monthlySalary.get(monthNumber).intValue()+"$ for month - "+monthNumber);
		}
			
		
	}
	
	

}
