package com.google.android.gms.internal.measurement;

import e1.C1902d;
import e1.C1903e;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q4 {

    /* renamed from: a */
    public static final C1903e f6348a = new C1903e(0);

    /* renamed from: a */
    public static synchronized void m3598a() {
        C1903e c1903e = f6348a;
        Iterator it = ((C1902d) c1903e.values()).iterator();
        if (it.hasNext()) {
            ((q4) it.next()).getClass();
            throw null;
        }
        c1903e.clear();
    }
}
