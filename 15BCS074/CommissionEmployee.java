/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Person;

/**
 *
 * @author III-B
 */
public class CommissionEmployee extends Employee{
    private int noOfDaysWorked;
    private float CommisionPerDay;
    
    public float calculateSalary(){
        return noOfDaysWorked*CommisionPerDay;
    }

    public CommissionEmployee(int noOfDaysWorked, float CommisionPerDay, String empId, String Name) {
        super(empId, Name);
        this.noOfDaysWorked = noOfDaysWorked;
        this.CommisionPerDay = CommisionPerDay;
    }

    public int getNoOfDaysWorked() {
        return noOfDaysWorked;
    }

    @Override
    public String toString() {
        super.toString();
        return "CommissionEmployee{" + "noOfDaysWorked=" + noOfDaysWorked + ", CommisionPerDay=" + CommisionPerDay + '}';
    }

    public CommissionEmployee(float CommisionPerDay, String empId, String Name) {
        super(empId, Name);
        this.CommisionPerDay = CommisionPerDay;
    }

    public CommissionEmployee() {
    }

    public float getCommisionPerDay() {
        return CommisionPerDay;
    }

    public void setNoOfDaysWorked(int noOfDaysWorked) {
        this.noOfDaysWorked = noOfDaysWorked;
    }

    public void setCommisionPerDay(float CommisionPerDay) {
        this.CommisionPerDay = CommisionPerDay;
    }
    
}
