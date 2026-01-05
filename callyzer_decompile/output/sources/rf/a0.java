package rf;

import android.os.DeadObjectException;
import android.os.RemoteException;
import c9.C0908c;
import c9.C0910e;
import com.google.android.gms.common.api.Status;
import hd.C2893e;
import java.util.Map;
import ng.C5070u;
import pf.C5904d;
import sf.AbstractC6840z;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC6515t {

    /* renamed from: b */
    public final C2893e f31207b;

    /* renamed from: c */
    public final C8650g f31208c;

    /* renamed from: d */
    public final C5070u f31209d;

    public a0(int i10, C2893e c2893e, C8650g c8650g, C5070u c5070u) {
        super(i10);
        this.f31208c = c8650g;
        this.f31207b = c2893e;
        this.f31209d = c5070u;
        if (i10 == 2 && c2893e.f15922a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // rf.c0
    /* renamed from: a */
    public final void mo12502a(Status status) {
        this.f31209d.getClass();
        this.f31208c.m15970c(AbstractC6840z.m13041l(status));
    }

    @Override // rf.c0
    /* renamed from: b */
    public final void mo12503b(Exception exc) {
        this.f31208c.m15970c(exc);
    }

    @Override // rf.c0
    /* renamed from: c */
    public final void mo12504c(C6511p c6511p) throws DeadObjectException {
        C8650g c8650g = this.f31208c;
        try {
            C2893e c2893e = this.f31207b;
            ((InterfaceC6505j) ((C2893e) c2893e.f15925d).f15924c).accept(c6511p.f31256f, c8650g);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e10) {
            mo12502a(c0.m12512e(e10));
        } catch (RuntimeException e11) {
            c8650g.m15970c(e11);
        }
    }

    @Override // rf.c0
    /* renamed from: d */
    public final void mo12505d(C0910e c0910e, boolean z6) {
        Boolean boolValueOf = Boolean.valueOf(z6);
        Map map = (Map) c0910e.f5580c;
        C8650g c8650g = this.f31208c;
        map.put(c8650g, boolValueOf);
        c8650g.f41930a.m15976c(new C0908c(14, c0910e, c8650g));
    }

    @Override // rf.AbstractC6515t
    /* renamed from: f */
    public final boolean mo12506f(C6511p c6511p) {
        return this.f31207b.f15922a;
    }

    @Override // rf.AbstractC6515t
    /* renamed from: g */
    public final C5904d[] mo12507g(C6511p c6511p) {
        return (C5904d[]) this.f31207b.f15924c;
    }
}
