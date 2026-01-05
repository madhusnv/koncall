package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class p8i {

    /* renamed from: b */
    public static final C16025a f39606b = new C16025a(null);

    /* renamed from: c */
    public static final Set f39607c;

    /* renamed from: d */
    public static final p8i f39608d;

    /* renamed from: a */
    public final int f39609a;

    /* renamed from: o.p8i$a */
    public static final class C16025a {
        public C16025a() {
        }

        public /* synthetic */ C16025a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final p8i m43192a() {
            return p8i.f39608d;
        }
    }

    /* renamed from: o.p8i$b */
    public static final class C16026b extends p8i {
        public C16026b(int i) {
            super(i, null);
        }
    }

    /* renamed from: o.p8i$c */
    public static final class C16027c extends p8i {

        /* renamed from: e */
        public static final C16027c f39610e = new C16027c();

        public C16027c() {
            super(4, null);
        }

        @Override // p001o.p8i
        public String toString() {
            return "Fragment";
        }
    }

    /* renamed from: o.p8i$d */
    public static final class C16028d extends p8i {

        /* renamed from: e */
        public static final C16028d f39611e = new C16028d();

        public C16028d() {
            super(1, null);
        }

        @Override // p001o.p8i
        public String toString() {
            return "Path";
        }
    }

    /* renamed from: o.p8i$e */
    public static final class C16029e extends p8i {

        /* renamed from: e */
        public static final C16029e f39612e = new C16029e();

        public C16029e() {
            super(2, null);
        }

        @Override // p001o.p8i
        public String toString() {
            return "QueryParameters";
        }
    }

    static {
        int i = 0;
        Set setM40668i = nif.m40668i(C16028d.f39611e, C16029e.f39612e, C16027c.f39610e);
        f39607c = setM40668i;
        Iterator it = setM40668i.iterator();
        while (it.hasNext()) {
            i += ((p8i) it.next()).f39609a;
        }
        f39608d = new C16026b(i);
    }

    public /* synthetic */ p8i(int i, id5 id5Var) {
        this(i);
    }

    /* renamed from: b */
    public final boolean m43191b(p8i p8iVar) {
        sq8.m48649h(p8iVar, "item");
        return (p8iVar.f39609a & this.f39609a) != 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p8i) && this.f39609a == ((p8i) obj).f39609a;
    }

    public int hashCode() {
        return this.f39609a;
    }

    public String toString() {
        Set set = f39607c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (m43191b((p8i) obj)) {
                arrayList.add(obj);
            }
        }
        return kh3.p0(arrayList, "|", null, null, 0, null, null, 62, null);
    }

    public p8i(int i) {
        this.f39609a = i;
    }
}
