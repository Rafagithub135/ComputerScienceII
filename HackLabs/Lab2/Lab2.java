package HackLabs.Lab2;

public class Lab2 {
    public static class House {
        private Owner homeOwner;
//        private Room[] rooms;
        private int roomIndex;

        public House(int n, Owner o) {
        }

        public void setOwner(Owner o) {
        }

        public void getOwner(Owner o) {
        }

        public void addRoom(double a, String t) {
        }
//
//        public double getTotalInstallCost() {
//            return
//        }
//
//        public double getTotalFlooringCost() {
//            return
//        }
    }

    public static class Owner {
        private String name;
        private String phoneNum;
        private String address;
        private String city;
        private String state;
        private String zipCode;

        public Owner(String name, String phoneNum, String address, String city, String state, String zipCode) {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
    }

//    public static class Room {
//        private Floor floorType;
//
//        public Room(double a, String t) {
//        }
//
//        public Floor getFloorType() {
//            return floorType;
//        }
//    }
}