package p001o;

/* loaded from: classes3.dex */
public abstract class o84 {
    /* renamed from: a */
    public static final f84 m41759a(q74 q74Var, String str) {
        String strM26280K;
        sq8.m48649h(q74Var, "<this>");
        sq8.m48649h(str, "name");
        f84 f84Var = (f84) q74Var.get(f84.f22941c);
        if (f84Var == null || (strM26280K = f84Var.m26280K()) == null) {
            return new f84(str);
        }
        return new f84(strM26280K + ':' + str);
    }
}
