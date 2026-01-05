package o1;

import com.sun.mail.util.AbstractC1452a;
import k2.C3953b;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.a */
/* loaded from: classes.dex */
public final class C5242a implements v1 {

    /* renamed from: a */
    public final int f25688a;

    /* renamed from: b */
    public final String f25689b;

    /* renamed from: c */
    public final k2.e1 f25690c = C3953b.m8517t(C7340b.f34956e);

    /* renamed from: d */
    public final k2.e1 f25691d = C3953b.m8517t(Boolean.TRUE);

    public C5242a(int i10, String str) {
        this.f25688a = i10;
        this.f25689b = str;
    }

    @Override // o1.v1
    /* renamed from: a */
    public final int mo6893a(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        return m10311e().f34957a;
    }

    @Override // o1.v1
    /* renamed from: b */
    public final int mo6894b(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m) {
        return m10311e().f34959c;
    }

    @Override // o1.v1
    /* renamed from: c */
    public final int mo6895c(InterfaceC6747c interfaceC6747c) {
        return m10311e().f34958b;
    }

    @Override // o1.v1
    /* renamed from: d */
    public final int mo6896d(InterfaceC6747c interfaceC6747c) {
        return m10311e().f34960d;
    }

    /* renamed from: e */
    public final C7340b m10311e() {
        return (C7340b) this.f25690c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5242a) {
            return this.f25688a == ((C5242a) obj).f25688a;
        }
        return false;
    }

    /* renamed from: f */
    public final void m10312f(c6.y1 y1Var, int i10) {
        int i11 = this.f25688a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f25690c.setValue(y1Var.f5541a.mo2475g(i11));
            this.f25691d.setValue(Boolean.valueOf(y1Var.f5541a.mo2480q(i11)));
        }
    }

    public final int hashCode() {
        return this.f25688a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25689b);
        sb2.append('(');
        sb2.append(m10311e().f34957a);
        sb2.append(", ");
        sb2.append(m10311e().f34958b);
        sb2.append(", ");
        sb2.append(m10311e().f34959c);
        sb2.append(", ");
        return AbstractC1452a.m4563j(sb2, m10311e().f34960d, ')');
    }
}
