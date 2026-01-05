package p001o;

/* loaded from: classes3.dex */
public interface ic4 extends ib8 {

    /* renamed from: a */
    public static final C14248a f28446a = C14248a.f28447a;

    /* renamed from: o.ic4$a */
    public static final class C14248a {

        /* renamed from: a */
        public static final /* synthetic */ C14248a f28447a = new C14248a();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Type inference failed for: r12v0, types: [o.qx0] */
        /* JADX WARN: Type inference failed for: r12v1, types: [o.qx0] */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v4, types: [o.tob] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ic4 m31900a(String str, String str2, String str3, gk8 gk8Var, String str4, qx0 qx0Var) {
            sq8.m48649h(str, "accessKeyId");
            sq8.m48649h(str2, "secretAccessKey");
            if (str4 != null) {
                if (!sq8.m48644c(qx0Var != 0 ? (String) qx0Var.mo18191b(mb8.f35104a.m38677a()) : null, str4)) {
                    if (qx0Var != 0) {
                        tob tobVarM50745j = tx0.m50745j(qx0Var);
                        qx0Var = tobVarM50745j;
                        if (tobVarM50745j == null) {
                            qx0Var = tx0.m50740e();
                        }
                        tx0.m50743h(qx0Var, mb8.f35104a.m38677a(), str4);
                    }
                }
            } else if (qx0Var == 0) {
                qx0Var = tx0.m50736a();
            }
            return new nc4(str, str2, str3, gk8Var, qx0Var);
        }
    }

    /* renamed from: o.ic4$b */
    public static final class C14249b {
        /* renamed from: a */
        public static String m31901a(ic4 ic4Var) {
            return (String) ic4Var.getAttributes().mo18191b(mb8.f35104a.m38677a());
        }
    }

    /* renamed from: a */
    String mo31896a();

    /* renamed from: b */
    String mo31897b();

    /* renamed from: d */
    String mo31898d();

    String getSessionToken();
}
