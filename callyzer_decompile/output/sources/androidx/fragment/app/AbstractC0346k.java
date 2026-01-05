package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public abstract class AbstractC0346k {

    /* renamed from: a */
    public final h2 f2605a;

    public AbstractC0346k(h2 operation) {
        AbstractC4154l.m8923f(operation, "operation");
        this.f2605a = operation;
    }

    /* renamed from: a */
    public final boolean m1204a() {
        l2 l2VarM1202a;
        h2 h2Var = this.f2605a;
        View view = h2Var.f2547c.mView;
        if (view != null) {
            l2.Companion.getClass();
            l2VarM1202a = j2.m1202a(view);
        } else {
            l2VarM1202a = null;
        }
        l2 l2Var = h2Var.f2545a;
        if (l2VarM1202a == l2Var) {
            return true;
        }
        l2 l2Var2 = l2.VISIBLE;
        return (l2VarM1202a == l2Var2 || l2Var == l2Var2) ? false : true;
    }
}
