package Lab303117PhoneDirTreeMap;
import java.util.TreeMap;
import java.util.Map;
public class PhoneDirWithTreeMap {
    /*
    The treeMap that will store the data.
    Both key and value are of type string.
    The key represents a name and the value
    represents the associated phone number.
     */
    private TreeMap<String, String> data;

    /**
     * Constructor creates an initially empty directory
     */
    public PhoneDirWithTreeMap(){
        this.data = new TreeMap<String,String>();
    }
    /**
     * Finds the phone number. if any, for a given name
     * @return the phone number associated w/ the name; if the name
     * does not occur in the phone directory, then the return value is null
     */
    public String getNumber(String name){
        return this.data.get(name);
    }
    /**
     * Associates a given name with a given phone number. If the name
     * already exists in the phone directory, then the new number
     * replaces the old one. Otherwise a new name/pair is added. The name and
     * number should both be non-null. An IllegalArgumentException is
     * thrown if this is not the case
     */
    public void putNumber(String name, String number) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        this.data.put(name, number);
    }
    /**
     * Write contents of phone dir to System.out
     */
    public void print(){
        for(Map.Entry<String, String> entry : this.data.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
