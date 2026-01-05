package k2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import u2.AbstractC7311h;
import u2.AbstractC7316m;
import u2.AbstractC7329z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC7329z implements h2 {

    /* renamed from: b */
    public final InterfaceC2137a f20357b;

    /* renamed from: c */
    public final d2 f20358c;

    /* renamed from: d */
    public b0 f20359d = new b0(AbstractC7316m.m13686k().mo13652g());

    public c0(InterfaceC2137a interfaceC2137a, d2 d2Var) {
        this.f20357b = interfaceC2137a;
        this.f20358c = d2Var;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: b */
    public final u2.a0 mo8488b() {
        return this.f20359d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k2.b0 m8529f(k2.b0 r22, u2.AbstractC7311h r23, boolean r24, ex.InterfaceC2137a r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c0.m8529f(k2.b0, u2.h, boolean, ex.a):k2.b0");
    }

    /* renamed from: g */
    public final b0 m8530g() {
        AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
        return m8529f((b0) AbstractC7316m.m13685j(this.f20359d, abstractC7311hM13686k), abstractC7311hM13686k, false, this.f20357b);
    }

    @Override // k2.h2
    public final Object getValue() {
        InterfaceC2139c interfaceC2139cMo13650e = AbstractC7316m.m13686k().mo13650e();
        if (interfaceC2139cMo13650e != null) {
            interfaceC2139cMo13650e.invoke(this);
        }
        AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
        return m8529f((b0) AbstractC7316m.m13685j(this.f20359d, abstractC7311hM13686k), abstractC7311hM13686k, true, this.f20357b).f20353f;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: j */
    public final void mo8493j(u2.a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f20359d = (b0) a0Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        b0 b0Var = (b0) AbstractC7316m.m13684i(this.f20359d);
        sb2.append(b0Var.m8524c(this, AbstractC7316m.m13686k()) ? String.valueOf(b0Var.f20353f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
