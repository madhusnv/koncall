package f8;

import ap.C0390c;
import c8.C0898a;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4672b;
import nx.AbstractC5179q;
import og.ve;
import og.xe;
import rw.AbstractC6663m;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.k */
/* loaded from: classes.dex */
public final class C2216k {

    /* renamed from: a */
    public final String f10188a;

    /* renamed from: b */
    public final Object f10189b;

    /* renamed from: c */
    public final Set f10190c;

    /* renamed from: d */
    public final Set f10191d;

    public C2216k(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        AbstractC4154l.m8923f(foreignKeys, "foreignKeys");
        this.f10188a = str;
        this.f10189b = map;
        this.f10190c = foreignKeys;
        this.f10191d = abstractSet;
    }

    /* renamed from: a */
    public static final C2216k m5927a(C4672b c4672b, String str) {
        return ve.m11020b(new C0898a(c4672b), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2216k)) {
            return false;
        }
        C2216k c2216k = (C2216k) obj;
        if (!this.f10188a.equals(c2216k.f10188a) || !this.f10189b.equals(c2216k.f10189b) || !AbstractC4154l.m8918a(this.f10190c, c2216k.f10190c)) {
            return false;
        }
        Set set2 = this.f10191d;
        if (set2 == null || (set = c2216k.f10191d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f10190c.hashCode() + ((this.f10189b.hashCode() + (this.f10188a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f10188a);
        sb2.append("',\n            |    columns = {");
        sb2.append(xe.m11046c(AbstractC6663m.m12760X(this.f10189b.values(), new C0390c(9))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(xe.m11046c(this.f10190c));
        sb2.append("\n            |    indices = {");
        Set set = this.f10191d;
        sb2.append(xe.m11046c(set != null ? AbstractC6663m.m12760X(set, new C0390c(10)) : C6668r.f31943a));
        sb2.append("\n            |}\n        ");
        return AbstractC5179q.m10123e(sb2.toString());
    }
}
