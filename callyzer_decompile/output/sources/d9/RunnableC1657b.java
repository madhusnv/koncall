package d9;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c9.C0925t;
import java.util.ArrayList;
import og.pe;
import u8.C7368p;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1657b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8166a;

    /* renamed from: b */
    public final /* synthetic */ WorkDatabase f8167b;

    /* renamed from: c */
    public final /* synthetic */ String f8168c;

    /* renamed from: d */
    public final /* synthetic */ C7368p f8169d;

    public /* synthetic */ RunnableC1657b(WorkDatabase workDatabase, String str, C7368p c7368p, int i10) {
        this.f8166a = i10;
        this.f8167b = workDatabase;
        this.f8168c = str;
        this.f8169d = c7368p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8896y c8896yM16401j;
        Cursor cursorM10840o;
        switch (this.f8166a) {
            case 0:
                C0925t c0925tMo1368C = this.f8167b.mo1368C();
                c0925tMo1368C.getClass();
                c8896yM16401j = C8896y.m16401j(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                c8896yM16401j.mo9278q(1, this.f8168c);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0925tMo1368C.f5651a;
                workDatabase_Impl.m16388b();
                int i10 = 0;
                cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorM10840o.getCount());
                    while (cursorM10840o.moveToNext()) {
                        arrayList.add(cursorM10840o.getString(0));
                    }
                    cursorM10840o.close();
                    c8896yM16401j.m16402u();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        AbstractC1665j.m5376a((String) obj, this.f8169d);
                    }
                    return;
                } finally {
                }
            default:
                C0925t c0925tMo1368C2 = this.f8167b.mo1368C();
                c0925tMo1368C2.getClass();
                c8896yM16401j = C8896y.m16401j(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                c8896yM16401j.mo9278q(1, this.f8168c);
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c0925tMo1368C2.f5651a;
                workDatabase_Impl2.m16388b();
                int i11 = 0;
                cursorM10840o = pe.m10840o(workDatabase_Impl2, c8896yM16401j, false);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorM10840o.getCount());
                    while (cursorM10840o.moveToNext()) {
                        arrayList2.add(cursorM10840o.getString(0));
                    }
                    cursorM10840o.close();
                    c8896yM16401j.m16402u();
                    int size2 = arrayList2.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        AbstractC1665j.m5376a((String) obj2, this.f8169d);
                    }
                    return;
                } finally {
                }
        }
    }
}
