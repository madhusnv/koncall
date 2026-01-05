package p001o;

import com.google.android.gms.cast.CredentialsData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ofc {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ ofc[] $VALUES;
    public static final ofc Linux = new ofc("Linux", 0);
    public static final ofc MacOs = new ofc("MacOs", 1);
    public static final ofc Windows = new ofc("Windows", 2);
    public static final ofc Android = new ofc("Android", 3);
    public static final ofc Ios = new ofc("Ios", 4);
    public static final ofc Unknown = new ofc("Unknown", 5);

    /* renamed from: o.ofc$a */
    public /* synthetic */ class C15795a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38301a;

        static {
            int[] iArr = new int[ofc.values().length];
            try {
                iArr[ofc.Linux.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ofc.MacOs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ofc.Windows.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ofc.Android.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ofc.Ios.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ofc.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f38301a = iArr;
        }
    }

    private static final /* synthetic */ ofc[] $values() {
        return new ofc[]{Linux, MacOs, Windows, Android, Ios, Unknown};
    }

    static {
        ofc[] ofcVarArr$values = $values();
        $VALUES = ofcVarArr$values;
        $ENTRIES = hi6.m30609a(ofcVarArr$values);
    }

    private ofc(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static ofc valueOf(String str) {
        return (ofc) Enum.valueOf(ofc.class, str);
    }

    public static ofc[] values() {
        return (ofc[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C15795a.f38301a[ordinal()]) {
            case 1:
                return "linux";
            case 2:
                return "macos";
            case 3:
                return "windows";
            case 4:
                return CredentialsData.CREDENTIALS_TYPE_ANDROID;
            case 5:
                return CredentialsData.CREDENTIALS_TYPE_IOS;
            case 6:
                return "unknown";
            default:
                throw new szb();
        }
    }
}
