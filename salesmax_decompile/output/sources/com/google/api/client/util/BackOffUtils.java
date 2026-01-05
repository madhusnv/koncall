package com.google.api.client.util;

@Beta
/* loaded from: classes3.dex */
public final class BackOffUtils {
    private BackOffUtils() {
    }

    public static boolean next(Sleeper sleeper, BackOff backOff) {
        long jNextBackOffMillis = backOff.nextBackOffMillis();
        if (jNextBackOffMillis == -1) {
            return false;
        }
        sleeper.sleep(jNextBackOffMillis);
        return true;
    }
}
