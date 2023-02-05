package HW_2;

public class Dog extends Pet {
    private String training;
    

    protected Dog(int height, int weight, String eye_color, String nickname, String breed, String vaccinations,
            String coat_color, String birthday, String training) {
        super(height, weight, eye_color, nickname, breed, vaccinations, coat_color, birthday);
        this.training = training;
    }

    public void setTraining(){
        System.out.println("A dog handler trains a dog...");
        this.training = "Yes";
    }

    @Override
    public String getInfo() {
        return String.format("%s; %s Наличие дрессировки: %s;", who(), super.getInfo(), this.training);
    }

    @Override
    protected void showAffection() {
        System.out.println("Собака довольна:)");
        
    }

    @Override
    public String say() {
        return "Woof!";
    }

    @Override
    public String who() {
        return "Собака";
    }
    
}
