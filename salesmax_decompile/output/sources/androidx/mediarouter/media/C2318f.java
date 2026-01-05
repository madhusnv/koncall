package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.mediarouter.media.f */
/* loaded from: classes2.dex */
public final class C2318f {

    /* renamed from: c */
    public static final C2318f f9224c = new C2318f(new Bundle(), null);

    /* renamed from: a */
    public final Bundle f9225a;

    /* renamed from: b */
    public List f9226b;

    /* renamed from: androidx.mediarouter.media.f$a */
    public static final class a {

        /* renamed from: a */
        public ArrayList f9227a;

        public a() {
        }

        /* renamed from: a */
        public a m8227a(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    m8228b((String) it.next());
                }
            }
            return this;
        }

        /* renamed from: b */
        public a m8228b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.f9227a == null) {
                this.f9227a = new ArrayList();
            }
            if (!this.f9227a.contains(str)) {
                this.f9227a.add(str);
            }
            return this;
        }

        /* renamed from: c */
        public a m8229c(C2318f c2318f) {
            if (c2318f == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            m8227a(c2318f.m8223e());
            return this;
        }

        /* renamed from: d */
        public C2318f m8230d() {
            if (this.f9227a == null) {
                return C2318f.f9224c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.f9227a);
            return new C2318f(bundle, this.f9227a);
        }

        public a(C2318f c2318f) {
            if (c2318f == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c2318f.m8222c();
            if (c2318f.f9226b.isEmpty()) {
                return;
            }
            this.f9227a = new ArrayList(c2318f.f9226b);
        }
    }

    public C2318f(Bundle bundle, List list) {
        this.f9225a = bundle;
        this.f9226b = list;
    }

    /* renamed from: d */
    public static C2318f m8219d(Bundle bundle) {
        if (bundle != null) {
            return new C2318f(bundle, null);
        }
        return null;
    }

    /* renamed from: a */
    public Bundle m8220a() {
        return this.f9225a;
    }

    /* renamed from: b */
    public boolean m8221b(C2318f c2318f) {
        if (c2318f == null) {
            return false;
        }
        m8222c();
        c2318f.m8222c();
        return this.f9226b.containsAll(c2318f.f9226b);
    }

    /* renamed from: c */
    public void m8222c() {
        if (this.f9226b == null) {
            ArrayList<String> stringArrayList = this.f9225a.getStringArrayList("controlCategories");
            this.f9226b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f9226b = Collections.emptyList();
            }
        }
    }

    /* renamed from: e */
    public List m8223e() {
        m8222c();
        return new ArrayList(this.f9226b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2318f)) {
            return false;
        }
        C2318f c2318f = (C2318f) obj;
        m8222c();
        c2318f.m8222c();
        return this.f9226b.equals(c2318f.f9226b);
    }

    /* renamed from: f */
    public boolean m8224f() {
        m8222c();
        return this.f9226b.isEmpty();
    }

    /* renamed from: g */
    public boolean m8225g() {
        m8222c();
        return !this.f9226b.contains(null);
    }

    /* renamed from: h */
    public boolean m8226h(List list) {
        if (list == null) {
            return false;
        }
        m8222c();
        if (this.f9226b.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                Iterator it2 = this.f9226b.iterator();
                while (it2.hasNext()) {
                    if (intentFilter.hasCategory((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        m8222c();
        return this.f9226b.hashCode();
    }

    public String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(m8223e().toArray()) + " }";
    }
}
