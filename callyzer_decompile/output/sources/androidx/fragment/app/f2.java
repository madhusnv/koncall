package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class f2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2528a;

    /* renamed from: b */
    public final /* synthetic */ C0352q f2529b;

    /* renamed from: c */
    public final /* synthetic */ h2 f2530c;

    public /* synthetic */ f2(C0352q c0352q, h2 h2Var, int i10) {
        this.f2528a = i10;
        this.f2529b = c0352q;
        this.f2530c = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2528a) {
            case 0:
                C0352q c0352q = this.f2529b;
                ArrayList arrayList = c0352q.f2675b;
                h2 h2Var = this.f2530c;
                if (arrayList.contains(h2Var)) {
                    l2 l2Var = h2Var.f2545a;
                    View view = h2Var.f2547c.mView;
                    AbstractC4154l.m8922e(view, "operation.fragment.mView");
                    l2Var.applyState(view, c0352q.f2674a);
                    break;
                }
                break;
            case 1:
                C0352q this$0 = this.f2529b;
                AbstractC4154l.m8923f(this$0, "this$0");
                h2 operation = this.f2530c;
                AbstractC4154l.m8923f(operation, "$operation");
                this$0.m1234a(operation);
                break;
            default:
                C0352q c0352q2 = this.f2529b;
                ArrayList arrayList2 = c0352q2.f2675b;
                h2 h2Var2 = this.f2530c;
                arrayList2.remove(h2Var2);
                c0352q2.f2676c.remove(h2Var2);
                break;
        }
    }
}
