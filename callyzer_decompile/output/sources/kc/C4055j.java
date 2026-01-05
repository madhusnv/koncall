package kc;

import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;
import tc.C7117b;
import vc.InterfaceC7698a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kc.j */
/* loaded from: classes.dex */
public final class C4055j {

    /* renamed from: a */
    public final C7117b f20902a;

    /* renamed from: b */
    public final InterfaceC7698a f20903b;

    /* renamed from: c */
    public final InterfaceC2004b f20904c;

    public C4055j(C7117b httpRequest, InterfaceC7698a identity, InterfaceC2004b signingAttributes) {
        AbstractC4154l.m8923f(httpRequest, "httpRequest");
        AbstractC4154l.m8923f(identity, "identity");
        AbstractC4154l.m8923f(signingAttributes, "signingAttributes");
        this.f20902a = httpRequest;
        this.f20903b = identity;
        this.f20904c = signingAttributes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4055j)) {
            return false;
        }
        C4055j c4055j = (C4055j) obj;
        return AbstractC4154l.m8918a(this.f20902a, c4055j.f20902a) && AbstractC4154l.m8918a(this.f20903b, c4055j.f20903b) && AbstractC4154l.m8918a(this.f20904c, c4055j.f20904c);
    }

    public final int hashCode() {
        return this.f20904c.hashCode() + ((this.f20903b.hashCode() + (this.f20902a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SignHttpRequest(httpRequest=" + this.f20902a + ", identity=" + this.f20903b + ", signingAttributes=" + this.f20904c + ')';
    }
}
