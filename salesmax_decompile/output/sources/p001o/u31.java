package p001o;

import p001o.ox0;

/* loaded from: classes6.dex */
public final class u31 extends ox0.AbstractC15909a {

    /* renamed from: a */
    public final String f48226a;

    public u31(String str) {
        if (str == null) {
            throw new NullPointerException("Null stringValue");
        }
        this.f48226a = str;
    }

    @Override // p001o.ox0.AbstractC15909a
    /* renamed from: c */
    public String mo42753c() {
        return this.f48226a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ox0.AbstractC15909a) {
            return this.f48226a.equals(((ox0.AbstractC15909a) obj).mo42753c());
        }
        return false;
    }

    public int hashCode() {
        return this.f48226a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueString{stringValue=" + this.f48226a + "}";
    }
}
