package businessServirce;
// Generated 15 Mar 2016 10:16:51 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Members generated by hbm2java
 */
public class Members  implements java.io.Serializable {


     private int memberId;
     private String name;
     private String surname;
     private String cellnumber;
     private String houseno;
     private String location;
     private String city;
     private String emailAddress;
     private Set bookings = new HashSet(0);

    public Members() {
    }

	
    public Members(int memberId, String name, String surname, String cellnumber, String houseno, String location, String city, String emailAddress) {
        this.memberId = memberId;
        this.name = name;
        this.surname = surname;
        this.cellnumber = cellnumber;
        this.houseno = houseno;
        this.location = location;
        this.city = city;
        this.emailAddress = emailAddress;
    }
    public Members(int memberId, String name, String surname, String cellnumber, String houseno, String location, String city, String emailAddress, Set bookings) {
       this.memberId = memberId;
       this.name = name;
       this.surname = surname;
       this.cellnumber = cellnumber;
       this.houseno = houseno;
       this.location = location;
       this.city = city;
       this.emailAddress = emailAddress;
       this.bookings = bookings;
    }
   
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getCellnumber() {
        return this.cellnumber;
    }
    
    public void setCellnumber(String cellnumber) {
        this.cellnumber = cellnumber;
    }
    public String getHouseno() {
        return this.houseno;
    }
    
    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Set getBookings() {
        return this.bookings;
    }
    
    public void setBookings(Set bookings) {
        this.bookings = bookings;
    }




}


