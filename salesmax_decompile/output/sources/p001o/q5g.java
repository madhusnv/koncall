package p001o;

import com.google.android.gms.cast.MediaError;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q5g {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ q5g[] $VALUES;
    public static final q5g SUCCESS = new q5g("SUCCESS", 0);
    public static final q5g ERROR = new q5g(MediaError.ERROR_TYPE_ERROR, 1);
    public static final q5g LOADING = new q5g("LOADING", 2);

    private static final /* synthetic */ q5g[] $values() {
        return new q5g[]{SUCCESS, ERROR, LOADING};
    }

    static {
        q5g[] q5gVarArr$values = $values();
        $VALUES = q5gVarArr$values;
        $ENTRIES = hi6.m30609a(q5gVarArr$values);
    }

    private q5g(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static q5g valueOf(String str) {
        return (q5g) Enum.valueOf(q5g.class, str);
    }

    public static q5g[] values() {
        return (q5g[]) $VALUES.clone();
    }
}
