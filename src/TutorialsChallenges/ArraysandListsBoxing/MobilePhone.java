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

    public boolean updateContact(Contact oldContact, Contact newcontact) {
        int found = searchContact(oldContact);

        if (found < 0) {
            System.out.println(oldContact.getName() + " Was Not fund");
            return false;
        }

        this.contacts.set(found, newcontact)
        System.out.println(oldContact.getName() + ", was replace with "+ newcontact.getName());
        return true;

    }


   public boolean addContact(Contact contact) {

    if (searchContact(contact.getName()) >= 0){
        System.out.println("Contact already exists");
        return false;
    }

    contacts.add(contact);
    return true;
   }

   public boolean removeContact(Contact contact){
       int found = searchContact(contact);

       if (found < 0) {
           System.out.println(contact.getName() + " Was Not fund");
           return false;
       }

       this.contacts.remove(contact);
       System.out.println(contact.getName() +  ", was Deleted");
       return true;
    }

   public  String queryContact (Contact contact) {

        if (searchContact(contact) >=0){
            return contact.getName();
        }
        return null;
   }



















}
