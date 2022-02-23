package cw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("maryan");
        Pet dog = new Pet("sharik");
        Pet cat = new Pet("lolik");
        List<Pet> petList = new ArrayList<>();
        petList.add(dog);
        petList.add(cat);
        TreeMap<Person , List<Pet>> personListTreeMap = new TreeMap<>();
        personListTreeMap.put(person , petList);
        Zooclub zooclub = new Zooclub(personListTreeMap);
        System.out.println(zooclub);
        Set<Map.Entry<Person, List<Pet>>> entries = personListTreeMap.entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next =  iterator.next();
            List<Pet> petValue = next.getValue();
//            if (next.getKey().equals(person)){
//                iterator.remove();
//            }
            Iterator<Pet> iterator1 = petValue.iterator();
            while (iterator1.hasNext()) {
                Pet pet =  iterator1.next();
                if (pet.equals(cat)){
                    iterator1.remove();
                }
            }
        }
        System.out.println(zooclub);
    }
}
