import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// class Pair {
//     String word;
//     int frequency;

//     public Pair(String word, int frequency) {
//         this.word = word;
//         this.frequency = frequency;
//     }
// }

class CustomComparator implements java.util.Comparator<Map.Entry<String, Integer>> {
    public int compare(Map.Entry<String, Integer> first, Map.Entry<String, Integer> second) {
        return second.getValue() - first.getValue();
    }
}

public class javaFileIO {

    public static void main(String[] args) {
        String csvFile = "javaFileIO.csv";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                for (String word : words) {
                    word = word.trim();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new CustomComparator());
        pq.addAll(wordCount.entrySet());

        int count = 3;
        while (count != 0 && !pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey());
            // System.out.println(entry.getValue());
            count--;
        }
    }
}