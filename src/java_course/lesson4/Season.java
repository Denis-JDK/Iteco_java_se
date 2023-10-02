package java_course.lesson4;

 public enum Season {

     SPRING("green"),
     SUMMER("yellow"),
     WINTER("white"),
     AUTUMN("orange");

     private String color;
     Season(String color) {
         this.color = color;
     }
 }
