package planes;

 import models.MilitaryType;

 import java.util.Objects;

 public class MilitaryPlane extends Plane {

     private MilitaryType militaryType;

     public MilitaryPlane(String modelOfMilitaryPlane, int maxSpeed, int maxFlightDistance,
                          int maxLoadCapacity, MilitaryType militaryType) {
         super(modelOfMilitaryPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
         this.militaryType = militaryType;
     }

     public MilitaryType getMilitaryType() {
         return militaryType;
     }

     @Override
     public String toString() {
         return super.toString().replace("}",
                 ", type=" + militaryType +
                         '}');
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof MilitaryPlane)) return false;
         if (!super.equals(o)) return false;
         MilitaryPlane militaryPlane = (MilitaryPlane) o;
         return militaryType == militaryPlane.militaryType;
     }

     @Override
     public int hashCode() {
         return Objects.hash(super.hashCode(), militaryType);
     }
 }