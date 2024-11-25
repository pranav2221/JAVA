import java.util.Scanner;

class employee{
    private String firstname;
    private String lastname;
    private int salary;
    Scanner s = new Scanner(System.in);
    void setfirst(){
        System.out.println("Enter your first name");
        firstname = s.nextLine();
    }
    void setlast(){
        System.out.println("Enter your last name");
        lastname = s.nextLine();
    }
    void setsalary(){
        System.out.println("Enter your salary");
        salary = s.nextInt();
    }
    String getfirst(){
        return firstname;
    }
    String getlast(){
        return lastname;
    }
    int getsalary(){
        return salary;
    }
    int getyearlysalary()
	{
		return salary*12;
	}

    float grace(){
        float inc = (getyearlysalary()*0.1f)+getyearlysalary();
        return inc;
    }
}

class info{
    public static void main(String[] args) {
        System.out.println("Enter info of 1st employee");
        employee e1 = new employee();
        e1.setfirst();
        e1.setlast();
        e1.setsalary();
        System.out.println("Enter info of 2nd employee");
        employee e2 = new employee();
        e2.setfirst();
        e2.setlast();
        e2.setsalary();
        System.out.println("INFORMATION----------");
        System.out.println(e1.getfirst()+" "+e1.getlast()+" "+e1.getsalary()+" "+e1.grace());
        System.out.println(e2.getfirst()+" "+e2.getlast()+" "+e2.getsalary()+" "+e2.grace());
    }
}