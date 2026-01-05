package qi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.q */
/* loaded from: classes.dex */
public final class C6234q {

    /* renamed from: a */
    public final Class f30253a;

    /* renamed from: b */
    public final Class f30254b;

    public C6234q(Class cls, Class cls2) {
        this.f30253a = cls;
        this.f30254b = cls2;
    }

    /* renamed from: a */
    public static C6234q m12250a(Class cls) {
        return new C6234q(InterfaceC6233p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6234q.class != obj.getClass()) {
            return false;
        }
        C6234q c6234q = (C6234q) obj;
        if (this.f30254b.equals(c6234q.f30254b)) {
            return this.f30253a.equals(c6234q.f30253a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30253a.hashCode() + (this.f30254b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f30254b;
        Class cls2 = this.f30253a;
        if (cls2 == InterfaceC6233p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
