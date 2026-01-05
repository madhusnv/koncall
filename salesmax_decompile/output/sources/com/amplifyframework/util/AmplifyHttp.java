package com.amplifyframework.util;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import p001o.gi6;
import p001o.gi9;
import p001o.hi6;
import p001o.si9;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AmplifyHttp {
    public static final AmplifyHttp INSTANCE = new AmplifyHttp();
    private static final gi9 availableVersion$delegate;
    private static final Logger logger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Version {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ Version[] $VALUES;
        public static final Version OkHttp4 = new Version("OkHttp4", 0);
        public static final Version OkHttp5 = new Version("OkHttp5", 1);

        private static final /* synthetic */ Version[] $values() {
            return new Version[]{OkHttp4, OkHttp5};
        }

        static {
            Version[] versionArr$values = $values();
            $VALUES = versionArr$values;
            $ENTRIES = hi6.m30609a(versionArr$values);
        }

        private Version(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static Version valueOf(String str) {
            return (Version) Enum.valueOf(Version.class, str);
        }

        public static Version[] values() {
            return (Version[]) $VALUES.clone();
        }
    }

    static {
        Logger logger2 = Amplify.Logging.logger("HttpEngine");
        sq8.m48648g(logger2, "logger(...)");
        logger = logger2;
        availableVersion$delegate = si9.m48360a(AmplifyHttp$availableVersion$2.INSTANCE);
    }

    private AmplifyHttp() {
    }

    public final Version getAvailableVersion() {
        return (Version) availableVersion$delegate.getValue();
    }
}
