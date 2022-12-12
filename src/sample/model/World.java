package sample.model;

import java.util.ArrayList;

public class World {

    private String name;
    private String description;
    private String rating;
    private ArrayList<Family> families;
    private ArrayList<Guy> guys_without_family;
    private ArrayList<Guy> past_guys;

    public World (String name_to_set, String description_to_set, String rating_to_set, ArrayList<Family> families_to_set,
                  ArrayList<Guy> guys_without_family_to_set, ArrayList<Guy> past_guys_to_set) {

        this.name = name_to_set;
        this.description = description_to_set;
        this.rating = rating_to_set;
        this.families = families_to_set;
        this.guys_without_family = guys_without_family_to_set;
        this.past_guys = past_guys_to_set;
    }

    // toString and Getters and Setters
    public String toString () {
        return this.name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public ArrayList<Family> getFamilies() {
        return families;
    }
    public void setFamilies(ArrayList<Family> families) {
        this.families = families;
    }
    public ArrayList<Guy> getGuys_without_family() {
        return guys_without_family;
    }
    public void setGuys_without_family(ArrayList<Guy> guys_without_family) {
        this.guys_without_family = guys_without_family;
    }
    public ArrayList<Guy> getPast_guys() {
        return past_guys;
    }
    public void setPast_guys(ArrayList<Guy> past_guys) {
        this.past_guys = past_guys;
    }

    public ArrayList<Guy> get_current_guys() {
        ArrayList<Guy> all_guys_with_family = new ArrayList<Guy>(guys_without_family);
        for (Family f : this.getFamilies()) {
            all_guys_with_family.addAll(f.getAllMembers());
        }
        return all_guys_with_family;
    }

    // Return guys without a family
    public ArrayList<Guy> get_guys_without_family() {
        return this.guys_without_family;
    }

    // Finds a guy in the World by name. Returns the Guy object or None if guy is not found
    public Guy find_guy(String name) {
        for (Family f : this.getFamilies()) {
            Guy g = f.find_guy(name);
            if (g != null) {
                return g;
            }
        }
        return null;
    }

    // Add a family in the World
    public World add_family(Family family_to_add) {
        this.families.add(family_to_add);
        return this;
    }

    // Adds a guy to the category of guys without a family
    public World add_guy(Guy guy_to_add) {
            this.guys_without_family.add(guy_to_add);
            return this;
    }

}
