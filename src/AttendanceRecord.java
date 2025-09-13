import java.util.Date;

public class AttendanceRecord {
    private String employeeID;
    private Date checkInTime; 
    private Date checkOutTime; 

    public AttendanceRecord(String employeeID, Date checkInTime, Date checkOutTime){
        this.employeeID = employeeID; 
        this.checkInTime = checkInTime; 
        this.checkOutTime = null; 
    }
    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }
    
}
