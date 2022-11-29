package Lesson6.Models;

import Lesson6.Models.Coordinate;

public abstract class Item {
   private Coordinate coordinate;
   private final int id;

   public Item(Coordinate coordinate, int id) {
       this.coordinate = coordinate;
       this.id = id;
   }

   public int getId(){
       return id;
   }

   public Coordinate getCoordinate() {
       return coordinate;
   }
}
