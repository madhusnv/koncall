package p004e;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.v */
/* loaded from: classes.dex */
public abstract class AbstractC1887v {

    /* renamed from: a */
    public boolean f8901a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f8902b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public AbstractC4152j f8903c;

    public AbstractC1887v(boolean z6) {
        this.f8901a = z6;
    }

    /* renamed from: b */
    public abstract void mo1276b();

    /* renamed from: c */
    public void mo1277c(C1866a backEvent) {
        AbstractC4154l.m8923f(backEvent, "backEvent");
    }

    /* renamed from: d */
    public void mo1278d(C1866a backEvent) {
        AbstractC4154l.m8923f(backEvent, "backEvent");
    }

    /* renamed from: e */
    public final void m5514e() {
        Iterator it = this.f8902b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1867b) it.next()).cancel();
        }
    }

    /* renamed from: a */
    public void mo1275a() {
    }
}
