package qz;

import b00.C0521f;
import com.sun.mail.util.AbstractC1452a;
import java.net.SocketTimeoutException;
import mz.C4919c;
import qc.C6158d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.w */
/* loaded from: classes3.dex */
public final class C6405w extends C0521f {

    /* renamed from: m */
    public final /* synthetic */ C6406x f30896m;

    public C6405w(C6406x c6406x) {
        this.f30896m = c6406x;
    }

    @Override // b00.C0521f
    /* renamed from: j */
    public final void mo1558j() {
        this.f30896m.m12406e(EnumC6384b.CANCEL);
        C6398p c6398p = this.f30896m.f30898b;
        synchronized (c6398p) {
            long j6 = c6398p.f30859q;
            long j10 = c6398p.f30858p;
            if (j6 < j10) {
                return;
            }
            c6398p.f30858p = j10 + 1;
            c6398p.f30860r = System.nanoTime() + 1000000000;
            C4919c.m9815c(c6398p.f30852h, AbstractC1452a.m4564k(new StringBuilder(), c6398p.f30847c, " ping"), new C6158d(2, c6398p));
        }
    }

    /* renamed from: k */
    public final void m12401k() {
        if (m1557i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
