package androidx.compose.material3;

import ab.C0084b;
import com.sun.mail.util.AbstractC1452a;
import g2.C2460n;
import g2.u1;
import kotlin.jvm.internal.AbstractC4154l;
import tx.c0;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ClockDialModifier extends a1 {

    /* renamed from: a */
    public final C2460n f2063a;

    /* renamed from: b */
    public final boolean f2064b;

    /* renamed from: c */
    public final int f2065c;

    public ClockDialModifier(C2460n c2460n, boolean z6, int i10) {
        this.f2063a = c2460n;
        this.f2064b = z6;
        this.f2065c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return AbstractC4154l.m8918a(this.f2063a, clockDialModifier.f2063a) && this.f2064b == clockDialModifier.f2064b && this.f2065c == clockDialModifier.f2065c;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new u1(this.f2063a, this.f2064b, this.f2065c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2065c) + AbstractC1452a.m4558e(this.f2063a.hashCode() * 31, 31, this.f2064b);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        u1 u1Var = (u1) abstractC7878q;
        C2460n c2460n = this.f2063a;
        u1Var.f12823s = c2460n;
        u1Var.f12824t = this.f2064b;
        int i10 = u1Var.f12825v;
        int i11 = this.f2065c;
        if (i10 == i11) {
            return;
        }
        u1Var.f12825v = i11;
        c0.m13502y(u1Var.z0(), null, null, new C0084b(c2460n, null, 13), 3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClockDialModifier(state=");
        sb2.append(this.f2063a);
        sb2.append(", autoSwitchToMinute=");
        sb2.append(this.f2064b);
        sb2.append(", selection=");
        int i10 = this.f2065c;
        sb2.append((Object) (i10 == 0 ? "Hour" : i10 == 1 ? "Minute" : ""));
        sb2.append(')');
        return sb2.toString();
    }
}
