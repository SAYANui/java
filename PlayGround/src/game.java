/*
The Problem Statement: 3D Game World Coordinate Tracker
Background
In a 3D sandbox video game, the world is divided into a grid of zones. The game map consists of a 4x4 grid of land sectors, and each sector has a height depth of 2 layers (Surface and Underground). The game engine needs to track how many player-built structures exist in each specific cubic zone of this map.

Objective
Create a program that:

Stores the structure count for a world size of 2 layers, 4 rows, and 4 columns.

Counts the total number of structures built across the entire game world.
 */


public class game {
    public static void main(String[] args) {
        int[][][] worldGrid = {
                {
                        {5, 2, 0, 1},
                        {0, 8, 3, 0},
                        {1, 1, 4, 2},
                        {0, 0, 0, 6}
                },
                {
                        {1, 0, 0, 0},
                        {2, 3, 1, 0},
                        {0, 0, 5, 1},
                        {0, 1, 0, 2}
                }
        };

        int totalStructures = 0;

        for (int layer = 0; layer < worldGrid.length; layer++) {
            for (int row = 0; row < worldGrid[layer].length; row++) {
                for (int col = 0; col < worldGrid[layer][row].length; col++) {
                    totalStructures += worldGrid[layer][row][col];
                }
            }
        }

        System.out.println("Total structures in world: " + totalStructures);
    }
}