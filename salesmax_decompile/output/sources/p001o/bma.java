package p001o;

/* loaded from: classes3.dex */
public class bma {

    /* renamed from: b */
    public static final bma f16530b = new bma();

    /* renamed from: a */
    public final xma f16531a = new xma(20);

    /* renamed from: b */
    public static bma m19372b() {
        return f16530b;
    }

    /* renamed from: a */
    public ama m19373a(String str) {
        if (str == null) {
            return null;
        }
        return (ama) this.f16531a.get(str);
    }

    /* renamed from: c */
    public void m19374c(String str, ama amaVar) {
        if (str == null) {
            return;
        }
        this.f16531a.put(str, amaVar);
    }
}
