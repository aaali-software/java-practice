# Java Practice

This repository is where I practice Java fundamentals, data structures, algorithms, and interview-style coding patterns.

## Goals
- Refresh core Java knowledge
- Strengthen problem-solving skills for interviews
- Reinforce common coding patterns
- Build a consistent GitHub history of technical growth

---

## Structure

- `basics/`  
  Java syntax, variables, and foundational concepts

- `collections/`  
  HashMap, HashSet, sorting, comparators, and collection-based patterns

- `problems/`  
  Interview-style coding problems and solutions

- `oop/`  
  Object-oriented programming concepts and examples

---

## Implemented Problems & Patterns

### 🔹 HashMap / Frequency Counting
- **TwoSum.java**
  - Uses a HashMap to find complements in O(n)
  - Pattern: value → index lookup

- **ValidAnagram.java**
  - Frequency map with increment/decrement logic
  - Pattern: counting + cleanup (removing zero entries)

---

### 🔹 Grouping Pattern
- **GroupAnagrams.java**
  - Groups strings using sorted string as key
  - Pattern: HashMap<String, List<String>>

---

### 🔹 Heap / Top K Pattern
- **TopKFrequentElements.java**
  - Combines frequency map + min heap
  - Pattern: keep heap size = k

---

### 🔹 Comparator / Sorting
- **ComparatorExamples.java**
  - Sorting numbers, strings, and custom objects
  - Covers:
    - ascending / descending
    - multi-condition sorting
    - lambda usage

---

### 🔹 HashSet / Uniqueness
- **HashSetExamples.java**
  - Duplicate detection
  - Intersection of arrays
  - Pattern: fast lookup (O(1))

---

### 🔹 Sliding Window (Two Pointers)
- **LongestSubstringWithoutRepeatingCharacters.java**
  - Expanding + shrinking window
  - Pattern: maintain valid window using HashSet

---

## Key Patterns Learned

- Frequency counting (HashMap)
- Grouping elements (HashMap<List>)
- Heap / PriorityQueue (Top K problems)
- Sorting with comparators and lambdas
- HashSet for uniqueness and fast lookup
- Sliding window (two pointers)

---

## Next Steps

- Add more sliding window problems
- Practice two-pointer techniques
- Expand heap-based problems
- Add more advanced Java concepts (Streams, Optional, etc.)
- Begin integrating Spring Boot examples

---

## Notes

This repository is intentionally structured for learning and review.  
Each problem reinforces a specific pattern commonly used in technical interviews.