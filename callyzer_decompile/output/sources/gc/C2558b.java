package gc;

import a2.AbstractC0030c;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gc.b */
/* loaded from: classes.dex */
public final class C2558b {

    /* renamed from: a */
    public final InterfaceC2139c f13957a;

    /* renamed from: b */
    public final String f13958b;

    /* renamed from: c */
    public final String f13959c;

    /* renamed from: d */
    public final Object f13960d;

    public C2558b(InterfaceC2139c parse, String sysProp, String envVar, Object obj) {
        AbstractC4154l.m8923f(parse, "parse");
        AbstractC4154l.m8923f(sysProp, "sysProp");
        AbstractC4154l.m8923f(envVar, "envVar");
        this.f13957a = parse;
        this.f13958b = sysProp;
        this.f13959c = envVar;
        this.f13960d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2558b)) {
            return false;
        }
        C2558b c2558b = (C2558b) obj;
        return AbstractC4154l.m8918a(this.f13957a, c2558b.f13957a) && AbstractC4154l.m8918a(this.f13958b, c2558b.f13958b) && AbstractC4154l.m8918a(this.f13959c, c2558b.f13959c) && AbstractC4154l.m8918a(this.f13960d, c2558b.f13960d);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(this.f13957a.hashCode() * 31, 31, this.f13958b), 31, this.f13959c);
        Object obj = this.f13960d;
        return iM113d + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "EnvironmentSetting(parse=" + this.f13957a + ", sysProp=" + this.f13958b + ", envVar=" + this.f13959c + ", defaultValue=" + this.f13960d + ')';
    }
}
