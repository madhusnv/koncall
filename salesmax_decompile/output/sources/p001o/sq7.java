package p001o;

/* loaded from: classes3.dex */
public abstract class sq7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.String] */
    /* renamed from: b */
    public static final Void m48641b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        gxe gxeVarMo18271a = 0;
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            gxe gxeVar = bArr == null ? sq8.m48644c(o18Var.m41347f().getStatus(), s48.f44774c.m47770B()) ? new gxe("NotFound", null, null, null, 14, null) : new gxe(o18Var.m41347f().getStatus().toString(), null, null, null, 14, null) : ixe.m32886a(bArr);
            gxeVarMo18271a = gxeVar.mo18271a();
            Throwable thMo16296b = !sq8.m48644c(gxeVarMo18271a, "NoSuchKey") ? sq8.m48644c(gxeVarMo18271a, "InvalidObjectState") ? new ks8().mo16296b(jl6Var, o18VarM41344c, bArr) : new jxe(gxeVar.getMessage()) : new ozb().mo16296b(jl6Var, o18VarM41344c, bArr);
            ixe.m32887b(thMo16296b, g48VarM31020b, gxeVar);
            throw thMo16296b;
        } catch (Exception unused) {
            jxe jxeVar = new jxe("Failed to parse response as restXml error");
            ixe.m32887b(jxeVar, o18VarM41344c.m41347f(), gxeVarMo18271a);
            throw jxeVar;
        }
    }
}
