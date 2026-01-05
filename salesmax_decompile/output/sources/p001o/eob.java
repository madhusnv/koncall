package p001o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p001o.dhe;
import p001o.gjb;

/* loaded from: classes5.dex */
public class eob {

    /* renamed from: e */
    public static final C13240c f21989e = new C13240c();

    /* renamed from: f */
    public static final gjb f21990f = new C13238a();

    /* renamed from: a */
    public final List f21991a;

    /* renamed from: b */
    public final C13240c f21992b;

    /* renamed from: c */
    public final Set f21993c;

    /* renamed from: d */
    public final ged f21994d;

    /* renamed from: o.eob$a */
    public static class C13238a implements gjb {
        @Override // p001o.gjb
        /* renamed from: a */
        public boolean mo18149a(Object obj) {
            return false;
        }

        @Override // p001o.gjb
        /* renamed from: b */
        public gjb.C13758a mo18150b(Object obj, int i, int i2, rec recVar) {
            return null;
        }
    }

    /* renamed from: o.eob$b */
    public static class C13239b {

        /* renamed from: a */
        public final Class f21995a;

        /* renamed from: b */
        public final Class f21996b;

        /* renamed from: c */
        public final hjb f21997c;

        public C13239b(Class cls, Class cls2, hjb hjbVar) {
            this.f21995a = cls;
            this.f21996b = cls2;
            this.f21997c = hjbVar;
        }

        /* renamed from: a */
        public boolean m25387a(Class cls) {
            return this.f21995a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m25388b(Class cls, Class cls2) {
            return m25387a(cls) && this.f21996b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: o.eob$c */
    public static class C13240c {
        /* renamed from: a */
        public dob m25389a(List list, ged gedVar) {
            return new dob(list, gedVar);
        }
    }

    public eob(ged gedVar) {
        this(gedVar, f21989e);
    }

    /* renamed from: f */
    public static gjb m25380f() {
        return f21990f;
    }

    /* renamed from: a */
    public final void m25381a(Class cls, Class cls2, hjb hjbVar, boolean z) {
        C13239b c13239b = new C13239b(cls, cls2, hjbVar);
        List list = this.f21991a;
        list.add(z ? list.size() : 0, c13239b);
    }

    /* renamed from: b */
    public synchronized void m25382b(Class cls, Class cls2, hjb hjbVar) {
        m25381a(cls, cls2, hjbVar, true);
    }

    /* renamed from: c */
    public synchronized List m25383c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C13239b c13239b : this.f21991a) {
                if (!this.f21993c.contains(c13239b) && c13239b.m25387a(cls)) {
                    this.f21993c.add(c13239b);
                    arrayList.add(m25385e(c13239b));
                    this.f21993c.remove(c13239b);
                }
            }
        } catch (Throwable th) {
            this.f21993c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized gjb m25384d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C13239b c13239b : this.f21991a) {
                if (this.f21993c.contains(c13239b)) {
                    z = true;
                } else if (c13239b.m25388b(cls, cls2)) {
                    this.f21993c.add(c13239b);
                    arrayList.add(m25385e(c13239b));
                    this.f21993c.remove(c13239b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f21992b.m25389a(arrayList, this.f21994d);
            }
            if (arrayList.size() == 1) {
                return (gjb) arrayList.get(0);
            }
            if (!z) {
                throw new dhe.C12918c(cls, cls2);
            }
            return m25380f();
        } catch (Throwable th) {
            this.f21993c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public final gjb m25385e(C13239b c13239b) {
        return (gjb) bgd.m18886d(c13239b.f21997c.mo18152b(this));
    }

    /* renamed from: g */
    public synchronized List m25386g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C13239b c13239b : this.f21991a) {
            if (!arrayList.contains(c13239b.f21996b) && c13239b.m25387a(cls)) {
                arrayList.add(c13239b.f21996b);
            }
        }
        return arrayList;
    }

    public eob(ged gedVar, C13240c c13240c) {
        this.f21991a = new ArrayList();
        this.f21993c = new HashSet();
        this.f21994d = gedVar;
        this.f21992b = c13240c;
    }
}
