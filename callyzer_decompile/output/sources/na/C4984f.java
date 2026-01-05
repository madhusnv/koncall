package na;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.f */
/* loaded from: classes.dex */
public final class C4984f {

    /* renamed from: a */
    public final String f24720a;

    /* renamed from: b */
    public final String f24721b;

    public C4984f(String name, String version) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(version, "version");
        this.f24720a = name;
        this.f24721b = version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4984f)) {
            return false;
        }
        C4984f c4984f = (C4984f) obj;
        return AbstractC4154l.m8918a(this.f24720a, c4984f.f24720a) && AbstractC4154l.m8918a(this.f24721b, c4984f.f24721b);
    }

    public final int hashCode() {
        return this.f24721b.hashCode() + (this.f24720a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC4982d.m9897b("lib", this.f24720a, this.f24721b);
    }
}
