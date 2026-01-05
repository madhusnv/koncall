package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class moe {

    /* renamed from: a */
    public final List f35789a = new ArrayList();

    /* renamed from: o.moe$a */
    public static final class C15380a {

        /* renamed from: a */
        public final Class f35790a;

        /* renamed from: b */
        public final loe f35791b;

        public C15380a(Class cls, loe loeVar) {
            this.f35790a = cls;
            this.f35791b = loeVar;
        }

        /* renamed from: a */
        public boolean m39467a(Class cls) {
            return this.f35790a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m39465a(Class cls, loe loeVar) {
        this.f35789a.add(new C15380a(cls, loeVar));
    }

    /* renamed from: b */
    public synchronized loe m39466b(Class cls) {
        int size = this.f35789a.size();
        for (int i = 0; i < size; i++) {
            C15380a c15380a = (C15380a) this.f35789a.get(i);
            if (c15380a.m39467a(cls)) {
                return c15380a.f35791b;
            }
        }
        return null;
    }
}
