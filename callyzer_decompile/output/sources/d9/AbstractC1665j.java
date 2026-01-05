package d9;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c9.C0908c;
import c9.C0913h;
import c9.C0925t;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4680j;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6663m;
import t8.C7056b;
import t8.C7077w;
import t8.C7079y;
import t8.e0;
import u8.C7356d;
import u8.C7365m;
import u8.C7368p;
import u8.C7378z;
import u8.InterfaceC7358f;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.j */
/* loaded from: classes.dex */
public abstract class AbstractC1665j {

    /* renamed from: a */
    public static final int[] f8188a = {13, 15, 14};

    /* renamed from: a */
    public static final void m5376a(String str, C7368p c7368p) {
        C7378z c7378zM13770b;
        WorkDatabase workDatabase = c7368p.f35045c;
        AbstractC4154l.m8922e(workDatabase, "workManagerImpl.workDatabase");
        C0925t c0925tMo1368C = workDatabase.mo1368C();
        C0908c c0908cMo1370x = workDatabase.mo1370x();
        ArrayList arrayListM10835j = pe.m10835j(str);
        while (!arrayListM10835j.isEmpty()) {
            String str2 = (String) AbstractC6663m.m12757U(arrayListM10835j);
            e0 e0VarM2684m = c0925tMo1368C.m2684m(str2);
            if (e0VarM2684m != e0.SUCCEEDED && e0VarM2684m != e0.FAILED) {
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0925tMo1368C.f5651a;
                workDatabase_Impl.m16388b();
                C0913h c0913h = (C0913h) c0925tMo1368C.f5655e;
                C4680j c4680jM347a = c0913h.m347a();
                c4680jM347a.mo9278q(1, str2);
                try {
                    workDatabase_Impl.m16389c();
                    try {
                        c4680jM347a.m9573h();
                        workDatabase_Impl.m16399v();
                    } finally {
                    }
                } finally {
                    c0913h.m355i(c4680jM347a);
                }
            }
            arrayListM10835j.addAll(c0908cMo1370x.m2571p(str2));
        }
        C7356d c7356d = c7368p.f35048f;
        AbstractC4154l.m8922e(c7356d, "workManagerImpl.processor");
        synchronized (c7356d.f35013k) {
            C7077w.m13371a().getClass();
            c7356d.f35011i.add(str);
            c7378zM13770b = c7356d.m13770b(str);
        }
        C7356d.m13768d(c7378zM13770b, 1);
        Iterator it = c7368p.f35047e.iterator();
        while (it.hasNext()) {
            ((InterfaceC7358f) it.next()).mo13776d(str);
        }
    }

    /* renamed from: b */
    public static final void m5377b(WorkDatabase workDatabase, C7056b configuration, C7365m c7365m) {
        int i10;
        AbstractC4154l.m8923f(workDatabase, "workDatabase");
        AbstractC4154l.m8923f(configuration, "configuration");
        ArrayList arrayListM10835j = pe.m10835j(c7365m);
        int i11 = 0;
        while (!arrayListM10835j.isEmpty()) {
            C7365m c7365m2 = (C7365m) AbstractC6663m.m12757U(arrayListM10835j);
            List list = c7365m2.f35032e;
            AbstractC4154l.m8922e(list, "current.work");
            if (list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((C7079y) it.next()).f34178b.f5631j.m13352b() && (i10 = i10 + 1) < 0) {
                        pe.m10841p();
                        throw null;
                    }
                }
            }
            i11 += i10;
            List list2 = c7365m2.f35035h;
            if (list2 != null) {
                arrayListM10835j.addAll(list2);
            }
        }
        if (i11 == 0) {
            return;
        }
        C0925t c0925tMo1368C = workDatabase.mo1368C();
        c0925tMo1368C.getClass();
        C8896y c8896yM16401j = C8896y.m16401j(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0925tMo1368C.f5651a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            int i12 = cursorM10840o.moveToFirst() ? cursorM10840o.getInt(0) : 0;
            cursorM10840o.close();
            c8896yM16401j.m16402u();
            int i13 = configuration.f34113i;
            if (i12 + i11 > i13) {
                throw new IllegalArgumentException(AbstractC5601a.m11233d(i11, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", AbstractC1452a.m4566m(i13, i12, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
            }
        } catch (Throwable th2) {
            cursorM10840o.close();
            c8896yM16401j.m16402u();
            throw th2;
        }
    }
}
