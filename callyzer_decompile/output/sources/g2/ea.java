package g2;

import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.NoWhenBranchMatchedException;
import w1.AbstractC7861e;
import w1.C7858b;
import w1.C7860d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ea {

    /* renamed from: a */
    public static final k2.i2 f11475a = new k2.i2(w1.f13088v);

    /* renamed from: a */
    public static final d3.l0 m6134a(j2.g0 g0Var, InterfaceC3962k interfaceC3962k) {
        ca caVar = (ca) ((C3966o) interfaceC3962k).m8618k(f11475a);
        switch (da.f11400a[g0Var.ordinal()]) {
            case 1:
                return caVar.f11322e;
            case 2:
                return m6135b(caVar.f11322e);
            case 3:
                return caVar.f11318a;
            case 4:
                return m6135b(caVar.f11318a);
            case 5:
                return AbstractC7861e.f37635a;
            case 6:
                return caVar.f11321d;
            case 7:
                float f6 = (float) 0.0d;
                return C7860d.m14839a(caVar.f11321d, new C7858b(f6), null, null, new C7858b(f6), 6);
            case 8:
                return m6135b(caVar.f11321d);
            case 9:
                return caVar.f11320c;
            case 10:
                return d3.h0.f7748a;
            case 11:
                return caVar.f11319b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public static final C7860d m6135b(C7860d c7860d) {
        float f6 = (float) 0.0d;
        return C7860d.m14839a(c7860d, null, null, new C7858b(f6), new C7858b(f6), 3);
    }
}
