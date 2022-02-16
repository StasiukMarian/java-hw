package cw1;

public class Main {
    public static void main(String[] args) {
        Geo user1Geo = new Geo("-37.3159", "81.1496");
        Address user1Address = new Address("Kulas Light", "Apt. 556", "Gwenborough\n", "92998-3874", user1Geo);
        Company user1Company = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");
        User user1 = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", user1Address, "1-770-736-8031 x56442", "hildegard.org\n", user1Company);
        System.out.println(user1);
    }
}
