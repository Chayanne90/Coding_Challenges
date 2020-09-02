package TutorialsChallenges.ArraysandListsBoxing;

import java.util.Scanner;

public class App3 {

    private static Scanner in = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone("646-987-2504");

    public static void main(String[] args) {

        boolean quit = false;
        System.out.println("Starting Phone....");
        printActions();

        while (!quit) {

            System.out.println("\nEnter Action: (6 to show avaible actions)");
            int action = in.nextInt();
            in.nextLine();

            switch (action) {

                case 0:
                    System.out.println("\nShut Down...");
                    quit = true;
                case 1:
                    printActions();
                    break;
                case 2:
                    mobilePhone.getContact();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:

                    break;
            }
        }
    }

    private static void printActions() {
        System.out.println("\n Available Astions: \npress");
        System.out.println("0 - Shutdown\n"+
                           "1 - Print Contact\n"+
                           "2 - Add Contact\n" +
                           "3 - Update Contact\n "+
                           "4 - Remove Contact\n "+
                           "5 - Query Existiing Contact\n "+
                           "6 - Print Actions ");

        System.out.println("Choose you Action: ");
    }

    private static void addNewContact() {

        System.out.println("Enter new contact name:");
        String name = in.nextLine();
        System.out.println("Enter Phone number");
        String phone = in.nextLine();

        Contact newContact = Contact.createContact(name,phone);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: " +name +","+phone);
        }
    }

    private static void updateContact() {

        System.out.println("Enter existing conctact name");
        String name = in.nextLine();
        Contact exsitingContact = mobilePhone.queryContact(name);

        if (exsitingContact == null){
            System.out.println("Contact not found!");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = in.nextLine();
        System.out.println("Enter new contact phone number");
        String newPhone = in.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);

        if(mobilePhone.updateContact(exsitingContact, newContact)) {

            System.out.println("Successfully Updated record!");
        } else {

            System.out.println("Error Updating record");
        }

    }

}
