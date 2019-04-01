package staff;

public abstract class Employee {
    private String name;
    private int niNumber;
    private int salary;

    public Employee(String name, int niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
             if (name != null){
                 this.name = name;
             }
        }

        public int getniNmuber(){
            return this.niNumber;
        }

        public int getSalary(){
            return this.salary;
        }

        public void raiseSalary(double salary){
           if (salary > 0)
            this.salary += salary;
        }

        public double payBonus(){
          return this.salary * 0.01;
        }
}
