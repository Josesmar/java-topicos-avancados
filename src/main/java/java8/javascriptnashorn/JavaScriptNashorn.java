package java8.javascriptnashorn;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class JavaScriptNashorn {

    public static void main(String[] args) {

        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");

        //Serve para interpretar o código JavaScript
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);

        bind.put("goodbye", " Até logo");

        try {
            ee.eval(new FileReader("src/olamundo.js"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
