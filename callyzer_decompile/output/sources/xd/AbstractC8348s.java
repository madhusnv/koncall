package xd;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ge.C2576h;
import ge.C2577i;
import he.C2914e;
import he.C2916g;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import s4.AbstractC6746b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.s */
/* loaded from: classes.dex */
public abstract class AbstractC8348s {

    /* renamed from: a */
    public static final long f39966a = AbstractC6746b.m12930h(0, 0, 0, 0);

    /* renamed from: b */
    public static final C2914e f39967b;

    static {
        C2916g c2916g = C2916g.f15947c;
        f39967b = new C2914e();
    }

    /* renamed from: a */
    public static final C2577i m15528a(Object obj, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8608Z(1087186730);
        if (obj instanceof C2577i) {
            C2577i c2577i = (C2577i) obj;
            c3966o.m8623p(false);
            return c2577i;
        }
        Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
        c3966o.m8608Z(-1245195153);
        boolean zM8614g = c3966o.m8614g(context) | c3966o.m8614g(obj);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            C2576h c2576h = new C2576h(context);
            c2576h.f14004c = obj;
            objM8596M = c2576h.m6574a();
            c3966o.j0(objM8596M);
        }
        C2577i c2577i2 = (C2577i) objM8596M;
        c3966o.m8623p(false);
        c3966o.m8623p(false);
        return c2577i2;
    }
}
