package com.amplifyframework.analytics;

/* loaded from: classes5.dex */
public interface AnalyticsCategoryBehavior {
    void disable();

    void enable();

    void flushEvents();

    void identifyUser(String str, UserProfile userProfile);

    void recordEvent(AnalyticsEventBehavior analyticsEventBehavior);

    void recordEvent(String str);

    void registerGlobalProperties(AnalyticsProperties analyticsProperties);

    void unregisterGlobalProperties(String... strArr);
}
