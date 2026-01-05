package com.google.firebase.perf.v1;

import p001o.yn8;

/* loaded from: classes6.dex */
public enum ApplicationProcessState implements yn8.InterfaceC18439c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.firebase.perf.v1.ApplicationProcessState.1
        @Override // p001o.yn8.InterfaceC18440d
        public ApplicationProcessState findValueByNumber(int i) {
            return ApplicationProcessState.forNumber(i);
        }
    };
    private final int value;

    public static final class ApplicationProcessStateVerifier implements yn8.InterfaceC18441e {
        static final yn8.InterfaceC18441e INSTANCE = new ApplicationProcessStateVerifier();

        private ApplicationProcessStateVerifier() {
        }

        @Override // p001o.yn8.InterfaceC18441e
        public boolean isInRange(int i) {
            return ApplicationProcessState.forNumber(i) != null;
        }
    }

    ApplicationProcessState(int i) {
        this.value = i;
    }

    public static ApplicationProcessState forNumber(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static yn8.InterfaceC18440d internalGetValueMap() {
        return internalValueMap;
    }

    public static yn8.InterfaceC18441e internalGetVerifier() {
        return ApplicationProcessStateVerifier.INSTANCE;
    }

    @Override // p001o.yn8.InterfaceC18439c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int i) {
        return forNumber(i);
    }
}
