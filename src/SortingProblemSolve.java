import java.util.*;

/**
 * Created by LAPTOP DREAM on 7/26/2017.
 */
public class SortingProblemSolve {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);
        Collections.sort(studentList,
                Collections.reverseOrder(new SortingProblemSolve.AgeComparator()));

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }



    static class AgeComparator implements Comparator<Student>
    {
        @Override
        public int compare(Student p1, Student p2) {
            double cgp1=p1.getCgpa();
            double cgp2 = p2.getCgpa();

            if (cgp1 == cgp2)
                return 0;
            else if (cgp1 > cgp2)
                return 1;
            else
                return -1;
        }
    }
}
