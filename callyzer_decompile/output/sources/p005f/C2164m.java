package p005f;

import com.google.android.gms.internal.measurement.j4;
import ex.InterfaceC2141e;
import p004e.AbstractC1887v;
import p004e.C1866a;
import tx.InterfaceC7266z;
import vx.C7806h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.m */
/* loaded from: classes.dex */
public final class C2164m extends AbstractC1887v {

    /* renamed from: d */
    public InterfaceC7266z f10021d;

    /* renamed from: e */
    public InterfaceC2141e f10022e;

    /* renamed from: f */
    public j4 f10023f;

    /* renamed from: g */
    public boolean f10024g;

    @Override // p004e.AbstractC1887v
    /* renamed from: a */
    public final void mo1275a() {
        j4 j4Var = this.f10023f;
        if (j4Var != null) {
            j4Var.m3394g();
        }
        j4 j4Var2 = this.f10023f;
        if (j4Var2 != null) {
            j4Var2.f6251b = false;
        }
        this.f10024g = false;
    }

    @Override // p004e.AbstractC1887v
    /* renamed from: b */
    public final void mo1276b() {
        j4 j4Var = this.f10023f;
        if (j4Var != null && !j4Var.f6251b) {
            j4Var.m3394g();
            this.f10023f = null;
        }
        if (this.f10023f == null) {
            this.f10023f = new j4(this.f10021d, false, this.f10022e, this);
        }
        j4 j4Var2 = this.f10023f;
        if (j4Var2 != null) {
            ((C7806h) j4Var2.f6252c).m14781n(null);
        }
        j4 j4Var3 = this.f10023f;
        if (j4Var3 != null) {
            j4Var3.f6251b = false;
        }
        this.f10024g = false;
    }

    @Override // p004e.AbstractC1887v
    /* renamed from: c */
    public final void mo1277c(C1866a c1866a) {
        super.mo1277c(c1866a);
        j4 j4Var = this.f10023f;
        if (j4Var != null) {
            ((C7806h) j4Var.f6252c).mo14776i(c1866a);
        }
    }

    @Override // p004e.AbstractC1887v
    /* renamed from: d */
    public final void mo1278d(C1866a c1866a) {
        super.mo1278d(c1866a);
        j4 j4Var = this.f10023f;
        if (j4Var != null) {
            j4Var.m3394g();
        }
        if (this.f8901a) {
            this.f10023f = new j4(this.f10021d, true, this.f10022e, this);
        }
        this.f10024g = true;
    }
}
