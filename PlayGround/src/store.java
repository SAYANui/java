/*
Imagine you own a small department store chain. You have 2 stores. Each store has 3 departments (Clothing, Electronics, Home). Each department tracks the inventory of 2 specific items.

Create a 3D array to represent this setup.

Initialize it with the following inventory counts:

Store 0:

Clothing: 10 items, 15 items

Electronics: 5 items, 8 items

Home: 20 items, 25 items

Store 1:

Clothing: 12 items, 14 items

Electronics: 7 items, 9 items

Home: 22 items, 28 items

Write a program to print out the inventory count of the second item in the Electronics department of Store 1.
 */
public class store {
    public static void main(String[] args) {
        // Dimensions: [2 Stores] [3 Departments] [2 Items]
        int[][][] inventory = {
                { // Store 0
                        {10, 15}, // Department 0 (Clothing)
                        {5, 8},   // Department 1 (Electronics)
                        {20, 25}  // Department 2 (Home)
                },
                { // Store 1
                        {12, 14}, // Department 0 (Clothing)
                        {7, 9},   // Department 1 (Electronics)
                        {22, 28}  // Department 2 (Home)
                }
        };

        // Accessing the specific item:
        // Store 1 -> Index 1
        // Electronics -> Index 1
        // Second item -> Index 1
        int targetedItemCount = inventory[1][1][1];

        System.out.println("Inventory count for Store 1, Electronics, Item 2 is: " + targetedItemCount);
    }
}