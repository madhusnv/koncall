package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0347l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2609a = 1;

    /* renamed from: b */
    public final /* synthetic */ Object f2610b;

    /* renamed from: c */
    public final /* synthetic */ Object f2611c;

    public /* synthetic */ RunnableC0347l(c2 c2Var, View view, Rect rect) {
        this.f2610b = view;
        this.f2611c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2609a) {
            case 0:
                h2 operation = (h2) this.f2610b;
                C0349n this$0 = (C0349n) this.f2611c;
                AbstractC4154l.m8923f(operation, "$operation");
                AbstractC4154l.m8923f(this$0, "this$0");
                if (j1.m1152K(2)) {
                    operation.toString();
                }
                operation.m1139c(this$0);
                break;
            default:
                c2.m1123g((View) this.f2610b, (Rect) this.f2611c);
                break;
        }
    }

    public /* synthetic */ RunnableC0347l(h2 h2Var, C0349n c0349n) {
        this.f2610b = h2Var;
        this.f2611c = c0349n;
    }
}
