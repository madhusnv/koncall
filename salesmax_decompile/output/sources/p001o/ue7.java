package p001o;

/* loaded from: classes3.dex */
public final class ue7 implements hu6 {

    /* renamed from: a */
    public final String f48767a;

    public ue7(String str) {
        sq8.m48649h(str, "name");
        this.f48767a = str;
    }

    /* renamed from: a */
    public final String m51399a() {
        return this.f48767a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue7) && sq8.m48644c(this.f48767a, ((ue7) obj).f48767a);
    }

    public int hashCode() {
        return this.f48767a.hashCode();
    }

    public String toString() {
        return "FormUrlSerialName(name=" + this.f48767a + ')';
    }
}
