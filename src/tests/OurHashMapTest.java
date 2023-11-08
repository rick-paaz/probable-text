package tests;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.OurHashMap;
import model.OurMap;

class OurHashMapTest {

  @Test
  void testConstructorAndToString() {
     OurMap<String, ArrayList<Character>> map = new OurHashMap<>();
     ArrayList<Character> followers = new ArrayList<>();
     followers.add('U');
     followers.add('A');
     map.put("Alice", followers);
     System.out.println(map.get("Alice").toString());
  }
}