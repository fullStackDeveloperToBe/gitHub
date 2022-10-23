package com.java.doubt.check;

public class OrDoubtCheck {
    public static void main(String[] args) {
        String a = "drc_error_re";
        String b = "pend";
        String c = "";

        if(a=="proceed" && b=="proceed") {
            c="proceed";
            System.out.println("both are proceed -> "+c);
        }
        if(a=="pend" || b=="pend") {
            c= "pend";
            System.out.println("both are pend -> "+c);
        }
        if(a=="drc_stp" || b=="drc_stp") {
            c="drc_stp";
            System.out.println("both are drc_stp -> "+c);
        }
        if(a=="drc_error_re" || b=="drc_error_re") {
            c= "drc_errro_re";
            System.out.println("both are drc_errro_re -> "+c);
        }
    }
}
