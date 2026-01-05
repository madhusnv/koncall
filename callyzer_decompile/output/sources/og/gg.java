package og;

import android.view.View;
import c9.C0917l;
import com.websoptimization.callyzerbiz.R;
import cp.C1475f;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g8.InterfaceC2547g;
import kotlin.jvm.internal.AbstractC4154l;
import t2.AbstractC7013l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class gg {
    /* renamed from: a */
    public static final InterfaceC2547g m10674a(View view) {
        AbstractC4154l.m8923f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            InterfaceC2547g interfaceC2547g = tag instanceof InterfaceC2547g ? (InterfaceC2547g) tag : null;
            if (interfaceC2547g != null) {
                return interfaceC2547g;
            }
            Object objM10801c = oe.m10801c(view);
            view = objM10801c instanceof View ? (View) objM10801c : null;
        }
        return null;
    }

    /* renamed from: b */
    public static final C0917l m10675b(InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c) {
        C1475f c1475f = new C1475f(interfaceC2141e);
        kotlin.jvm.internal.d0.m8907d(1, interfaceC2139c);
        C0917l c0917l = AbstractC7013l.f33949a;
        return new C0917l(16, c1475f, interfaceC2139c);
    }

    /* renamed from: c */
    public static final void m10676c(View view, InterfaceC2547g interfaceC2547g) {
        AbstractC4154l.m8923f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC2547g);
    }
}
