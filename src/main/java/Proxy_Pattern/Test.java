package Proxy_Pattern;

public class Test {
    public static void main(String[] args) {
        UserServiceImpl target = new UserServiceImpl();
        UserService proxy = (UserService) new ServiceProxy().getProxy(target);
        proxy.saveUser();
    }
}
