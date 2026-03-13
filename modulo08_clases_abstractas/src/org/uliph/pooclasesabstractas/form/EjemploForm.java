package org.uliph.pooclasesabstractas.form;

import org.uliph.pooclasesabstractas.form.elementos.*;
import org.uliph.pooclasesabstractas.form.elementos.select.Opcion;
import org.uliph.pooclasesabstractas.form.validador.EmailValidador;
import org.uliph.pooclasesabstractas.form.validador.LargoValidador;
import org.uliph.pooclasesabstractas.form.validador.NumeroValidador;
import org.uliph.pooclasesabstractas.form.validador.RequeridoValidador;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
            .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NumeroValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python").setSelected())
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {

            @Override
            public String dibujarHtml() {
                return String.format("<input disabled name='%s' value='%s'", this.nombre, this.valor);
            }
        };

        saludar.setValor("Hola que tal este campo está desabilidtado!");

        username.setValor("");
        password.setValor("a1b2c");
        email.setValor("correo@ejemplo.com");
        edad.setValor("22");
        experiencia.setValor("... más de 0 años de experiencia ...");
       // java.setSelected(true);

        List<ElementoForm> elmentos = Arrays.asList(username,
                password,
                email,
                experiencia,
                lenguaje,
                saludar);

        elmentos.forEach(elemento -> {
            System.out.println(elemento.dibujarHtml());
            System.out.println("<br>");
        });

        elmentos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach( System.out::println);

            }
        });

//        for (ElementoForm elemento : elmentos) {
//            System.out.println(elemento.dibujarHtml());
//            System.out.println("<br>");
//        }
    }
}
