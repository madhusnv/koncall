package p001o;

/* loaded from: classes5.dex */
public abstract class ovh implements Cloneable {

    /* renamed from: a */
    public nvh f38985a = rzb.m47355c();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ovh clone() {
        try {
            return (ovh) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final nvh m42724b() {
        return this.f38985a;
    }

    /* renamed from: c */
    public final ovh m42725c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ovh) {
            return uqi.m51922c(this.f38985a, ((ovh) obj).f38985a);
        }
        return false;
    }

    /* renamed from: f */
    public final ovh m42726f(nvh nvhVar) {
        this.f38985a = (nvh) bgd.m18886d(nvhVar);
        return m42725c();
    }

    public int hashCode() {
        nvh nvhVar = this.f38985a;
        if (nvhVar != null) {
            return nvhVar.hashCode();
        }
        return 0;
    }
}
