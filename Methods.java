public class Methods {
    public static void printMessage(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
       printMessage();
    }
}
//private default protected public
/*

Perfect — let’s **close this loop completely**.

Below is the **COMPLETE, EXHAUSTIVE SET of Java syntax COMBOS** that appear in **DSA interviews**.
Not examples. Not patterns. **Actual reusable syntax groupings**.

If you master these, **there is no new combo left** in interviews.

---

# ✅ ALL POSSIBLE JAVA DSA SYNTAX COMBOS (FINAL)

> **Anything not here is either rare or theory-heavy and not expected under interview pressure.**

---

## 🟢 LEVEL 0 — CORE LANGUAGE COMBOS (EVERY PROBLEM)

### Combo 0.1 — Variable + Condition

```java
int
if
comparison operators
```

Used in: base cases, validation

---

### Combo 0.2 — Loop Only

```java
for
while
```

Used in: scanning, traversal

---

### Combo 0.3 — Loop + Condition

```java
for / while
if
```

Used in: filtering, counting

---

## 🟢 LEVEL 1 — ARRAY & STRING COMBOS

### Combo 1.1 — Array Scan

```java
int[]
for
a[i]
```

Used in: max, min, sum

---

### Combo 1.2 — Array + Two Pointers

```java
int[]
int l, r
while
```

Used in: reverse, remove duplicates

---

### Combo 1.3 — String Indexing

```java
String
charAt
length
```

Used in: palindrome, parsing

---

### Combo 1.4 — String + Two Pointers

```java
String
charAt
while
l++, r--
```

Used in: valid palindrome

---

### Combo 1.5 — StringBuilder

```java
StringBuilder
append
toString
```

Used in: string construction

---

## 🟡 LEVEL 2 — COLLECTION CORE COMBOS

### Combo 2.1 — List + Loop

```java
ArrayList
for
get / add
```

Used in: dynamic arrays

---

### Combo 2.2 — HashSet + Loop

```java
HashSet
add
contains
```

Used in: uniqueness, seen-before

---

### Combo 2.3 — HashMap + Loop

```java
HashMap
getOrDefault
put
```

Used in: frequency counting

---

### Combo 2.4 — HashMap Lookup

```java
HashMap
containsKey
get
```

Used in: Two Sum

---

### Combo 2.5 — HashMap Iteration

```java
map.entrySet
for
```

Used in: result extraction

---

## 🟡 LEVEL 3 — WINDOW & POINTER COMBOS (MOST INTERVIEWED)

### Combo 3.1 — Sliding Window (Basic)

```java
int l
for (r)
while
```

Used in: subarrays

---

### Combo 3.2 — Sliding Window + HashSet

```java
HashSet
add / remove
while
```

Used in: longest substring

---

### Combo 3.3 — Sliding Window + HashMap

```java
HashMap
getOrDefault
while
```

Used in: at most K

---

### Combo 3.4 — Prefix Sum

```java
int sum
sum += a[i]
```

Used in: subarray sum

---

### Combo 3.5 — Prefix Sum + HashMap

```java
sum
HashMap
getOrDefault
```

Used in: count subarrays

---

## 🔴 LEVEL 4 — STACK / QUEUE / DEQUE COMBOS

### Combo 4.1 — Stack via Deque

```java
Deque
push
pop
peek
```

Used in: parentheses, NGE

---

### Combo 4.2 — Stack + While

```java
Deque
while
pop
```

Used in: monotonic stack

---

### Combo 4.3 — Queue (BFS-like)

```java
Queue
offer
poll
```

Used in: level order, traversal

---

### Combo 4.4 — Deque + Sliding Window

```java
Deque
addLast
removeFirst
peekFirst
```

Used in: sliding window max

---

## 🔴 LEVEL 5 — HEAP COMBOS

### Combo 5.1 — Heap Only

```java
PriorityQueue
offer
poll
```

Used in: k smallest/largest

---

### Combo 5.2 — Heap + HashMap

```java
HashMap
PriorityQueue
```

Used in: Top K frequent

---

### Combo 5.3 — Max Heap

```java
PriorityQueue
Collections.reverseOrder
```

---

## 🔴 LEVEL 6 — SORTING COMBOS

### Combo 6.1 — Array Sort

```java
Arrays.sort
```

---

### Combo 6.2 — List Sort

```java
Collections.sort
```

---

### Combo 6.3 — Sort + Two Pointers

```java
Arrays.sort
while
```

Used in: 3Sum, pair problems

---

## 🧠 META COMBOS (INTERVIEW DIFFICULTY BOOSTERS)

### Combo M1 — Loop + Map + Condition

```java
for
HashMap
if
```

### Combo M2 — While + Remove + Shrink

```java
while
remove
l++
```

### Combo M3 — Multiple DS Interaction

```java
HashMap + Set
HashMap + Heap
Deque + Array
```

---

## 📊 COMPLETE COVERAGE CHECK

| Category | Covered |
| -------- | ------- |
| Easy     | ✅       |
| Medium   | ✅       |
| Hard     | ✅       |
| FAANG    | ✅       |
| Startup  | ✅       |

---

## 🧠 FINAL INTERVIEW TRUTH (IMPORTANT)

> **Every DSA problem is just a recombination of these combos.
> There is no “new” Java syntax in interviews.**

---

If you want next:

* 🧠 **Combo → Problem name mapping**
* ⏱️ **10-second combo identification drill**
* 📄 **One-page printable combo chart**
* 🏆 **Apple / Google expected combo order**

Say the word 👌


*/