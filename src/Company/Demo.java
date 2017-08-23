package Company;

public class Demo {

	public static void main(String[] args) {
		Company myCompany = new Company("myCompany");
		
		Employee asen = new Employee("Asen", 18, 800);
		Employee ivan = new Employee("Ivan", 20, 900);
		Employee ivanAsen = new Employee("Ivan Asen", 25, 850);
		Employee asenIvan = new Employee("Asen Ivan", 30, 880);
		Employee irina = new Employee("Irina", 28, 800);
		Employee kris = new Employee("Kris", 31, 830);
		Employee krisi = new Employee("Kris", 32, 830);
		
		
		
		myCompany.addBranch("Asistent","age");
		myCompany.addBranch("Boss","name");
		myCompany.addBranch("Security", "salary");
		
		myCompany.addEmployee(asen, "Asistent");
		myCompany.addEmployee(ivan, "Asistent");
		myCompany.addEmployee(ivanAsen, "Boss");
		myCompany.addEmployee(asenIvan, "Boss");
		myCompany.addEmployee(irina, "Security");
		myCompany.addEmployee(kris, "Security");
		myCompany.addEmployee(krisi, "Asistent");
		
		
		myCompany.listAllByBranches();
		System.out.println("-----------------------------");
		myCompany.listAllEmployees(myCompany.getBranches());
		System.out.println("-----------------------------");
		myCompany.eliminateTheDuplicates(myCompany.getBranches());
		System.out.println("-----------------------------");
		krisi.setMonthlySalary(900, 2);
		krisi.getMonthlySalary(2);
		
		
	}

}
