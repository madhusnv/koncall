package p001o;

/* loaded from: classes3.dex */
public abstract class cec {
    /* renamed from: a */
    public static final hwc m21085a(j7f j7fVar) {
        sq8.m48649h(j7fVar, "<this>");
        String strM26259c = f7f.m26259c(j7fVar.m33381a());
        if (strM26259c == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String strM26258b = f7f.m26258b(j7fVar.m33381a());
        if (strM26258b == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String strM58869d = j7fVar.m33386f().m58869d();
        if (strM58869d == null) {
            strM58869d = strM26259c;
        }
        hth hthVarMo34509a = j7fVar.m33386f().m58868c().mo40628d().mo34509a(strM58869d);
        x54 x54VarMo28089a = j7fVar.m33386f().m58868c().mo40626b().mo28089a();
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.service", strM26259c);
        rx0Var.m47216b("rpc.method", strM26258b);
        tob tobVarM47215a = rx0Var.m47215a();
        tob tobVarM50745j = tx0.m50745j(j7fVar.m33386f().m58866a());
        tx0.m50739d(tobVarM50745j, tobVarM47215a);
        String str = strM26259c + '.' + strM26258b;
        String strM58871f = j7fVar.m33386f().m58871f();
        if (strM58871f == null) {
            strM58871f = str;
        }
        dth dthVarMo31126a = hthVarMo34509a.mo31126a(strM58871f, tobVarM50745j, j7fVar.m33386f().m58870e(), x54VarMo28089a);
        q74 q74VarPlus = new wdh(j7fVar.m33386f().m58868c()).plus(new cka(vyh.m53620a("rpc", str), vyh.m53620a("sdkInvocationId", l7f.m36670d(j7fVar.m33381a()))));
        jl6 jl6VarM33381a = j7fVar.m33381a();
        s38 s38Var = s38.f44646a;
        jl6VarM33381a.mo34002p(s38Var.m47572h(), j7fVar.m33386f().m58867b());
        j7fVar.m33381a().mo34002p(s38Var.m47570f(), tobVarM47215a);
        j7fVar.m33384d().add(new bec(j7fVar.m33386f().m58867b(), strM26259c, strM26258b, null, 8, null));
        return vyh.m53620a(dthVarMo31126a, q74VarPlus);
    }
}
