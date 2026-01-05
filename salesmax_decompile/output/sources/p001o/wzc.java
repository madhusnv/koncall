package p001o;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class wzc implements Comparable {

    /* renamed from: b */
    public static final C18014a f52936b = new C18014a(null);

    /* renamed from: c */
    public static final String f52937c;

    /* renamed from: a */
    public final zq1 f52938a;

    /* renamed from: o.wzc$a */
    public static final class C18014a {
        public C18014a() {
        }

        public /* synthetic */ C18014a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ wzc m55481c(C18014a c18014a, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c18014a.m55483a(file, z);
        }

        /* renamed from: d */
        public static /* synthetic */ wzc m55482d(C18014a c18014a, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c18014a.m55484b(str, z);
        }

        /* renamed from: a */
        public final wzc m55483a(File file, boolean z) {
            sq8.m48649h(file, "<this>");
            String string = file.toString();
            sq8.m48648g(string, "toString(...)");
            return m55484b(string, z);
        }

        /* renamed from: b */
        public final wzc m55484b(String str, boolean z) {
            sq8.m48649h(str, "<this>");
            return AbstractC12775d.m22154k(str, z);
        }
    }

    static {
        String str = File.separator;
        sq8.m48648g(str, "separator");
        f52937c = str;
    }

    public wzc(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "bytes");
        this.f52938a = zq1Var;
    }

    /* renamed from: s */
    public static /* synthetic */ wzc m55467s(wzc wzcVar, wzc wzcVar2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return wzcVar.m55478r(wzcVar2, z);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(wzc wzcVar) {
        sq8.m48649h(wzcVar, "other");
        return m55469c().compareTo(wzcVar.m55469c());
    }

    /* renamed from: c */
    public final zq1 m55469c() {
        return this.f52938a;
    }

    /* renamed from: d */
    public final wzc m55470d() {
        int iM22158o = AbstractC12775d.m22158o(this);
        if (iM22158o == -1) {
            return null;
        }
        return new wzc(m55469c().mo38687N(0, iM22158o));
    }

    /* renamed from: e */
    public final List m55471e() {
        ArrayList arrayList = new ArrayList();
        int iM22158o = AbstractC12775d.m22158o(this);
        if (iM22158o == -1) {
            iM22158o = 0;
        } else if (iM22158o < m55469c().m59694L() && m55469c().m59699h(iM22158o) == 92) {
            iM22158o++;
        }
        int iM59694L = m55469c().m59694L();
        int i = iM22158o;
        while (iM22158o < iM59694L) {
            if (m55469c().m59699h(iM22158o) == 47 || m55469c().m59699h(iM22158o) == 92) {
                arrayList.add(m55469c().mo38687N(i, iM22158o));
                i = iM22158o + 1;
            }
            iM22158o++;
        }
        if (i < m55469c().m59694L()) {
            arrayList.add(m55469c().mo38687N(i, m55469c().m59694L()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof wzc) && sq8.m48644c(((wzc) obj).m55469c(), m55469c());
    }

    /* renamed from: g */
    public final boolean m55472g() {
        return AbstractC12775d.m22158o(this) != -1;
    }

    /* renamed from: h */
    public final String m55473h() {
        return m55474j().m59696R();
    }

    public int hashCode() {
        return m55469c().hashCode();
    }

    /* renamed from: j */
    public final zq1 m55474j() {
        int iM22155l = AbstractC12775d.m22155l(this);
        return iM22155l != -1 ? zq1.m59686O(m55469c(), iM22155l + 1, 0, 2, null) : (m55480u() == null || m55469c().m59694L() != 2) ? m55469c() : zq1.f57498e;
    }

    /* renamed from: m */
    public final wzc m55475m() {
        wzc wzcVar;
        if (sq8.m48644c(m55469c(), AbstractC12775d.f18910d) || sq8.m48644c(m55469c(), AbstractC12775d.f18907a) || sq8.m48644c(m55469c(), AbstractC12775d.f18908b) || AbstractC12775d.m22157n(this)) {
            return null;
        }
        int iM22155l = AbstractC12775d.m22155l(this);
        if (iM22155l != 2 || m55480u() == null) {
            if (iM22155l == 1 && m55469c().m59695M(AbstractC12775d.f18908b)) {
                return null;
            }
            if (iM22155l != -1 || m55480u() == null) {
                if (iM22155l == -1) {
                    return new wzc(AbstractC12775d.f18910d);
                }
                if (iM22155l != 0) {
                    return new wzc(zq1.m59686O(m55469c(), 0, iM22155l, 1, null));
                }
                wzcVar = new wzc(zq1.m59686O(m55469c(), 0, 1, 1, null));
            } else {
                if (m55469c().m59694L() == 2) {
                    return null;
                }
                wzcVar = new wzc(zq1.m59686O(m55469c(), 0, 2, 1, null));
            }
        } else {
            if (m55469c().m59694L() == 3) {
                return null;
            }
            wzcVar = new wzc(zq1.m59686O(m55469c(), 0, 3, 1, null));
        }
        return wzcVar;
    }

    /* renamed from: n */
    public final wzc m55476n(wzc wzcVar) {
        sq8.m48649h(wzcVar, "other");
        if (!sq8.m48644c(m55470d(), wzcVar.m55470d())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + wzcVar).toString());
        }
        List listM55471e = m55471e();
        List listM55471e2 = wzcVar.m55471e();
        int iMin = Math.min(listM55471e.size(), listM55471e2.size());
        int i = 0;
        while (i < iMin && sq8.m48644c(listM55471e.get(i), listM55471e2.get(i))) {
            i++;
        }
        if (i == iMin && m55469c().m59694L() == wzcVar.m55469c().m59694L()) {
            return C18014a.m55482d(f52936b, ".", false, 1, null);
        }
        if (!(listM55471e2.subList(i, listM55471e2.size()).indexOf(AbstractC12775d.f18911e) == -1)) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + wzcVar).toString());
        }
        if (sq8.m48644c(wzcVar.m55469c(), AbstractC12775d.f18910d)) {
            return this;
        }
        rl1 rl1Var = new rl1();
        zq1 zq1VarM22156m = AbstractC12775d.m22156m(wzcVar);
        if (zq1VarM22156m == null && (zq1VarM22156m = AbstractC12775d.m22156m(this)) == null) {
            zq1VarM22156m = AbstractC12775d.m22162s(f52937c);
        }
        int size = listM55471e2.size();
        for (int i2 = i; i2 < size; i2++) {
            rl1Var.M2(AbstractC12775d.f18911e);
            rl1Var.M2(zq1VarM22156m);
        }
        int size2 = listM55471e.size();
        while (i < size2) {
            rl1Var.M2((zq1) listM55471e.get(i));
            rl1Var.M2(zq1VarM22156m);
            i++;
        }
        return AbstractC12775d.m22160q(rl1Var, false);
    }

    /* renamed from: o */
    public final wzc m55477o(String str) {
        sq8.m48649h(str, "child");
        return AbstractC12775d.m22153j(this, AbstractC12775d.m22160q(new rl1().n0(str), false), false);
    }

    /* renamed from: r */
    public final wzc m55478r(wzc wzcVar, boolean z) {
        sq8.m48649h(wzcVar, "child");
        return AbstractC12775d.m22153j(this, wzcVar, z);
    }

    /* renamed from: t */
    public final File m55479t() {
        return new File(toString());
    }

    public String toString() {
        return m55469c().m59696R();
    }

    /* renamed from: u */
    public final Character m55480u() {
        boolean z = false;
        if (zq1.m59688x(m55469c(), AbstractC12775d.f18907a, 0, 2, null) != -1 || m55469c().m59694L() < 2 || m55469c().m59699h(1) != 58) {
            return null;
        }
        char cM59699h = (char) m55469c().m59699h(0);
        if (!('a' <= cM59699h && cM59699h < '{')) {
            if ('A' <= cM59699h && cM59699h < '[') {
                z = true;
            }
            if (!z) {
                return null;
            }
        }
        return Character.valueOf(cM59699h);
    }
}
