package uc;

import jc.AbstractC3745u;
import jc.InterfaceC3738n;
import jc.h0;
import kotlin.jvm.internal.AbstractC4154l;
import qb.InterfaceC6154c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uc.a */
/* loaded from: classes.dex */
public final class C7394a implements InterfaceC6154c {

    /* renamed from: a */
    public final h0 f35158a;

    /* renamed from: b */
    public final InterfaceC3738n f35159b;

    /* renamed from: c */
    public final AbstractC3745u f35160c;

    /* renamed from: d */
    public final String f35161d;

    public C7394a(h0 status, InterfaceC3738n interfaceC3738n, AbstractC3745u body) {
        AbstractC4154l.m8923f(status, "status");
        AbstractC4154l.m8923f(body, "body");
        this.f35158a = status;
        this.f35159b = interfaceC3738n;
        this.f35160c = body;
        this.f35161d = "HTTP " + status.f19575a + ' ' + status.f19576b;
    }

    @Override // qb.InterfaceC6154c
    /* renamed from: a */
    public final String mo12193a() {
        return this.f35161d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7394a)) {
            return false;
        }
        C7394a c7394a = (C7394a) obj;
        return AbstractC4154l.m8918a(this.f35158a, c7394a.f35158a) && AbstractC4154l.m8918a(this.f35159b, c7394a.f35159b) && AbstractC4154l.m8918a(this.f35160c, c7394a.f35160c);
    }

    public final int hashCode() {
        return this.f35160c.hashCode() + ((this.f35159b.hashCode() + (Integer.hashCode(this.f35158a.f19575a) * 31)) * 31);
    }

    public final String toString() {
        return "DefaultHttpResponse(status=" + this.f35158a + ", headers=" + this.f35159b + ", body=" + this.f35160c + ')';
    }
}
