package qz;

import b00.C0529n;
import kotlin.jvm.internal.AbstractC4154l;
import ph.C5950e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.d */
/* loaded from: classes3.dex */
public final class C6386d {

    /* renamed from: d */
    public static final C0529n f30794d;

    /* renamed from: e */
    public static final C0529n f30795e;

    /* renamed from: f */
    public static final C0529n f30796f;

    /* renamed from: g */
    public static final C0529n f30797g;

    /* renamed from: h */
    public static final C0529n f30798h;

    /* renamed from: i */
    public static final C0529n f30799i;

    /* renamed from: a */
    public final C0529n f30800a;

    /* renamed from: b */
    public final C0529n f30801b;

    /* renamed from: c */
    public final int f30802c;

    static {
        C0529n c0529n = C0529n.f3647d;
        f30794d = C5950e.m11977h(":");
        f30795e = C5950e.m11977h(":status");
        f30796f = C5950e.m11977h(":method");
        f30797g = C5950e.m11977h(":path");
        f30798h = C5950e.m11977h(":scheme");
        f30799i = C5950e.m11977h(":authority");
    }

    public C6386d(C0529n name, C0529n value) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        this.f30800a = name;
        this.f30801b = value;
        this.f30802c = value.mo1563d() + name.mo1563d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6386d)) {
            return false;
        }
        C6386d c6386d = (C6386d) obj;
        return AbstractC4154l.m8918a(this.f30800a, c6386d.f30800a) && AbstractC4154l.m8918a(this.f30801b, c6386d.f30801b);
    }

    public final int hashCode() {
        return this.f30801b.hashCode() + (this.f30800a.hashCode() * 31);
    }

    public final String toString() {
        return this.f30800a.m1613r() + ": " + this.f30801b.m1613r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6386d(String str, String str2) {
        this(C5950e.m11977h(str), C5950e.m11977h(str2));
        C0529n c0529n = C0529n.f3647d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6386d(C0529n name, String value) {
        this(name, C5950e.m11977h(value));
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        C0529n c0529n = C0529n.f3647d;
    }
}
