package javaapplication1;

/**
 *
 * @author
 * Posathorn Ploykaew 5907101008
 * Pacharapon Sreepiachai 5907101024
 */
public class HashEntry {
    private String key;
    private String value;

    HashEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue(String key) {
        if(this.value.equals(null))
             return "this index is null";
        else
        return this.value;
    }
    public String takeStKey(){
        return this.key;
    }
}
