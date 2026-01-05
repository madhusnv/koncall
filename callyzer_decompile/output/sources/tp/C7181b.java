package tp;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import qp.C6272i;
import qw.a0;
import vp.AbstractC7728a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tp.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7181b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f34458a;

    /* renamed from: b */
    public final /* synthetic */ C6272i f34459b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f34460c;

    public /* synthetic */ C7181b(C6272i c6272i, InterfaceC2141e interfaceC2141e, int i10) {
        this.f34458a = i10;
        this.f34459b = c6272i;
        this.f34460c = interfaceC2141e;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f34458a) {
            case 0:
                num.getClass();
                AbstractC7185f.m13442a(this.f34459b, this.f34460c, interfaceC3962k, C3953b.m8496A(49));
                break;
            case 1:
                num.getClass();
                AbstractC7185f.m13444c(this.f34459b, this.f34460c, interfaceC3962k, C3953b.m8496A(49));
                break;
            case 2:
                num.getClass();
                AbstractC7185f.m13445d(this.f34459b, this.f34460c, interfaceC3962k, C3953b.m8496A(49));
                break;
            case 3:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7185f.m13442a(this.f34459b, this.f34460c, c3966o, 48);
                } else {
                    c3966o.m8601S();
                }
                return a0.f30746a;
            case 4:
                int iIntValue2 = num.intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC7185f.m13444c(this.f34459b, this.f34460c, c3966o2, 48);
                } else {
                    c3966o2.m8601S();
                }
                return a0.f30746a;
            case 5:
                int iIntValue3 = num.intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC7185f.m13445d(this.f34459b, this.f34460c, c3966o3, 48);
                } else {
                    c3966o3.m8601S();
                }
                return a0.f30746a;
            case 6:
                num.getClass();
                AbstractC7728a.m14715a(this.f34459b, this.f34460c, interfaceC3962k, C3953b.m8496A(49));
                break;
            case 7:
                num.getClass();
                AbstractC7728a.m14719e(this.f34459b, this.f34460c, interfaceC3962k, C3953b.m8496A(49));
                break;
            case 8:
                num.getClass();
                AbstractC7728a.m14720f(this.f34459b, this.f34460c, interfaceC3962k, C3953b.m8496A(49));
                break;
            case 9:
                int iIntValue4 = num.intValue();
                C3966o c3966o4 = (C3966o) interfaceC3962k;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC7728a.m14715a(this.f34459b, this.f34460c, c3966o4, 48);
                } else {
                    c3966o4.m8601S();
                }
                return a0.f30746a;
            case 10:
                int iIntValue5 = num.intValue();
                C3966o c3966o5 = (C3966o) interfaceC3962k;
                if (c3966o5.m8598P(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC7728a.m14719e(this.f34459b, this.f34460c, c3966o5, 48);
                } else {
                    c3966o5.m8601S();
                }
                return a0.f30746a;
            default:
                int iIntValue6 = num.intValue();
                C3966o c3966o6 = (C3966o) interfaceC3962k;
                if (c3966o6.m8598P(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC7728a.m14720f(this.f34459b, this.f34460c, c3966o6, 48);
                } else {
                    c3966o6.m8601S();
                }
                return a0.f30746a;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C7181b(C6272i c6272i, InterfaceC2141e interfaceC2141e, int i10, int i11) {
        this.f34458a = i11;
        this.f34459b = c6272i;
        this.f34460c = interfaceC2141e;
    }
}
