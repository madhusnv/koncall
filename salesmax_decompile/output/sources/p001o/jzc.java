package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p001o.sed;

/* loaded from: classes6.dex */
public final class jzc extends xb1 {

    /* renamed from: a */
    public final j56 f31290a;

    /* renamed from: b */
    public final float f31291b;

    /* renamed from: c */
    public final Random f31292c;

    /* renamed from: d */
    public int f31293d;

    /* renamed from: e */
    public float f31294e;

    /* renamed from: f */
    public float f31295f;

    public /* synthetic */ jzc(j56 j56Var, float f, Random random, int i, id5 id5Var) {
        this(j56Var, f, (i & 4) != 0 ? new Random() : random);
    }

    @Override // p001o.xb1
    /* renamed from: a */
    public List mo34784a(float f, izc izcVar, i74 i74Var) {
        sq8.m48649h(izcVar, "party");
        sq8.m48649h(i74Var, "drawArea");
        this.f31295f += f;
        float fM33263b = this.f31290a.m33263b() / 1000.0f;
        if ((this.f31294e == 0.0f) && f > fM33263b) {
            this.f31295f = fM33263b;
        }
        List listM21246k = ch3.m21246k();
        if (this.f31295f >= this.f31290a.m33262a() && !m34792i()) {
            kl8 kl8Var = new kl8(1, (int) (this.f31295f / this.f31290a.m33262a()));
            listM21246k = new ArrayList(dh3.m23088v(kl8Var, 10));
            Iterator it = kl8Var.iterator();
            while (it.hasNext()) {
                ((dl8) it).mo23412a();
                listM21246k.add(m34786c(izcVar, i74Var));
            }
            this.f31295f %= this.f31290a.m33262a();
        }
        this.f31294e += f * 1000;
        return listM21246k;
    }

    @Override // p001o.xb1
    /* renamed from: b */
    public boolean mo34785b() {
        return this.f31290a.m33263b() > 0 && this.f31294e >= ((float) this.f31290a.m33263b());
    }

    /* renamed from: c */
    public final lq3 m34786c(izc izcVar, i74 i74Var) {
        this.f31293d++;
        gvf gvfVar = (gvf) izcVar.m32946m().get(this.f31292c.nextInt(izcVar.m32946m().size()));
        sed.C16819a c16819aM34787d = m34787d(izcVar.m32943j(), i74Var);
        return new lq3(new fsi(c16819aM34787d.m48280a(), c16819aM34787d.m48281b()), ((Number) izcVar.m32937d().get(this.f31292c.nextInt(izcVar.m32937d().size()))).intValue(), gvfVar.m29544f() * this.f31291b, m34793j(gvfVar), m34789f(izcVar.m32945l()), izcVar.m32949p(), izcVar.m32941h(), null, m34791h(izcVar), izcVar.m32938e(), m34794k(izcVar.m32944k()) * izcVar.m32944k().m48940c(), m34794k(izcVar.m32944k()) * izcVar.m32944k().m48939b(), this.f31291b, 128, null);
    }

    /* renamed from: d */
    public final sed.C16819a m34787d(sed sedVar, i74 i74Var) {
        if (sedVar instanceof sed.C16819a) {
            sed.C16819a c16819a = (sed.C16819a) sedVar;
            return new sed.C16819a(c16819a.m48280a(), c16819a.m48281b());
        }
        if (!(sedVar instanceof sed.C16820b)) {
            throw new szb();
        }
        sed.C16820b c16820b = (sed.C16820b) sedVar;
        return new sed.C16819a(i74Var.getWidth() * ((float) c16820b.m48282a()), i74Var.getHeight() * ((float) c16820b.m48283b()));
    }

    /* renamed from: e */
    public final double m34788e(izc izcVar) {
        if (izcVar.m32948o() == 0) {
            return izcVar.m32936c();
        }
        return (((izcVar.m32936c() + (izcVar.m32948o() / 2)) - r0) * this.f31292c.nextDouble()) + (izcVar.m32936c() - (izcVar.m32948o() / 2));
    }

    /* renamed from: f */
    public final wkf m34789f(List list) {
        return (wkf) list.get(this.f31292c.nextInt(list.size()));
    }

    /* renamed from: g */
    public final float m34790g(izc izcVar) {
        if (izcVar.m32942i() == -1.0f) {
            return izcVar.m32947n();
        }
        return izcVar.m32947n() + ((izcVar.m32942i() - izcVar.m32947n()) * this.f31292c.nextFloat());
    }

    /* renamed from: h */
    public final fsi m34791h(izc izcVar) {
        float fM34790g = m34790g(izcVar);
        double radians = Math.toRadians(m34788e(izcVar));
        return new fsi(((float) Math.cos(radians)) * fM34790g, fM34790g * ((float) Math.sin(radians)));
    }

    /* renamed from: i */
    public final boolean m34792i() {
        return this.f31290a.m33263b() != 0 && this.f31294e >= ((float) this.f31290a.m33263b());
    }

    /* renamed from: j */
    public final float m34793j(gvf gvfVar) {
        return gvfVar.m29542d() + (gvfVar.m29542d() * this.f31292c.nextFloat() * gvfVar.m29543e());
    }

    /* renamed from: k */
    public final float m34794k(sue sueVar) {
        if (!sueVar.m48938a()) {
            return 0.0f;
        }
        return sueVar.m48941d() + (sueVar.m48941d() * sueVar.m48942e() * ((this.f31292c.nextFloat() * 2.0f) - 1.0f));
    }

    public jzc(j56 j56Var, float f, Random random) {
        sq8.m48649h(j56Var, "emitterConfig");
        sq8.m48649h(random, "random");
        this.f31290a = j56Var;
        this.f31291b = f;
        this.f31292c = random;
    }
}
