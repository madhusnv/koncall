package f8;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5179q;
import og.xe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.h */
/* loaded from: classes.dex */
public final class C2213h {

    /* renamed from: a */
    public final String f10172a;

    /* renamed from: b */
    public final String f10173b;

    /* renamed from: c */
    public final boolean f10174c;

    /* renamed from: d */
    public final int f10175d;

    /* renamed from: e */
    public final String f10176e;

    /* renamed from: f */
    public final int f10177f;

    /* renamed from: g */
    public final int f10178g;

    public C2213h(String name, String type, boolean z6, int i10, String str, int i11) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(type, "type");
        this.f10172a = name;
        this.f10173b = type;
        this.f10174c = z6;
        this.f10175d = i10;
        this.f10176e = str;
        this.f10177f = i11;
        String upperCase = type.toUpperCase(Locale.ROOT);
        AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
        this.f10178g = AbstractC5178p.m10116x(upperCase, "INT", false) ? 3 : (AbstractC5178p.m10116x(upperCase, "CHAR", false) || AbstractC5178p.m10116x(upperCase, "CLOB", false) || AbstractC5178p.m10116x(upperCase, "TEXT", false)) ? 2 : AbstractC5178p.m10116x(upperCase, "BLOB", false) ? 5 : (AbstractC5178p.m10116x(upperCase, "REAL", false) || AbstractC5178p.m10116x(upperCase, "FLOA", false) || AbstractC5178p.m10116x(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2213h) {
                boolean z6 = this.f10175d > 0;
                C2213h c2213h = (C2213h) obj;
                int i10 = c2213h.f10177f;
                if (z6 == (c2213h.f10175d > 0) && AbstractC4154l.m8918a(this.f10172a, c2213h.f10172a) && this.f10174c == c2213h.f10174c) {
                    String str = c2213h.f10176e;
                    int i11 = this.f10177f;
                    String str2 = this.f10176e;
                    if ((i11 != 1 || i10 != 2 || str2 == null || xe.m11045b(str2, str)) && ((i11 != 2 || i10 != 1 || str == null || xe.m11045b(str, str2)) && ((i11 == 0 || i11 != i10 || (str2 == null ? str == null : xe.m11045b(str2, str))) && this.f10178g == c2213h.f10178g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f10172a.hashCode() * 31) + this.f10178g) * 31) + (this.f10174c ? 1231 : 1237)) * 31) + this.f10175d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f10172a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f10173b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f10178g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f10174c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f10175d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f10176e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return AbstractC5179q.m10120b(AbstractC5179q.m10123e(sb2.toString()));
    }
}
