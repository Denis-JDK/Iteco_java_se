package java_course;

public class AbstractHouse {

        public String city;
        String street;
        protected int number;
        private int apartment;

        public AbstractHouse() {
        }

        public AbstractHouse(String city, String street, int number, int apartment) {
            this.city = city;
            this.street = street;
            this.number = number;
            this.apartment = apartment;
        }

        public int getApartment() {
            return apartment;
        }

        void goToHouse() {
        }

}
