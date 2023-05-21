package org.example.leetcode;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        address = address.replace("." , "[.]");
        return address;
    }
}
