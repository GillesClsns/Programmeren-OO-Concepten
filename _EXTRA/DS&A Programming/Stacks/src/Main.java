import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        /* Stack = LIFO data structure.
         * stores objects into a sort of "vertical tower"
         * push() to add to the top
         * pop() to remove from the top
         */

        Stack<String> games = new Stack<>();

        games.push("Minecraft");
        games.push("Skyrim");
        games.push("DOOM");
        games.push("Borderlands");
        games.push("FFVII");

        //String myFavGame = games.pop();
        //System.out.println(games.peek());
        //System.out.println(games.search("Borderlands"));

        System.out.println(games);

        /* Uses of stacks?
         * 1. Undo/redo features in text editors.
         * 2. Moving back/forwards through browser histroy.
         * 3. Backtracking algorithms (maze, file directories).
         * 4. Calling functions (call stack).
         */

    }

}
