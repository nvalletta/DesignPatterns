
package designpatterns;

import designpatterns.concurrency.threadpool.ThreadPoolPattern;

/**
 * @author nora-valletta
 */
public class DesignPatternsHub {

    public static void main(String[] args) {
        ThreadPoolPattern pattern = new ThreadPoolPattern();
        pattern.demonstrate();
    }
    
}
