import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SpellChecker {
    public static void main(String[] args) throws FileNotFoundException {
        SpellChecker spellCheck = new SpellChecker();
        spellCheck.spellCheckerTest("./resources/war-and-peace.txt");
    }

    // Reads words from a file into an ArrayList
    public ArrayList<String> readWordsArrayList(String filename) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        Scanner in = new Scanner(new File(filename));
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext())
        {
            words.add(in.next().toLowerCase());
        }
        return words;
    }

    // Reads words from a file into a TreeSet (sorted unique words)
    public TreeSet<String> readWordsTreeSet(String filename) throws FileNotFoundException {
        TreeSet<String> words = new TreeSet<>();
        Scanner in = new Scanner(new File(filename));
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext())
        {
            words.add(in.next().toLowerCase());
        }
        return words;
    }

    // Reads words from a file into a HashSet (unique unordered words)
    public Set<String> readWordsHashSet(String filename)
            throws FileNotFoundException
    {
        Set<String> words = new HashSet<>();
        Scanner in = new Scanner(new File(filename));
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext())
        {
            words.add(in.next().toLowerCase());
        }
        return words;
    }

    // Method to perform spell checking and display word counts and time differences
    // Method to perform spell checking and display word counts and time differences
    public void spellCheckerTest(String filename) throws FileNotFoundException {
        // Loading dictionary words into different data structures
        Set<String> dictionaryWords = readWordsHashSet("./resources/words");
        Set<String> dictionaryWords2 = readWordsTreeSet("./resources/words");
        ArrayList<String> dictionaryWords3 = readWordsArrayList("./resources/words");

        // Loading words from the specified file for spell checking
        Set<String> warPeace = readWordsTreeSet("./resources/war-and-peace.txt");
        Set<String> warPeace2 = readWordsHashSet("./resources/war-and-peace.txt");
        ArrayList<String> warPeace3 = readWordsArrayList("./resources/war-and-peace.txt");

        // Perform spell checking using HashSet
        performSpellCheck(dictionaryWords, warPeace2, "HashSet");

        // Perform spell checking using TreeSet
        performSpellCheck(dictionaryWords2, warPeace, "TreeSet");

        // Perform spell checking using ArrayList
        performSpellCheck(dictionaryWords3, warPeace3, "ArrayList");
    }

    // Method to perform spell checking using a specific data structure
    private void performSpellCheck(Collection<String> dictionary, Collection<String> wordsToCheck, String structure) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        System.out.println("\nInitiating examination for terms absent in dictionary utilizing " + structure + "...");

        for (String word : wordsToCheck) {
            if (!dictionary.contains(word)) {
                wordCount++;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("Time: " + structure + ": " + elapsedTime + " nanoseconds");
        System.out.println("Words not found: " + structure + ": " + wordCount);
        System.out.println("Total words counted for: " + structure + ": " + wordsToCheck.size());
    }

    // Stopwatch class to measure time
    private static class Stopwatch {
        private long startTime;
        private long endTime;

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return endTime - startTime;
        }
    }
}