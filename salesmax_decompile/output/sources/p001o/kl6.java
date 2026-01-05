package p001o;

/* loaded from: classes2.dex */
public final class kl6 {

    /* renamed from: a */
    public final String f32366a;

    public kl6(String str) {
        sq8.m48649h(str, "name");
        this.f32366a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl6) && sq8.m48644c(this.f32366a, ((kl6) obj).f32366a);
    }

    public int hashCode() {
        return this.f32366a.hashCode();
    }

    public String toString() {
        return i91.m31760e("exec-env", this.f32366a, null, 4, null);
    }
}
