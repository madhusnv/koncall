package p001o;

/* loaded from: classes3.dex */
public final class mej implements hu6 {

    /* renamed from: a */
    public final String f35310a;

    public mej(String str) {
        sq8.m48649h(str, "name");
        this.f35310a = str;
    }

    /* renamed from: a */
    public final String m38864a() {
        return this.f35310a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mej) && sq8.m48644c(this.f35310a, ((mej) obj).f35310a);
    }

    public int hashCode() {
        return this.f35310a.hashCode();
    }

    public String toString() {
        return "XmlSerialName(name=" + this.f35310a + ')';
    }
}
