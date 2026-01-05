package kb;

import b2.C0554l;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kb.g */
/* loaded from: classes.dex */
public final class C4043g {

    /* renamed from: a */
    public final C4041e f20881a;

    /* renamed from: b */
    public final C0554l f20882b;

    public C4043g(C4041e c4041e) {
        C0554l c0554l = new C0554l((byte) 0, 12);
        this.f20881a = c4041e;
        this.f20882b = c0554l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4043g)) {
            return false;
        }
        C4043g c4043g = (C4043g) obj;
        return AbstractC4154l.m8918a(this.f20881a, c4043g.f20881a) && AbstractC4154l.m8918a(this.f20882b, c4043g.f20882b);
    }

    public final int hashCode() {
        return this.f20882b.hashCode() + (this.f20881a.hashCode() * 31);
    }

    public final String toString() {
        return "S3ExpressCredentialsCacheValue(expiringCredentials=" + this.f20881a + ", sfg=" + this.f20882b + ')';
    }
}
