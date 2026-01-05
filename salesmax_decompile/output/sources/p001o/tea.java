package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.xea;

/* loaded from: classes3.dex */
public abstract class tea {
    /* renamed from: c */
    public static final void m49787c(xea.C18127a c18127a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12160g.f14619a, new na9("Lexicons"));
        h7f h7fVar2 = new h7f(aff.C12163j.f14622a, new na9("NextToken"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                dn5.InterfaceC12995a interfaceC12995aMo23577c = i89Var.mo23577c(h7fVar);
                ArrayList arrayList = new ArrayList();
                while (interfaceC12995aMo23577c.mo23581d()) {
                    if (interfaceC12995aMo23577c.mo23580a()) {
                        arrayList.add(dca.m22806a(i89Var));
                    } else {
                        interfaceC12995aMo23577c.mo31725e();
                    }
                }
                c18127a.m56171e(arrayList);
            } else {
                int iM29946a2 = h7fVar2.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                    c18127a.m56172f(interfaceC12997cMo23579h.mo31726i());
                } else if (numMo23583m == null) {
                    return;
                } else {
                    interfaceC12997cMo23579h.skipValue();
                }
            }
        }
    }

    /* renamed from: d */
    public static final Void m49788d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            Throwable thMo16296b = !sq8.m48644c(strMo18271a, "ServiceFailureException") ? sq8.m48644c(strMo18271a, "InvalidNextTokenException") ? new gs8().mo16296b(jl6Var, o18VarM41344c, bArr) : new pdd(ij6VarM32630a.getMessage()) : new jgf().mo16296b(jl6Var, o18VarM41344c, bArr);
            b2e.m18117a(thMo16296b, g48VarM31020b, ij6VarM32630a);
            throw thMo16296b;
        } catch (Exception e) {
            pdd pddVar = new pdd("Failed to parse response as 'restJson1' error", e);
            b2e.m18117a(pddVar, o18VarM41344c.m41347f(), null);
            throw pddVar;
        }
    }
}
