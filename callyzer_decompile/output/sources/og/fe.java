package og;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import bt.C0761f;
import d3.C1565s;
import ex.InterfaceC2137a;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import s2.AbstractC6740i;
import uv.AbstractC7554g;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.C7876o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class fe {
    /* renamed from: a */
    public static final void m10651a(int i10, InterfaceC2137a onBeltClick, InterfaceC3962k interfaceC3962k, int i11) {
        AbstractC4154l.m8923f(onBeltClick, "onBeltClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1141557071);
        int i12 = (c3966o.m8612e(i10) ? 4 : 2) | i11 | (c3966o.m8616i(onBeltClick) ? 32 : 16);
        if (c3966o.m8598P(i12 & 1, (i12 & 19) != 18)) {
            C7860d c7860dM14841b = AbstractC7861e.m14841b(10);
            g2.p9.m6240d(pg.c0.m11560a(AbstractC0242a.m656j(AbstractC0245d.m668e(AbstractC0237a.m637e(C7876o.f37669a, false, null, null, onBeltClick, 7), 1.0f), 5), 1, C1565s.m5186b(0.5f, 14, g2.t6.m6310a(c3966o).f12962i), c7860dM14841b), c7860dM14841b, g2.p9.m6253q(AbstractC7554g.m14301b(c3966o).f36378F, c3966o, 0), null, null, AbstractC6740i.m12902d(-1408617857, new qr.a0(i10, 1), c3966o), c3966o, 196608, 24);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0761f(i10, i11, 4, onBeltClick);
        }
    }

    /* renamed from: b */
    public static Application m10652b(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }
}
