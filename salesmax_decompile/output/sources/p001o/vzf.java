package p001o;

import com.google.android.gms.cast.MediaError;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vzf {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ vzf[] $VALUES;
    public static final vzf UNSET = new vzf("UNSET", 0);
    public static final vzf OK = new vzf("OK", 1);
    public static final vzf ERROR = new vzf(MediaError.ERROR_TYPE_ERROR, 2);

    private static final /* synthetic */ vzf[] $values() {
        return new vzf[]{UNSET, OK, ERROR};
    }

    static {
        vzf[] vzfVarArr$values = $values();
        $VALUES = vzfVarArr$values;
        $ENTRIES = hi6.m30609a(vzfVarArr$values);
    }

    private vzf(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static vzf valueOf(String str) {
        return (vzf) Enum.valueOf(vzf.class, str);
    }

    public static vzf[] values() {
        return (vzf[]) $VALUES.clone();
    }
}
