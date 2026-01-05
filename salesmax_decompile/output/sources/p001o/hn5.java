package p001o;

import java.util.ArrayList;
import p001o.aff;
import p001o.dn5;
import p001o.ln5;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class hn5 {
    /* renamed from: c */
    public static final void m30844c(ln5.C15108a c15108a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12160g.f14619a, new na9("Languages"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                dn5.InterfaceC12995a interfaceC12995aMo23577c = i89Var.mo23577c(h7fVar);
                ArrayList arrayList = new ArrayList();
                while (interfaceC12995aMo23577c.mo23581d()) {
                    if (interfaceC12995aMo23577c.mo23580a()) {
                        arrayList.add(yw5.m58396a(i89Var));
                    } else {
                        interfaceC12995aMo23577c.mo31725e();
                    }
                }
                c15108a.m37516d(arrayList);
            } else if (numMo23583m == null) {
                return;
            } else {
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Void m30845d(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        Throwable xp3Var;
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            if (strMo18271a == null) {
                xp3Var = new xp3(ij6VarM32630a.getMessage());
            } else {
                int iHashCode = strMo18271a.hashCode();
                if (iHashCode != 588566607) {
                    if (iHashCode != 734598063) {
                        if (iHashCode == 1148038775 && strMo18271a.equals("InvalidRequestException")) {
                            xp3Var = new nt8().mo16296b(jl6Var, o18VarM41344c, bArr);
                        }
                    } else if (strMo18271a.equals("InternalServerException")) {
                        xp3Var = new fq8().mo16296b(jl6Var, o18VarM41344c, bArr);
                    }
                } else if (strMo18271a.equals("TextSizeLimitExceededException")) {
                    xp3Var = new rih().mo16296b(jl6Var, o18VarM41344c, bArr);
                }
            }
            b2e.m18117a(xp3Var, g48VarM31020b, ij6VarM32630a);
            throw xp3Var;
        } catch (Exception e) {
            xp3 xp3Var2 = new xp3("Failed to parse response as 'awsJson1_1' error", e);
            b2e.m18117a(xp3Var2, o18VarM41344c.m41347f(), null);
            throw xp3Var2;
        }
    }
}
