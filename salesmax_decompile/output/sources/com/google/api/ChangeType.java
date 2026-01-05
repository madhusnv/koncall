package com.google.api;

import p001o.yn8;

/* loaded from: classes3.dex */
public enum ChangeType implements yn8.InterfaceC18439c {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.ChangeType.1
        @Override // p001o.yn8.InterfaceC18440d
        public ChangeType findValueByNumber(int i) {
            return ChangeType.forNumber(i);
        }
    };
    private final int value;

    public static final class ChangeTypeVerifier implements yn8.InterfaceC18441e {
        static final yn8.InterfaceC18441e INSTANCE = new ChangeTypeVerifier();

        private ChangeTypeVerifier() {
        }

        @Override // p001o.yn8.InterfaceC18441e
        public boolean isInRange(int i) {
            return ChangeType.forNumber(i) != null;
        }
    }

    ChangeType(int i) {
        this.value = i;
    }

    public static ChangeType forNumber(int i) {
        if (i == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ADDED;
        }
        if (i == 2) {
            return REMOVED;
        }
        if (i != 3) {
            return null;
        }
        return MODIFIED;
    }

    public static yn8.InterfaceC18440d internalGetValueMap() {
        return internalValueMap;
    }

    public static yn8.InterfaceC18441e internalGetVerifier() {
        return ChangeTypeVerifier.INSTANCE;
    }

    @Override // p001o.yn8.InterfaceC18439c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ChangeType valueOf(int i) {
        return forNumber(i);
    }
}
