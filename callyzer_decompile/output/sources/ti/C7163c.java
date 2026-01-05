package ti;

import android.util.Log;
import cj.C0979e;
import ek.AbstractC2065e;
import ek.C2063c;
import ek.C2064d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k4.C4001v;
import nz.C5213x;
import qi.RunnableC6224g;
import rw.AbstractC6664n;
import xi.C8386d;
import yi.AbstractC8685n;
import yi.C8673b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ti.c */
/* loaded from: classes.dex */
public final class C7163c {

    /* renamed from: a */
    public final C0979e f34413a;

    public C7163c(C0979e c0979e) {
        this.f34413a = c0979e;
    }

    /* renamed from: a */
    public final void m13423a(C2064d c2064d) {
        C0979e c0979e = this.f34413a;
        HashSet hashSet = c2064d.f9676a;
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C2063c c2063c = (C2063c) ((AbstractC2065e) it.next());
            String str = c2063c.f9671b;
            String str2 = c2063c.f9673d;
            String strSubstring = c2063c.f9674e;
            String str3 = c2063c.f9672c;
            long j6 = c2063c.f9675f;
            C4001v c4001v = AbstractC8685n.f42035a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new C8673b(str, str2, strSubstring, str3, j6));
        }
        synchronized (((C5213x) c0979e.f5807f)) {
            try {
                if (((C5213x) c0979e.f5807f).m10208b(arrayList)) {
                    ((C8386d) c0979e.f5804c).f40064b.m15551a(new RunnableC6224g(23, c0979e, ((C5213x) c0979e.f5807f).m10207a()));
                }
            } finally {
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}
