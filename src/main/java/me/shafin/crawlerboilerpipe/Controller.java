/*
 */
package me.shafin.crawlerboilerpipe;

import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.l3s.boilerpipe.extractors.ArticleExtractor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHAFIN
 */
public class Controller {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.dailystar.co.uk/");
            // NOTE: Use ArticleExtractor unless DefaultExtractor gives better results for you
            String text = ArticleExtractor.INSTANCE.getText(url);
            System.out.println(text);
        } catch (MalformedURLException | BoilerpipeProcessingException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
