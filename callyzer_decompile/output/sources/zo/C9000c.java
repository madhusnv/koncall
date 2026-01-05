package zo;

import al.C0182j;
import android.content.Context;
import c9.C0922q;
import com.websoptimization.callyzerbiz.workManager.LogFileUploadManager;
import com.websoptimization.callyzerbiz.workManager.ReadContactWorker;
import com.websoptimization.callyzerbiz.workManager.SyncCallLogNotificationManager;
import d9.C1664i;
import dy.AbstractC1856d;
import dy.C1855c;
import im.EnumC3320v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import og.mg;
import qw.a0;
import rw.AbstractC6663m;
import t8.C7059e;
import t8.C7064j;
import t8.C7079y;
import t8.EnumC7055a;
import t8.EnumC7068n;
import t8.EnumC7078x;
import t8.e0;
import t8.f0;
import u8.C7368p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zo.c */
/* loaded from: classes3.dex */
public final class C9000c {

    /* renamed from: a */
    public final Context f43353a;

    /* renamed from: b */
    public final C8805t f43354b;

    /* renamed from: c */
    public final C1855c f43355c = AbstractC1856d.m5490a();

    public C9000c(Context context, C8805t c8805t) {
        this.f43353a = context;
        this.f43354b = c8805t;
    }

    /* renamed from: a */
    public static C7079y m16465a(boolean z6, long j6) {
        C0182j c0182j = new C0182j(SyncCallLogNotificationManager.class);
        c0182j.m410a("JUST_SYNC");
        if (z6) {
            EnumC7078x enumC7078x = EnumC7078x.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            EnumC7078x networkType = EnumC7078x.CONNECTED;
            AbstractC4154l.m8923f(networkType, "networkType");
            ((C0922q) c0182j.f556c).f5631j = new C7059e(new C1664i(null), networkType, false, false, false, false, -1L, -1L, AbstractC6663m.g0(linkedHashSet));
        }
        if (j6 > 0) {
            c0182j.m424o(j6, TimeUnit.MILLISECONDS);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("SyncManagerWorkType", "JUST_SYNC");
        C7064j c7064j = new C7064j(linkedHashMap);
        mg.m10769b(c7064j);
        c0182j.m425p(c7064j);
        return c0182j.m411b();
    }

    /* renamed from: b */
    public static C7079y m16466b(long j6) {
        C0182j c0182j = new C0182j(SyncCallLogNotificationManager.class);
        c0182j.m410a("SCHEDULE_HOUR_SYNC");
        ((C0922q) c0182j.f556c).f5631j = new C7059e(new C1664i(null), EnumC7078x.NOT_REQUIRED, false, false, false, false, -1L, -1L, AbstractC6663m.g0(new LinkedHashSet()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("SyncManagerWorkType", "SCHEDULE_HOUR_SYNC");
        C7064j c7064j = new C7064j(linkedHashMap);
        mg.m10769b(c7064j);
        ((C0922q) c0182j.f556c).f5626e = c7064j;
        c0182j.m424o(j6, TimeUnit.MINUTES);
        EnumC7055a enumC7055a = EnumC7055a.EXPONENTIAL;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0182j.m423n(enumC7055a);
        return c0182j.m411b();
    }

    /* renamed from: c */
    public static C7079y m16467c(long j6) {
        C0182j c0182j = new C0182j(SyncCallLogNotificationManager.class);
        c0182j.m410a("IDEAL_SYNC");
        ((C0922q) c0182j.f556c).f5631j = new C7059e(new C1664i(null), EnumC7078x.NOT_REQUIRED, false, true, false, false, -1L, -1L, AbstractC6663m.g0(new LinkedHashSet()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("SyncManagerWorkType", "IDEAL_SYNC");
        C7064j c7064j = new C7064j(linkedHashMap);
        mg.m10769b(c7064j);
        ((C0922q) c0182j.f556c).f5626e = c7064j;
        if (j6 > 0) {
            c0182j.m424o(j6, TimeUnit.MINUTES);
        }
        return c0182j.m411b();
    }

    /* renamed from: d */
    public final boolean m16468d(String str) {
        List listC0 = (List) C7368p.m13783g(this.f43353a).m13785h(str).f39850b.get();
        if (listC0.size() > 6) {
            int size = listC0.size();
            if (5 >= size) {
                listC0 = AbstractC6663m.c0(listC0);
            } else {
                ArrayList arrayList = new ArrayList(5);
                if (listC0 instanceof RandomAccess) {
                    for (int i10 = size - 5; i10 < size; i10++) {
                        arrayList.add(listC0.get(i10));
                    }
                } else {
                    ListIterator listIterator = listC0.listIterator(size - 5);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                listC0 = arrayList;
            }
        }
        if (listC0.isEmpty()) {
            return false;
        }
        Iterator it = listC0.iterator();
        while (it.hasNext()) {
            e0 e0Var = ((f0) it.next()).f34141b;
            if (e0Var == e0.RUNNING || e0Var == e0.ENQUEUED) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void m16469e() {
        C7059e c7059e = new C7059e(new C1664i(null), EnumC7078x.NOT_REQUIRED, false, false, false, false, -1L, -1L, AbstractC6663m.g0(new LinkedHashSet()));
        C0182j c0182j = new C0182j(ReadContactWorker.class);
        ((C0922q) c0182j.f556c).f5631j = c7059e;
        C7368p.m13783g(this.f43353a).m13355c("read_device_contact", EnumC7068n.KEEP, c0182j.m411b());
    }

    /* renamed from: f */
    public final void m16470f(boolean z6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_from_fcm", Boolean.valueOf(z6));
        C7064j c7064j = new C7064j(linkedHashMap);
        mg.m10769b(c7064j);
        EnumC7078x enumC7078x = EnumC7078x.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EnumC7078x networkType = EnumC7078x.CONNECTED;
        AbstractC4154l.m8923f(networkType, "networkType");
        C7059e c7059e = new C7059e(new C1664i(null), networkType, false, false, false, false, -1L, -1L, AbstractC6663m.g0(linkedHashSet));
        C0182j c0182j = new C0182j(LogFileUploadManager.class);
        C0922q c0922q = (C0922q) c0182j.f556c;
        c0922q.f5631j = c7059e;
        c0922q.f5626e = c7064j;
        C7368p.m13783g(this.f43353a).m13355c("share_log_file", EnumC7068n.KEEP, c0182j.m411b());
    }

    /* renamed from: g */
    public final Object m16471g(InterfaceC7559c interfaceC7559c) {
        Object objM16472h;
        return (m16468d("JUST_SYNC") || (objM16472h = m16472h(0L, true, EnumC3320v.JUST_SYNC, EnumC7068n.REPLACE, interfaceC7559c)) != EnumC7794a.COROUTINE_SUSPENDED) ? a0.f30746a : objM16472h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16472h(long r10, boolean r12, im.EnumC3320v r13, t8.EnumC7068n r14, uw.InterfaceC7559c r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zo.C9000c.m16472h(long, boolean, im.v, t8.n, uw.c):java.lang.Object");
    }
}
