class AnimalTest {
    public static void main(String[] args) {
        Whale w = new Whale();

        w.SetName("고래");
        w.SetAge(5);
        w.SetSwim(false);

        System.out.println("이름 : " + w.GetName());
        System.out.println("나이 : " + w.GetAge());
        System.out.println("수영여부 : " + w.GetSwim());

        w.WhaleStatusShow(); // 위의 코드를 함수화 시킴

    }
}
