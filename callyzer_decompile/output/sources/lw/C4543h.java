package lw;

import c3.C0847b;
import k2.C3953b;
import k2.e1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import mw.C4896d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lw.h */
/* loaded from: classes3.dex */
public final class C4543h {

    /* renamed from: a */
    public final w0 f22587a;

    /* renamed from: b */
    public final w0 f22588b;

    /* renamed from: c */
    public final w0 f22589c;

    /* renamed from: d */
    public final w0 f22590d;

    public C4543h() {
        e1 e1VarM8517t = C3953b.m8517t(new C0847b(0L));
        e1 e1VarM8517t2 = C3953b.m8517t(new C0847b(0L));
        e1 e1VarM8517t3 = C3953b.m8517t(new C4896d(0));
        e1 e1VarM8517t4 = C3953b.m8517t(new C4896d(0));
        this.f22587a = e1VarM8517t;
        this.f22588b = e1VarM8517t2;
        this.f22589c = e1VarM8517t3;
        this.f22590d = e1VarM8517t4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4543h)) {
            return false;
        }
        C4543h c4543h = (C4543h) obj;
        return AbstractC4154l.m8918a(this.f22587a, c4543h.f22587a) && AbstractC4154l.m8918a(this.f22588b, c4543h.f22588b) && AbstractC4154l.m8918a(this.f22589c, c4543h.f22589c) && AbstractC4154l.m8918a(this.f22590d, c4543h.f22590d);
    }

    public final int hashCode() {
        return this.f22590d.hashCode() + ((this.f22589c.hashCode() + ((this.f22588b.hashCode() + (this.f22587a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LabelConnectorScopeImpl(startPosition=" + this.f22587a + ", endPosition=" + this.f22588b + ", startAngle=" + this.f22589c + ", endAngle=" + this.f22590d + ")";
    }
}
