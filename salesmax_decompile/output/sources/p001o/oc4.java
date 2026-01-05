package p001o;

/* loaded from: classes3.dex */
public abstract class oc4 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ic4 m41961a(ic4 ic4Var, String str, String str2, String str3, gk8 gk8Var, String str4, qx0 qx0Var) {
        tob tobVarM50745j;
        sq8.m48649h(ic4Var, "<this>");
        sq8.m48649h(str, "accessKeyId");
        sq8.m48649h(str2, "secretAccessKey");
        qx0 qx0Var2 = qx0Var;
        qx0Var2 = qx0Var;
        if (ic4Var.mo31897b() != null && str4 == null) {
            if (qx0Var == null || (tobVarM50745j = tx0.m50745j(qx0Var)) == null) {
                qx0Var2 = null;
            } else {
                tobVarM50745j.mo34003q(mb8.f35104a.m38677a());
                boolean zM50738c = tx0.m50738c(tobVarM50745j);
                qx0Var2 = tobVarM50745j;
                if (!zM50738c) {
                }
            }
        }
        return ic4.f28446a.m31900a(str, str2, str3, gk8Var, str4, qx0Var2);
    }

    /* renamed from: b */
    public static /* synthetic */ ic4 m41962b(ic4 ic4Var, String str, String str2, String str3, gk8 gk8Var, String str4, qx0 qx0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ic4Var.mo31898d();
        }
        if ((i & 2) != 0) {
            str2 = ic4Var.mo31896a();
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = ic4Var.getSessionToken();
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            gk8Var = ic4Var.mo29762c();
        }
        gk8 gk8Var2 = gk8Var;
        if ((i & 16) != 0) {
            str4 = ic4Var.mo31897b();
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            qx0Var = ic4Var.getAttributes();
        }
        return m41961a(ic4Var, str, str5, str6, gk8Var2, str7, qx0Var);
    }
}
