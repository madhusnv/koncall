package tx;

import kotlinx.coroutines.DispatchException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r0 extends t0 {

    /* renamed from: c */
    public final C7251k f34668c;

    /* renamed from: d */
    public final /* synthetic */ v0 f34669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, long j6, C7251k c7251k) {
        super(j6);
        this.f34669d = v0Var;
        this.f34668c = c7251k;
    }

    @Override // java.lang.Runnable
    public final void run() throws DispatchException {
        this.f34668c.m13527B(this.f34669d);
    }

    @Override // tx.t0
    public final String toString() {
        return super.toString() + this.f34668c;
    }
}
