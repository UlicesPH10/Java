package System;

import java.util.Map;

public class VariablesEnvExample {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();

        System.out.println("varEnv = " + varEnv);
        String username = System.getenv("USER");
        System.out.println("username = " + username);

        System.out.println("------ Listando las variables de entorno del sistema ------");
        for (String key : varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String miVar = System.getenv("MI_VAR");
        System.out.println("miVar = " + miVar);


        String temDir = varEnv.get("PATH");
        System.out.println("PATH = " + temDir);

        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));
    }
}
