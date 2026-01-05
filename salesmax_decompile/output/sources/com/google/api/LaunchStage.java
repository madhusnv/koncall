package com.google.api;

import p001o.yn8;

/* loaded from: classes3.dex */
public enum LaunchStage implements yn8.InterfaceC18439c {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.LaunchStage.1
        @Override // p001o.yn8.InterfaceC18440d
        public LaunchStage findValueByNumber(int i) {
            return LaunchStage.forNumber(i);
        }
    };
    private final int value;

    public static final class LaunchStageVerifier implements yn8.InterfaceC18441e {
        static final yn8.InterfaceC18441e INSTANCE = new LaunchStageVerifier();

        private LaunchStageVerifier() {
        }

        @Override // p001o.yn8.InterfaceC18441e
        public boolean isInRange(int i) {
            return LaunchStage.forNumber(i) != null;
        }
    }

    LaunchStage(int i) {
        this.value = i;
    }

    public static LaunchStage forNumber(int i) {
        if (i == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i == 1) {
            return EARLY_ACCESS;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return BETA;
        }
        if (i == 4) {
            return GA;
        }
        if (i != 5) {
            return null;
        }
        return DEPRECATED;
    }

    public static yn8.InterfaceC18440d internalGetValueMap() {
        return internalValueMap;
    }

    public static yn8.InterfaceC18441e internalGetVerifier() {
        return LaunchStageVerifier.INSTANCE;
    }

    @Override // p001o.yn8.InterfaceC18439c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LaunchStage valueOf(int i) {
        return forNumber(i);
    }
}
