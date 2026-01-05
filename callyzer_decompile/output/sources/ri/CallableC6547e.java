package ri;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import l1.C4327p;
import qi.RunnableC6224g;
import u8.C7356d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ri.e */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC6547e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f31394a;

    /* renamed from: b */
    public final /* synthetic */ Object f31395b;

    /* renamed from: c */
    public final /* synthetic */ Object f31396c;

    /* renamed from: d */
    public final /* synthetic */ Object f31397d;

    public /* synthetic */ CallableC6547e(int i10, Object obj, Object obj2, Object obj3) {
        this.f31394a = i10;
        this.f31395b = obj;
        this.f31396c = obj2;
        this.f31397d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f31394a) {
            case 0:
                return ((ScheduledExecutorServiceC6548f) this.f31395b).f31398a.submit(new RunnableC6224g(4, (Callable) this.f31396c, (C4327p) this.f31397d));
            default:
                C7356d c7356d = (C7356d) this.f31395b;
                ArrayList arrayList = (ArrayList) this.f31396c;
                String str = (String) this.f31397d;
                WorkDatabase workDatabase = c7356d.f35007e;
                arrayList.addAll(workDatabase.mo1369D().m2703k(str));
                return workDatabase.mo1368C().m2685n(str);
        }
    }
}
