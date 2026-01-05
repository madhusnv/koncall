package p001o;

/* loaded from: classes3.dex */
public final class kx0 {

    /* renamed from: a */
    public final String f32774a;

    public kx0(String str) {
        sq8.m48649h(str, "name");
        this.f32774a = str;
        if (!(!f9g.d0(str))) {
            throw new IllegalArgumentException("AttributeKey name must not be blank".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kx0) && sq8.m48644c(this.f32774a, ((kx0) obj).f32774a);
    }

    public int hashCode() {
        return this.f32774a.hashCode();
    }

    public String toString() {
        return "AttributeKey(" + this.f32774a + ')';
    }
}
