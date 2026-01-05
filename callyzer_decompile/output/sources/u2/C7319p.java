package u2;

import kotlin.jvm.internal.AbstractC4154l;
import o2.AbstractC5269b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.p */
/* loaded from: classes.dex */
public final class C7319p extends a0 {

    /* renamed from: c */
    public AbstractC5269b f34901c;

    /* renamed from: d */
    public int f34902d;

    /* renamed from: e */
    public int f34903e;

    public C7319p(long j6, AbstractC5269b abstractC5269b) {
        super(j6);
        this.f34901c = abstractC5269b;
    }

    @Override // u2.a0
    /* renamed from: a */
    public final void mo8494a(a0 a0Var) {
        synchronized (AbstractC7321r.f34905a) {
            AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
            this.f34901c = ((C7319p) a0Var).f34901c;
            this.f34902d = ((C7319p) a0Var).f34902d;
            this.f34903e = ((C7319p) a0Var).f34903e;
        }
    }

    @Override // u2.a0
    /* renamed from: b */
    public final a0 mo8495b(long j6) {
        return new C7319p(j6, this.f34901c);
    }
}
