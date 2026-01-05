package og;

import al.EnumC0185m;
import android.os.Bundle;
import android.os.SystemClock;
import b2.C0554l;
import gl.C2629e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26925a;

    /* renamed from: b */
    public final /* synthetic */ long f26926b;

    /* renamed from: c */
    public final /* synthetic */ Object f26927c;

    /* renamed from: d */
    public final /* synthetic */ Object f26928d;

    /* renamed from: e */
    public final /* synthetic */ Object f26929e;

    /* renamed from: f */
    public final /* synthetic */ Object f26930f;

    public /* synthetic */ wg(Object obj, String str, String str2, Object obj2, long j6, int i10) {
        this.f26925a = i10;
        this.f26927c = str;
        this.f26928d = str2;
        this.f26929e = obj2;
        this.f26926b = j6;
        this.f26930f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26925a) {
            case 0:
                final yg ygVar = (yg) this.f26927c;
                final fc fcVar = (fc) this.f26928d;
                w0 w0Var = (w0) this.f26929e;
                final C8986c c8986c = (C8986c) this.f26930f;
                HashMap map = ygVar.f26978j;
                if (!map.containsKey(fcVar)) {
                    map.put(fcVar, new C5375p());
                }
                C5375p c5375p = (C5375p) map.get(fcVar);
                Long lValueOf = Long.valueOf(this.f26926b);
                C5381v c5381v = c5375p.f26714c;
                Collection collection = (Collection) c5381v.get(w0Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    c5381v.put(w0Var, arrayList);
                } else {
                    collection.add(lValueOf);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (ygVar.m11077d(fcVar, jElapsedRealtime)) {
                    ygVar.f26977i.put(fcVar, Long.valueOf(jElapsedRealtime));
                    EnumC0185m.INSTANCE.execute(new Runnable() { // from class: og.vg
                        @Override // java.lang.Runnable
                        public final void run() {
                            yg ygVar2 = ygVar;
                            HashMap map2 = ygVar2.f26978j;
                            fc fcVar2 = fcVar;
                            C5375p c5375p2 = (C5375p) map2.get(fcVar2);
                            if (c5375p2 != null) {
                                Iterator it = ((C5367h) c5375p2.m10788b()).iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    Object arrayList2 = (Collection) c5375p2.f26714c.get(next);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList(3);
                                    }
                                    List list = (List) arrayList2;
                                    ArrayList arrayList3 = new ArrayList(list instanceof RandomAccess ? new C5370k(c5375p2, next, list, null) : new C5372m(c5375p2, next, list, null));
                                    Collections.sort(arrayList3);
                                    p020v.x0 x0Var = new p020v.x0(7, false);
                                    int size = arrayList3.size();
                                    long jLongValue = 0;
                                    int i10 = 0;
                                    while (i10 < size) {
                                        Object obj = arrayList3.get(i10);
                                        i10++;
                                        jLongValue += ((Long) obj).longValue();
                                    }
                                    x0Var.f36756d = Long.valueOf((jLongValue / arrayList3.size()) & Long.MAX_VALUE);
                                    x0Var.f36754b = Long.valueOf(yg.m11074a(arrayList3, 100.0d) & Long.MAX_VALUE);
                                    x0Var.f36759g = Long.valueOf(yg.m11074a(arrayList3, 75.0d) & Long.MAX_VALUE);
                                    x0Var.f36758f = Long.valueOf(yg.m11074a(arrayList3, 50.0d) & Long.MAX_VALUE);
                                    x0Var.f36757e = Long.valueOf(yg.m11074a(arrayList3, 25.0d) & Long.MAX_VALUE);
                                    x0Var.f36755c = Long.valueOf(yg.m11074a(arrayList3, 0.0d) & Long.MAX_VALUE);
                                    kb kbVar = new kb(x0Var);
                                    int size2 = arrayList3.size();
                                    C2629e c2629e = (C2629e) c8986c.f43336b;
                                    w0 w0Var2 = (w0) next;
                                    p020v.x0 x0Var2 = new p020v.x0(8, false);
                                    x0Var2.f36756d = c2629e.f14218i ? dc.TYPE_THICK : dc.TYPE_THIN;
                                    q0 q0Var = new q0();
                                    q0Var.f26757b = Integer.valueOf(size2 & Integer.MAX_VALUE);
                                    q0Var.f26756a = w0Var2;
                                    q0Var.f26758c = kbVar;
                                    x0Var2.f36759g = new x0(q0Var);
                                    EnumC0185m.INSTANCE.execute(new c6.b1(ygVar2, new C0554l(x0Var2, 0), fcVar2, ygVar2.m11076c(), 2));
                                }
                                map2.remove(fcVar2);
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                String str = (String) this.f26928d;
                ug.s1 s1Var = (ug.s1) this.f26930f;
                String str2 = (String) this.f26927c;
                if (str2 == null) {
                    ug.h4 h4Var = s1Var.f35819e;
                    h4Var.mo327b().mo325M();
                    String str3 = h4Var.f35482L;
                    if (str3 == null || str3.equals(str)) {
                        h4Var.f35482L = str;
                        h4Var.f35481K = null;
                        return;
                    }
                    return;
                }
                ug.x2 x2Var = new ug.x2((String) this.f26929e, str2, this.f26926b);
                ug.h4 h4Var2 = s1Var.f35819e;
                h4Var2.mo327b().mo325M();
                String str4 = h4Var2.f35482L;
                if (str4 != null) {
                    str4.equals(str);
                }
                h4Var2.f35482L = str;
                h4Var2.f35481K = x2Var;
                return;
            case 2:
                ug.q2 q2Var = (ug.q2) this.f26930f;
                String str5 = (String) this.f26927c;
                String str6 = (String) this.f26928d;
                q2Var.m14126X(this.f26926b, this.f26929e, str5, str6);
                return;
            default:
                ug.b3 b3Var = (ug.b3) this.f26930f;
                Bundle bundle = (Bundle) this.f26927c;
                ug.x2 x2Var2 = (ug.x2) this.f26928d;
                ug.x2 x2Var3 = (ug.x2) this.f26929e;
                b3Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                ug.l4 l4Var = ((ug.n1) b3Var.f482a).f35672j;
                ug.n1.m14083i(l4Var);
                b3Var.m13846W(x2Var2, x2Var3, this.f26926b, true, l4Var.m14032U("screen_view", bundle, null, false));
                return;
        }
    }

    public /* synthetic */ wg(yg ygVar, fc fcVar, w0 w0Var, long j6, C8986c c8986c) {
        this.f26925a = 0;
        this.f26927c = ygVar;
        this.f26928d = fcVar;
        this.f26929e = w0Var;
        this.f26926b = j6;
        this.f26930f = c8986c;
    }

    public wg(ug.b3 b3Var, Bundle bundle, ug.x2 x2Var, ug.x2 x2Var2, long j6) {
        this.f26925a = 3;
        this.f26927c = bundle;
        this.f26928d = x2Var;
        this.f26929e = x2Var2;
        this.f26926b = j6;
        Objects.requireNonNull(b3Var);
        this.f26930f = b3Var;
    }
}
