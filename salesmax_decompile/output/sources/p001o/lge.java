package p001o;

/* loaded from: classes6.dex */
public class lge {
    /* renamed from: a */
    public rb9 m37157a(cm7 cm7Var) {
        return cm7Var;
    }

    /* renamed from: b */
    public ob9 m37158b(Class cls) {
        return new fa3(cls);
    }

    /* renamed from: c */
    public qb9 m37159c(Class cls, String str) {
        return new hic(cls, str);
    }

    /* renamed from: d */
    public yb9 m37160d(spb spbVar) {
        return spbVar;
    }

    /* renamed from: e */
    public bc9 m37161e(trd trdVar) {
        return trdVar;
    }

    /* renamed from: f */
    public cc9 m37162f(vrd vrdVar) {
        return vrdVar;
    }

    /* renamed from: g */
    public String m37163g(bm7 bm7Var) {
        String string = bm7Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* renamed from: h */
    public String m37164h(kf9 kf9Var) {
        return m37163g(kf9Var);
    }
}
