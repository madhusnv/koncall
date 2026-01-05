package p001o;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;
import p001o.nf8;

/* loaded from: classes2.dex */
public final class ln1 implements dnd {

    /* renamed from: a */
    public final yq6 f34101a;

    /* renamed from: b */
    public tq6 f34102b;

    /* renamed from: c */
    public uq6 f34103c;

    public ln1(yq6 yq6Var) {
        this.f34101a = yq6Var;
    }

    /* renamed from: g */
    public static /* synthetic */ String m37511g(tq6 tq6Var) {
        return tq6Var.mo46490f().getClass().getSimpleName();
    }

    @Override // p001o.dnd
    /* renamed from: a */
    public void mo23624a(long j, long j2) {
        ((tq6) op0.m42515e(this.f34102b)).mo17261a(j, j2);
    }

    @Override // p001o.dnd
    /* renamed from: b */
    public int mo23625b(ued uedVar) {
        return ((tq6) op0.m42515e(this.f34102b)).mo17264k((uq6) op0.m42515e(this.f34103c), uedVar);
    }

    @Override // p001o.dnd
    /* renamed from: c */
    public void mo23626c() {
        tq6 tq6Var = this.f34102b;
        if (tq6Var == null) {
            return;
        }
        tq6 tq6VarMo46490f = tq6Var.mo46490f();
        if (tq6VarMo46490f instanceof cnb) {
            ((cnb) tq6VarMo46490f).m21468l();
        }
    }

    @Override // p001o.dnd
    /* renamed from: d */
    public long mo23627d() {
        uq6 uq6Var = this.f34103c;
        if (uq6Var != null) {
            return uq6Var.getPosition();
        }
        return -1L;
    }

    @Override // p001o.dnd
    /* renamed from: e */
    public void mo23628e(pu4 pu4Var, Uri uri, Map map, long j, long j2, vq6 vq6Var) throws x4i {
        yd5 yd5Var = new yd5(pu4Var, j, j2);
        this.f34103c = yd5Var;
        if (this.f34102b != null) {
            return;
        }
        tq6[] tq6VarArrMo18781d = this.f34101a.mo18781d(uri, map);
        nf8.C15566a c15566aM40509r = nf8.m40509r(tq6VarArrMo18781d.length);
        if (tq6VarArrMo18781d.length == 1) {
            this.f34102b = tq6VarArrMo18781d[0];
        } else {
            int length = tq6VarArrMo18781d.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                tq6 tq6Var = tq6VarArrMo18781d[i];
                try {
                } catch (EOFException unused) {
                    if (this.f34102b != null || yd5Var.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    op0.m42517g(this.f34102b != null || yd5Var.getPosition() == j);
                    yd5Var.mo40490c();
                    throw th;
                }
                if (tq6Var.mo17262c(yd5Var)) {
                    this.f34102b = tq6Var;
                    op0.m42517g(true);
                    yd5Var.mo40490c();
                    break;
                } else {
                    c15566aM40509r.m40519j(tq6Var.mo27149i());
                    boolean z = this.f34102b != null || yd5Var.getPosition() == j;
                    op0.m42517g(z);
                    yd5Var.mo40490c();
                    i++;
                }
            }
            if (this.f34102b == null) {
                throw new x4i("None of the available extractors (" + h79.m29890g(", ").m29894d(fga.m26655k(nf8.m40512z(tq6VarArrMo18781d), new ol7() { // from class: o.kn1
                    @Override // p001o.ol7
                    public final Object apply(Object obj) {
                        return ln1.m37511g((tq6) obj);
                    }
                })) + ") could read the stream.", (Uri) op0.m42515e(uri), c15566aM40509r.m40520k());
            }
        }
        this.f34102b.mo17263d(vq6Var);
    }

    @Override // p001o.dnd
    public void release() {
        tq6 tq6Var = this.f34102b;
        if (tq6Var != null) {
            tq6Var.release();
            this.f34102b = null;
        }
        this.f34103c = null;
    }
}
