# Data Structure

## 1) Array

### 📌 Definition
An **Array** is a linear data structure that stores a fixed-size sequence of elements of the **same type** in **contiguous memory**. Elements are accessed by **zero-based index**, which enables **O(1)** random access.

---

### ✅ Advantages
- **O(1) random access** by index.
- **Cache-friendly** and memory-efficient due to contiguous allocation.
- **Simple** to use and supported natively in most languages.
- **Low overhead** compared to dynamic collections.

---

### ❌ Disadvantages
- **Fixed size**: cannot grow or shrink after creation.
- **Insert/Delete is costly** (O(n)) when done in the middle (requires shifting elements or allocating a new array).
- **Contiguous memory requirement** can be limiting for very large arrays.
- Managing capacity and copies is **manual**, unlike dynamic structures (e.g., `ArrayList`).

---

### ⚙️ Operations Implemented

This project demonstrates basic operations on an array of `Student` objects:

- **Add Element**
  - A new array is created with a larger size
  - Existing elements are copied
  - New element is added at the end

- **Remove Element**
  - A new array is created with a smaller size
  - All elements except the target index are copied

- **Update Element**
  - The element at a specific index is modified directly

- **Print Array**
  - Displays all student data (Roll Number, Name, Age)

---

## Files

```
.
├── Main.java
└── Student.java
```

---

### 💡 Notes
- Since arrays are **fixed in size**, operations like add/remove require creating a new array.
- This example helps understand how arrays work internally before using advanced data structures like `ArrayList`.

---

## Time & Space Complexity

| Operation                 | Time Complexity | Space Notes                              |
|--------------------------|-----------------|------------------------------------------|
| Access by index          | **O(1)**        | No extra space                           |
| Update by index          | **O(1)**        | No extra space                           |
| Add at end (resize copy) | **O(n)**        | New array of size `n+1`                  |
| Remove at index          | **O(n)**        | New array of size `n-1`                  |
| Insert at middle         | **O(n)**        | Requires shifting / new array allocation |

---
## Sample Output

```
Remove Student Array: 
RollNumber: 1, Name: John, Age: 19
RollNumber: 3, Name: Bob, Age: 21
RollNumber: 4, Name: Mo, Age: 22
RollNumber: 5, Name: Mona, Age: 23

Add Student Array: 
RollNumber: 1, Name: John, Age: 19
RollNumber: 2, Name: Alice, Age: 20
RollNumber: 3, Name: Bob, Age: 21
RollNumber: 4, Name: Mo, Age: 22
RollNumber: 5, Name: Mona, Age: 23
RollNumber: 5, Name: Mona, Age: 23

Update Student Array: 
RollNumber: 1, Name: John, Age: 19
RollNumber: 2, Name: Alice, Age: 20
RollNumber: 99, Name: UpdateName, Age: 25
RollNumber: 4, Name: Mo, Age: 22
RollNumber: 5, Name: Mona, Age: 23
```

---

## Build & Run

```bash
# Compile
javac Main.java Student.java

# Run
java Main
```

---

## Notes & Possible Improvements

- **Method naming**: In Java, methods typically follow `lowerCamelCase` (e.g., `addElement`, `removeElement`).
- **Bounds checking**: `removeElement` currently assumes a valid index; add validation to avoid errors.
- **Immutability**: Consider making `Student` immutable (no setters) for safer updates (create a new object on change).
- **Use `ArrayList<Student>`** if you need dynamic resizing and easier insertions/deletions.
- **Avoid duplicates** in `AddElement` by validating whether the appended element already exists (if that matters in your context).

