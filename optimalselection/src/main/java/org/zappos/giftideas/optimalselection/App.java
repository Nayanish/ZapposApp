package org.zappos.giftideas.optimalselection;

import org.zappos.giftideas.optimalselection.impl.ZapposAPIHandlerImpl;

/**
 * Hello world!
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {
        ZapposAPIHandler handler = new ZapposAPIHandlerImpl();
        handler.search("boots");
    }
}
