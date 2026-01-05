package c9;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import og.ka;
import og.pe;
import t8.C7059e;
import t8.C7064j;
import t8.e0;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.s */
/* loaded from: classes.dex */
public final class CallableC0924s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f5648a;

    /* renamed from: b */
    public final /* synthetic */ C8896y f5649b;

    /* renamed from: c */
    public final /* synthetic */ C0925t f5650c;

    public /* synthetic */ CallableC0924s(C0925t c0925t, C8896y c8896y, int i10) {
        this.f5648a = i10;
        this.f5650c = c0925t;
        this.f5649b = c8896y;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        WorkDatabase_Impl workDatabase_Impl;
        Cursor cursorM10840o;
        Boolean boolValueOf;
        switch (this.f5648a) {
            case 0:
                C0925t c0925t = this.f5650c;
                workDatabase_Impl = (WorkDatabase_Impl) c0925t.f5651a;
                workDatabase_Impl.m16389c();
                try {
                    cursorM10840o = pe.m10840o(workDatabase_Impl, this.f5649b, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorM10840o.moveToNext()) {
                            String string = cursorM10840o.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorM10840o.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorM10840o.moveToPosition(-1);
                        c0925t.m2673b(map);
                        c0925t.m2672a(map2);
                        ArrayList arrayList = new ArrayList(cursorM10840o.getCount());
                        while (cursorM10840o.moveToNext()) {
                            String string3 = cursorM10840o.getString(0);
                            e0 e0VarM10732f = ka.m10732f(cursorM10840o.getInt(1));
                            C7064j c7064jM13364a = C7064j.m13364a(cursorM10840o.getBlob(2));
                            int i10 = cursorM10840o.getInt(3);
                            int i11 = cursorM10840o.getInt(4);
                            arrayList.add(new C0921p(string3, e0VarM10732f, c7064jM13364a, cursorM10840o.getLong(14), cursorM10840o.getLong(15), cursorM10840o.getLong(16), new C7059e(ka.m10734h(cursorM10840o.getBlob(6)), ka.m10730d(cursorM10840o.getInt(5)), cursorM10840o.getInt(7) != 0, cursorM10840o.getInt(8) != 0, cursorM10840o.getInt(9) != 0, cursorM10840o.getInt(10) != 0, cursorM10840o.getLong(11), cursorM10840o.getLong(12), ka.m10727a(cursorM10840o.getBlob(13))), i10, ka.m10729c(cursorM10840o.getInt(17)), cursorM10840o.getLong(18), cursorM10840o.getLong(19), cursorM10840o.getInt(20), i11, cursorM10840o.getLong(21), cursorM10840o.getInt(22), (ArrayList) map.get(cursorM10840o.getString(0)), (ArrayList) map2.get(cursorM10840o.getString(0))));
                        }
                        workDatabase_Impl.m16399v();
                        cursorM10840o.close();
                        return arrayList;
                    } finally {
                        cursorM10840o.close();
                    }
                } finally {
                }
            case 1:
                C0925t c0925t2 = this.f5650c;
                workDatabase_Impl = (WorkDatabase_Impl) c0925t2.f5651a;
                workDatabase_Impl.m16389c();
                try {
                    Cursor cursorM10840o2 = pe.m10840o(workDatabase_Impl, this.f5649b, true);
                    try {
                        HashMap map3 = new HashMap();
                        HashMap map4 = new HashMap();
                        while (cursorM10840o2.moveToNext()) {
                            String string4 = cursorM10840o2.getString(0);
                            if (!map3.containsKey(string4)) {
                                map3.put(string4, new ArrayList());
                            }
                            String string5 = cursorM10840o2.getString(0);
                            if (!map4.containsKey(string5)) {
                                map4.put(string5, new ArrayList());
                            }
                        }
                        cursorM10840o2.moveToPosition(-1);
                        c0925t2.m2673b(map3);
                        c0925t2.m2672a(map4);
                        ArrayList arrayList2 = new ArrayList(cursorM10840o2.getCount());
                        while (cursorM10840o2.moveToNext()) {
                            String string6 = cursorM10840o2.getString(0);
                            e0 e0VarM10732f2 = ka.m10732f(cursorM10840o2.getInt(1));
                            C7064j c7064jM13364a2 = C7064j.m13364a(cursorM10840o2.getBlob(2));
                            int i12 = cursorM10840o2.getInt(3);
                            int i13 = cursorM10840o2.getInt(4);
                            arrayList2.add(new C0921p(string6, e0VarM10732f2, c7064jM13364a2, cursorM10840o2.getLong(14), cursorM10840o2.getLong(15), cursorM10840o2.getLong(16), new C7059e(ka.m10734h(cursorM10840o2.getBlob(6)), ka.m10730d(cursorM10840o2.getInt(5)), cursorM10840o2.getInt(7) != 0, cursorM10840o2.getInt(8) != 0, cursorM10840o2.getInt(9) != 0, cursorM10840o2.getInt(10) != 0, cursorM10840o2.getLong(11), cursorM10840o2.getLong(12), ka.m10727a(cursorM10840o2.getBlob(13))), i12, ka.m10729c(cursorM10840o2.getInt(17)), cursorM10840o2.getLong(18), cursorM10840o2.getLong(19), cursorM10840o2.getInt(20), i13, cursorM10840o2.getLong(21), cursorM10840o2.getInt(22), (ArrayList) map3.get(cursorM10840o2.getString(0)), (ArrayList) map4.get(cursorM10840o2.getString(0))));
                        }
                        workDatabase_Impl.m16399v();
                        cursorM10840o2.close();
                        return arrayList2;
                    } finally {
                        cursorM10840o2.close();
                    }
                } finally {
                }
            default:
                cursorM10840o = pe.m10840o((WorkDatabase_Impl) this.f5650c.f5651a, this.f5649b, false);
                try {
                    if (cursorM10840o.moveToFirst()) {
                        boolValueOf = Boolean.valueOf(cursorM10840o.getInt(0) != 0);
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    return boolValueOf;
                } catch (Throwable th2) {
                    cursorM10840o.close();
                    throw th2;
                }
        }
    }

    public final void finalize() {
        switch (this.f5648a) {
            case 0:
                this.f5649b.m16402u();
                break;
            case 1:
                this.f5649b.m16402u();
                break;
            default:
                this.f5649b.m16402u();
                break;
        }
    }
}
