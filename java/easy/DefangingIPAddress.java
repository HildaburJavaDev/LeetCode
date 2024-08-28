// task №1108

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        String[] octets = address.split("\\.");
        for (int i = 0; i < 3; i++) {
            sb.append(octets[i]);
            sb.append("[.]");
        }
        return sb.append(octets[3]).toString();
    }
}
