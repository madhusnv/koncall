package p001o;

/* loaded from: classes3.dex */
public abstract class mx7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* renamed from: b */
    public static final Void m39757b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        gxe gxeVarM48644c = 0;
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            gxe gxeVar = bArr == null ? sq8.m48644c(o18Var.m41347f().getStatus(), s48.f44774c.m47770B()) ? new gxe("NotFound", null, null, null, 14, null) : new gxe(o18Var.m41347f().getStatus().toString(), null, null, null, 14, null) : ixe.m32886a(bArr);
            gxeVarM48644c = sq8.m48644c(gxeVar.mo18271a(), "NotFound");
            Throwable thMo16296b = gxeVarM48644c != 0 ? new t0c().mo16296b(jl6Var, o18VarM41344c, bArr) : new jxe(gxeVar.getMessage());
            ixe.m32887b(thMo16296b, g48VarM31020b, gxeVar);
            throw thMo16296b;
        } catch (Exception unused) {
            jxe jxeVar = new jxe("Failed to parse response as restXml error");
            ixe.m32887b(jxeVar, o18VarM41344c.m41347f(), gxeVarM48644c);
            throw jxeVar;
        }
    }
}
