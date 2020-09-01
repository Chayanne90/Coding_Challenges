package TutorialsChallenges.ArraysandListsBoxing;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {

        this. contacts = new ArrayList<Contact>();
    }

    private int searchContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int searchContact(String contactName) {

        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;

    }


   public boolean addContact(Contact contact) {

    if (searchContact(contact.getName()) >= 0){
        System.out.println("Contact already exists");
        return false;
    }

    contacts.add(contact);
    return true;
   }
















}
