package p001o;

/* loaded from: classes2.dex */
public abstract class wdj {
    /* renamed from: a */
    public static final vej m54243a(vej vejVar) {
        sq8.m48649h(vejVar, "root");
        if (!sq8.m48644c(vejVar.m52683c(), "ErrorResponse")) {
            throw new an5("invalid root, expected <ErrorResponse>; found `" + vejVar.m52682b() + '`');
        }
        vej vejVarM52684d = vejVar.m52684d();
        if (vejVarM52684d != null && sq8.m48644c(vejVarM52684d.m52683c(), "Error")) {
            return vejVarM52684d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid error, expected <Error>; found `");
        sb.append(vejVarM52684d != null ? vejVarM52684d.m52682b() : null);
        sb.append('`');
        throw new an5(sb.toString());
    }
}
