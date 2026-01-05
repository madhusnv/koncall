package j$.time;

import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.TemporalAccessor;
import j$.time.zone.C3495f;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a */
    public static final Map f18037a;
    private static final long serialVersionUID = 8352817235686L;

    /* renamed from: C */
    public abstract C3495f mo7865C();

    /* renamed from: X */
    public abstract void mo7866X(DataOutput dataOutput);

    /* renamed from: r */
    public abstract String mo7867r();

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i10 = 0; i10 < 28; i10++) {
            Map.Entry entry = entryArr[i10];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f18037a = Collections.unmodifiableMap(map);
    }

    public static ZoneId systemDefault() {
        String id2 = TimeZone.getDefault().getID();
        Map map = f18037a;
        Objects.requireNonNull(id2, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id2);
        if (str != null) {
            id2 = str;
        }
        return of(id2);
    }

    public static ZoneId of(String str) {
        return m7861I(str, true);
    }

    /* renamed from: K */
    public static ZoneId m7862K(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.f18042b != 0) {
            str = str.concat(zoneOffset.f18043c);
        }
        return new C3488v(str, new C3495f(zoneOffset));
    }

    /* renamed from: I */
    public static ZoneId m7861I(String str, boolean z6) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.b0(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return m7863Q(str, 3, z6);
        }
        if (str.startsWith("UT")) {
            return m7863Q(str, 2, z6);
        }
        return C3488v.a0(str, z6);
    }

    /* renamed from: Q */
    public static ZoneId m7863Q(String str, int i10, boolean z6) {
        String strSubstring = str.substring(0, i10);
        if (str.length() == i10) {
            return m7862K(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return C3488v.a0(str, z6);
        }
        try {
            ZoneOffset zoneOffsetB0 = ZoneOffset.b0(str.substring(i10));
            if (zoneOffsetB0 == ZoneOffset.UTC) {
                return m7862K(strSubstring, zoneOffsetB0);
            }
            return m7862K(strSubstring, zoneOffsetB0);
        } catch (C3401c e2) {
            throw new C3401c("Invalid ID for offset-based ZoneId: ".concat(str), e2);
        }
    }

    /* renamed from: t */
    public static ZoneId m7864t(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.mo7808d(AbstractC3483m.f18281e);
        if (zoneId != null) {
            return zoneId;
        }
        throw new C3401c("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != C3488v.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return mo7867r().equals(((ZoneId) obj).mo7867r());
        }
        return false;
    }

    public int hashCode() {
        return mo7867r().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return mo7867r();
    }

    private Object writeReplace() {
        return new C3467q((byte) 7, this);
    }
}
