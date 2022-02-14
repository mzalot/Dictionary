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
    }
}
