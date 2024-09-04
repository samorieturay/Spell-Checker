# Spell Checking and Performance Analysis Project
This project focuses on developing an algorithm to check word spelling accuracy over large bodies of text and assess the time efficiency of different data structures in handling dictionary and text data. The project leverages Java’s HashSet, TreeSet, and ArrayList to evaluate the performance of spell-checking across different storage methods.
## Features
* Spell Checking Algorithm: Checks the accuracy of words against a given dictionary.
* Performance Analysis: Assesses time efficiency using different data structures (HashSet, TreeSet, and ArrayList).
* Dictionary Management: Handles dictionary operations and word documentation for runtime analysis.
## Project Files
* SpellChecker.java: Contains the main logic for spell checking and performance analysis.
* Stopwatch.java: Utility class to measure the time taken by various operations.
* SpellCheck.java: Script implementing the spell-checking algorithm.
## Implementation Details
### Spell Checking Algorithm
The spell checker reads through large text files, comparing each word against a dictionary. The accuracy of the spelling is verified by looking up each word in the dictionary, which is implemented using various data structures:
* HashSet: Provides constant-time performance for lookups.
* TreeSet: Ensures sorted order but has slower performance compared to HashSet due to log(n) time complexity for lookups.
* ArrayList: Offers indexed access but has the slowest performance for lookups, especially with large data sets.
## Performance Analysis
The project evaluates the time efficiency of each data structure using a Stopwatch class, which records the time taken to complete the spell-checking process with different data structures.
## Dictionary Management
The dictionary is managed using the three data structures mentioned above, and the performance of each structure is documented. The choice of data structure significantly impacts the efficiency of the spell-checking process, especially when dealing with large dictionaries.
## How to Run
1. Clone the Repository: Download the project files to your local machine.
2. Open respected IDE (VS Code or IntelliJ)
## Example Output
* **In Spellcheck** <br/>
exclusions <br/>
tel <br/>
attmail <br/>
uglification <br/>
tis <br/>
northumbria ... <br/>

* **In Spellchecker** <br/>
Initiating examination for terms absent in dictionary utilizing HashSet... <br/>
Time: HashSet: 9350500 nanoseconds <br/>
Words not found: HashSet: 2266 <br/>
Total words counted for: HashSet: 17624 <br/>
 <br/>
Initiating examination for terms absent in dictionary utilizing TreeSet... <br/>
Time: TreeSet: 4335100 nanoseconds <br/>
Words not found: TreeSet: 2266 <br/>
Total words counted for: TreeSet: 17624 <br/>
 <br/>
Initiating examination for terms absent in dictionary utilizing ArrayList... <br/>
## Contributions
Contributions are welcome! If you have ideas to improve the algorithm or performance analysis, feel free to submit a pull request.
