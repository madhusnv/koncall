package ak;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import bk.C0674e;
import bk.C0676g;
import bk.C0687r;
import bk.C0688s;
import c9.C0908c;
import c9.C0913h;
import c9.C0919n;
import c9.C0922q;
import c9.C0925t;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4680j;
import og.pe;
import t8.AbstractC7075u;
import t8.C7064j;
import t8.C7073s;
import t8.C7074t;
import t8.C7077w;
import t8.e0;
import u8.AbstractC7375w;
import u8.C7372t;
import u8.C7373u;
import u8.C7374v;
import u8.C7378z;
import u8.a0;
import wj.AbstractC8098x;
import wj.C8090p;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.b */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0163b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f501a;

    /* renamed from: b */
    public final /* synthetic */ Object f502b;

    /* renamed from: c */
    public final /* synthetic */ Object f503c;

    public /* synthetic */ CallableC0163b(int i10, Object obj, Object obj2) {
        this.f501a = i10;
        this.f502b = obj;
        this.f503c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i10;
        boolean z6 = false;
        String str2 = null;
        switch (this.f501a) {
            case 0:
                C0165d c0165d = (C0165d) this.f502b;
                C0166e c0166e = (C0166e) this.f503c;
                C0687r c0687r = c0165d.f512h;
                synchronized (c0687r.f4317b) {
                    SharedPreferences.Editor editorEdit = c0687r.f4316a.edit();
                    c0166e.getClass();
                    editorEdit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", c0166e.f515a).commit();
                }
                return null;
            case 1:
                C0674e c0674e = (C0674e) this.f502b;
                C0676g c0676g = (C0676g) this.f503c;
                C0688s c0688s = c0674e.f4248b;
                synchronized (c0688s) {
                    FileOutputStream fileOutputStreamOpenFileOutput = c0688s.f4321a.openFileOutput(c0688s.f4322b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(c0676g.f4257a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            case 2:
                AbstractC7375w abstractC7375w = (AbstractC7375w) this.f502b;
                C7378z c7378z = (C7378z) this.f503c;
                String str3 = c7378z.f35068c;
                C0925t c0925t = c7378z.f35075j;
                if (abstractC7375w instanceof C7373u) {
                    AbstractC7075u abstractC7075u = ((C7373u) abstractC7375w).f35057a;
                    e0 e0VarM2684m = c0925t.m2684m(str3);
                    C0919n c0919nMo1367B = c7378z.f35074i.mo1367B();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0919nMo1367B.f5598a;
                    workDatabase_Impl.m16388b();
                    C0913h c0913h = (C0913h) c0919nMo1367B.f5600c;
                    C4680j c4680jM347a = c0913h.m347a();
                    c4680jM347a.mo9278q(1, str3);
                    try {
                        workDatabase_Impl.m16389c();
                        try {
                            c4680jM347a.m9573h();
                            workDatabase_Impl.m16399v();
                            if (e0VarM2684m != null) {
                                if (e0VarM2684m == e0.RUNNING) {
                                    C0922q c0922q = c7378z.f35066a;
                                    if (abstractC7075u instanceof C7074t) {
                                        int i11 = a0.f34991a;
                                        C7077w.m13371a().getClass();
                                        if (c0922q.m2671d()) {
                                            c7378z.m13792c();
                                        } else {
                                            c0925t.m2695x(e0.SUCCEEDED, str3);
                                            C7064j c7064j = ((C7074t) abstractC7075u).f34171a;
                                            AbstractC4154l.m8922e(c7064j, "success.outputData");
                                            c0925t.m2694w(str3, c7064j);
                                            c7378z.f35072g.getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            C0908c c0908c = c7378z.f35076k;
                                            ArrayList arrayListM2571p = c0908c.m2571p(str3);
                                            int size = arrayListM2571p.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayListM2571p.get(i12);
                                                i12++;
                                                String str4 = (String) obj;
                                                if (c0925t.m2684m(str4) == e0.BLOCKED) {
                                                    C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                                    c8896yM16401j.mo9278q(1, str4);
                                                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c0908c.f5574b;
                                                    workDatabase_Impl2.m16388b();
                                                    Cursor cursorM10840o = pe.m10840o(workDatabase_Impl2, c8896yM16401j, false);
                                                    try {
                                                        if (cursorM10840o.moveToFirst() && cursorM10840o.getInt(0) != 0) {
                                                            int i13 = a0.f34991a;
                                                            C7077w.m13371a().getClass();
                                                            c0925t.m2695x(e0.ENQUEUED, str4);
                                                            c0925t.m2693v(str4, jCurrentTimeMillis);
                                                        }
                                                    } finally {
                                                        cursorM10840o.close();
                                                        c8896yM16401j.m16402u();
                                                    }
                                                }
                                            }
                                        }
                                    } else if (abstractC7075u instanceof C7073s) {
                                        int i14 = a0.f34991a;
                                        C7077w.m13371a().getClass();
                                        c7378z.m13791b(-256);
                                        z6 = true;
                                    } else {
                                        int i15 = a0.f34991a;
                                        C7077w.m13371a().getClass();
                                        if (c0922q.m2671d()) {
                                            c7378z.m13792c();
                                        } else {
                                            c7378z.m13793d(abstractC7075u);
                                        }
                                    }
                                } else if (!e0VarM2684m.isFinished()) {
                                    c7378z.m13791b(-512);
                                    z6 = true;
                                }
                            }
                        } finally {
                            workDatabase_Impl.m16395r();
                        }
                    } finally {
                        c0913h.m355i(c4680jM347a);
                    }
                } else if (abstractC7375w instanceof C7372t) {
                    c7378z.m13793d(((C7372t) abstractC7375w).f35056a);
                } else {
                    if (!(abstractC7375w instanceof C7374v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i16 = ((C7374v) abstractC7375w).f35058a;
                    e0 e0VarM2684m2 = c0925t.m2684m(str3);
                    if (e0VarM2684m2 == null || e0VarM2684m2.isFinished()) {
                        int i17 = a0.f34991a;
                        C7077w c7077wM13371a = C7077w.m13371a();
                        Objects.toString(e0VarM2684m2);
                        c7077wM13371a.getClass();
                    } else {
                        int i18 = a0.f34991a;
                        C7077w c7077wM13371a2 = C7077w.m13371a();
                        e0VarM2684m2.toString();
                        c7077wM13371a2.getClass();
                        c0925t.m2695x(e0.ENQUEUED, str3);
                        c0925t.m2696y(i16, str3);
                        c0925t.m2687p(str3, -1L);
                        z6 = true;
                    }
                }
                return Boolean.valueOf(z6);
            default:
                Context context = (Context) this.f502b;
                Intent intent = (Intent) this.f503c;
                C8090p c8090pM15225t = C8090p.m15225t();
                c8090pM15225t.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                ((ArrayDeque) c8090pM15225t.f38726d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (c8090pM15225t) {
                    try {
                        String str5 = (String) c8090pM15225t.f38723a;
                        if (str5 != null) {
                            str2 = str5;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null && context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                if (str.startsWith(".")) {
                                    c8090pM15225t.f38723a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    c8090pM15225t.f38723a = serviceInfo.name;
                                }
                                str2 = (String) c8090pM15225t.f38723a;
                            }
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    i10 = (c8090pM15225t.m15235L(context) ? AbstractC8098x.m15283c(context, intent2) : context.startService(intent2)) == null ? 404 : -1;
                } catch (IllegalStateException e2) {
                    e2.toString();
                    i10 = 402;
                } catch (SecurityException unused) {
                    i10 = 401;
                }
                return Integer.valueOf(i10);
        }
    }
}
