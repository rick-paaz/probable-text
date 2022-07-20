package probable;

import java.util.LinkedList;
import java.util.Set;


public class OurHashMap<K, V> implements OurMap<K,V> {
  
  // Map a key to a value as one object.
  public class HashNode {
    private K key;
    private V value;

    public HashNode(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  // Instance variables
  private static final int TABLE_SIZE = 20000;
  private LinkedList<HashNode>[] lists;
  int n;
  
  public OurHashMap() {
    // TODO Initialize an array of TABLE_SIZE empty LinkedList<MapNode> objects
  }
  
  // Precondition: Type K must override hashCode() like String
  // and Integer already do. This methods returns 0..TABLE_SIZE-1
  private int hashCode(K key) {
    // String's hashCode gets arithmetic overflow so it is often negative.
    // This is why we use Math.abs().
    return Math.abs(key.hashCode()) % TABLE_SIZE;
  }


  // If the key is not in use, map the key and the value by adding a
  // new HashNode to the correct LinkedList. Then return null.
  //
  // If there was a mapping to the key, replace and return
  // the existing value that was previously mapped to the key.
  public V put(K key, V value) {
    // TODO Auto-generated method stub
    return null;
  }

  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

  public V get(K key) {
    // TODO Auto-generated method stub
    return null;
  }

  public boolean containsKey(K key) {
    // TODO Auto-generated method stub
    return false;
  }

  public Set<K> keySet() {
    // TODO Auto-generated method stub
    return null;
  }

}
