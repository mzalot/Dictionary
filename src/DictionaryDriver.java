/**
 DictionaryDriver
 The program will create a driver for the Dictionary class
 Author: Mareks Zeile
 Collaborator(s):
 Collaboration:
 Date: 2/14/22
 On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: MZ
 **/
public class DictionaryDriver {
    public static void main(String[] args) {
        Dictionary test = new Dictionary();
        //test isEmpty
        System.out.println("Test isEmpty(should return true): " + test.isEmpty());
        //test size
        System.out.println("Test size(should return 0): " + test.size());
        //add a value
        test.put("August", "Pogust");
        System.out.println("Adding a key value pair to the dictionary.");
        //test isEmpty
        System.out.println("Test isEmpty(should return false): " + test.isEmpty());
        //test size
        System.out.println("Test size(should return 1): " + test.size());
        //test contains method
        System.out.println("Test contains with August(should return true): " + test.contains("August"));
        System.out.println("Test contains with Will(should return false): " + test.contains("Will"));
        //get test
        System.out.println("Test get(should return Pogust): " + test.get("August"));
        //remove test
        System.out.println("Test remove(should return Pogust): " + test.remove("August"));
        //adding more elements to test the contain methods
        System.out.println("Adding more elements to test the contain methods");
        test.put("Eli", "Sussy baka");
        test.put("Connor", "Bruh button");
        test.put("Trent", "Dad");
        //test collection methods
        System.out.println("Test collection of keys method(should return a collection of keys): " + test.keys());
        System.out.println("Test collection of values method(should return a collection of values): " + test.values());
        //still need to test get, remove, and contains(add more values for this)
    }
}
