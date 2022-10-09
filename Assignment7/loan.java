public class loan {
    public int age;
    public float income;
    public int experience;
    public String citizen;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public loan(int a, float i, int e, String c) {
        age = a;
        income = i;
        experience = e;
        citizen = c;
    }

}

