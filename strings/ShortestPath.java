
public class ShortestPath {
    
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {   // Time complexity -> O(n)
            char dir = path.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            // South
            } else if (dir == 'S') {
                y--;
            // East
            } else if (dir == 'E') {
                x++;
            // West
            } else {
                x--;
            }
        }
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path is : " + getShortestPath(path));
    }
}
