package p020v;

import ej.C2060e;
import java.util.HashSet;
import java.util.Set;
import z0.C8835a;
import z0.C8836b;
import z0.C8839e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.p */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7606p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36663a;

    /* renamed from: b */
    public final /* synthetic */ Object f36664b;

    public /* synthetic */ RunnableC7606p(int i10, Object obj) {
        this.f36663a = i10;
        this.f36664b = obj;
    }

    /* renamed from: a */
    private final void m14421a() {
        C2060e c2060e = (C2060e) this.f36664b;
        c2060e.m5787f();
        C8839e c8839e = (C8839e) c2060e.f9654e;
        Set<C8835a> setKeySet = (HashSet) c2060e.f9658i;
        synchronized (c8839e.f42549a) {
            if (setKeySet == null) {
                try {
                    setKeySet = c8839e.f42550b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (C8835a c8835a : setKeySet) {
                if (c8839e.f42550b.containsKey(c8835a)) {
                    c8839e.m16304j((C8836b) c8839e.f42550b.get(c8835a));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.RunnableC7606p.run():void");
    }
}
