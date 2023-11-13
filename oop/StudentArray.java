public class StudentArray {
    
    public static void main(String[] args) {
        
        Student[] st = new Student[5];
        double sumAge = 0, sumGpax = 0;

        st[0] = new Student("65100001", "AAA", 'F', 20, 3.23);
        st[1] = new Student("65100002", "BBB", 'M', 21, 3.02);
        st[2] = new Student("65100003", "CCC", 'M', 19, 2.55);
        st[3] = new Student("65100004", "DDD", 'M', 21, 3.52);
        st[4] = new Student("65100005", "FFF", 'M', 20, 3.55);

        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].toString());
            sumAge += st[i].getAge();
            sumGpax += st[i].getGpax();
        }

        System.out.println("Average age: " + sumAge / st.length);
        
        System.out.println("Average Gpax: " + sumGpax / st.length);
        minMaxAge(st);
    }

    public static void minMaxAge(Student[] students) {
        double minGpax = students[0].getGpax();
        double maxGpax = students[0].getGpax();
        double minAge = students[0].getAge();
        double maxAge = students[0].getAge();

        for (int i = 0; i < students.length; i++) {
            double age = students[i].getAge();
            double gpax = students[i].getGpax();

            if (maxGpax < gpax) {
                maxGpax = gpax;
            }
            if (minGpax > gpax) {
                minGpax = gpax;
            }

            if (maxAge < age) {
                maxAge = age;
            }
            if (minAge > age) {
                minAge = age;
            }
        }

        System.out.println("Age, Min: " + minAge + ", Max: " + maxAge);
        System.out.println("Gpax, Min: " + minGpax + ", Max: " + maxGpax);
    }
}
