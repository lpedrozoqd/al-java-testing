package edu.clarape.al.testing;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    public static void main(String[] args) {
        String result = StringUtil.repeat("Hola", 3);
        //Todo esto es una verificación manual hasta aquí:
        System.out.println(result);

        //A partir de aquí es más automatizado los test pero aún con verificación
        //manual:
        String result2 = StringUtil.repeat("Hola", 1);
        if(!result2.equals("hola hola hola")){
            System.out.println("Error ... espera tres veces la impresión");
        }
    }
}