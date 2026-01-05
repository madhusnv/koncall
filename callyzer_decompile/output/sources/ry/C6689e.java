package ry;

import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.SSHRuntimeException;
import net.schmizz.sshj.connection.ConnectionException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ry.e */
/* loaded from: classes3.dex */
public final class C6689e extends AbstractC6690f {

    /* renamed from: e */
    public final long f31993e;

    public C6689e(long j6, int i10, long j10, C5033m c5033m) {
        super(j6, i10, c5033m);
        this.f31993e = j10;
    }

    @Override // ry.AbstractC6690f
    /* renamed from: a */
    public final void mo12826a(long j6) {
        try {
            super.mo12826a(j6);
        } catch (ConnectionException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }
}
