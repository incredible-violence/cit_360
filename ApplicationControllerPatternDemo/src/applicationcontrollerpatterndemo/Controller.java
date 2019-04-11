/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpatterndemo;

import java.util.HashMap;

/**
 *
 * @author jamesK
 */
public class Controller {
    public static HashMap<String, DoMath> key = new HashMap <String, DoMath>();
    
    public void Controller() {
        
    }
    
    public static void handler(String operator, Integer input1, Integer input2) {
        key.put("+", new Addition());
        key.put("-", new Subtraction());
        key.put("/", new Division());
        key.put("*", new Multiplication());
        key.put("%", new Modulo());
        
        DoMath handler = key.get(operator);
        handler.execute(input1, input2);
    }
}
