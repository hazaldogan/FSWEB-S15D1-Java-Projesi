package model;

import java.util.ArrayList;

public class MobilePhone {
    private String myPhone;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myPhone) {
        this.myPhone = myPhone;
        this.contacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
         if(findContact(contact.getName())>=0){
             return false;
         }
         this.contacts.add(contact);
         return true;
    }

    public boolean updateContact(Contact oldContact, Contact newConcact){
        int oldConstactIndex = findContact(oldContact.getName());
        if(oldConstactIndex<0){
            return false;
        }
        this.contacts.set(oldConstactIndex,newConcact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int constactIndex = findContact(contact.getName());
        if(constactIndex<0){
            return false;
        }
        this.contacts.remove(constactIndex);
        return true;
    }

    public int findContact(Contact contact){
        return this.contacts.indexOf(contact);
    }
    public Contact queryContact(String contactName){
        int index = findContact(contactName);
        if(index>=0){
            return this.contacts.get(index);
        }
        return null;
    }

    public int findContact(String contactName){
        for(int i = 0; i< this.contacts.size(); i++){
            Contact contact = this.contacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public void printContacts(){
        for(int i=0;i<this.contacts.size();i++){
            Contact contact = this.contacts.get(i);
            System.out.println((i+1) + " -> " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
