public class DefaningAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
//        time = O(1)
//        space = O(1)
    }
}
