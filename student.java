public class main{
    public static void main(String[] args) {


        //Q1

//        try {
//            int arr[] = {1, 2, 3, 4, 5, 6, 7};
//            System.out.println(arr[9]);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }



        //Q2

//        try {
//           boolean res= isDivided(15);
//           if (res){
//               System.out.println("Is divided by 5");
//           }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }



    }


    public static boolean isDivided (int number) throws Exception{

        if(number%5!=0){
            throw new Exception ("Not Divided by 5");
        }
        return true;
    }
}


// Q3
class Author {

    private String name;
    private String email;


    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[name= " + name + " ,email= " + email +']';
    }
}

//Q4
class Ball {
    private float x;
    private float y;
    private int redius;
    private float xDelta;
    private float yDelta;


    public Ball(float x, float y, int redius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.redius = redius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta=-xDelta;
    }

    public void reflectVertical(){
        yDelta=-yDelta;
    }

    @Override
    public String toString() {
        return "Ball[("+x +
                "," + y +
                "),speed=(" + xDelta +
                ", " + yDelta +
                ")]";
    }
}

//Q5
class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return this.firstName+" "+this.lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.salary*12;
    }

    public int raiseSalary(int percent){
        this.salary+=this.salary*percent;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//Q6
class InvoiceItem{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return this.unitPrice*this.qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

//Q7
class MyPoint{
    private int x;
    private int y;

    private MyPoint(){
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int arr[]={this.x,this.y};
        return arr;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y){

        int subtractrResX=x-this.x;
        int subtractResY=y-this.y;

        int squareX=subtractrResX*subtractrResX;
        int squareY=subtractResY*subtractResY;

        int sum=squareX+squareY;

        return Math.sqrt(sum);
    }

    public double distance(MyPoint another){
        return distance(another.getX(),another.getY());
    }

    public double distance(){
        return distance(0,0);
    }
}


