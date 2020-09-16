package empdata;

public class Manager extends Employee {

	private int bonus;
        
        public Manager(String s, int w,int nh,int b)
        {
            super(s,w,nh);
            bonus=b;
        
        }

	public int getBonus() {
		return this.bonus;
	}

	/**
	 * 
	 * @param bonus
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
        
        @Override
        public int calculatePay()
        {
           return((super.calculatePay())+bonus);
           // return((getWage()*getNumHours())+bonus);
        }

}