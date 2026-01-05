package com.google.api;

import p001o.yn8;

/* loaded from: classes3.dex */
public enum FieldBehavior implements yn8.InterfaceC18439c {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);

    public static final int FIELD_BEHAVIOR_UNSPECIFIED_VALUE = 0;
    public static final int IMMUTABLE_VALUE = 5;
    public static final int INPUT_ONLY_VALUE = 4;
    public static final int OPTIONAL_VALUE = 1;
    public static final int OUTPUT_ONLY_VALUE = 3;
    public static final int REQUIRED_VALUE = 2;
    private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.FieldBehavior.1
        @Override // p001o.yn8.InterfaceC18440d
        public FieldBehavior findValueByNumber(int i) {
            return FieldBehavior.forNumber(i);
        }
    };
    private final int value;

    public static final class FieldBehaviorVerifier implements yn8.InterfaceC18441e {
        static final yn8.InterfaceC18441e INSTANCE = new FieldBehaviorVerifier();

        private FieldBehaviorVerifier() {
        }

        @Override // p001o.yn8.InterfaceC18441e
        public boolean isInRange(int i) {
            return FieldBehavior.forNumber(i) != null;
        }
    }

    FieldBehavior(int i) {
        this.value = i;
    }

    public static FieldBehavior forNumber(int i) {
        if (i == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return OPTIONAL;
        }
        if (i == 2) {
            return REQUIRED;
        }
        if (i == 3) {
            return OUTPUT_ONLY;
        }
        if (i == 4) {
            return INPUT_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    public static yn8.InterfaceC18440d internalGetValueMap() {
        return internalValueMap;
    }

    public static yn8.InterfaceC18441e internalGetVerifier() {
        return FieldBehaviorVerifier.INSTANCE;
    }

    @Override // p001o.yn8.InterfaceC18439c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static FieldBehavior valueOf(int i) {
        return forNumber(i);
    }
}
