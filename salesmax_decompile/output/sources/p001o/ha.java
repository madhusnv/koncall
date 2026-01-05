package p001o;

import org.objectweb.asm.Opcodes;
import p001o.hyh;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class ha implements tq6 {

    /* renamed from: d */
    public static final yq6 f26460d = new yq6() { // from class: o.ga
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return ha.m30027e();
        }
    };

    /* renamed from: a */
    public final ia f26461a = new ia();

    /* renamed from: b */
    public final zwc f26462b = new zwc(Opcodes.ACC_ENUM);

    /* renamed from: c */
    public boolean f26463c;

    /* renamed from: e */
    public static /* synthetic */ tq6[] m30027e() {
        return new tq6[]{new ha()};
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f26463c = false;
        this.f26461a.mo24647b();
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
            uq6Var.mo40498m(zwcVar.m60024e(), 0, 7);
            zwcVar.m60017U(0);
            int iM60010N = zwcVar.m60010N();
            if (iM60010N == 44096 || iM60010N == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iM33431e = ja.m33431e(zwcVar.m60024e(), iM60010N);
                if (iM33431e == -1) {
                    return false;
                }
                uq6Var.mo40494h(iM33431e - 7);
            } else {
                uq6Var.mo40490c();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                uq6Var.mo40494h(i3);
                i2 = 0;
            }
        }
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f26461a.mo24649d(vq6Var, new hyh.C14129d(0, 1));
        vq6Var.mo32489p();
        vq6Var.mo32490r(new zaf.C18604b(-9223372036854775807L));
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        int i = uq6Var.read(this.f26462b.m60024e(), 0, Opcodes.ACC_ENUM);
        if (i == -1) {
            return -1;
        }
        this.f26462b.m60017U(0);
        this.f26462b.m60016T(i);
        if (!this.f26463c) {
            this.f26461a.mo24650e(0L, 4);
            this.f26463c = true;
        }
        this.f26461a.mo24646a(this.f26462b);
        return 0;
    }

    @Override // p001o.tq6
    public void release() {
    }
}
