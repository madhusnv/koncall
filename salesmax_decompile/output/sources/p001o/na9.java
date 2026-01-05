package p001o;

/* loaded from: classes3.dex */
public final class na9 implements hu6 {

    /* renamed from: a */
    public final String f36627a;

    public na9(String str) {
        sq8.m48649h(str, "name");
        this.f36627a = str;
    }

    /* renamed from: a */
    public final String m40278a() {
        return this.f36627a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na9) && sq8.m48644c(this.f36627a, ((na9) obj).f36627a);
    }

    public int hashCode() {
        return this.f36627a.hashCode();
    }

    public String toString() {
        return "JsonSerialName(name=" + this.f36627a + ')';
    }
}
