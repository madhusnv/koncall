package p001o;

/* loaded from: classes3.dex */
public abstract class aa {

    /* renamed from: a */
    public final String f14333a;

    /* renamed from: b */
    public final String f14334b;

    public aa(String str, String str2) {
        sq8.m48649h(str, "uri");
        this.f14333a = str;
        this.f14334b = str2;
    }

    /* renamed from: a */
    public final String m16707a() {
        return this.f14334b;
    }

    /* renamed from: b */
    public final String m16708b() {
        return this.f14333a;
    }

    public String toString() {
        return "AbstractXmlNamespace(uri=" + this.f14333a + ", prefix=" + this.f14334b + ')';
    }
}
