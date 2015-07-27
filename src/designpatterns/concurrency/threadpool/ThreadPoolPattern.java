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
        // 15 rides and 100 park guests.
        norasThemePark = new ThemePark(15, 100);
    }
    
}
