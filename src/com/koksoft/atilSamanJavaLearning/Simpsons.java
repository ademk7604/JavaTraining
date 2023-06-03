package com.koksoft.atilSamanJavaLearning;

public class Simpsons {

    // instance veirnin basina bir Accses m. yazmadiginda public dir.
//    String name;
//    String job;
//    int age;

    private String name;
    private String job;
    private int age;
    public Simpsons(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
