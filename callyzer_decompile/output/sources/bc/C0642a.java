package bc;

import ad.C0108o;
import ad.C0109p;
import ec.C2005c;
import ec.C2011i;
import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bc.a */
/* loaded from: classes.dex */
public final class C0642a {

    /* renamed from: a */
    public final C0109p f4113a;

    /* renamed from: b */
    public final InterfaceC2004b f4114b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0642a(C0109p uri) {
        this(uri, C2011i.f9543a);
        AbstractC4154l.m8923f(uri, "uri");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0642a)) {
            return false;
        }
        C0642a c0642a = (C0642a) obj;
        return AbstractC4154l.m8918a(this.f4113a, c0642a.f4113a) && AbstractC4154l.m8918a(this.f4114b, c0642a.f4114b);
    }

    public final int hashCode() {
        return this.f4114b.hashCode() + (this.f4113a.hashCode() * 961);
    }

    public final String toString() {
        return "Endpoint(uri=" + this.f4113a + ", headers=null, attributes=" + this.f4114b + ')';
    }

    public C0642a(C0109p uri, InterfaceC2004b interfaceC2004b) {
        AbstractC4154l.m8923f(uri, "uri");
        this.f4113a = uri;
        this.f4114b = interfaceC2004b;
    }

    public C0642a(C0109p c0109p, C2005c c2005c) {
        this(c0109p, (InterfaceC2004b) c2005c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0642a(String uri) {
        this(C0108o.m297a(C0109p.f374i, uri));
        AbstractC4154l.m8923f(uri, "uri");
    }
}
