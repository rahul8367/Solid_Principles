package SolidPrincipleViolation.OCP;
/*
violation of open-closed principle it states that open for
extension closed for modification
 */
public class NotificationClass {
   public void sendOTP(String conType){
       if(conType.equalsIgnoreCase("mobile")){
           // write logic
       }
       if(conType.equalsIgnoreCase("whatsapp")){
           //write logic
       }
   }
}
