package business;

import exception.InvalidXMLException;
import exception.ItemAlreadyExistsException;
import exception.ItemNotFoundException;
import exception.UserNotFoundException;

public class TestBO {

    public static void main(String[] args) throws InvalidXMLException, ItemAlreadyExistsException,
            ItemNotFoundException, UserNotFoundException {
        /**
        String userXML = "<user><username>felix</username><password>felix</password></user>";
        UserBO.create(userXML);

        userXML = "<user><username>jose</username><password>jose</password></user>";
        UserBO.create(userXML);
		*/
        System.out.println(UserBO.getXML("jose"));        
      
        System.out.println(UserBO.getAllXML());
        /**
        String messageXML = "<message>"
        + "<messageID></messageID>"
        + "<content>There has to be done someting with...</content>"
        + "<link></link>"
        + "<user>"
        + "<username>felix</username>"
        + "<password>felix</password>"
        + "<link></link>"
        + "</user>"
        + "</message>";
        MessageBO.create(messageXML);
        
        String messageXML02 = "<message>"
            + "<messageID></messageID>"
            + "<content>I have to do someting to...</content>"
            + "<link></link>"
            + "<user>"
            + "<username>jose</username>"
            + "<password>jose</password>"
            + "<link></link>"
            + "</user>"
            + "</message>";
        MessageBO.create(messageXML02);
		*/
        System.out.println("----------------|");
        System.out.println(MessageBO.getAllXML());
        System.out.println("----------------|");

        System.out.println(MessageBO.getAllXMLForUser("sando"));
        System.out.println(MessageBO.getAllXMLForUser("felix"));

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println(MessageBO.searchAllXML("someting"));
        

        /**   System.out.println(UserBO.getJSON("jose"));         */

        /**   System.out.println(UserBO.getAllJSON());         */
        
        /**   UserBO.delete("jose");
        System.out.println(UserBO.getXML("jose"));         */

        /**        System.out.println("----------------");
        System.out.println(MessageBO.getAllJSON());
        System.out.println("----------------");         */

        /**       System.out.println(MessageBO.getAllJSONForUser("felix"));         */
         
    }
}
