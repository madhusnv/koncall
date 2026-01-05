package p001o;

/* loaded from: classes2.dex */
public abstract class k81 {
    /* renamed from: a */
    public static final vej m35158a(vej vejVar, String str) {
        sq8.m48649h(vejVar, "root");
        sq8.m48649h(str, "operationName");
        String str2 = str + "Response";
        String str3 = str + "Result";
        if (!sq8.m48644c(vejVar.m52683c(), str2)) {
            throw new an5("invalid root, expected " + str2 + "; found `" + vejVar.m52682b() + '`');
        }
        vej vejVarM52684d = vejVar.m52684d();
        if (vejVarM52684d != null && sq8.m48644c(vejVarM52684d.m52683c(), str3)) {
            return vejVarM52684d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid result, expected ");
        sb.append(str3);
        sb.append("; found `");
        sb.append(vejVarM52684d != null ? vejVarM52684d.m52682b() : null);
        sb.append('`');
        throw new an5(sb.toString());
    }
}
