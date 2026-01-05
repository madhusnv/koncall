package sc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import tc.InterfaceC7116a;
import vc.InterfaceC7698a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.x */
/* loaded from: classes.dex */
public final class C6804x {

    /* renamed from: a */
    public final C0645a f32335a;

    /* renamed from: b */
    public final InterfaceC7116a f32336b;

    /* renamed from: c */
    public final InterfaceC7698a f32337c;

    public C6804x(C0645a context, InterfaceC7116a interfaceC7116a, InterfaceC7698a identity) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(identity, "identity");
        this.f32335a = context;
        this.f32336b = interfaceC7116a;
        this.f32337c = identity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6804x)) {
            return false;
        }
        C6804x c6804x = (C6804x) obj;
        return AbstractC4154l.m8918a(this.f32335a, c6804x.f32335a) && AbstractC4154l.m8918a(this.f32336b, c6804x.f32336b) && AbstractC4154l.m8918a(this.f32337c, c6804x.f32337c);
    }

    public final int hashCode() {
        return this.f32337c.hashCode() + ((this.f32336b.hashCode() + (this.f32335a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ResolveEndpointRequest(context=" + this.f32335a + ", httpRequest=" + this.f32336b + ", identity=" + this.f32337c + ')';
    }
}
