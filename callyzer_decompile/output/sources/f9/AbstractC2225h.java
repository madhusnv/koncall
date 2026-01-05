package f9;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import c9.C0912g;
import c9.C0914i;
import c9.C0915j;
import c9.C0917l;
import c9.C0922q;
import c9.C0927v;
import i0.m0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import og.ja;
import og.pe;
import rw.AbstractC6663m;
import t8.C7077w;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f9.h */
/* loaded from: classes.dex */
public abstract class AbstractC2225h {

    /* renamed from: a */
    public static final /* synthetic */ int f10211a = 0;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    /* renamed from: a */
    public static final void m5929a(C0917l c0917l, C0927v c0927v, C0914i c0914i, ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C0922q c0922q = (C0922q) obj;
            C0915j c0915jM10706a = ja.m10706a(c0922q);
            String str = c0922q.f5622a;
            C0912g c0912gM2629i = c0914i.m2629i(c0915jM10706a);
            Integer numValueOf = c0912gM2629i != null ? Integer.valueOf(c0912gM2629i.f5583c) : null;
            c0917l.getClass();
            C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT name FROM workname WHERE work_spec_id=?");
            c8896yM16401j.mo9278q(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0917l.f5594b;
            workDatabase_Impl.m16388b();
            Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorM10840o.getCount());
                while (cursorM10840o.moveToNext()) {
                    arrayList2.add(cursorM10840o.getString(0));
                }
                cursorM10840o.close();
                c8896yM16401j.m16402u();
                String strM12748L = AbstractC6663m.m12748L(arrayList2, ",", null, null, null, 62);
                String strM12748L2 = AbstractC6663m.m12748L(c0927v.m2703k(str), ",", null, null, null, 62);
                StringBuilder sbM7383p = m0.m7383p("\n", str, "\t ");
                sbM7383p.append(c0922q.f5624c);
                sbM7383p.append("\t ");
                sbM7383p.append(numValueOf);
                sbM7383p.append("\t ");
                sbM7383p.append(c0922q.f5623b.name());
                sbM7383p.append("\t ");
                sbM7383p.append(strM12748L);
                sbM7383p.append("\t ");
                sbM7383p.append(strM12748L2);
                sbM7383p.append('\t');
                sb2.append(sbM7383p.toString());
            } catch (Throwable th2) {
                cursorM10840o.close();
                c8896yM16401j.m16402u();
                throw th2;
            }
        }
        AbstractC4154l.m8922e(sb2.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
