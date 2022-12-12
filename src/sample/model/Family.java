package sample.model;

import java.util.ArrayList;

public class Family {

    private String name;
    private Guy head;
    private ArrayList<Guy> members;

    public Family(String name, Guy head, ArrayList<Guy> members) {
        if (members.contains(head)) {
            System.out.println("WARNING. The head is contained in the members. This will automatically be fixed.");
        }

        this.name = name;
        this.head = head;
        this.members = members;
    }

    public String toString() {
        return this.name;
    }

    // Returns an array of all the guys in the family
    public ArrayList<Guy> getAllMembers() {
        ArrayList<Guy> membersOfFamily = new ArrayList<Guy>(this.members);
        membersOfFamily.add(this.head);
        return membersOfFamily;
    }

    public Guy getHead() {
        return this.head;
    }

    // Sets the head of the family to a different guy from the same family
    public boolean setHead(Guy head) {
        boolean operationSuccessful;
        if (find_guy(head.getName()) == null) {
            return false;
        }
        else if (head.getName().equals(this.getHead().getName())){
            return true;
        }
        else {
            this.add_guy(this.head);
            operationSuccessful = this.members.remove(head);
            this.head = head;
        }
        return operationSuccessful;
    }

    public void setName(String nameToSet) {
        this.name = nameToSet;
    }

    public ArrayList<Guy> getMembers() {
        return this.members;
    }

    // Finds a guy in the family by name. Returns Guy object or None if guy is not found
    public Guy find_guy(String name) {
        for (Guy g : this.getAllMembers()) {
            if (g.getName().equals(name)) {
                return g;
            }
        }
        return null;
    }

    // Adds a guy to the members of the family
    public Family add_guy(Guy guyToAdd) {
        this.members.add(guyToAdd);
        return this;
    }
}
