package oopsdemo2;
//java program to Implement Hierarchical inheritance
              /*            doctor
               * specialist      non-specialist
               * 
               */
public class TestDoctor {

	public static void main(String[] args) {
		
		//invoke child class Specialist constructor
        Specialist spObj=new Specialist(1001,"Mary","New York","Cardiologist");
       
        spObj.display(); // invoke child class Specialist display() method
       
        //invoke child class NonSpecialist constructor
        NonSpecialist nspObj=new NonSpecialist(1005,"John","Sydney");
       
        nspObj.display();// invoke base class Doctor display() method
	}

}