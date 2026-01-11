# Java DSA Interview Notes

> **Based on "Syntax java dsa" PDF**
>
> This guide contains ONLY the Java language + Collections components that are ACTUALLY USED in DSA interviews. If something is not in this table, you can safely ignore it for interviews.

---

## ✅ Final Java Interview Syntax Table (DSA-Only)

### 1. Core Program Structure

| Component | Syntax |
| :--- | :--- |
| **Class** | `class Solution {}` |
| **Main (rare)** | `public static void main(String[] args)` |
| **Method** | `static int solve()` |
| **Return** | `return x;` |

### 2. Data Types (Most Used)

| Type | Syntax |
| :--- | :--- |
| **Integer** | `int x` |
| **Large int** | `long x` |
| **Decimal** | `double x` |
| **Character** | `char c` |
| **Boolean** | `boolean f` |
| **String** | `String s` |

### 3. Control Flow

| Component | Syntax |
| :--- | :--- |
| **If** | `if (cond) {}` |
| **Else** | `else {}` |
| **For** | `for (int i = 0; i < n; i++) {}` |
| **While** | `while (cond) {}` |
| **Break** | `break;` |
| **Continue** | `continue;` |

### 4. Operators

| Type | Syntax |
| :--- | :--- |
| **Arithmetic** | `+ - * / %` |
| **Compare** | `== != < > <= >=` |
| **Logical** | `&&` `||` `!` |
| **Assign** | `= += -=` |

### 5. Arrays

| Component | Syntax |
| :--- | :--- |
| **Declare** | `int[] a = new int[n];` |
| **Init** | `int[] a = {1,2,3};` |
| **Access** | `a[i]` |
| **Length** | `a.length` |
| **2D** | `a[i][j]` |

### 6. Strings

| Component | Syntax |
| :--- | :--- |
| **Length** | `s.length()` |
| **Char** | `s.charAt(i)` |
| **Substring** | `s.substring(l, r)` |
| **Compare** | `s.equals(t)` |

### 7. StringBuilder

| Component | Syntax |
| :--- | :--- |
| **Create** | `new StringBuilder()` |
| **Append** | `sb.append(x)` |
| **Delete** | `sb.deleteCharAt(i)` |
| **Reverse** | `sb.reverse()` |
| **Convert** | `sb.toString()` |

### 8. Collection Interfaces

| Interface | Used As |
| :--- | :--- |
| **List** | `List<T>` |
| **Map** | `Map<K,V>` |
| **Set** | `Set<T>` |
| **Queue** | `Queue<T>` |
| **Deque** | `Deque<T>` |

### 9. Collection Classes (Core)

| Purpose | Syntax |
| :--- | :--- |
| **Dynamic array** | `new ArrayList<>()` |
| **Hash map** | `new HashMap<>()` |
| **Hash set** | `new HashSet<>()` |
| **Queue** | `new LinkedList<>()` |
| **Stack** | `new ArrayDeque<>()` |
| **Heap** | `new PriorityQueue<>()` |
| **Max heap** | `new PriorityQueue<>(Collections.reverseOrder())` |

### 10. Collection Methods (Most Used)

#### List
- **Add**: `list.add(x)`
- **Get**: `list.get(i)`
- **Set**: `list.set(i, x)`
- **Size**: `list.size()`

#### Map
- **Put**: `map.put(k,v)`
- **Get**: `map.get(k)`
- **Default**: `map.getOrDefault(k,0)`
- **Contains**: `map.containsKey(k)`
- **Remove**: `map.remove(k)`

#### Set
- **Add**: `set.add(x)`
- **Contains**: `set.contains(x)`
- **Remove**: `set.remove(x)`

#### Queue / Deque
- **Add**: `offer(x)`
- **Remove**: `poll()`
- **Peek**: `peek()`
- **Stack push**: `push(x)`
- **Stack pop**: `pop()`

### 11. Utility Classes

| Utility | Syntax |
| :--- | :--- |
| **Sort array** | `Arrays.sort(a)` |
| **Sort list** | `Collections.sort(list)` |
| **Reverse** | `Collections.reverse(list)` |

### 12. Import (Only One)

```java
import java.util.*;
```

> **FINAL TRUTH**: 90% of Java DSA interview solutions use only what's in this table. Master this, and Java will never slow your thinking again.

---

## ✅ All Possible Java DSA Syntax Combos (Final)

> "Below is the COMPLETE, EXHAUSTIVE SET of Java syntax COMBOS that appear in DSA interviews. Not examples. Not patterns. Actual reusable syntax groupings. If you master these, there is no new combo left in interviews."

### 🟢 Level 0 — Core Language Combos (Every Problem)

#### Combo 0.1 — Variable + Condition
**Used in**: base cases, validation  
**Platform**: LeetCode

**Basic Boolean Checks**
1. [LC 9] Palindrome Number
2. [LC 231] Power of Two
3. [LC 326] Power of Three
4. [LC 342] Power of Four
5. [LC 263] Ugly Number
6. [LC 367] Perfect Square
7. [LC 367] Valid Perfect Square
8. [LC 728] Self Dividing Numbers
9. [LC 1232] Check If It Is a Straight Line
10. [LC 2283] Check if Number Has Equal Digit Count

**Number Relation / Range Checks**
1. [LC 412] Fizz Buzz
2. [LC 1150] Check if a Number Is Majority Element in Sorted Array
3. [LC 941] Valid Mountain Array *(conceptually conditional)*
4. [LC 1346] Check If N and Its Double Exist
5. Check If Two Integers Have Same Sign *(variant)*

**String / Character Condition**
1. [LC 520] Detect Capital
2. [LC 408] Valid Word Abbreviation
3. [LC 1455] Check If a Word Occurs As a Prefix
4. [LC 1941] Check If All Characters Have Equal Occurrences
5. [LC 1790] Check if One String Swap Can Make Strings Equal

**Array Single-Decision Problems** *(no traversal logic required beyond simple checks)*
1. [LC 1752] Check If Array Is Sorted and Rotated
2. [LC 1550] Check If It Is a Valid Sequence
3. [LC 2133] Check If Every Row and Column Contains All Numbers
4. [LC 1832] Check If a Sentence Is Pangram *(logic-based)*

**Math / Geometry Conditions**
1. [LC 812] Largest Triangle Area *(conditional compare)*
2. [LC 1037] Valid Boomerang
3. [LC 1812] Determine Color of a Chessboard Square
4. [LC 2543] Check If Point Is Reachable
5. [LC 1716] Calculate Money in Leetcode Bank

**Logical Rule-Based Checks**
1. [LC 657] Robot Return to Origin
2. [LC 1275] Find Winner on a Tic Tac Toe Game
3. [LC 2124] Check If All A's Appear Before All B's
4. [LC 1784] Check If Binary String Has at Most One Segment of Ones
5. [LC 2042] Check If Numbers Are Ascending in a Sentence

**Edge-Condition / Truth Table Style**
1. [LC 2490] Check If the Sentence Is Circular
2. [LC 2828] Check If a String Is an Acronym of Words
3. [LC 2437] Check If Time Is Valid
4. [LC 2729] Check If a Number Is Fascinating

#### Combo 0.2 — Loop Only
**Scanner**: `for`, `while`  
**Used in**: scanning, traversal  
**Platform**: LeetCode

**Basic Counting / Accumulation**
1. [LC 1480] Running Sum of 1D Array
2. [LC 1672] Richest Customer Wealth
3. [LC 2114] Maximum Number of Words Found in Sentences
4. [LC 1295] Find Numbers with Even Number of Digits
5. [LC 1588] Sum of All Odd Length Subarrays
6. [LC 1572] Matrix Diagonal Sum
7. [LC 2656] Maximum Sum With Exactly K Elements

**Simple Iteration / Scanning**
1. [LC 1920] Build Array from Permutation
2. [LC 1470] Shuffle the Array
3. [LC 1929] Concatenation of Array
4. [LC 1389] Create Target Array in the Given Order
5. [LC 2011] Final Value of Variable After Performing Operations
6. [LC 1512] Number of Good Pairs *(brute loop version)*

**Digit / Character Iteration**
1. [LC 1281] Subtract the Product and Sum of Digits of an Integer
2. [LC 258] Add Digits *(loop-based)*
3. [LC 2520] Count the Digits That Divide a Number
4. [LC 1684] Count the Number of Consistent Strings *(loop check)*
5. [LC 2255] Count Prefixes of a Given String

**Array / String Traversal (No Memory)**
1. [LC 1752] Check If Array Is Sorted *(loop variant)*
2. [LC 896] Monotonic Array
3. [LC 1800] Maximum Ascending Subarray Sum
4. [LC 389] Find the Difference *(XOR/loop view)*
5. [LC 58] Length of Last Word

**Simulation / Loop-Driven Logic**
1. [LC 657] Robot Return to Origin *(loop simulation)*
2. [LC 682] Baseball Game *(loop-driven logic)*
3. [LC 2243] Calculate Digit Sum of a String
4. [LC 1417] Reformat the String *(loop build)*

**Math / Sequence Generation**
1. [LC 509] Fibonacci Number *(iterative)*
2. [LC 1137] N-th Tribonacci Number
3. [LC 1374] Generate a String With Characters That Have Odd Counts
4. [LC 2180] Count Integers With Even Digit Sum

**Edge-Case Iteration Questions**
1. [LC 2027] Minimum Moves to Convert String
2. [LC 1941] Check If All Characters Have Equal Occurrences *(loop count logic)*
3. [LC 2000] Reverse Prefix of Word *(loop swap)*

#### Combo 0.3 — Loop + Condition
**Syntax**: `for / while` + `if`  
**Used in**: filtering, counting

---

### 🟢 Level 1 — Array & String Combos

#### Combo 1.1 — Array Scan
**Syntax**: `int[]` + `for` + `a[i]`  
**Used in**: max, min, sum  
**Platform**: LeetCode

**Basic Scan / Aggregation**
1. Find Maximum Element in Array
2. Find Minimum Element in Array
3. Sum of Array Elements
4. Average of Array
5. [LC 1480] Running Sum of 1D Array
6. [LC 1672] Richest Customer Wealth
7. [LC 1464] Maximum Product of Two Elements in an Array
8. [LC 747] Largest Number At Least Twice of Others

**Counting / Condition-Based Scan**
1. Count Elements Greater Than X
2. [LC 1351] Count Negative Numbers in a Sorted Matrix *(scan version)*
3. [LC 1534] Count Good Triplets *(brute scan)*
4. [LC 2176] Count Equal and Divisible Pairs in an Array
5. [LC 2798] Number of Employees Who Met the Target
6. [LC 2180] Count Integers With Even Digit Sum *(array variant)*

**Order / Property Check**
1. Check If Array Is Sorted
2. [LC 896] Monotonic Array
3. Check If Numbers Are Ascending in an Array
4. [LC 3151] Check If Array Is Special
5. Check If All Elements Are Unique *(Brute)*

**Index + Value Relation**
1. [LC 1920] Build Array from Permutation
2. [LC 1470] Shuffle the Array
3. [LC 1389] Create Target Array in the Given Order
4. [LC 1732] Find the Highest Altitude
5. [LC 2535] Find the Difference Between Element Sum and Digit Sum of an Array

**Subarray (Naive Scan View)**
1. [LC 53] Maximum Subarray *(Kadane-style scan)*
2. [LC 1800] Maximum Ascending Subarray Sum
3. [LC 2441] Largest Positive Integer That Exists With Its Negative *(scan logic)*

**Edge-Condition Scans**
1. Find First Peak Element
2. Check If All Zeros Are at the End
3. Find Index of Maximum Element
4. Find Second Maximum Element
5. Check If Array Has At Least One Increasing Pair

#### Combo 1.2 — Array + Two Pointers
**Mental Model**: Scan = One direction, one truth, one state.  
**Syntax**: `int[]` + `int l, r` + `while`

**Same-Direction Two Pointers** (Both move forward; fast/slow pattern)
*Used in: reverse, remove duplicates*
1. [LC 26] Remove Duplicates from Sorted Array
2. [LC 27] Remove Element
3. [LC 283] Move Zeroes
4. [LC 1089] Duplicate Zeros
5. [LC 2460] Apply Operations to an Array
6. [LC 2154] Keep Multiplying Found Values by Two
7. [LC 2442] Count Number of Distinct Integers After Reverse Operations *(pointer variant)*
8. [LC 1299] Replace Elements with Greatest Element on Right Side *(scan + pointer update)*

**Opposite-Direction Two Pointers** (Left/right converge)
*Mental move: Decide which pointer to move, never both blindly.*
1. Reverse Array (classic)
2. [LC 977] Squares of a Sorted Array
3. [LC 905] Sort Array by Parity
4. [LC 922] Sort Array by Parity II
5. [LC 11] Container With Most Water
6. [LC 42] Trapping Rain Water
7. [LC 881] Boats to Save People *(requires sort)*

**Filter / Partition Problems**
1. Move All Even Numbers to Front
2. Move All Negative Numbers to Front
3. Segregate 0s and 1s
4. [LC 75] Dutch National Flag (0,1,2)
5. [LC 2161] Partition Array According to Given Pivot

**Merge / Overlay Using Pointers**
1. [LC 88] Merge Sorted Array
2. [LC 349] Intersection of Two Arrays (Sorted) *(pointer version)*
3. [LC 350] Intersection of Two Arrays II (Sorted)
4. Find Common Elements in Two Sorted Arrays
5. [LC 165] Compare Version Numbers *(pointer parsing)*

**Count / Check with Pointers**
1. [LC 941] Valid Mountain Array
2. [LC 1752] Check If Array Is Sorted and Rotated *(pointer logic)*
3. [LC 485] Max Consecutive Ones *(pointer window)*
4. [LC 674] Longest Continuous Increasing Subsequence

**Interview-Staple Hard Ones** (Pure two pointers)
1. [LC 16] 3Sum Closest *(sort + pointers)*
2. [LC 18] 4Sum *(nested + pointers)*
3. [LC 209] Minimum Size Subarray Sum *(pointer window)*
4. [LC 713] Subarray Product Less Than K
5. [LC 287] Find the Duplicate Number *(Floyd pointers)*

**Mental Rule**: "Two pointers = one reads reality, one fixes structure."

#### Combo 1.3 — String Indexing
**Syntax**: `String` + `length()` + `charAt(i)` + `for / while`  
**Used in**: palindrome, parsing  
**Mental Model**: "Read only, decide immediately."

**Basic Character Scan**
1. [LC 58] Length of Last Word
2. [LC 344] Reverse String *(index-based)*
3. [LC 520] Detect Capital
4. Check If All Characters Are Equal
5. Check If String Is Uppercase / Lowercase
6. Find First Repeating Character (Brute)
7. Find First Non-Repeating Character (Brute)

**Count / Property Check**
1. [LC 1784] Check If Binary String Has at Most One Segment of Ones
2. [LC 2124] Check If All A's Appear Before All B's
3. Check If All Digits Appear Before Letters
4. [LC 1003] Check If String Is Valid After Substitutions *(scan logic)*
5. [LC 2490] Check If Sentence Is Circular

**Digit / Character Processing**
1. [LC 1281] Subtract the Product and Sum of Digits of an Integer *(string view)*
2. [LC 2520] Count the Digits That Divide a Number *(string view)*
3. [LC 2243] Calculate Digit Sum of a String
4. [LC 2729] Check If Number Is Fascinating *(digit scan)*

**Position / Index Relation**
1. [LC 1455] Check If a Word Occurs As a Prefix of Any Word
2. [LC 28] Find the Index of the First Occurrence in a String *(naive scan)*
3. [LC 1790] Check If One String Swap Can Make Strings Equal *(index compare)*
4. Check If String Is a Prefix of Another String

**Order / Pattern Check**
1. [LC 2042] Check If Numbers Are Ascending in a Sentence
2. Check If String Is a Valid Sequence of Moves
3. Check If Binary String Has Alternating Bits
4. [LC 1941] Check If All Characters Have Equal Occurrences *(scan logic)*

**Edge-Condition String Scans**
1. [LC 2000] Reverse Prefix of Word *(index-based)*
2. [LC 2027] Minimum Moves to Convert String
3. [LC 2437] Check If Time Is Valid
4. [LC 2828] Check If String Is an Acronym of Words

#### Combo 1.4 — String + Two Pointers
**Syntax**: `String` + `charAt` + `while` + `l++, r--`  
**Used in**: valid palindrome

**Core Palindrome / Reversal**
1. [LC 125] Valid Palindrome
2. [LC 9] Palindrome Number (String view)
3. [LC 344] Reverse String
4. [LC 2000] Reverse Prefix of Word
5. Check If String Is Palindrome (Strict)
6. [LC 680] Check If String Is Palindrome After Removing One Character

**Skip / Filter Characters**
1. Valid Palindrome II (Skip non-alphanumeric) *(LC 125 variant)*
2. Check If String Is Valid After Removing Non-Letters
3. Check If String Is Alphanumeric Palindrome
4. Check If String Is Case-Insensitive Palindrome

**Match / Mismatch Using Pointers**
1. [LC 1790] Check If One String Swap Can Make Strings Equal
2. Check If Two Strings Are Equal After One Edit
3. Compare Two Strings from Ends
4. Check If String Is a Mirror of Another String

**Substring / Prefix-Suffix Match**
1. [LC 14] Find Longest Common Prefix (Two-Pointer view)
2. [LC 392] Check If One String Is a Subsequence of Another
3. Check If String Is Rotation of Another String *(Pointer logic)*
4. Check If String Ends With Another String (Manual)

**Clean-Up / In-Place Logic**
1. [LC 1332] Remove Palindromic Subsequences *(Pointer logic)*
2. Remove Characters From Both Ends Until Equal
3. Trim Matching Characters From Ends
4. Check If String Can Become Empty by Removing Equal Ends

**Count / Validation with Pointers**
1. Count Mismatched Characters from Ends
2. Check If Binary String Has Equal 0s and 1s from Ends
3. Check If String Has Symmetric Pattern

**Interview-Staple Harder Ones**
1. [LC 5] Longest Palindromic Substring *(Expand from Center)*
2. [LC 1216] Valid Palindrome III (k deletions) *(pointer reasoning)*
3. [LC 1328] Break a Palindrome
4. Check If String Is Almost Palindrome (k skips)
5. [LC 844] Compare Strings with Backspace *(Two pointers from end)*

**Golden Rule**: In string two-pointer problems, characters don’t move — pointers do.

#### Combo 1.5 — StringBuilder
**Syntax**: `StringBuilder` + `append` + `toString`  
**Used in**: string construction

---

### 🟢 Level 2 — Collection Core Combos

#### Combo 2.1 — List + Loop
**Syntax**: `ArrayList` + `for` + `get` / `add`  
**Used in**: dynamic arrays

**Basic List Building / Traversal**
1. [LC 1389] Create Target Array in the Given Order
2. [LC 1441] Build an Array With Stack Operations
3. [LC 1656] Design an Ordered Stream
4. [LC 1929] Concatenation of Array *(list version)*
5. [LC 1431] Kids With the Greatest Number of Candies *(list result)*

**Filter / Collect Elements**
1. [LC 448] Find All Numbers Disappeared in an Array *(list output)*
2. [LC 442] Find All Duplicates in an Array *(list output variant)*
3. Find All Even Numbers in an Array
4. [LC 2089] Find Indices of Occurrences in an Array *(list build)*
5. [LC 2942] Find Words Containing Character

**Simulation Using List**
1. [LC 682] Baseball Game
2. [LC 1598] Crawler Log Folder
3. [LC 1603] Design Parking System *(list-backed)*
4. [LC 1475] Final Prices With a Special Discount *(list simulation)*

**Prefix / Accumulation Into List**
1. [LC 1480] Running Sum of 1D Array *(list version)*
2. [LC 228] Summary Ranges
3. [LC 1200] Minimum Absolute Difference *(list result)*
4. [LC 118] Pascal’s Triangle
5. [LC 119] Pascal’s Triangle II

**Matrix → List Extraction**
1. [LC 54] Spiral Matrix
2. [LC 1380] Lucky Numbers in a Matrix
3. Find All Diagonal Order Elements
4. [LC 2643] Row With Maximum Ones *(list result)*

**Order / Validation With List**
1. [LC 1752] Check If Array Is Sorted and Rotated *(list view)*
2. Check If All Elements Are Unique *(list brute)*
3. [LC 1991] Find the Middle Index in Array *(list logic)*
4. [LC 724] Find Pivot Index *(list accumulation)*

**Harder (Still List + Loop)**
1. [LC 57] Insert Interval *(construction logic)*
2. [LC 56] Merge Intervals *(list collect)*
3. [LC 2150] Find All Lonely Numbers in the Array *(list result)*

**Mental Model**: List + Loop = "Collect answers as you go."

#### Combo 2.2 — HashSet + Loop
**Syntax**: `HashSet` + `add` + `contains`  
**Used in**: uniqueness, seen-before  
**Mental Model**: "Have I seen this before?"

**Core Uniqueness / Duplicate Check**
1. [LC 217] Contains Duplicate
2. [LC 219] Contains Duplicate II
3. [LC 1941] Check If All Characters Have Equal Occurrences
4. [LC 929] Unique Email Addresses
5. [LC 1832] Check If the Sentence Is a Pangram

**Seen-Before / First-Repeat Logic**
1. [LC 2351] First Letter to Appear Twice
2. [LC 202] Happy Number
3. Check If a String Has All Unique Characters
4. Find First Repeating Element in an Array
5. Detect Cycle in Number Transformation *(set-based)*

**Pair / Complement Existence (Boolean)**
1. [LC 1346] Check If N and Its Double Exist
2. Two Sum *(set-based boolean variant)*
3. Check If Array Has Pair With Given Sum
4. Check If Array Has Pair With Given Difference

**Range / Sequence Using Set**
1. [LC 128] Longest Consecutive Sequence
2. Check If All Elements Are Consecutive
3. [LC 268] Missing Number *(set view)*
4. [LC 448] Find All Numbers Disappeared in an Array *(set approach)*

**Intersection / Distinct Count**
1. [LC 349] Intersection of Two Arrays
2. [LC 2215] Difference of Two Arrays
3. [LC 2465] Number of Distinct Averages
4. [LC 2442] Count Distinct Integers After Reverse Operations

**Validation / Filter Using Set**
1. [LC 771] Jewels and Stones
2. Check If All Characters Are Allowed
3. Check If Every Element Appears At Most Once
4. [LC 1893] Check If All Integers in a Range Are Covered

**Set + Loop + Remove (Controlled)**
1. [LC 1695] Maximum Erasure Value *(set-based window)*
2. [LC 3] Longest Substring Without Repeating Characters *(set version)*
3. [LC 219] Contains Duplicate II *(sliding set form)*

#### Combo 2.3 — HashMap + Loop
**Syntax**: `HashMap` + `for / while` + `put` / `get` / `getOrDefault` / `containsKey`  
**Used in**: frequency counting

**Core Frequency / Counting**
1. [LC 1] Two Sum
2. [LC 169] Majority Element
3. [LC 229] Majority Element II
4. [LC 383] Ransom Note
5. [LC 387] First Unique Character in a String
6. [LC 1394] Find Lucky Integer in an Array
7. [LC 1941] Check If All Characters Have Equal Occurrences

**Anagram / String Mapping**
1. [LC 242] Valid Anagram
2. [LC 205] Isomorphic Strings
3. [LC 290] Word Pattern
4. Check If Two Strings Are Isomorphic
5. Check If Words Follow the Same Pattern

**Count Pairs / Element Relations**
1. [LC 2006] Count Number of Pairs With Absolute Difference K
2. [LC 1512] Number of Good Pairs
3. Check If Array Has Duplicate Frequencies
4. Check If Any Element Appears More Than N / K Times

**Prefix Sum + HashMap (Count-Based)**
1. [LC 560] Subarray Sum Equals K
2. [LC 523] Continuous Subarray Sum
3. [LC 1590] Make Sum Divisible by P
4. [LC 974] Subarray Sums Divisible by K

**Index / Position Mapping**
1. First Repeating Element (Index Tracking)
2. [LC 2057] Smallest Index With Equal Value
3. [LC 2341] Maximum Number of Pairs in Array
4. [LC 1207] Check If Frequencies Are Unique

**Array ↔ Value Transformation**
1. [LC 1636] Sort Array by Increasing Frequency *(count map only)*
2. [LC 3005] Count Elements With Maximum Frequency
3. [LC 2085] Count Words That Appear Exactly Once

#### Combo 2.4 — HashMap Lookup
**Syntax**: `HashMap` + `containsKey` / `get` + `for / while`  
**Used in**: existence / direct lookup  
**Mental Model**: "Does this key already exist — and what does it map to?"

**Direct Lookup / Existence**
1. [LC 1] Two Sum *(lookup-first style)*
2. [LC 1346] Check If N and Its Double Exist *(map lookup variant)*
3. Check If Array Has Pair With Given Sum
4. Check If Array Has Pair With Given Difference
5. Check If Complement Exists in Array

**Index / Position Lookup**
1. First Repeating Element (Index-based)
2. [LC 387] First Unique Character in a String *(index lookup)*
3. [LC 2057] Smallest Index With Equal Value
4. Check If Any Value Appears Twice Before Another
5. Check If Value Appears Earlier Than Another Value

**Mapping Relation (One-to-One)**
1. [LC 205] Isomorphic Strings *(lookup-only enforcement)*
2. [LC 290] Word Pattern *(lookup enforcement)*
3. Check If Mapping Is Consistent
4. Check If Bijective Mapping Exists Between Two Strings

**Prefix / Seen-Before Lookup (Boolean)**
1. [LC 523] Continuous Subarray Sum *(remainder lookup)*
2. Check If Prefix Sum Repeats
3. Detect Cycle Using HashMap (Index tracking)
4. Check If Any Prefix Sum Equals Target

**Validation / Constraint Check**
1. [LC 1207] Check If Frequencies Are Unique *(lookup phase)*
2. Check If All Mappings Are Distinct
3. Check If Any Two Keys Map to Same Value
4. Check If Constraint Mapping Is Violated

#### Combo 2.5 — HashMap Iteration
**Syntax**: `HashMap` + `for (entrySet / keySet / values)`  
**Used in**: result extraction  
**Mental Model**: "Given all counts, what conclusion do we draw?"

**Frequency Post-Processing**
1. [LC 169] Majority Element *(verification via iteration)*
2. [LC 229] Majority Element II *(threshold check)*
3. [LC 1207] Check If Frequencies Are Unique
4. [LC 3005] Count Elements With Maximum Frequency
5. [LC 1394] Find Lucky Integer in an Array

**Max / Min Over Map Values**
1. [LC 451] Sort Characters by Frequency *(iteration phase)*
2. [LC 347] Top K Frequent Elements *(iteration before heap)*
3. [LC 819] Most Common Word
4. [LC 2341] Maximum Number of Pairs in Array
5. [LC 1838] Maximum Frequency After Subarray Operation *(count phase)*

**Validation Using Map State**
1. [LC 1941] Check If All Characters Have Equal Occurrences
2. Check If Any Value Appears More Than Half
3. Check If Any Frequency Exceeds Limit
4. Check If Mapping Is One-to-One
5. Check If Two Keys Share Same Frequency

**Transformation Based on Map**
1. [LC 2215] Find the Difference of Two Arrays *(map iteration view)*
2. [LC 1551] Minimum Number of Operations to Make Array Equal *(count iterate)*
3. [LC 1338] Reduce Array Size to The Half *(iteration prep)*
4. [LC 2085] Count Words That Appear Exactly Once

**Result Extraction From Map**
1. Find All Elements With Given Frequency
2. Return All Keys With Max Frequency
3. Return Keys Appearing Only Once
4. Return Keys Appearing More Than K Times
5. Extract Keys Based on Value Condition

---

### 🟢 Level 3 — Window & Pointer Combos

#### Combo 3.1 — Sliding Window (Basic)
**Syntax**: `int l`, `for (r)`, `while`  
**Used in**: subarrays

#### Combo 3.2 — Sliding Window + HashSet
**Syntax**: `HashSet` + `add / remove` + `while`  
**Used in**: longest substring

#### Combo 3.3 — Sliding Window + HashMap
**Syntax**: `HashMap` + `getOrDefault` + `while`  
**Used in**: at most K

#### Combo 3.4 — Prefix Sum

#### Combo 3.5 — Prefix Sum + HashMap
**Syntax**: `sum` + `HashMap` + `getOrDefault`  
**Used in**: count subarrays

---

### 🟢 Level 4 — Stack / Queue / Deque Combos

#### Combo 4.1 — Stack via Deque
**Syntax**: `Deque`, `push`, `pop`, `peek`  
**Used in**: parentheses, NGE

#### Combo 4.2 — Stack + While
**Syntax**: `Deque` + `while` + `pop`  
**Used in**: monotonic stack

#### Combo 4.3 — Queue (BFS-like)
**Syntax**: `Queue`, `offer`, `poll`  
**Used in**: level order, traversal

#### Combo 4.4 — Deque + Sliding Window
**Syntax**: `Deque` + `addLast`, `removeFirst`, `peekFirst`  
**Used in**: sliding window max

---

### 🟢 Level 5 — Heap Combos

#### Combo 5.1 — Heap Only
**Syntax**: `PriorityQueue`, `offer`, `poll`  
**Used in**: k smallest/largest

#### Combo 5.2 — Heap + HashMap
**Syntax**: `HashMap` + `PriorityQueue`  
**Used in**: Top K frequent

#### Combo 5.3 — Max Heap
**Syntax**: `PriorityQueue` + `Collections.reverseOrder`

---

### 🟢 Level 6 — Sorting Combos

#### Combo 6.1 — Array Sort
**Syntax**: `Arrays.sort`

#### Combo 6.2 — List Sort
**Syntax**: `Collections.sort`

#### Combo 6.3 — Sort + Two Pointers
**Syntax**: `Arrays.sort` + `while`  
**Used in**: 3Sum, pair problems

---

### 🟢 Meta Combos (Interview Difficulty Boosters)

#### Combo M1 — Loop + Map + Condition
#### Combo M2 — While + Remove + Shrink
#### Combo M3 — Multiple DS Interaction
**Examples**:
- HashMap + Set
- HashMap + Heap
- Deque + Array

---

### Complete Coverage Check
- **Easy**: ✅
- **Medium**: ✅
- **Hard**: ✅
- **FAANG**: ✅
- **Startup**: ✅

