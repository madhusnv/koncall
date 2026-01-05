package p001o;

/* loaded from: classes2.dex */
public enum h77 implements g77 {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    /* renamed from: o.h77$a */
    public /* synthetic */ class C13888a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26331a;

        static {
            int[] iArr = new int[h77.values().length];
            try {
                iArr[h77.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h77.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h77.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h77.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26331a = iArr;
        }
    }

    public boolean getHasFocus() {
        int i = C13888a.f26331a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new szb();
    }

    public boolean isCaptured() {
        int i = C13888a.f26331a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        throw new szb();
    }

    public boolean isFocused() {
        int i = C13888a.f26331a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new szb();
    }
}
