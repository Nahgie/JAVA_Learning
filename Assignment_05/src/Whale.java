class Whale extends Animal{

    private boolean CanSwim;

    //Setter
    public void SetSwim(boolean S_Type) { CanSwim = S_Type;}

    //Getter
    public boolean GetSwim() {return CanSwim;}

    void WhaleStatusShow(){

        System.out.println("이름 : " + this.GetName() + "\n나이 : " + this.GetAge() + "\n수영여부 : " + GetSwim());

    }

}