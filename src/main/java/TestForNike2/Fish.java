package TestForNike2;

class Fish extends Animal{
    private String name;

    public Fish(){
        super(0);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //@Override
    public void walk(){
        System.out.println("Рыбки, конечно, гуляют не могут - они плавают");
    }
    public void eat() {
        System.out.println("Рыбки едят червячков");
    }
}
