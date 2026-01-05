package bt;

import cs.C1492k;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import ex.InterfaceC2143g;
import im.EnumC3312n;
import js.C3850f;
import mm.C4802m;
import qw.InterfaceC6355e;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4810a;

    /* renamed from: b */
    public final /* synthetic */ k2.w0 f4811b;

    /* renamed from: c */
    public final /* synthetic */ int f4812c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6355e f4813d;

    /* renamed from: e */
    public final /* synthetic */ Object f4814e;

    /* renamed from: f */
    public final /* synthetic */ Object f4815f;

    public /* synthetic */ e0(String str, InterfaceC2141e interfaceC2141e, int i10, k2.w0 w0Var, k2.w0 w0Var2) {
        this.f4810a = 4;
        this.f4814e = str;
        this.f4813d = interfaceC2141e;
        this.f4812c = i10;
        this.f4811b = w0Var;
        this.f4815f = w0Var2;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        int i10 = this.f4810a;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj = this.f4815f;
        k2.w0 w0Var = this.f4811b;
        int i11 = this.f4812c;
        InterfaceC6355e interfaceC6355e = this.f4813d;
        Object obj2 = this.f4814e;
        switch (i10) {
            case 0:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) interfaceC6355e;
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) obj;
                w0Var.setValue(Boolean.FALSE);
                String str = ((C4802m) obj2).f23890b;
                if (str != null) {
                    interfaceC2139c2.invoke(str);
                }
                interfaceC2139c.invoke(Integer.valueOf(i11));
                break;
            case 1:
                C3850f c3850f = (C3850f) obj2;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) obj;
                InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) interfaceC6355e;
                C8791f c8791f = C8791f.f42457a;
                if (!C8791f.m16171d(c3850f.f19815e)) {
                    interfaceC2139c3.invoke(new C1492k(c3850f.f19813c));
                    break;
                } else {
                    w0Var.setValue(EnumC3312n.COPY);
                    interfaceC2141e.invoke(Integer.valueOf(i11), c3850f);
                    break;
                }
            case 2:
                C3850f c3850f2 = (C3850f) obj2;
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) interfaceC6355e;
                InterfaceC2142f interfaceC2142f = (InterfaceC2142f) obj;
                C8791f c8791f2 = C8791f.f42457a;
                if (!C8791f.m16171d(c3850f2.f19815e)) {
                    interfaceC2142f.invoke(c3850f2, String.valueOf(c3850f2.f19814d), c3850f2.f19813c);
                    break;
                } else {
                    w0Var.setValue(EnumC3312n.WHATSAPP);
                    interfaceC2141e2.invoke(Integer.valueOf(i11), c3850f2);
                    break;
                }
            case 3:
                C3850f c3850f3 = (C3850f) obj2;
                InterfaceC2141e interfaceC2141e3 = (InterfaceC2141e) interfaceC6355e;
                InterfaceC2143g interfaceC2143g = (InterfaceC2143g) obj;
                C8791f c8791f3 = C8791f.f42457a;
                if (!C8791f.m16171d(c3850f3.f19815e)) {
                    interfaceC2143g.mo1450c(Integer.valueOf(i11), String.valueOf(c3850f3.f19814d), c3850f3.f19813c, c3850f3);
                    break;
                } else {
                    w0Var.setValue(EnumC3312n.CALL);
                    interfaceC2141e3.invoke(Integer.valueOf(i11), c3850f3);
                    break;
                }
            default:
                w0Var.setValue((String) obj2);
                ((k2.w0) obj).setValue(Boolean.FALSE);
                ((InterfaceC2141e) interfaceC6355e).invoke((String) w0Var.getValue(), Integer.valueOf(i11));
                break;
        }
        return a0Var;
    }

    public /* synthetic */ e0(C3850f c3850f, k2.w0 w0Var, InterfaceC2141e interfaceC2141e, int i10, InterfaceC2139c interfaceC2139c) {
        this.f4810a = 1;
        this.f4814e = c3850f;
        this.f4811b = w0Var;
        this.f4815f = interfaceC2141e;
        this.f4812c = i10;
        this.f4813d = interfaceC2139c;
    }

    public /* synthetic */ e0(C3850f c3850f, k2.w0 w0Var, InterfaceC2141e interfaceC2141e, int i10, InterfaceC6355e interfaceC6355e, int i11) {
        this.f4810a = i11;
        this.f4814e = c3850f;
        this.f4811b = w0Var;
        this.f4813d = interfaceC2141e;
        this.f4812c = i10;
        this.f4815f = interfaceC6355e;
    }

    public /* synthetic */ e0(k2.w0 w0Var, C4802m c4802m, InterfaceC2139c interfaceC2139c, int i10, InterfaceC2139c interfaceC2139c2) {
        this.f4810a = 0;
        this.f4811b = w0Var;
        this.f4814e = c4802m;
        this.f4813d = interfaceC2139c;
        this.f4812c = i10;
        this.f4815f = interfaceC2139c2;
    }
}
