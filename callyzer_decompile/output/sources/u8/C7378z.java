package u8;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c9.C0908c;
import c9.C0913h;
import c9.C0914i;
import c9.C0922q;
import c9.C0925t;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import lv.C4535g;
import m8.C4680j;
import og.pe;
import rw.AbstractC6663m;
import t8.AbstractC7075u;
import t8.C7056b;
import t8.C7064j;
import t8.C7072r;
import t8.C7077w;
import t8.e0;
import tx.c0;
import tx.f1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.z */
/* loaded from: classes.dex */
public final class C7378z {

    /* renamed from: a */
    public final C0922q f35066a;

    /* renamed from: b */
    public final Context f35067b;

    /* renamed from: c */
    public final String f35068c;

    /* renamed from: d */
    public final C4367l f35069d;

    /* renamed from: e */
    public final C0914i f35070e;

    /* renamed from: f */
    public final C7056b f35071f;

    /* renamed from: g */
    public final C7077w f35072g;

    /* renamed from: h */
    public final C7356d f35073h;

    /* renamed from: i */
    public final WorkDatabase f35074i;

    /* renamed from: j */
    public final C0925t f35075j;

    /* renamed from: k */
    public final C0908c f35076k;

    /* renamed from: l */
    public final ArrayList f35077l;

    /* renamed from: m */
    public final String f35078m;

    /* renamed from: n */
    public final f1 f35079n;

    public C7378z(C4535g c4535g) {
        C0922q c0922q = (C0922q) c4535g.f22542f;
        this.f35066a = c0922q;
        this.f35067b = (Context) c4535g.f22544h;
        String str = c0922q.f5622a;
        this.f35068c = str;
        this.f35069d = (C4367l) c4535g.f22545i;
        this.f35070e = (C0914i) c4535g.f22539c;
        C7056b c7056b = (C7056b) c4535g.f22538b;
        this.f35071f = c7056b;
        this.f35072g = c7056b.f34108d;
        this.f35073h = (C7356d) c4535g.f22540d;
        WorkDatabase workDatabase = (WorkDatabase) c4535g.f22541e;
        this.f35074i = workDatabase;
        this.f35075j = workDatabase.mo1368C();
        this.f35076k = workDatabase.mo1370x();
        ArrayList arrayList = (ArrayList) c4535g.f22543g;
        this.f35077l = arrayList;
        this.f35078m = AbstractC1452a.m4564k(m0.m7383p("Work [ id=", str, ", tags={ "), AbstractC6663m.m12748L(arrayList, ",", null, null, null, 62), " } ]");
        this.f35079n = c0.m13480c();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13790a(u8.C7378z r22, ww.AbstractC8193c r23) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.C7378z.m13790a(u8.z, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void m13791b(int i10) {
        e0 e0Var = e0.ENQUEUED;
        C0925t c0925t = this.f35075j;
        String str = this.f35068c;
        c0925t.m2695x(e0Var, str);
        this.f35072g.getClass();
        c0925t.m2693v(str, System.currentTimeMillis());
        c0925t.m2690s(this.f35066a.f5643v, str);
        c0925t.m2687p(str, -1L);
        c0925t.m2696y(i10, str);
    }

    /* renamed from: c */
    public final void m13792c() {
        this.f35072g.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0925t c0925t = this.f35075j;
        String str = this.f35068c;
        c0925t.m2693v(str, jCurrentTimeMillis);
        c0925t.m2695x(e0.ENQUEUED, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0925t.f5651a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) c0925t.f5660j;
        C4680j c4680jM347a = c0913h.m347a();
        c4680jM347a.mo9278q(1, str);
        try {
            workDatabase_Impl.m16389c();
            try {
                c4680jM347a.m9573h();
                workDatabase_Impl.m16399v();
                c0913h.m355i(c4680jM347a);
                c0925t.m2690s(this.f35066a.f5643v, str);
                workDatabase_Impl.m16388b();
                c0913h = (C0913h) c0925t.f5656f;
                c4680jM347a = c0913h.m347a();
                c4680jM347a.mo9278q(1, str);
                try {
                    workDatabase_Impl.m16389c();
                    try {
                        c4680jM347a.m9573h();
                        workDatabase_Impl.m16399v();
                        c0913h.m355i(c4680jM347a);
                        c0925t.m2687p(str, -1L);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: d */
    public final void m13793d(AbstractC7075u result) {
        AbstractC4154l.m8923f(result, "result");
        String str = this.f35068c;
        ArrayList arrayListM10835j = pe.m10835j(str);
        while (true) {
            boolean zIsEmpty = arrayListM10835j.isEmpty();
            C0925t c0925t = this.f35075j;
            if (zIsEmpty) {
                C7064j c7064j = ((C7072r) result).f34170a;
                AbstractC4154l.m8922e(c7064j, "failure.outputData");
                c0925t.m2690s(this.f35066a.f5643v, str);
                c0925t.m2694w(str, c7064j);
                return;
            }
            String str2 = (String) AbstractC6663m.m12757U(arrayListM10835j);
            if (c0925t.m2684m(str2) != e0.CANCELLED) {
                c0925t.m2695x(e0.FAILED, str2);
            }
            arrayListM10835j.addAll(this.f35076k.m2571p(str2));
        }
    }
}
