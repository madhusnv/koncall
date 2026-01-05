package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class c3d {

    /* renamed from: a */
    public final List f17226a;

    /* renamed from: b */
    public final int f17227b;

    /* renamed from: c */
    public int f17228c;

    /* renamed from: d */
    public final List f17229d;

    /* renamed from: e */
    public final HashMap f17230e;

    /* renamed from: f */
    public final gi9 f17231f;

    /* renamed from: o.c3d$a */
    public static final class C12545a extends kf9 implements uk7 {
        public C12545a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap invoke() {
            HashMap mapM29190J = go3.m29190J();
            c3d c3dVar = c3d.this;
            int size = c3dVar.m20170b().size();
            for (int i = 0; i < size; i++) {
                tc9 tc9Var = (tc9) c3dVar.m20170b().get(i);
                go3.m29193M(mapM29190J, go3.m29183C(tc9Var), tc9Var);
            }
            return mapM29190J;
        }
    }

    public c3d(List list, int i) {
        sq8.m48649h(list, "keyInfos");
        this.f17226a = list;
        this.f17227b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.f17229d = new ArrayList();
        HashMap map = new HashMap();
        int size = list.size();
        int iM49708c = 0;
        for (int i2 = 0; i2 < size; i2++) {
            tc9 tc9Var = (tc9) this.f17226a.get(i2);
            map.put(Integer.valueOf(tc9Var.m49707b()), new jv7(i2, iM49708c, tc9Var.m49708c()));
            iM49708c += tc9Var.m49708c();
        }
        this.f17230e = map;
        this.f17231f = si9.m48360a(new C12545a());
    }

    /* renamed from: a */
    public final int m20169a() {
        return this.f17228c;
    }

    /* renamed from: b */
    public final List m20170b() {
        return this.f17226a;
    }

    /* renamed from: c */
    public final HashMap m20171c() {
        return (HashMap) this.f17231f.getValue();
    }

    /* renamed from: d */
    public final tc9 m20172d(int i, Object obj) {
        return (tc9) go3.m29192L(m20171c(), obj != null ? new g79(Integer.valueOf(i), obj) : Integer.valueOf(i));
    }

    /* renamed from: e */
    public final int m20173e() {
        return this.f17227b;
    }

    /* renamed from: f */
    public final List m20174f() {
        return this.f17229d;
    }

    /* renamed from: g */
    public final int m20175g(tc9 tc9Var) {
        sq8.m48649h(tc9Var, "keyInfo");
        jv7 jv7Var = (jv7) this.f17230e.get(Integer.valueOf(tc9Var.m49707b()));
        if (jv7Var != null) {
            return jv7Var.m34572b();
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean m20176h(tc9 tc9Var) {
        sq8.m48649h(tc9Var, "keyInfo");
        return this.f17229d.add(tc9Var);
    }

    /* renamed from: i */
    public final void m20177i(tc9 tc9Var, int i) {
        sq8.m48649h(tc9Var, "keyInfo");
        this.f17230e.put(Integer.valueOf(tc9Var.m49707b()), new jv7(-1, i, 0));
    }

    /* renamed from: j */
    public final void m20178j(int i, int i2, int i3) {
        if (i > i2) {
            Collection<jv7> collectionValues = this.f17230e.values();
            sq8.m48648g(collectionValues, "groupInfos.values");
            for (jv7 jv7Var : collectionValues) {
                int iM34572b = jv7Var.m34572b();
                if (i <= iM34572b && iM34572b < i + i3) {
                    jv7Var.m34575e((iM34572b - i) + i2);
                } else if (i2 <= iM34572b && iM34572b < i) {
                    jv7Var.m34575e(iM34572b + i3);
                }
            }
            return;
        }
        if (i2 > i) {
            Collection<jv7> collectionValues2 = this.f17230e.values();
            sq8.m48648g(collectionValues2, "groupInfos.values");
            for (jv7 jv7Var2 : collectionValues2) {
                int iM34572b2 = jv7Var2.m34572b();
                if (i <= iM34572b2 && iM34572b2 < i + i3) {
                    jv7Var2.m34575e((iM34572b2 - i) + i2);
                } else if (i + 1 <= iM34572b2 && iM34572b2 < i2) {
                    jv7Var2.m34575e(iM34572b2 - i3);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m20179k(int i, int i2) {
        if (i > i2) {
            Collection<jv7> collectionValues = this.f17230e.values();
            sq8.m48648g(collectionValues, "groupInfos.values");
            for (jv7 jv7Var : collectionValues) {
                int iM34573c = jv7Var.m34573c();
                if (iM34573c == i) {
                    jv7Var.m34576f(i2);
                } else if (i2 <= iM34573c && iM34573c < i) {
                    jv7Var.m34576f(iM34573c + 1);
                }
            }
            return;
        }
        if (i2 > i) {
            Collection<jv7> collectionValues2 = this.f17230e.values();
            sq8.m48648g(collectionValues2, "groupInfos.values");
            for (jv7 jv7Var2 : collectionValues2) {
                int iM34573c2 = jv7Var2.m34573c();
                if (iM34573c2 == i) {
                    jv7Var2.m34576f(i2);
                } else if (i + 1 <= iM34573c2 && iM34573c2 < i2) {
                    jv7Var2.m34576f(iM34573c2 - 1);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m20180l(int i) {
        this.f17228c = i;
    }

    /* renamed from: m */
    public final int m20181m(tc9 tc9Var) {
        sq8.m48649h(tc9Var, "keyInfo");
        jv7 jv7Var = (jv7) this.f17230e.get(Integer.valueOf(tc9Var.m49707b()));
        if (jv7Var != null) {
            return jv7Var.m34573c();
        }
        return -1;
    }

    /* renamed from: n */
    public final boolean m20182n(int i, int i2) {
        int iM34572b;
        jv7 jv7Var = (jv7) this.f17230e.get(Integer.valueOf(i));
        if (jv7Var == null) {
            return false;
        }
        int iM34572b2 = jv7Var.m34572b();
        int iM34571a = i2 - jv7Var.m34571a();
        jv7Var.m34574d(i2);
        if (iM34571a == 0) {
            return true;
        }
        Collection<jv7> collectionValues = this.f17230e.values();
        sq8.m48648g(collectionValues, "groupInfos.values");
        for (jv7 jv7Var2 : collectionValues) {
            if (jv7Var2.m34572b() >= iM34572b2 && !sq8.m48644c(jv7Var2, jv7Var) && (iM34572b = jv7Var2.m34572b() + iM34571a) >= 0) {
                jv7Var2.m34575e(iM34572b);
            }
        }
        return true;
    }

    /* renamed from: o */
    public final int m20183o(tc9 tc9Var) {
        sq8.m48649h(tc9Var, "keyInfo");
        jv7 jv7Var = (jv7) this.f17230e.get(Integer.valueOf(tc9Var.m49707b()));
        return jv7Var != null ? jv7Var.m34571a() : tc9Var.m49708c();
    }
}
