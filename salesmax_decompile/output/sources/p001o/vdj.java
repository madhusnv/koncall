package p001o;

/* loaded from: classes3.dex */
public abstract class vdj {
    /* renamed from: a */
    public static final vej m52647a(vej vejVar) {
        sq8.m48649h(vejVar, "root");
        if (sq8.m48644c(vejVar.m52683c(), "Error")) {
            return vejVar;
        }
        throw new an5("invalid error, expected <Error>; found `" + vejVar.m52682b() + '`');
    }
}
