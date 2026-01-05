package u8;

import android.text.TextUtils;
import c9.C0914i;
import d9.ExecutorC1668m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.bh;
import og.rg;
import qc.C6158d;
import t8.C7077w;
import t8.C7079y;
import t8.EnumC7068n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.m */
/* loaded from: classes.dex */
public final class C7365m extends bh {

    /* renamed from: b */
    public final C7368p f35029b;

    /* renamed from: c */
    public final String f35030c;

    /* renamed from: d */
    public final EnumC7068n f35031d;

    /* renamed from: e */
    public final List f35032e;

    /* renamed from: f */
    public final ArrayList f35033f;

    /* renamed from: g */
    public final ArrayList f35034g = new ArrayList();

    /* renamed from: h */
    public final List f35035h;

    /* renamed from: i */
    public boolean f35036i;

    /* renamed from: j */
    public C7077w f35037j;

    static {
        C7077w.m13372b("WorkContinuationImpl");
    }

    public C7365m(C7368p c7368p, String str, EnumC7068n enumC7068n, List list, List list2) {
        this.f35029b = c7368p;
        this.f35030c = str;
        this.f35031d = enumC7068n;
        this.f35032e = list;
        this.f35035h = list2;
        this.f35033f = new ArrayList(list.size());
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f35034g.addAll(((C7365m) it.next()).f35034g);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (enumC7068n == EnumC7068n.REPLACE && ((C7079y) list.get(i10)).f34178b.f5642u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((C7079y) list.get(i10)).f34177a.toString();
            AbstractC4154l.m8922e(string, "id.toString()");
            this.f35033f.add(string);
            this.f35034g.add(string);
        }
    }

    /* renamed from: d */
    public static boolean m13780d(C7365m c7365m, HashSet hashSet) {
        hashSet.addAll(c7365m.f35033f);
        HashSet hashSetM13781e = m13781e(c7365m);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetM13781e.contains((String) it.next())) {
                return true;
            }
        }
        List list = c7365m.f35035h;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (m13780d((C7365m) it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(c7365m.f35033f);
        return false;
    }

    /* renamed from: e */
    public static HashSet m13781e(C7365m c7365m) {
        HashSet hashSet = new HashSet();
        List list = c7365m.f35035h;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((C7365m) it.next()).f35033f);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public final C7077w m13782c() {
        if (this.f35036i) {
            C7077w c7077wM13371a = C7077w.m13371a();
            TextUtils.join(", ", this.f35033f);
            c7077wM13371a.getClass();
        } else {
            C7368p c7368p = this.f35029b;
            this.f35037j = rg.m10883a(c7368p.f35044b.f34116l, "EnqueueRunnable_" + this.f35031d.name(), (ExecutorC1668m) ((C0914i) c7368p.f35046d).f5585a, new C6158d(7, this));
        }
        return this.f35037j;
    }
}
