package p001o;

/* loaded from: classes5.dex */
public final class n76 {

    /* renamed from: a */
    public final String f36510a;

    public n76(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f36510a = str;
    }

    /* renamed from: b */
    public static n76 m40202b(String str) {
        return new n76(str);
    }

    /* renamed from: a */
    public String m40203a() {
        return this.f36510a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n76) {
            return this.f36510a.equals(((n76) obj).f36510a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36510a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f36510a + "\"}";
    }
}
