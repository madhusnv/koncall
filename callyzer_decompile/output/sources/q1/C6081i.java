package q1;

import b2.C0554l;
import ex.InterfaceC2141e;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import r1.C6424i;
import r1.C6427l;
import r1.C6428m;
import s1.C6713h;
import s1.InterfaceC6728w;
import t1.C6986k;
import t1.C6990o;
import t1.C6994s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.i */
/* loaded from: classes.dex */
public final class C6081i extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29654a;

    /* renamed from: b */
    public final /* synthetic */ int f29655b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6728w f29656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6081i(InterfaceC6728w interfaceC6728w, int i10, int i11) {
        super(2);
        this.f29654a = i11;
        this.f29656c = interfaceC6728w;
        this.f29655b = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29654a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Number) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C6082j c6082j = (C6082j) this.f29656c;
                    C0554l c0554l = c6082j.f29658b.f29652b;
                    int i10 = this.f29655b;
                    C6713h c6713hM1636e = c0554l.m1636e(i10);
                    ((C6078f) c6713hM1636e.f32070c).f29649c.mo1450c(c6082j.f29659c, Integer.valueOf(i10 - c6713hM1636e.f32068a), c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0554l c0554l2 = ((C6427l) this.f29656c).f30988b.f30986c;
                    int i11 = this.f29655b;
                    C6713h c6713hM1636e2 = c0554l2.m1636e(i11);
                    ((C6424i) c6713hM1636e2.f32070c).f30981c.mo1450c(C6428m.f30990a, Integer.valueOf(i11 - c6713hM1636e2.f32068a), c3966o2, 6);
                } else {
                    c3966o2.m8601S();
                }
                break;
            default:
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0554l c0554lMo12097k = ((C6990o) this.f29656c).f33830b.mo12097k();
                    int i12 = this.f29655b;
                    C6713h c6713hM1636e3 = c0554lMo12097k.m1636e(i12);
                    ((C6986k) c6713hM1636e3.f32070c).f33808b.mo1450c(C6994s.f33870a, Integer.valueOf(i12 - c6713hM1636e3.f32068a), c3966o3, 0);
                } else {
                    c3966o3.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
