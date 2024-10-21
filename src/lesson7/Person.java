package lesson7;
    // поля класса ( записываются вверху класса)
public class Person {
  private   String name;
   private String surname;
   private int age;
  private   String phoneNumber;

  // методы ( то, что имеет делать этот тип)
        // пишем метод котороы будет присваевать возраст человеку

        public void setAge(int age){
            // newage --- 23
           this.age = age;

        }

        // метод будет возвращать возраст персоны
        public int getAge(){
            return age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

