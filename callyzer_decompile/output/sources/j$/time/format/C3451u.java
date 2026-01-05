package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: j$.time.format.u */
/* loaded from: classes2.dex */
public final class C3451u {

    /* renamed from: a */
    public final DateTimeFormatter f18202a;

    /* renamed from: b */
    public boolean f18203b = true;

    /* renamed from: c */
    public boolean f18204c = true;

    /* renamed from: d */
    public final ArrayList f18205d;

    /* renamed from: e */
    public ArrayList f18206e;

    public C3451u(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f18205d = arrayList;
        this.f18206e = null;
        this.f18202a = dateTimeFormatter;
        arrayList.add(new a0());
    }

    /* renamed from: a */
    public final boolean m7985a(char c2, char c10) {
        if (this.f18203b) {
            return c2 == c10;
        }
        return m7984b(c2, c10);
    }

    /* renamed from: g */
    public final boolean m7990g(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 <= charSequence.length() && i11 + i12 <= charSequence2.length()) {
            if (this.f18203b) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (charSequence.charAt(i10 + i13) == charSequence2.charAt(i11 + i13)) {
                    }
                }
                return true;
            }
            for (int i14 = 0; i14 < i12; i14++) {
                char cCharAt = charSequence.charAt(i10 + i14);
                char cCharAt2 = charSequence2.charAt(i11 + i14);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m7984b(char c2, char c10) {
        return c2 == c10 || Character.toUpperCase(c2) == Character.toUpperCase(c10) || Character.toLowerCase(c2) == Character.toLowerCase(c10);
    }

    /* renamed from: c */
    public final a0 m7986c() {
        return (a0) this.f18205d.get(r0.size() - 1);
    }

    /* renamed from: d */
    public final Long m7987d(ChronoField chronoField) {
        return (Long) ((HashMap) m7986c().f18136a).get(chronoField);
    }

    /* renamed from: f */
    public final int m7989f(TemporalField temporalField, long j6, int i10, int i11) {
        Objects.requireNonNull(temporalField, "field");
        Long l9 = (Long) ((HashMap) m7986c().f18136a).put(temporalField, Long.valueOf(j6));
        return (l9 == null || l9.longValue() == j6) ? i11 : ~i10;
    }

    /* renamed from: e */
    public final void m7988e(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        m7986c().f18137b = zoneId;
    }

    public final String toString() {
        return m7986c().toString();
    }
}
