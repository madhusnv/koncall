package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class l76 {

    /* renamed from: a */
    public final List f33340a = new ArrayList();

    /* renamed from: o.l76$a */
    public static final class C15009a {

        /* renamed from: a */
        public final Class f33341a;

        /* renamed from: b */
        public final i76 f33342b;

        public C15009a(Class cls, i76 i76Var) {
            this.f33341a = cls;
            this.f33342b = i76Var;
        }

        /* renamed from: a */
        public boolean m36654a(Class cls) {
            return this.f33341a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized void m36652a(Class cls, i76 i76Var) {
        this.f33340a.add(new C15009a(cls, i76Var));
    }

    /* renamed from: b */
    public synchronized i76 m36653b(Class cls) {
        for (C15009a c15009a : this.f33340a) {
            if (c15009a.m36654a(cls)) {
                return c15009a.f33342b;
            }
        }
        return null;
    }
}
