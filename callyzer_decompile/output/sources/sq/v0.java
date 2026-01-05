package sq;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import g2.vd;
import g2.xd;
import k2.C3966o;
import k2.InterfaceC3962k;
import k4.C3998s;
import og.af;
import pg.b9;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33287a;

    /* renamed from: b */
    public final /* synthetic */ int f33288b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f33289c;

    public /* synthetic */ v0(int i10, int i11, InterfaceC7879r interfaceC7879r) {
        this.f33287a = i11;
        this.f33288b = i10;
        this.f33289c = interfaceC7879r;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33287a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b1.m13113q(og.t0.m10920c(c3966o, this.f33288b), this.f33289c, 0L, null, null, 0, 0, 0L, null, g4.o0.m6461a(((vd) c3966o.m8618k(xd.f13268a)).f13056l, 0L, af.m10534c(14), C3998s.f20697g, null, null, 0L, 0L, null, 16777209), c3966o, 0, 508);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pg.i0.m11693a(b9.m11551a(this.f33288b, 0, c3966o2), "", this.f33289c, null, null, DefinitionKt.NO_Float_VALUE, null, c3966o2, 48, 56);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
