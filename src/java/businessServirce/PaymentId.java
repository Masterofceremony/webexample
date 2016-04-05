package businessServirce;
// Generated 15 Mar 2016 10:16:51 PM by Hibernate Tools 4.3.1



/**
 * PaymentId generated by java
 */
public class PaymentId  implements java.io.Serializable {


     private String invoiceN0;
     private int membersMemberId;
     private int usersUserId;

    public PaymentId() {
    }

    public PaymentId(String invoiceN0, int membersMemberId, int usersUserId) {
       this.invoiceN0 = invoiceN0;
       this.membersMemberId = membersMemberId;
       this.usersUserId = usersUserId;
    }
   
    public String getInvoiceN0() {
        return this.invoiceN0;
    }
    
    public void setInvoiceN0(String invoiceN0) {
        this.invoiceN0 = invoiceN0;
    }
    public int getMembersMemberId() {
        return this.membersMemberId;
    }
    
    public void setMembersMemberId(int membersMemberId) {
        this.membersMemberId = membersMemberId;
    }
    public int getUsersUserId() {
        return this.usersUserId;
    }
    
    public void setUsersUserId(int usersUserId) {
        this.usersUserId = usersUserId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PaymentId) ) return false;
		 PaymentId castOther = ( PaymentId ) other; 
         
		 return ( (this.getInvoiceN0()==castOther.getInvoiceN0()) || ( this.getInvoiceN0()!=null && castOther.getInvoiceN0()!=null && this.getInvoiceN0().equals(castOther.getInvoiceN0()) ) )
 && (this.getMembersMemberId()==castOther.getMembersMemberId())
 && (this.getUsersUserId()==castOther.getUsersUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInvoiceN0() == null ? 0 : this.getInvoiceN0().hashCode() );
         result = 37 * result + this.getMembersMemberId();
         result = 37 * result + this.getUsersUserId();
         return result;
   }   


}


