package com.google.firebase.perf.v1;

import p001o.yn8;

/* loaded from: classes6.dex */
public enum SessionVerbosity implements yn8.InterfaceC18439c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.firebase.perf.v1.SessionVerbosity.1
        @Override // p001o.yn8.InterfaceC18440d
        public SessionVerbosity findValueByNumber(int i) {
            return SessionVerbosity.forNumber(i);
        }
    };
    private final int value;

    public static final class SessionVerbosityVerifier implements yn8.InterfaceC18441e {
        static final yn8.InterfaceC18441e INSTANCE = new SessionVerbosityVerifier();

        private SessionVerbosityVerifier() {
        }

        @Override // p001o.yn8.InterfaceC18441e
        public boolean isInRange(int i) {
            return SessionVerbosity.forNumber(i) != null;
        }
    }

    SessionVerbosity(int i) {
        this.value = i;
    }

    public static SessionVerbosity forNumber(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static yn8.InterfaceC18440d internalGetValueMap() {
        return internalValueMap;
    }

    public static yn8.InterfaceC18441e internalGetVerifier() {
        return SessionVerbosityVerifier.INSTANCE;
    }

    @Override // p001o.yn8.InterfaceC18439c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i) {
        return forNumber(i);
    }
}
