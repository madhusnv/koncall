package tc;

import ad.C0109p;
import jc.AbstractC3745u;
import jc.InterfaceC3732h;
import jc.InterfaceC3738n;
import jc.e0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tc.h */
/* loaded from: classes.dex */
public final class C7123h implements InterfaceC7116a {

    /* renamed from: a */
    public final e0 f34335a;

    /* renamed from: b */
    public final C0109p f34336b;

    /* renamed from: c */
    public final InterfaceC3738n f34337c;

    /* renamed from: d */
    public final AbstractC3745u f34338d;

    /* renamed from: e */
    public final InterfaceC3732h f34339e;

    public C7123h(e0 method, C0109p c0109p, InterfaceC3738n headers, AbstractC3745u body, InterfaceC3732h trailingHeaders) {
        AbstractC4154l.m8923f(method, "method");
        AbstractC4154l.m8923f(headers, "headers");
        AbstractC4154l.m8923f(body, "body");
        AbstractC4154l.m8923f(trailingHeaders, "trailingHeaders");
        this.f34335a = method;
        this.f34336b = c0109p;
        this.f34337c = headers;
        this.f34338d = body;
        this.f34339e = trailingHeaders;
    }

    @Override // tc.InterfaceC7116a
    /* renamed from: a */
    public final InterfaceC3738n mo13398a() {
        return this.f34337c;
    }

    @Override // tc.InterfaceC7116a
    /* renamed from: b */
    public final e0 mo13399b() {
        return this.f34335a;
    }

    @Override // tc.InterfaceC7116a
    /* renamed from: c */
    public final AbstractC3745u mo13400c() {
        return this.f34338d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7123h)) {
            return false;
        }
        C7123h c7123h = (C7123h) obj;
        return this.f34335a == c7123h.f34335a && AbstractC4154l.m8918a(this.f34336b, c7123h.f34336b) && AbstractC4154l.m8918a(this.f34337c, c7123h.f34337c) && AbstractC4154l.m8918a(this.f34338d, c7123h.f34338d) && AbstractC4154l.m8918a(this.f34339e, c7123h.f34339e);
    }

    @Override // tc.InterfaceC7116a
    public final C0109p getUrl() {
        return this.f34336b;
    }

    public final int hashCode() {
        return this.f34339e.hashCode() + ((this.f34338d.hashCode() + ((this.f34337c.hashCode() + ((this.f34336b.hashCode() + (this.f34335a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RealHttpRequest(method=" + this.f34335a + ", url=" + this.f34336b + ", headers=" + this.f34337c + ", body=" + this.f34338d + ", trailingHeaders=" + this.f34339e + ')';
    }
}
