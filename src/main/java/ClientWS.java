import steve.dev.proxy.BanqueService;
import steve.dev.proxy.BanqueWS;
import steve.dev.proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        //we just create a middleware
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        //now we can use the stub(proxy is client side) to communicate and consume the Web service
        System.out.println(stub.convert(2700));

        Compte cp= stub.getcompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
