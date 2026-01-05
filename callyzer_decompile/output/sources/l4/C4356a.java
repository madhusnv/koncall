package l4;

import com.sun.mail.util.AbstractC1452a;
import g4.C2492h;
import kotlin.jvm.internal.AbstractC4154l;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.a */
/* loaded from: classes.dex */
public final class C4356a implements InterfaceC4362g {

    /* renamed from: a */
    public final C2492h f21849a;

    /* renamed from: b */
    public final int f21850b;

    public C4356a(C2492h c2492h, int i10) {
        this.f21849a = c2492h;
        this.f21850b = i10;
    }

    @Override // l4.InterfaceC4362g
    /* renamed from: a */
    public final void mo9068a(C4363h c4363h) {
        int i10 = c4363h.f21905d;
        C2492h c2492h = this.f21849a;
        if (i10 != -1) {
            c4363h.m9107d(i10, c4363h.f21906e, c2492h.f13620b);
        } else {
            c4363h.m9107d(c4363h.f21903b, c4363h.f21904c, c2492h.f13620b);
        }
        int i11 = c4363h.f21903b;
        int i12 = c4363h.f21904c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f21850b;
        int iM11912c = w9.m11912c(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - c2492h.f13620b.length(), 0, c4363h.f21902a.m5992b());
        c4363h.m9109f(iM11912c, iM11912c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4356a)) {
            return false;
        }
        C4356a c4356a = (C4356a) obj;
        return AbstractC4154l.m8918a(this.f21849a.f13620b, c4356a.f21849a.f13620b) && this.f21850b == c4356a.f21850b;
    }

    public final int hashCode() {
        return (this.f21849a.f13620b.hashCode() * 31) + this.f21850b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f21849a.f13620b);
        sb2.append("', newCursorPosition=");
        return AbstractC1452a.m4563j(sb2, this.f21850b, ')');
    }

    public C4356a(String str, int i10) {
        this(new C2492h(str), i10);
    }
}
