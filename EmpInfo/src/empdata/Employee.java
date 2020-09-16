package empdata;

public class Employee {

	private String name;
	private int wage;
	private int numHours;
	Company contains;
        
        public Employee(String nm,int w,int nh)
        {
            name=nm;
            wage=w;
            numHours=nh;
        }

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getWage() {
		return this.wage;
	}

	/**
	 * 
	 * @param wage
	 */
	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getNumHours() {
		return this.numHours;
	}

	/**
	 * 
	 * @param numHours
	 */
	public void setNumHours(int numHours) {
		this.numHours = numHours;
	}

        public int calculatePay()
        {
            return (wage*numHours);
        }
}