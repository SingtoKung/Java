public class ReturnFeature {
    public static void main(String[] args) {
        connectServer(200);
    }

    public static void connectServer (int ping) {
        System.out.println("Ping = " + ping);
        if (ping > 100) {
            return;
        } // ถ้า ping > 100 ให้ออก method: connectServer
        System.out.println("Connect server!");
        
    }
}
