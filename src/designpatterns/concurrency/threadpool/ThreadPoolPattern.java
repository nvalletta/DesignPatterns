package designpatterns.concurrency.threadpool;

import designpatterns.PatternDemonstration;


public class ThreadPoolPattern implements PatternDemonstration {

    private ThemePark norasThemePark;
    
    @Override
    public void demonstrate() {
        initialize();
        norasThemePark.openPark();
    }

    @Override
    public void initialize() {
        norasThemePark = new ThemePark(15, 10);
    }
    
}
