package il;

import gl.C2627c;
import hl.C2964a;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import pg.fa;
import pg.ga;
import pg.na;
import pg.oa;
import sf.AbstractC6840z;
import ug.C7438i;
import ug.C7443n;
import ug.h4;
import ug.n4;
import ug.s1;
import ug.x1;
import ug.y1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: il.e */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC3297e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f17530a;

    /* renamed from: b */
    public final /* synthetic */ Object f17531b;

    /* renamed from: c */
    public final /* synthetic */ Object f17532c;

    public /* synthetic */ CallableC3297e(C2627c c2627c, C2964a c2964a) {
        this.f17530a = 0;
        this.f17531b = c2627c;
        this.f17532c = c2964a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ga gaVar;
        int i10 = this.f17530a;
        Object obj = this.f17532c;
        Object obj2 = this.f17531b;
        switch (i10) {
            case 0:
                AbstractC3294b abstractC3294b = (AbstractC3294b) obj2;
                C2964a c2964a = (C2964a) obj;
                abstractC3294b.getClass();
                HashMap map = ga.f28907f;
                oa.m11812b();
                int i11 = na.f29002a;
                oa.m11812b();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = ga.f28907f;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new ga("detectorTaskWithResource#run"));
                    }
                    gaVar = (ga) map2.get("detectorTaskWithResource#run");
                } else {
                    gaVar = fa.f28850g;
                }
                gaVar.mo11636h();
                try {
                    List listM6601b = abstractC3294b.f17522b.m6601b(c2964a);
                    gaVar.close();
                    return listM6601b;
                } catch (Throwable th2) {
                    try {
                        gaVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            case 1:
                s1 s1Var = (s1) obj;
                s1Var.f35819e.m13947B();
                C7443n c7443n = s1Var.f35819e.f35488c;
                h4.m13944U(c7443n);
                return c7443n.H0((String) obj2);
            case 2:
                s1 s1Var2 = (s1) obj;
                s1Var2.f35819e.m13947B();
                return new C7438i(s1Var2.f35819e.p0(((n4) obj2).f35697a));
            default:
                n4 n4Var = (n4) obj2;
                String str = n4Var.f35697a;
                AbstractC6840z.m13036g(str);
                h4 h4Var = (h4) obj;
                y1 y1VarM13964d = h4Var.m13964d(str);
                x1 x1Var = x1.ANALYTICS_STORAGE;
                if (y1VarM13964d.m14213i(x1Var) && y1.m14206c(100, n4Var.f35715v).m14213i(x1Var)) {
                    return h4Var.c0(n4Var).m14222E();
                }
                h4Var.mo326a().f35870p.m14140a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ CallableC3297e(s1 s1Var, Object obj, int i10) {
        this.f17530a = i10;
        this.f17531b = obj;
        this.f17532c = s1Var;
    }

    public CallableC3297e(h4 h4Var, n4 n4Var) {
        this.f17530a = 3;
        this.f17531b = n4Var;
        Objects.requireNonNull(h4Var);
        this.f17532c = h4Var;
    }
}
