package zj;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zj.b */
/* loaded from: classes.dex */
public final class C8985b {

    /* renamed from: a */
    public final String f43331a;

    /* renamed from: b */
    public final C8986c f43332b;

    public C8985b(Set set, C8986c c8986c) {
        this.f43331a = m16457b(set);
        this.f43332b = c8986c;
    }

    /* renamed from: b */
    public static String m16457b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C8984a c8984a = (C8984a) it.next();
            sb2.append(c8984a.f43329a);
            sb2.append('/');
            sb2.append(c8984a.f43330b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public final String m16458a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f43331a;
        C8986c c8986c = this.f43332b;
        synchronized (((HashSet) c8986c.f43336b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) c8986c.f43336b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) c8986c.f43336b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) c8986c.f43336b);
        }
        sb2.append(m16457b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
