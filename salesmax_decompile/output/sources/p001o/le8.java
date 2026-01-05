package p001o;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class le8 {

    /* renamed from: a */
    public final HashMap f33690a = new HashMap();

    /* renamed from: a */
    public final void m37026a() {
        this.f33690a.clear();
    }

    /* renamed from: b */
    public final void m37027b(int i) {
        Iterator it = this.f33690a.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            sq8.m48648g(next, "it.next()");
            tq.m50332a(((WeakReference) ((Map.Entry) next).getValue()).get());
            it.remove();
        }
    }
}
