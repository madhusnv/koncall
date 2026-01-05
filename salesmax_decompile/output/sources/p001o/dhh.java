package p001o;

/* loaded from: classes2.dex */
public abstract class dhh {
    /* renamed from: a */
    public static final nh0 m23155a(chh chhVar) {
        sq8.m48649h(chhVar, "<this>");
        return chhVar.m21287a().m40560k(chhVar.m21288b());
    }

    /* renamed from: b */
    public static final nh0 m23156b(chh chhVar, int i) {
        sq8.m48649h(chhVar, "<this>");
        return chhVar.m21287a().subSequence(kih.m35761h(chhVar.m21288b()), Math.min(kih.m35761h(chhVar.m21288b()) + i, chhVar.m21289c().length()));
    }

    /* renamed from: c */
    public static final nh0 m23157c(chh chhVar, int i) {
        sq8.m48649h(chhVar, "<this>");
        return chhVar.m21287a().subSequence(Math.max(0, kih.m35762i(chhVar.m21288b()) - i), kih.m35762i(chhVar.m21288b()));
    }
}
