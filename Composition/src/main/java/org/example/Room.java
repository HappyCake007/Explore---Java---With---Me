package org.example;
/** This is the room class
 *  The RoomNumber method does not return, it performs a print task.
 *  The Room object will be used in House class to create room objects
 *  Inside the constructor, this.roomNum refers to the roomNum
 *  variable of the current Room object, num refers to the parameter passed constructor.
 *  **/

public class Room {
    int roomNum;
    public Room(int num){                //initialize the roomNumber variable of the Room object.
        this.roomNum = num;
    }
    public void RoomNumber(){
        System.out.println(" This is room number" + roomNum);
    }


}
