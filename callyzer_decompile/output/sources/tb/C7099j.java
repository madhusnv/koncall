package tb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import tc.C7117b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.j */
/* loaded from: classes.dex */
public final class C7099j {

    /* renamed from: a */
    public final C7117b f34267a;

    /* renamed from: b */
    public final String f34268b;

    /* renamed from: c */
    public final String f34269c;

    /* renamed from: d */
    public final String f34270d;

    public C7099j(C7117b c7117b, String requestString, String signedHeaders, String hash) {
        AbstractC4154l.m8923f(requestString, "requestString");
        AbstractC4154l.m8923f(signedHeaders, "signedHeaders");
        AbstractC4154l.m8923f(hash, "hash");
        this.f34267a = c7117b;
        this.f34268b = requestString;
        this.f34269c = signedHeaders;
        this.f34270d = hash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7099j)) {
            return false;
        }
        C7099j c7099j = (C7099j) obj;
        return AbstractC4154l.m8918a(this.f34267a, c7099j.f34267a) && AbstractC4154l.m8918a(this.f34268b, c7099j.f34268b) && AbstractC4154l.m8918a(this.f34269c, c7099j.f34269c) && AbstractC4154l.m8918a(this.f34270d, c7099j.f34270d);
    }

    public final int hashCode() {
        return this.f34270d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(this.f34267a.hashCode() * 31, 31, this.f34268b), 31, this.f34269c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CanonicalRequest(request=");
        sb2.append(this.f34267a);
        sb2.append(", requestString=");
        sb2.append(this.f34268b);
        sb2.append(", signedHeaders=");
        sb2.append(this.f34269c);
        sb2.append(", hash=");
        return AbstractC0030c.m123n(sb2, this.f34270d, ')');
    }
}
