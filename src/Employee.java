/**
 * Create an class Employee with following properties and function
 */
/* creating abstract class */
abstract class Employee {
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	/* creating constructor */
	Employee(int id, String name, int total, double sal) {
		empId = id;
		empName = name;
		total_leaves = total;
		total_salary = sal;
	}
	/* creating abstract method */
	void calculate_balance_leaves() {
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		return true;
	}

	void calculate_salary() {

	}

}

class PermanentEmp extends Employee {
	/*  constructor declare*/
	PermanentEmp(int id, String name, int total, double sal) {
		/* super */
		super(id, name, total, sal);
	}
	/*  variable initialization */
	int paid_leave = 7, sick_leave = 5, casual_leave = 2;
	double basic = 10000, hra = 4000, pfa = 1000;
	/*  method declare */
	void print_leave_details() {
		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	}

	void calculate_balance_leaves() {
		int total = total_leaves - (paid_leave + sick_leave + casual_leave);
		System.out.println("leave Balance =" + total);
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if (no_of_leaves < total_leaves)
			return true;
		else
			return false;

	}

	void calculate_salary() {
		/*  calculation*/
		double hra = .5f * basic;
		double da = .2f * basic;
		double totalSalary = total_salary + (hra + da) - pfa;
		System.out.println("Salary =" + totalSalary);

	}
}

class TemporaryEmp extends Employee {
	/* constructor declare */

	TemporaryEmp(int id, String name, int total, double sal) {
		/* super */
		super(id, name, total, sal);

	}/* variable initialization */

	int paid_leave = 3, sick_leave = 5, casual_leave = 2;
	/* method declare */

	void print_leave_details() {
		/* output */
		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	}


	void calculate_balance_leaves() {
		/* calculation */
		int total = total_leaves - (paid_leave + sick_leave + casual_leave);
		System.out.println("leave Balance =" + total);

	}

	
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if (no_of_leaves < total_leaves)
			return true;
		else
			return false;
	}

	
	void calculate_salary() {
		float hra = (float) 30.50;
		int rate = 1000;
		/* calculation */
		double totalSalary = hra * rate;
		/* outputF */
		System.out.println("Salary =" + totalSalary);

	}

}
