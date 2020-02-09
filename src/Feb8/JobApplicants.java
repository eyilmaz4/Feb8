package Feb8;

public class JobApplicants {
    public static void main(String[]args){
        int age=-1;
        double javaPoint=100;
        double score=0;

        if(age>=20 && age<=30 &&javaPoint>=80) {
            score = age * 1.5 + javaPoint * 4.5;
        }
        else if (age>=20 && age<=30 && javaPoint<80) {
            score = age * 1.5 + javaPoint * 3.5;
        }
        else if( age>=31 && javaPoint>=80) {
            score = age * 1.1 + javaPoint * 4.5;
        }
        else if ( age>=31 && javaPoint<80){
            score = age * 1.1 + javaPoint * 3.5;
        }
        else
        {
            System.out.println("please enter valid value");
        }

        System.out.println(score);
    }


}
