package sample.model;

import java.util.HashMap;
//import java.lang.reflect.*;

public class Guy {

    private String name;
    private String age_sort;
    private String job;
    private String hobbies;
    private String family_power;
    private String family_secret;
    private boolean is_current_guy;
    private HashMap<String, Integer> personality;

    public Guy(String name_to_set, String age_sort_to_set, String job_to_set, String hobbies_to_set,
               String family_power_to_set, String family_secret_to_set, boolean is_current_guy_to_set,
               HashMap<String, Integer> personality_to_set) {
        this.name = name_to_set;
        this.age_sort = age_sort_to_set;
        this.job = job_to_set;
        this.hobbies = hobbies_to_set;
        this.family_power = family_power_to_set;
        this.family_secret = family_secret_to_set;
        this.is_current_guy = is_current_guy_to_set;
        this.personality = personality_to_set;
    }

    public String toString () {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public String getAge_sort() {
        return age_sort;
    }

    public String getJob() {
        return job;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getFamily_power() {
        return family_power;
    }

    public String getFamily_secret() {
        return family_secret;
    }

    public boolean isIs_current_guy() {
        return is_current_guy;
    }

    public HashMap<String, Integer> getPersonality() {
        return personality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge_sort(String age_sort) {
        this.age_sort = age_sort;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setFamily_power(String family_power) {
        this.family_power = family_power;
    }

    public void setFamily_secret(String family_secret) {
        this.family_secret = family_secret;
    }

    public void setIs_current_guy(boolean is_current_guy) {
        this.is_current_guy = is_current_guy;
    }

    public void setPersonality(HashMap<String, Integer> personality) {
        this.personality = personality;
    }
}
