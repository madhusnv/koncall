package ma;

import a2.AbstractC0030c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ma.a */
/* loaded from: classes.dex */
public final class C4682a {

    /* renamed from: a */
    public final String f23142a;

    /* renamed from: b */
    public final String f23143b;

    /* renamed from: c */
    public final String f23144c;

    /* renamed from: d */
    public final String f23145d;

    /* renamed from: e */
    public final List f23146e;

    public C4682a(String partition, String service, String region, String accountId, List list) {
        AbstractC4154l.m8923f(partition, "partition");
        AbstractC4154l.m8923f(service, "service");
        AbstractC4154l.m8923f(region, "region");
        AbstractC4154l.m8923f(accountId, "accountId");
        this.f23142a = partition;
        this.f23143b = service;
        this.f23144c = region;
        this.f23145d = accountId;
        this.f23146e = list;
    }

    /* renamed from: a */
    public final String m9574a() {
        return this.f23145d;
    }

    /* renamed from: b */
    public final String m9575b() {
        return this.f23144c;
    }

    /* renamed from: c */
    public final List m9576c() {
        return this.f23146e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4682a)) {
            return false;
        }
        C4682a c4682a = (C4682a) obj;
        return AbstractC4154l.m8918a(this.f23142a, c4682a.f23142a) && AbstractC4154l.m8918a(this.f23143b, c4682a.f23143b) && AbstractC4154l.m8918a(this.f23144c, c4682a.f23144c) && AbstractC4154l.m8918a(this.f23145d, c4682a.f23145d) && AbstractC4154l.m8918a(this.f23146e, c4682a.f23146e);
    }

    public final int hashCode() {
        return this.f23146e.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.f23142a.hashCode() * 31, 31, this.f23143b), 31, this.f23144c), 31, this.f23145d);
    }

    public final String toString() {
        return "Arn(partition=" + this.f23142a + ", service=" + this.f23143b + ", region=" + this.f23144c + ", accountId=" + this.f23145d + ", resourceId=" + this.f23146e + ')';
    }
}
