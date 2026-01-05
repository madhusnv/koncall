package p001o;

/* loaded from: classes2.dex */
public abstract class v9g {
    /* renamed from: a */
    public static final String m52477a(f9d f9dVar) {
        sq8.m48649h(f9dVar, "platformEnvironProvider");
        String str = (String) bj6.m19237f(o81.f37890a.m41746s(), f9dVar);
        if (str != null) {
            return str;
        }
        return "aws-sdk-kotlin-" + jk8.m33904b(gk8.f25374b.m28963g());
    }

    /* renamed from: b */
    public static /* synthetic */ String m52478b(f9d f9dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f9dVar = r9d.f43250a.m46382a();
        }
        return m52477a(f9dVar);
    }
}
