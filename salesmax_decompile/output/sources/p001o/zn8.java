package p001o;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class zn8 {
    /* renamed from: a */
    public static final Charset m59634a(y9b y9bVar) {
        Charset charsetM57395b;
        return (y9bVar == null || (charsetM57395b = y9b.m57395b(y9bVar, null, 1, null)) == null) ? sh2.f45422b : charsetM57395b;
    }

    /* renamed from: b */
    public static final hwc m59635b(y9b y9bVar) {
        Charset charset = sh2.f45422b;
        if (y9bVar != null) {
            Charset charsetM57395b = y9b.m57395b(y9bVar, null, 1, null);
            if (charsetM57395b == null) {
                y9bVar = y9b.f55104e.m57404b(y9bVar + "; charset=utf-8");
            } else {
                charset = charsetM57395b;
            }
        }
        return vyh.m53620a(charset, y9bVar);
    }

    /* renamed from: c */
    public static final String[] m59636c(et3 et3Var, String[] strArr) {
        sq8.m48649h(et3Var, "<this>");
        sq8.m48649h(strArr, "socketEnabledCipherSuites");
        return et3Var.m25559d() != null ? ggj.m28644x(et3Var.m25559d(), strArr, r93.f43201b.m46373c()) : strArr;
    }
}
