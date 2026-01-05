package com.amplifyframework.analytics;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
