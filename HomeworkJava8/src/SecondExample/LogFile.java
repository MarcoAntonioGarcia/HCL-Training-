package SecondExample;

import java.time.LocalTime;

public class LogFile {
	private int visitID;
	private LocalTime startTime;
	private LocalTime endTime;
	
	public int getVisitID() {
		return visitID;
	}
	public void setVisitID(int visitID) {
		this.visitID = visitID;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
	
	
	
	public LogFile(int visitID, LocalTime startTime, LocalTime endTime) {
		this.visitID = visitID;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	public LogFile() {
	}
	
	@Override //Metodo toString para leer la informacion.
	public String toString() {
		return "Clientes [VisitID= " + visitID + ", Start Time= " +startTime 
				+ ", End Time = " + endTime+ "]";
	}
	
}





