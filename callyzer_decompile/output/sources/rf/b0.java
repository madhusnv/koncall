package rf;

import android.os.DeadObjectException;
import android.os.RemoteException;
import c9.C0910e;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import pf.C5904d;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC6515t {

    /* renamed from: b */
    public final C8650g f31210b;

    public b0(AbstractC6503h abstractC6503h, C8650g c8650g) {
        super(4);
        this.f31210b = c8650g;
    }

    @Override // rf.c0
    /* renamed from: a */
    public final void mo12502a(Status status) {
        this.f31210b.m15970c(new ApiException(status));
    }

    @Override // rf.c0
    /* renamed from: b */
    public final void mo12503b(Exception exc) {
        this.f31210b.m15970c(exc);
    }

    @Override // rf.c0
    /* renamed from: c */
    public final void mo12504c(C6511p c6511p) throws DeadObjectException {
        try {
            m12508h(c6511p);
        } catch (DeadObjectException e2) {
            mo12502a(c0.m12512e(e2));
            throw e2;
        } catch (RemoteException e10) {
            mo12502a(c0.m12512e(e10));
        } catch (RuntimeException e11) {
            this.f31210b.m15970c(e11);
        }
    }

    @Override // rf.AbstractC6515t
    /* renamed from: f */
    public final boolean mo12506f(C6511p c6511p) {
        return false;
    }

    @Override // rf.AbstractC6515t
    /* renamed from: g */
    public final C5904d[] mo12507g(C6511p c6511p) {
        return null;
    }

    /* renamed from: h */
    public final void m12508h(C6511p c6511p) {
        this.f31210b.m15971d(Boolean.FALSE);
    }

    @Override // rf.c0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12505d(C0910e c0910e, boolean z6) {
    }
}
