package p001o;

import java.util.Locale;
import p001o.l8i;
import p001o.u2e;

/* loaded from: classes3.dex */
public final class qac implements t01 {

    /* renamed from: d */
    public final y2e f41535d;

    public qac(y2e y2eVar) {
        sq8.m48649h(y2eVar, "selector");
        this.f41535d = y2eVar;
    }

    @Override // p001o.t01
    /* renamed from: a */
    public ule mo31614a(bve bveVar, zqe zqeVar) {
        sq8.m48649h(zqeVar, "response");
        if (zqeVar.m59732Q().m51734e("Proxy-Authorization") != null) {
            return null;
        }
        w48 w48VarM51741l = zqeVar.m59732Q().m51741l();
        l8i.C15037b c15037b = l8i.f33466k;
        l8i.C15036a c15036a = new l8i.C15036a();
        c15036a.m36775p(new a6f(w48VarM51741l.m53886r(), w48VarM51741l.m53882n()));
        c15036a.m36773n(y08.f54673a.m57086a(w48VarM51741l.m53877h()));
        c15036a.m36774o(Integer.valueOf(w48VarM51741l.m53882n()));
        u2e u2eVarMo52844a = this.f41535d.mo52844a(c15036a.m36761b());
        kei keiVarM36760g = u2eVarMo52844a instanceof u2e.C17286b ? ((u2e.C17286b) u2eVarMo52844a).m50869a().m36760g() : null;
        if (keiVarM36760g == null) {
            return null;
        }
        for (bg2 bg2Var : zqeVar.m59738g()) {
            String lowerCase = bg2Var.m18845d().toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            if (sq8.m48644c(lowerCase, "okhttp-preemptive") || sq8.m48644c(bg2Var.m18845d(), "Basic")) {
                return zqeVar.m59732Q().m51738i().m51757n("Proxy-Authorization", jc4.m33497b(keiVarM36760g.m35553b().m57310b(), keiVarM36760g.m35552a().m57310b(), null, 4, null)).m51746b();
            }
        }
        return null;
    }
}
