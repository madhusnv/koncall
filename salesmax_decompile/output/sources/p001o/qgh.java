package p001o;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qgh {

    /* renamed from: b */
    public static final C16401a f41974b = new C16401a(null);

    /* renamed from: c */
    public static final qgh f41975c = new qgh(0);

    /* renamed from: d */
    public static final qgh f41976d = new qgh(1);

    /* renamed from: e */
    public static final qgh f41977e = new qgh(2);

    /* renamed from: a */
    public final int f41978a;

    /* renamed from: o.qgh$a */
    public static final class C16401a {
        public C16401a() {
        }

        public /* synthetic */ C16401a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final qgh m45446a() {
            return qgh.f41977e;
        }

        /* renamed from: b */
        public final qgh m45447b() {
            return qgh.f41976d;
        }
    }

    public qgh(int i) {
        this.f41978a = i;
    }

    /* renamed from: c */
    public final boolean m45444c(qgh qghVar) {
        sq8.m48649h(qghVar, "other");
        int i = this.f41978a;
        return (qghVar.f41978a | i) == i;
    }

    /* renamed from: d */
    public final int m45445d() {
        return this.f41978a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qgh) && this.f41978a == ((qgh) obj).f41978a;
    }

    public int hashCode() {
        return this.f41978a;
    }

    public String toString() {
        if (this.f41978a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f41978a & f41976d.f41978a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f41978a & f41977e.f41978a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + ydh.m57661d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
