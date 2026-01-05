package p001o;

import p001o.mq3;

/* loaded from: classes2.dex */
public final class g41 extends mq3.AbstractC15402a {

    /* renamed from: a */
    public final String f24551a;

    /* renamed from: b */
    public final Class f24552b;

    /* renamed from: c */
    public final Object f24553c;

    public g41(String str, Class cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f24551a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f24552b = cls;
        this.f24553c = obj;
    }

    @Override // p001o.mq3.AbstractC15402a
    /* renamed from: c */
    public String mo28031c() {
        return this.f24551a;
    }

    @Override // p001o.mq3.AbstractC15402a
    /* renamed from: d */
    public Object mo28032d() {
        return this.f24553c;
    }

    @Override // p001o.mq3.AbstractC15402a
    /* renamed from: e */
    public Class mo28033e() {
        return this.f24552b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mq3.AbstractC15402a)) {
            return false;
        }
        mq3.AbstractC15402a abstractC15402a = (mq3.AbstractC15402a) obj;
        if (this.f24551a.equals(abstractC15402a.mo28031c()) && this.f24552b.equals(abstractC15402a.mo28033e())) {
            Object obj2 = this.f24553c;
            if (obj2 == null) {
                if (abstractC15402a.mo28032d() == null) {
                    return true;
                }
            } else if (obj2.equals(abstractC15402a.mo28032d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f24551a.hashCode() ^ 1000003) * 1000003) ^ this.f24552b.hashCode()) * 1000003;
        Object obj = this.f24553c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f24551a + ", valueClass=" + this.f24552b + ", token=" + this.f24553c + "}";
    }
}
