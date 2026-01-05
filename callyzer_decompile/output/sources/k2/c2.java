package k2;

import kotlin.jvm.internal.AbstractC4154l;
import u2.AbstractC7316m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c2 extends u2.a0 {

    /* renamed from: c */
    public Object f20361c;

    public c2(long j6, Object obj) {
        super(j6);
        this.f20361c = obj;
    }

    @Override // u2.a0
    /* renamed from: a */
    public final void mo8494a(u2.a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f20361c = ((c2) a0Var).f20361c;
    }

    @Override // u2.a0
    /* renamed from: b */
    public final u2.a0 mo8495b(long j6) {
        return new c2(AbstractC7316m.m13686k().mo13652g(), this.f20361c);
    }
}
