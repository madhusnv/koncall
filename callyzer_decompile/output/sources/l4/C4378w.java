package l4;

import com.sun.mail.util.AbstractC1452a;
import g4.C2492h;
import kotlin.jvm.internal.AbstractC4154l;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.w */
/* loaded from: classes.dex */
public final class C4378w implements InterfaceC4362g {

    /* renamed from: a */
    public final C2492h f21939a;

    /* renamed from: b */
    public final int f21940b;

    public C4378w(String str, int i10) {
        this.f21939a = new C2492h(str);
        this.f21940b = i10;
    }

    @Override // l4.InterfaceC4362g
    /* renamed from: a */
    public final void mo9068a(C4363h c4363h) {
        int i10 = c4363h.f21905d;
        C2492h c2492h = this.f21939a;
        if (i10 != -1) {
            int i11 = c4363h.f21906e;
            String str = c2492h.f13620b;
            String str2 = c2492h.f13620b;
            c4363h.m9107d(i10, i11, str);
            if (str2.length() > 0) {
                c4363h.m9108e(i10, str2.length() + i10);
            }
        } else {
            int i12 = c4363h.f21903b;
            int i13 = c4363h.f21904c;
            String str3 = c2492h.f13620b;
            String str4 = c2492h.f13620b;
            c4363h.m9107d(i12, i13, str3);
            if (str4.length() > 0) {
                c4363h.m9108e(i12, str4.length() + i12);
            }
        }
        int i14 = c4363h.f21903b;
        int i15 = c4363h.f21904c;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f21940b;
        int iM11912c = w9.m11912c(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - c2492h.f13620b.length(), 0, c4363h.f21902a.m5992b());
        c4363h.m9109f(iM11912c, iM11912c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4378w)) {
            return false;
        }
        C4378w c4378w = (C4378w) obj;
        return AbstractC4154l.m8918a(this.f21939a.f13620b, c4378w.f21939a.f13620b) && this.f21940b == c4378w.f21940b;
    }

    public final int hashCode() {
        return (this.f21939a.f13620b.hashCode() * 31) + this.f21940b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f21939a.f13620b);
        sb2.append("', newCursorPosition=");
        return AbstractC1452a.m4563j(sb2, this.f21940b, ')');
    }
}
