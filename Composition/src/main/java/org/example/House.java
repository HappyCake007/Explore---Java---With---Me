package org.example;
/** Composition - Classes that contain objects from other classes
 *  This House class has a number of rooms(kitchen, bathroom. launge, etc.
 *  House will contain objects from room
 *  Inside the constructor,initialize the livingRoom and bedroom variables
 *  by creating new Room objects.Each Room object is created with room number:
 *
 *  **/

public class House {
    private Room LivingRoom;
    private Room BedRoom;

    public House(){
        this.BedRoom = new Room(3);
        this.LivingRoom = new Room(66);
    }
    public void LivingAndBed(){
        LivingRoom.RoomNumber();
        BedRoom.RoomNumber();
    }

}
