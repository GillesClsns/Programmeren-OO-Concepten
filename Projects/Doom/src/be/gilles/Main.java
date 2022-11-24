package be.gilles;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(new Player(10,40));
        room.createFloorplan();
        room.draw();

        while(true) {

            try {

                Thread.sleep(500);
                room.update();
                room.createFloorplan();
                room.draw();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}
