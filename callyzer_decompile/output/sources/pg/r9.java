package pg;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d7.InterfaceC1637j;
import fw.C2392f;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import p004e.AbstractActivityC1878m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r9 {

    /* renamed from: a */
    public static final /* synthetic */ int f29049a = 0;

    /* renamed from: a */
    public static final C2392f m11854a(d7.c1 c1Var, InterfaceC3962k interfaceC3962k) {
        C2392f c2392fM6075d;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8608Z(1770922558);
        if (c1Var instanceof InterfaceC1637j) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            d7.y0 delegateFactory = ((InterfaceC1637j) c1Var).getDefaultViewModelProviderFactory();
            AbstractC4154l.m8923f(context, "context");
            AbstractC4154l.m8923f(delegateFactory, "delegateFactory");
            while (context instanceof ContextWrapper) {
                if (context instanceof AbstractActivityC1878m) {
                    c2392fM6075d = C2392f.m6075d((AbstractActivityC1878m) context, delegateFactory);
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    AbstractC4154l.m8922e(context, "ctx.baseContext");
                }
            }
            throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
        }
        c2392fM6075d = null;
        c3966o.m8623p(false);
        return c2392fM6075d;
    }
}
