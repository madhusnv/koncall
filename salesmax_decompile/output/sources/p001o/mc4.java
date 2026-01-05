package p001o;

/* loaded from: classes2.dex */
public abstract class mc4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [o.qx0] */
    /* renamed from: a */
    public static final ic4 m38705a(String str, String str2, String str3, gk8 gk8Var, String str4, String str5) {
        tob tobVarM50736a;
        sq8.m48649h(str, "accessKeyId");
        sq8.m48649h(str2, "secretAccessKey");
        if (str4 == null && str5 == null) {
            tobVarM50736a = tx0.m50736a();
        } else {
            tob tobVarM50740e = tx0.m50740e();
            tx0.m50743h(tobVarM50740e, mb8.f35104a.m38677a(), str4);
            tx0.m50743h(tobVarM50740e, m71.f34915a.m38471a(), str5);
            tobVarM50736a = tobVarM50740e;
        }
        return ic4.f28446a.m31900a(str, str2, (16 & 4) != 0 ? null : str3, (16 & 8) != 0 ? null : gk8Var, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : tobVarM50736a);
    }
}
