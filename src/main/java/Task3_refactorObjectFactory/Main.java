package Task3_refactorObjectFactory;

public class Main {
    public static void main(String[] args) {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
        System.out.println(iRobot.getVersion());
    }
}
