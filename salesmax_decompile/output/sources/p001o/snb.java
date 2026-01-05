package p001o;

/* loaded from: classes5.dex */
public class snb {

    /* renamed from: a */
    public Class f45679a;

    /* renamed from: b */
    public Class f45680b;

    /* renamed from: c */
    public Class f45681c;

    public snb() {
    }

    /* renamed from: a */
    public void m48582a(Class cls, Class cls2, Class cls3) {
        this.f45679a = cls;
        this.f45680b = cls2;
        this.f45681c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        snb snbVar = (snb) obj;
        return this.f45679a.equals(snbVar.f45679a) && this.f45680b.equals(snbVar.f45680b) && uqi.m51922c(this.f45681c, snbVar.f45681c);
    }

    public int hashCode() {
        int iHashCode = ((this.f45679a.hashCode() * 31) + this.f45680b.hashCode()) * 31;
        Class cls = this.f45681c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f45679a + ", second=" + this.f45680b + '}';
    }

    public snb(Class cls, Class cls2, Class cls3) {
        m48582a(cls, cls2, cls3);
    }
}
