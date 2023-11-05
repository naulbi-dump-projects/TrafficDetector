package olde;

import java.net.ProxySelector;

public class MainPS {
    public static void main(String[] args) {
        MyProxySelector ps = new MyProxySelector(ProxySelector.getDefault());
        ProxySelector.setDefault(ps);
        // rest of the application
    }
}
