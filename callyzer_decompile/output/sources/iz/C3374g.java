package iz;

import a2.AbstractC0030c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.g */
/* loaded from: classes3.dex */
public final class C3374g {

    /* renamed from: a */
    public final String f17863a;

    /* renamed from: b */
    public final Map f17864b;

    public C3374g(String str, Map map) {
        String lowerCase;
        this.f17863a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale US = Locale.US;
                AbstractC4154l.m8922e(US, "US");
                lowerCase = str2.toLowerCase(US);
                AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC4154l.m8922e(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f17864b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3374g)) {
            return false;
        }
        C3374g c3374g = (C3374g) obj;
        return AbstractC4154l.m8918a(c3374g.f17863a, this.f17863a) && AbstractC4154l.m8918a(c3374g.f17864b, this.f17864b);
    }

    public final int hashCode() {
        return this.f17864b.hashCode() + AbstractC0030c.m113d(899, 31, this.f17863a);
    }

    public final String toString() {
        return this.f17863a + " authParams=" + this.f17864b;
    }
}
