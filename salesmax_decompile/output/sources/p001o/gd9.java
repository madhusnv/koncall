package p001o;

import p001o.xn8;

/* loaded from: classes4.dex */
public enum gd9 implements xn8.InterfaceC18193a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final xn8.InterfaceC18194b internalValueMap = new xn8.InterfaceC18194b() { // from class: o.gd9.a
    };
    private final int value;

    /* renamed from: o.gd9$b */
    public static final class C13689b implements xn8.InterfaceC18195c {

        /* renamed from: a */
        public static final xn8.InterfaceC18195c f25023a = new C13689b();

        @Override // p001o.xn8.InterfaceC18195c
        public boolean isInRange(int i) {
            return gd9.forNumber(i) != null;
        }
    }

    gd9(int i) {
        this.value = i;
    }

    public static gd9 forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static xn8.InterfaceC18194b internalGetValueMap() {
        return internalValueMap;
    }

    public static xn8.InterfaceC18195c internalGetVerifier() {
        return C13689b.f25023a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static gd9 valueOf(int i) {
        return forNumber(i);
    }
}
