package androidx.compose.ui.focus;

import p001o.id5;

/* renamed from: androidx.compose.ui.focus.b */
/* loaded from: classes2.dex */
public final class C1928b {

    /* renamed from: b */
    public static final a f6246b = new a(null);

    /* renamed from: c */
    public static final int f6247c = m4879j(1);

    /* renamed from: d */
    public static final int f6248d = m4879j(2);

    /* renamed from: e */
    public static final int f6249e = m4879j(3);

    /* renamed from: f */
    public static final int f6250f = m4879j(4);

    /* renamed from: g */
    public static final int f6251g = m4879j(5);

    /* renamed from: h */
    public static final int f6252h = m4879j(6);

    /* renamed from: i */
    public static final int f6253i;

    /* renamed from: j */
    public static final int f6254j;

    /* renamed from: k */
    public static final int f6255k;

    /* renamed from: l */
    public static final int f6256l;

    /* renamed from: a */
    public final int f6257a;

    /* renamed from: androidx.compose.ui.focus.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m4885a() {
            return C1928b.f6252h;
        }

        /* renamed from: b */
        public final int m4886b() {
            return C1928b.f6253i;
        }

        /* renamed from: c */
        public final int m4887c() {
            return C1928b.f6254j;
        }

        /* renamed from: d */
        public final int m4888d() {
            return C1928b.f6249e;
        }

        /* renamed from: e */
        public final int m4889e() {
            return C1928b.f6247c;
        }

        /* renamed from: f */
        public final int m4890f() {
            return C1928b.f6248d;
        }

        /* renamed from: g */
        public final int m4891g() {
            return C1928b.f6250f;
        }

        /* renamed from: h */
        public final int m4892h() {
            return C1928b.f6251g;
        }
    }

    static {
        int iM4879j = m4879j(7);
        f6253i = iM4879j;
        int iM4879j2 = m4879j(8);
        f6254j = iM4879j2;
        f6255k = iM4879j;
        f6256l = iM4879j2;
    }

    public /* synthetic */ C1928b(int i) {
        this.f6257a = i;
    }

    /* renamed from: i */
    public static final /* synthetic */ C1928b m4878i(int i) {
        return new C1928b(i);
    }

    /* renamed from: j */
    public static int m4879j(int i) {
        return i;
    }

    /* renamed from: k */
    public static boolean m4880k(int i, Object obj) {
        return (obj instanceof C1928b) && i == ((C1928b) obj).m4884o();
    }

    /* renamed from: l */
    public static final boolean m4881l(int i, int i2) {
        return i == i2;
    }

    /* renamed from: m */
    public static int m4882m(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: n */
    public static String m4883n(int i) {
        return m4881l(i, f6247c) ? "Next" : m4881l(i, f6248d) ? "Previous" : m4881l(i, f6249e) ? "Left" : m4881l(i, f6250f) ? "Right" : m4881l(i, f6251g) ? "Up" : m4881l(i, f6252h) ? "Down" : m4881l(i, f6253i) ? "Enter" : m4881l(i, f6254j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m4880k(this.f6257a, obj);
    }

    public int hashCode() {
        return m4882m(this.f6257a);
    }

    /* renamed from: o */
    public final /* synthetic */ int m4884o() {
        return this.f6257a;
    }

    public String toString() {
        return m4883n(this.f6257a);
    }
}
