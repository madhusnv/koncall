package p001o;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class n8j {
    /* renamed from: a */
    public static long m40251a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public static Pair m40252b(fz5 fz5Var) {
        Map mapMo27780g = fz5Var.mo27780g();
        if (mapMo27780g == null) {
            return null;
        }
        return new Pair(Long.valueOf(m40251a(mapMo27780g, "LicenseDurationRemaining")), Long.valueOf(m40251a(mapMo27780g, "PlaybackDurationRemaining")));
    }
}
