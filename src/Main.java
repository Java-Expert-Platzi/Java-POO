import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

//        Doctor myDoctor = new Doctor("Hector Roman", "test@test.com");
//        myDoctor.addAvailableAppointment(new Date(), "4pm");
//        myDoctor.addAvailableAppointment(new Date(), "10am");
//        myDoctor.addAvailableAppointment(new Date(), "1pm");

//        System.out.println(myDoctor);

        User user = new Doctor("Romano", "romano@mail.com");
        user.showDataUser();

        User user1 = new User("Romano", "romano@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: 450");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                System.out.println(date + " " + time);
            }
        };

        iSchedulable.schedule(new Date(), "10am");

//        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }


        /*System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        System.out.println(patient);*/

    }



}
