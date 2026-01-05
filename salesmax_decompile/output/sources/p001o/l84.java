package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class l84 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ l84[] $VALUES;
    public static final l84 DEFAULT = new l84("DEFAULT", 0);
    public static final l84 LAZY = new l84("LAZY", 1);
    public static final l84 ATOMIC = new l84("ATOMIC", 2);
    public static final l84 UNDISPATCHED = new l84("UNDISPATCHED", 3);

    /* renamed from: o.l84$a */
    public /* synthetic */ class C15031a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33432a;

        static {
            int[] iArr = new int[l84.values().length];
            try {
                iArr[l84.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l84.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l84.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l84.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33432a = iArr;
        }
    }

    private static final /* synthetic */ l84[] $values() {
        return new l84[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        l84[] l84VarArr$values = $values();
        $VALUES = l84VarArr$values;
        $ENTRIES = hi6.m30609a(l84VarArr$values);
    }

    private l84(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static l84 valueOf(String str) {
        return (l84) Enum.valueOf(l84.class, str);
    }

    public static l84[] values() {
        return (l84[]) $VALUES.clone();
    }

    public final <R, T> void invoke(nl7 nl7Var, R r, n64 n64Var) {
        int i = C15031a.f33432a[ordinal()];
        if (i == 1) {
            dc2.m22769c(nl7Var, r, n64Var);
            return;
        }
        if (i == 2) {
            q64.m44835a(nl7Var, r, n64Var);
        } else if (i == 3) {
            i3i.m31473a(nl7Var, r, n64Var);
        } else if (i != 4) {
            throw new szb();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
