package c6;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.q */
/* loaded from: classes.dex */
public final class C0887q {

    /* renamed from: a */
    public final Runnable f5507a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f5508b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final HashMap f5509c = new HashMap();

    public C0887q(Runnable runnable) {
        this.f5507a = runnable;
    }

    /* renamed from: a */
    public final boolean m2486a(MenuItem menuItem) {
        Iterator it = this.f5508b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.a1) ((InterfaceC0888r) it.next())).f2456a.m1191p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m2487b(InterfaceC0888r interfaceC0888r) {
        this.f5508b.remove(interfaceC0888r);
        C0886p c0886p = (C0886p) this.f5509c.remove(interfaceC0888r);
        if (c0886p != null) {
            c0886p.f5494a.mo5346d(c0886p.f5495b);
            c0886p.f5495b = null;
        }
        this.f5507a.run();
    }
}
