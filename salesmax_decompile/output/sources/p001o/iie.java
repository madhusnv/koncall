package p001o;

import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class iie {

    /* renamed from: a */
    public final Map f28730a = new HashMap();

    /* renamed from: o.iie$a */
    public static class C14303a {

        /* renamed from: a */
        public final Class f28731a;

        /* renamed from: b */
        public final Provider f28732b;

        public C14303a(Class cls, Provider provider) {
            this.f28731a = cls;
            this.f28732b = provider;
        }

        /* renamed from: a */
        public final Provider m32181a() {
            return this.f28732b;
        }

        /* renamed from: b */
        public final Class m32182b() {
            return this.f28731a;
        }
    }

    public iie(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C14303a c14303a = (C14303a) it.next();
            this.f28730a.put(c14303a.m32182b(), c14303a.m32181a());
        }
    }
}
