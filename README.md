# ⚡ Electrical Lining using Kruskal's & Prim's Algorithms

This Java project demonstrates how to connect all houses in a town with electric lines using the **least total wire length**. It uses two well-known graph algorithms: **Kruskal’s Algorithm** and **Prim’s Algorithm** to find the **Minimum Spanning Tree (MST)**, ensuring all houses are connected efficiently.

---

## 📌 Problem Statement

You are given a number of houses (nodes) and possible connections between them with wire lengths (edge weights). Your goal is to connect all houses in such a way that:

- Every house is connected (directly or indirectly),
- The total wire length is **minimum**,
- No cycles are formed (to avoid redundancy or extra cost).

This is solved using **Minimum Spanning Tree (MST)** algorithms.

---

## 🔧 Algorithms Used

- **Kruskal’s Algorithm**: Sorts all edges in increasing order of weight and selects the shortest ones that don’t form a cycle using Union-Find.
- **Prim’s Algorithm**: Starts from any house and expands the MST by choosing the smallest weight edge that connects a new house.

---

## 🛠 How to Compile and Run

### 🖥 Requirements:
- Java Development Kit (JDK 8 or above)
- Terminal / Command Prompt

### 🔧 Steps:

1. Save the following files in the same directory:
   - `Main.java`
   - `PrimMST.java`
   - `KruskalMST.java`

2. Open terminal/command prompt in the directory and run:

```bash
javac Main.java PrimMST.java KruskalMST.java
java Main

---

####📥 Sample Input:

Enter the number of houses: 4
Enter the number of connections: 5
Enter each connection in format: node1 node2 weight
A B 3
A C 5
B C 1
B D 2
C D 4

---
#####📤 Sample Output:

Prim's MST:
B - C : 1
B - D : 2
B - A : 3
Total Wire Length: 6

Kruskal's MST:
B - C : 1
B - D : 2
A - B : 3
Total Wire Length: 6

---

######👤 Author
Achyuth Parisha
GitHub: https://github.com/Achyuth69
