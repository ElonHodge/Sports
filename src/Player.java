public class Player {
    String firstName;
    String lastName;
    String position;
    int age;
    double height;
    int weight;
    int experience;
    String college;
    int salary;
    String team;



    public Player(String firstName, String lastName, String position, int age, double height, int weight, int experience, String college, int salary, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.experience = experience;
        this.college = college;
        this.salary = salary;
        this.team = team;
    }

    public Player() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", experience=" + experience +
                ", college='" + college + '\'' +
                ", salary=" + salary +
                ", team='" + team + '\'' +
                '}';
    }




    public String firstAndLast(){

        return "";
    }
    public String firstLastAndPosition(){

        return "";
    }
    public String firstLastAndSalary(){

        return "";
    }

    public String firstLastAndTeam(){

        return "";
    }
    public String[] lastNameThatStartWith(String Letter){

        return new String[]{""};
    }


    public int getTotalPlayersFromCollege(String college){

        return 0;
    }

    public int getTotalPlayersWithAge(int age){

        return 0;
    }
    public int getTotalPlayersWithPosition(String position){

        return 0;
    }
    public int getTotalPlayersWithHeight(double height){

        return 0;
    }
    public double getTotalPlayersWithWeight(double weight){

        return 0;
    }
    public int getTotalPlayersWithExperience(int experience){

        return 0;
    }

    public int[] getPlayersFromCollege(String college){

        return new int[]{};
    }

    public int[] getPlayersWithAge(int age){

        return new int[]{};
    }
    public int[] getPlayersWithPosition(String position){

        return new int[]{};
    }
    public double[] getPlayersWithHeight(double height){

        return new double[]{};
    }
    public int[] getPlayersWithWeight(int weight){

        return new int[]{};
    }
    public int[] getPlayersWithExperience(String experience){

        return new int[]{};
    }

    public int[] getPlayersWhoMake(int salary){

        return new int[]{};
    }

    public int convertPlayerHeightToCm(int height){

        return 0;
    }
    public int convertPlayerWeightToKg(int weight){

        return 0;
    }

    public int[] teamsWithHighestSalary(){

        return  new  int[]{0};
    }
    public int[] teamsWithHighestAverageAge(){

        return  new  int[]{0};
    }

    public int[] teamsWithMinimumAverageAge(){

        return  new  int[]{0};
    }

    public int[] teamsWithMinimumAverageExperience(){

        return  new  int[]{0};
    }
    public int[] teamsWithHighestAverageExperience(){

        return  new  int[]{0};
    }
}