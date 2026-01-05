package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class gja {

    /* renamed from: b */
    public static final C13751a f25330b = new C13751a(null);

    /* renamed from: a */
    public final int f25331a;

    /* renamed from: o.gja$a */
    public static final class C13751a {
        public C13751a() {
        }

        public /* synthetic */ C13751a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final List m28862a() {
            return ch3.m21249n(C13754d.f25333c, C13755e.f25334c, C13756f.f25335c, C13757g.f25336c);
        }

        /* renamed from: b */
        public final gja m28863b(String str) {
            Object next;
            sq8.m48649h(str, "string");
            List<String> listD0 = f9g.D0(f9g.Z0(str).toString(), new String[]{"|"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(dh3.m23088v(listD0, 10));
            for (String str2 : listD0) {
                Iterator it = gja.f25330b.m28862a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (e9g.m24606x(str2, ((gja) next).toString(), true)) {
                        break;
                    }
                }
                gja gjaVar = (gja) next;
                if (gjaVar == null) {
                    throw new xa3("Log mode " + str2 + " is not supported, should be one or more of: " + kh3.p0(gja.f25330b.m28862a(), ", ", null, null, 0, null, null, 62, null));
                }
                arrayList.add(gjaVar);
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it2.next();
            while (it2.hasNext()) {
                next2 = ((gja) next2).m28861b((gja) it2.next());
            }
            return (gja) next2;
        }
    }

    /* renamed from: o.gja$b */
    public static final class C13752b extends gja {
        public C13752b(int i) {
            super(i, null);
        }
    }

    /* renamed from: o.gja$c */
    public static final class C13753c extends gja {

        /* renamed from: c */
        public static final C13753c f25332c = new C13753c();

        public C13753c() {
            super(0, null);
        }

        @Override // p001o.gja
        public String toString() {
            return "Default";
        }
    }

    /* renamed from: o.gja$d */
    public static final class C13754d extends gja {

        /* renamed from: c */
        public static final C13754d f25333c = new C13754d();

        public C13754d() {
            super(1, null);
        }

        @Override // p001o.gja
        public String toString() {
            return "LogRequest";
        }
    }

    /* renamed from: o.gja$e */
    public static final class C13755e extends gja {

        /* renamed from: c */
        public static final C13755e f25334c = new C13755e();

        public C13755e() {
            super(3, null);
        }

        @Override // p001o.gja
        public String toString() {
            return "LogRequestWithBody";
        }
    }

    /* renamed from: o.gja$f */
    public static final class C13756f extends gja {

        /* renamed from: c */
        public static final C13756f f25335c = new C13756f();

        public C13756f() {
            super(4, null);
        }

        @Override // p001o.gja
        public String toString() {
            return "LogResponse";
        }
    }

    /* renamed from: o.gja$g */
    public static final class C13757g extends gja {

        /* renamed from: c */
        public static final C13757g f25336c = new C13757g();

        public C13757g() {
            super(12, null);
        }

        @Override // p001o.gja
        public String toString() {
            return "LogResponseWithBody";
        }
    }

    public /* synthetic */ gja(int i, id5 id5Var) {
        this(i);
    }

    /* renamed from: a */
    public final boolean m28860a(gja gjaVar) {
        sq8.m48649h(gjaVar, "mode");
        int i = this.f25331a;
        int i2 = gjaVar.f25331a;
        return (i & i2) == i2;
    }

    /* renamed from: b */
    public final gja m28861b(gja gjaVar) {
        sq8.m48649h(gjaVar, "mode");
        return new C13752b(gjaVar.f25331a | this.f25331a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof gja) && this.f25331a == ((gja) obj).f25331a;
    }

    public String toString() {
        List listM28862a = f25330b.m28862a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM28862a) {
            if (m28860a((gja) obj)) {
                arrayList.add(obj);
            }
        }
        return kh3.p0(arrayList, "|", null, null, 0, null, null, 62, null);
    }

    public gja(int i) {
        this.f25331a = i;
    }
}
