package st;

import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.o1;
import qt.C6314i;
import qw.a0;
import sq.b1;
import tt.C7224g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: st.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6938a implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f33570a;

    /* renamed from: b */
    public final /* synthetic */ C7224g f33571b;

    public /* synthetic */ C6938a(C7224g c7224g, int i10) {
        this.f33570a = i10;
        this.f33571b = c7224g;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f33570a) {
            case 0:
                o1 AppBar = (o1) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(AppBar, "$this$AppBar");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C7224g c7224g = this.f33571b;
                    boolean zM8616i = c3966o.m8616i(c7224g);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8616i || objM8596M == C3961j.f20408a) {
                        objM8596M = new C6939b(c7224g, 4);
                        c3966o.j0(objM8596M);
                    }
                    b1.a0((InterfaceC2137a) objM8596M, c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                String cc2 = (String) obj;
                String number = (String) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(cc2, "cc");
                AbstractC4154l.m8923f(number, "number");
                this.f33571b.m13453h(new C6314i(number, cc2, iIntValue2));
                break;
        }
        return a0.f30746a;
    }
}
