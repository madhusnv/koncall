package tx;

import kotlinx.coroutines.TimeoutCancellationException;
import ww.AbstractC8193c;
import yx.C8822p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z1 extends C8822p implements Runnable {

    /* renamed from: e */
    public final long f34702e;

    public z1(long j6, AbstractC8193c abstractC8193c) {
        super(abstractC8193c, abstractC8193c.getContext());
        this.f34702e = j6;
    }

    @Override // tx.k1
    /* renamed from: V */
    public final String mo13560V() {
        return super.mo13560V() + "(timeMillis=" + this.f34702e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0.m13493p(this.f34593c);
        m13565o(new TimeoutCancellationException("Timed out waiting for " + this.f34702e + " ms", this));
    }
}
