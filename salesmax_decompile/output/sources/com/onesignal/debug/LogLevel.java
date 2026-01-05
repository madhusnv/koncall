package com.onesignal.debug;

import p001o.id5;

/* loaded from: classes6.dex */
public enum LogLevel {
    NONE,
    FATAL,
    ERROR,
    WARN,
    INFO,
    DEBUG,
    VERBOSE;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final LogLevel fromInt(int i) {
            return LogLevel.values()[i];
        }
    }

    public static final LogLevel fromInt(int i) {
        return Companion.fromInt(i);
    }
}
