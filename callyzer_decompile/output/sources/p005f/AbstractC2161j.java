package p005f;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.websoptimization.callyzerbiz.R;
import k2.C3966o;
import k2.C3977z;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import og.oe;
import p004e.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.j */
/* loaded from: classes.dex */
public abstract class AbstractC2161j {

    /* renamed from: a */
    public static final C3977z f10018a = new C3977z(C2155d.f10006d);

    /* renamed from: a */
    public static e0 m5822a(InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        e0 e0Var = (e0) c3966o.m8618k(f10018a);
        Object obj = null;
        if (e0Var == null) {
            c3966o.m8607Y(544166745);
            View view = (View) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2138f);
            AbstractC4154l.m8923f(view, "<this>");
            while (true) {
                if (view == null) {
                    e0Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                e0 e0Var2 = tag instanceof e0 ? (e0) tag : null;
                if (e0Var2 != null) {
                    e0Var = e0Var2;
                    break;
                }
                Object objM10801c = oe.m10801c(view);
                view = objM10801c instanceof View ? (View) objM10801c : null;
            }
            c3966o.m8623p(false);
        } else {
            c3966o.m8607Y(544164296);
            c3966o.m8623p(false);
        }
        if (e0Var != null) {
            c3966o.m8607Y(544164377);
            c3966o.m8623p(false);
            return e0Var;
        }
        c3966o.m8607Y(544168748);
        Context baseContext = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof e0) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        e0 e0Var3 = (e0) obj;
        c3966o.m8623p(false);
        return e0Var3;
    }
}
