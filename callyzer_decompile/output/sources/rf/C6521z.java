package rf;

import android.os.DeadObjectException;
import android.os.RemoteException;
import c9.C0910e;
import com.google.android.gms.common.api.Status;
import i0.m0;
import java.util.Map;
import nf.C5045g;
import qf.InterfaceC6204c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.z */
/* loaded from: classes.dex */
public final class C6521z extends c0 {

    /* renamed from: b */
    public final C5045g f31294b;

    public C6521z(C5045g c5045g) {
        super(1);
        this.f31294b = c5045g;
    }

    @Override // rf.c0
    /* renamed from: a */
    public final void mo12502a(Status status) {
        try {
            this.f31294b.m9967g(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // rf.c0
    /* renamed from: b */
    public final void mo12503b(Exception exc) {
        try {
            this.f31294b.m9967g(new Status(10, m0.m7379l(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // rf.c0
    /* renamed from: c */
    public final void mo12504c(C6511p c6511p) throws DeadObjectException {
        try {
            C5045g c5045g = this.f31294b;
            InterfaceC6204c interfaceC6204c = c6511p.f31256f;
            c5045g.getClass();
            try {
                c5045g.m9966f(interfaceC6204c);
            } catch (DeadObjectException e2) {
                c5045g.m9967g(new Status(8, e2.getLocalizedMessage(), null, null));
                throw e2;
            } catch (RemoteException e10) {
                c5045g.m9967g(new Status(8, e10.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e11) {
            mo12503b(e11);
        }
    }

    @Override // rf.c0
    /* renamed from: d */
    public final void mo12505d(C0910e c0910e, boolean z6) {
        Boolean boolValueOf = Boolean.valueOf(z6);
        Map map = (Map) c0910e.f5579b;
        C5045g c5045g = this.f31294b;
        map.put(c5045g, boolValueOf);
        c5045g.m3093a(new C6507l(c0910e, c5045g));
    }
}
