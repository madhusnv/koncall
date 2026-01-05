package p001o;

import com.google.firebase.perf.metrics.resource.ResourceType;
import org.apache.http.HttpHeaders;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fja {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ fja[] $VALUES;
    public static final fja Error = new fja("Error", 0);
    public static final fja Warning = new fja(HttpHeaders.WARNING, 1);
    public static final fja Info = new fja("Info", 2);
    public static final fja Debug = new fja("Debug", 3);
    public static final fja Trace = new fja(ResourceType.TRACE, 4);

    private static final /* synthetic */ fja[] $values() {
        return new fja[]{Error, Warning, Info, Debug, Trace};
    }

    static {
        fja[] fjaVarArr$values = $values();
        $VALUES = fjaVarArr$values;
        $ENTRIES = hi6.m30609a(fjaVarArr$values);
    }

    private fja(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static fja valueOf(String str) {
        return (fja) Enum.valueOf(fja.class, str);
    }

    public static fja[] values() {
        return (fja[]) $VALUES.clone();
    }
}
