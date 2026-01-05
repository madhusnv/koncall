package p001o;

import p001o.hyh;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class da implements tq6 {

    /* renamed from: d */
    public static final yq6 f19445d = new yq6() { // from class: o.ca
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return da.m22644e();
        }
    };

    /* renamed from: a */
    public final ea f19446a = new ea();

    /* renamed from: b */
    public final zwc f19447b = new zwc(2786);

    /* renamed from: c */
    public boolean f19448c;

    /* renamed from: e */
    public static /* synthetic */ tq6[] m22644e() {
        return new tq6[]{new da()};
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f19448c = false;
        this.f19446a.mo24647b();
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        zwc zwcVar = new zwc(10);
        int i = 0;
        while (true) {
            uq6Var.mo40498m(zwcVar.m60024e(), 0, 10);
            zwcVar.m60017U(0);
            if (zwcVar.m60007K() != 4801587) {
                break;
            }
            zwcVar.m60018V(3);
            int iM60003G = zwcVar.m60003G();
            i += iM60003G + 10;
            uq6Var.mo40494h(iM60003G);
        }
        uq6Var.mo40490c();
        uq6Var.mo40494h(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            uq6Var.mo40498m(zwcVar.m60024e(), 0, 6);
            zwcVar.m60017U(0);
            if (zwcVar.m60010N() != 2935) {
                uq6Var.mo40490c();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                uq6Var.mo40494h(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iM26328g = fa.m26328g(zwcVar.m60024e());
                if (iM26328g == -1) {
                    return false;
                }
                uq6Var.mo40494h(iM26328g - 6);
            }
        }
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f19446a.mo24649d(vq6Var, new hyh.C14129d(0, 1));
        vq6Var.mo32489p();
        vq6Var.mo32490r(new zaf.C18604b(-9223372036854775807L));
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        int i = uq6Var.read(this.f19447b.m60024e(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f19447b.m60017U(0);
        this.f19447b.m60016T(i);
        if (!this.f19448c) {
            this.f19446a.mo24650e(0L, 4);
            this.f19448c = true;
        }
        this.f19446a.mo24646a(this.f19447b);
        return 0;
    }

    @Override // p001o.tq6
    public void release() {
    }
}
