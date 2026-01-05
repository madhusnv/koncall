package k2;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z1 extends u2.a0 {

    /* renamed from: c */
    public float f20637c;

    public z1(float f6, long j6) {
        super(j6);
        this.f20637c = f6;
    }

    @Override // u2.a0
    /* renamed from: a */
    public final void mo8494a(u2.a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f20637c = ((z1) a0Var).f20637c;
    }

    @Override // u2.a0
    /* renamed from: b */
    public final u2.a0 mo8495b(long j6) {
        return new z1(this.f20637c, j6);
    }
}
