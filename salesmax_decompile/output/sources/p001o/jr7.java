package p001o;

import p001o.aff;
import p001o.dn5;
import p001o.mr7;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class jr7 {
    /* renamed from: c */
    public static final void m34391c(mr7.C15405a c15405a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12164k.f14623a, new na9("SynthesisTask"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c15405a.m39521d(shg.m48356a(i89Var));
            } else if (numMo23583m == null) {
                return;
            } else {
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m34392d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable pddVar;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a == null) {
                pddVar = new pdd(ij6VarM32630a.getMessage());
            } else {
                int iHashCode = strMo18271a.hashCode();
                if (iHashCode != -1634658681) {
                    if (iHashCode != -1276726630) {
                        if (iHashCode == -1224535080 && strMo18271a.equals("InvalidTaskIdException")) {
                            pddVar = new dv8().mo16296b(jl6Var, o18VarM41344c, bArr);
                        }
                    } else if (strMo18271a.equals("ServiceFailureException")) {
                        pddVar = new jgf().mo16296b(jl6Var, o18VarM41344c, bArr);
                    }
                } else if (strMo18271a.equals("SynthesisTaskNotFoundException")) {
                    pddVar = new uhg().mo16296b(jl6Var, o18VarM41344c, bArr);
                }
            }
            b2e.m18117a(pddVar, g48VarM31020b, ij6VarM32630a);
            throw pddVar;
        } catch (Exception e) {
            pdd pddVar2 = new pdd("Failed to parse response as 'restJson1' error", e);
            b2e.m18117a(pddVar2, o18VarM41344c.m41347f(), null);
            throw pddVar2;
        }
    }
}
