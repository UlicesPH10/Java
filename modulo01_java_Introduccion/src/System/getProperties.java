package System;

import java.util.Properties;

public class getProperties {
    public static void main(String[] args) {
        String username  = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String worksapce = System.getProperty("user.dir");
        System.out.println("worksapce = " + worksapce);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineseparator = System.getProperty("line.separator");
        System.out.println("lineseparator  " + lineseparator + "una linea nueva");

        String osNmae = System.getProperty("os.name");
        System.out.println("osNmae = " + osNmae);

        String osVersion = System.getProperty("os.version");
        System.out.println("osVersion = " + osVersion);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
