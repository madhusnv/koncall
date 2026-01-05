package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.b9i;
import p001o.bhf;

/* loaded from: classes2.dex */
public final class b9i {

    /* renamed from: a */
    public final String f15812a;

    /* renamed from: b */
    public final Map f15813b = new LinkedHashMap();

    /* renamed from: o.b9i$a */
    public interface InterfaceC12334a {
        /* renamed from: a */
        boolean mo16702a(C12335b c12335b);
    }

    /* renamed from: o.b9i$b */
    public static final class C12335b {

        /* renamed from: a */
        public final bhf f15814a;

        /* renamed from: b */
        public final c9i f15815b;

        /* renamed from: c */
        public final k7g f15816c;

        /* renamed from: d */
        public final List f15817d;

        /* renamed from: e */
        public boolean f15818e = false;

        /* renamed from: f */
        public boolean f15819f = false;

        public C12335b(bhf bhfVar, c9i c9iVar, k7g k7gVar, List list) {
            this.f15814a = bhfVar;
            this.f15815b = c9iVar;
            this.f15816c = k7gVar;
            this.f15817d = list;
        }

        /* renamed from: a */
        public boolean m18492a() {
            return this.f15819f;
        }

        /* renamed from: b */
        public boolean m18493b() {
            return this.f15818e;
        }

        /* renamed from: c */
        public List m18494c() {
            return this.f15817d;
        }

        /* renamed from: d */
        public bhf m18495d() {
            return this.f15814a;
        }

        /* renamed from: e */
        public k7g m18496e() {
            return this.f15816c;
        }

        /* renamed from: f */
        public c9i m18497f() {
            return this.f15815b;
        }

        /* renamed from: g */
        public void m18498g(boolean z) {
            this.f15819f = z;
        }

        /* renamed from: h */
        public void m18499h(boolean z) {
            this.f15818e = z;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f15814a + ", mUseCaseConfig=" + this.f15815b + ", mStreamSpec=" + this.f15816c + ", mCaptureTypes=" + this.f15817d + ", mAttached=" + this.f15818e + ", mActive=" + this.f15819f + '}';
        }
    }

    public b9i(String str) {
        this.f15812a = str;
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m18471p(C12335b c12335b) {
        return c12335b.m18492a() && c12335b.m18493b();
    }

    /* renamed from: e */
    public bhf.C12408h m18475e() {
        bhf.C12408h c12408h = new bhf.C12408h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f15813b.entrySet()) {
            C12335b c12335b = (C12335b) entry.getValue();
            if (c12335b.m18492a() && c12335b.m18493b()) {
                String str = (String) entry.getKey();
                c12408h.m19080b(c12335b.m18495d());
                arrayList.add(str);
            }
        }
        wja.m54627a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f15812a);
        return c12408h;
    }

    /* renamed from: f */
    public Collection m18476f() {
        return Collections.unmodifiableCollection(m18482l(new InterfaceC12334a() { // from class: o.z8i
            @Override // p001o.b9i.InterfaceC12334a
            /* renamed from: a */
            public final boolean mo16702a(b9i.C12335b c12335b) {
                return b9i.m18471p(c12335b);
            }
        }));
    }

    /* renamed from: g */
    public bhf.C12408h m18477g() {
        bhf.C12408h c12408h = new bhf.C12408h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f15813b.entrySet()) {
            C12335b c12335b = (C12335b) entry.getValue();
            if (c12335b.m18493b()) {
                c12408h.m19080b(c12335b.m18495d());
                arrayList.add((String) entry.getKey());
            }
        }
        wja.m54627a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f15812a);
        return c12408h;
    }

    /* renamed from: h */
    public Collection m18478h() {
        return Collections.unmodifiableCollection(m18482l(new InterfaceC12334a() { // from class: o.x8i
            @Override // p001o.b9i.InterfaceC12334a
            /* renamed from: a */
            public final boolean mo16702a(b9i.C12335b c12335b) {
                return c12335b.m18493b();
            }
        }));
    }

    /* renamed from: i */
    public Collection m18479i() {
        return Collections.unmodifiableCollection(m18483m(new InterfaceC12334a() { // from class: o.y8i
            @Override // p001o.b9i.InterfaceC12334a
            /* renamed from: a */
            public final boolean mo16702a(b9i.C12335b c12335b) {
                return c12335b.m18493b();
            }
        }));
    }

    /* renamed from: j */
    public Collection m18480j() {
        return Collections.unmodifiableCollection(m18484n(new InterfaceC12334a() { // from class: o.a9i
            @Override // p001o.b9i.InterfaceC12334a
            /* renamed from: a */
            public final boolean mo16702a(b9i.C12335b c12335b) {
                return c12335b.m18493b();
            }
        }));
    }

    /* renamed from: k */
    public final C12335b m18481k(String str, bhf bhfVar, c9i c9iVar, k7g k7gVar, List list) {
        C12335b c12335b = (C12335b) this.f15813b.get(str);
        if (c12335b != null) {
            return c12335b;
        }
        C12335b c12335b2 = new C12335b(bhfVar, c9iVar, k7gVar, list);
        this.f15813b.put(str, c12335b2);
        return c12335b2;
    }

    /* renamed from: l */
    public final Collection m18482l(InterfaceC12334a interfaceC12334a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f15813b.entrySet()) {
            if (interfaceC12334a == null || interfaceC12334a.mo16702a((C12335b) entry.getValue())) {
                arrayList.add(((C12335b) entry.getValue()).m18495d());
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public final Collection m18483m(InterfaceC12334a interfaceC12334a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f15813b.entrySet()) {
            if (interfaceC12334a == null || interfaceC12334a.mo16702a((C12335b) entry.getValue())) {
                arrayList.add(((C12335b) entry.getValue()).m18497f());
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public final Collection m18484n(InterfaceC12334a interfaceC12334a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f15813b.entrySet()) {
            if (interfaceC12334a == null || interfaceC12334a.mo16702a((C12335b) entry.getValue())) {
                arrayList.add((C12335b) entry.getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public boolean m18485o(String str) {
        if (this.f15813b.containsKey(str)) {
            return ((C12335b) this.f15813b.get(str)).m18493b();
        }
        return false;
    }

    /* renamed from: t */
    public void m18486t(String str) {
        this.f15813b.remove(str);
    }

    /* renamed from: u */
    public void m18487u(String str, bhf bhfVar, c9i c9iVar, k7g k7gVar, List list) {
        m18481k(str, bhfVar, c9iVar, k7gVar, list).m18498g(true);
    }

    /* renamed from: v */
    public void m18488v(String str, bhf bhfVar, c9i c9iVar, k7g k7gVar, List list) {
        m18481k(str, bhfVar, c9iVar, k7gVar, list).m18499h(true);
        m18491y(str, bhfVar, c9iVar, k7gVar, list);
    }

    /* renamed from: w */
    public void m18489w(String str) {
        if (this.f15813b.containsKey(str)) {
            C12335b c12335b = (C12335b) this.f15813b.get(str);
            c12335b.m18499h(false);
            if (c12335b.m18492a()) {
                return;
            }
            this.f15813b.remove(str);
        }
    }

    /* renamed from: x */
    public void m18490x(String str) {
        if (this.f15813b.containsKey(str)) {
            C12335b c12335b = (C12335b) this.f15813b.get(str);
            c12335b.m18498g(false);
            if (c12335b.m18493b()) {
                return;
            }
            this.f15813b.remove(str);
        }
    }

    /* renamed from: y */
    public void m18491y(String str, bhf bhfVar, c9i c9iVar, k7g k7gVar, List list) {
        if (this.f15813b.containsKey(str)) {
            C12335b c12335b = new C12335b(bhfVar, c9iVar, k7gVar, list);
            C12335b c12335b2 = (C12335b) this.f15813b.get(str);
            c12335b.m18499h(c12335b2.m18493b());
            c12335b.m18498g(c12335b2.m18492a());
            this.f15813b.put(str, c12335b);
        }
    }
}
