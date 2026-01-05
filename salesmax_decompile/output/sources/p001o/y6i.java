package p001o;

/* loaded from: classes3.dex */
public abstract class y6i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.o18] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.o18] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Throwable, o.jxe] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [o.gxe] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* renamed from: b */
    public static final Void m57320b(jl6 jl6Var, o18 o18Var, byte[] bArr) {
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        ?? message = 0;
        ?? M41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            gxe gxeVar = bArr == null ? sq8.m48644c(o18Var.m41347f().getStatus(), s48.f44774c.m47770B()) ? new gxe("NotFound", null, null, null, 14, null) : new gxe(o18Var.m41347f().getStatus().toString(), null, null, null, 14, null) : ixe.m32886a(bArr);
            gxeVar.mo18271a();
            message = gxeVar.getMessage();
            M41344c = new jxe(message);
            ixe.m32887b(M41344c, g48VarM31020b, gxeVar);
            throw M41344c;
        } catch (Exception unused) {
            jxe jxeVar = new jxe("Failed to parse response as restXml error");
            ixe.m32887b(jxeVar, M41344c.m41347f(), message);
            throw jxeVar;
        }
    }
}
