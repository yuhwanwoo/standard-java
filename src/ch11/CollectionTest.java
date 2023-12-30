package ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class CollectionTest {
    public static void main(String[] args) {
        // 1. Collection => List, Set
        // 2. Map

        // List
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> stack = new Stack<>();
        List<Vector> vectors = new Vector<>();

        // Set
        Set<String> hashSet = new HashSet<>();
        Set<String> TreeSet = new HashSet<>();

        // Map
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();
        Map<String, String> hashTable = new Hashtable<>();
        Hashtable properties = new Properties();
    }
}
