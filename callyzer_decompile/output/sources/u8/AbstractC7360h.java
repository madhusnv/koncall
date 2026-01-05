package u8;

import androidx.work.impl.WorkDatabase;
import c9.C0922q;
import c9.C0925t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t8.C7056b;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.h */
/* loaded from: classes.dex */
public abstract class AbstractC7360h {

    /* renamed from: a */
    public static final /* synthetic */ int f35020a = 0;

    static {
        C7077w.m13372b("Schedulers");
    }

    /* renamed from: a */
    public static void m13778a(C0925t c0925t, C7077w c7077w, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            c7077w.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c0925t.m2687p(((C0922q) obj).f5622a, jCurrentTimeMillis);
            }
        }
    }

    /* renamed from: b */
    public static void m13779b(C7056b c7056b, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C0925t c0925tMo1368C = workDatabase.mo1368C();
        workDatabase.m16389c();
        try {
            ArrayList arrayListM2681j = c0925tMo1368C.m2681j();
            m13778a(c0925tMo1368C, c7056b.f34108d, arrayListM2681j);
            ArrayList arrayListM2680i = c0925tMo1368C.m2680i(c7056b.f34114j);
            m13778a(c0925tMo1368C, c7056b.f34108d, arrayListM2680i);
            arrayListM2680i.addAll(arrayListM2681j);
            ArrayList arrayListM2678g = c0925tMo1368C.m2678g();
            workDatabase.m16399v();
            workDatabase.m16395r();
            if (arrayListM2680i.size() > 0) {
                C0922q[] c0922qArr = (C0922q[]) arrayListM2680i.toArray(new C0922q[arrayListM2680i.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC7358f interfaceC7358f = (InterfaceC7358f) it.next();
                    if (interfaceC7358f.mo13775c()) {
                        interfaceC7358f.mo13777e(c0922qArr);
                    }
                }
            }
            if (arrayListM2678g.size() > 0) {
                C0922q[] c0922qArr2 = (C0922q[]) arrayListM2678g.toArray(new C0922q[arrayListM2678g.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC7358f interfaceC7358f2 = (InterfaceC7358f) it2.next();
                    if (!interfaceC7358f2.mo13775c()) {
                        interfaceC7358f2.mo13777e(c0922qArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.m16395r();
            throw th2;
        }
    }
}
