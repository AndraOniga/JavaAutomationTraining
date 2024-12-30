package DataStructures;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Structures {
    //multimi: array, list, map

    @Test
    public void testMethod() {
        courseParticipants();
        courseParticipantsList();
        objectCategoriessMap();
        citiesCountry();
    }

    //exemplu array
    public void courseParticipants() {
        String[] participants = new String[6];
        participants[0] = "Andra";
        participants[1] = "Ana";
        participants[2] = "Anda";
        participants[3] = "Anca";
        participants[4] = "Andreea";
        participants[5] = "Alex";
        for(int index =0; index < participants.length; index++){
            System.out.println("Name of the participant is: " + participants[index]);
        }
    }

    //exemplu list
    public void courseParticipantsList(){
        List<String> participants = new ArrayList<>();
        participants.add("Andra");
        participants.add("Ana");
        participants.add("Anca");
        participants.add("Andreea");
        participants.add("Alex");
        int index = 0;
        while(index < participants.size()){
            System.out.println("Name of the participant with list is: " + participants.get(index));
            index++;
        }
    }

    //exemplu map
    //map -> cheie = valoare
    public void objectCategoriessMap(){
        HashMap<String, String> objects = new HashMap<>();
        objects.put("object", "laptop");
        objects.put("fruit", "apple");
        objects.put("flower", "rose");
        for (String key: objects.keySet()){
            System.out.println("Key is: " + key + " and value is " + objects.get(key));
        }
    }

    public void citiesCountry(){
        HashMap<String, List<String>> cities = new HashMap<>();
        List<String> citiesOfRomania = new ArrayList<>();
        citiesOfRomania.add("Cavnic");
        citiesOfRomania.add("Cluj-Napoca");
        List<String> citiesOfItaly = new ArrayList<>();
        citiesOfItaly.add("Milan");
        citiesOfItaly.add("Rome");
        cities.put("Romania", citiesOfRomania);
        cities.put("Italy", citiesOfItaly);
        for (String key: cities.keySet()){
            System.out.println("Country is: " + key + " and city is " + cities.get(key));
        }
    }
}
