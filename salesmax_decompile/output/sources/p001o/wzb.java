package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.alb;
import p001o.ocd;

/* loaded from: classes2.dex */
public final class wzb extends c0c {

    /* renamed from: b */
    public final alb.AbstractC12216c f52928b;

    /* renamed from: c */
    public final fqb f52929c;

    /* renamed from: d */
    public final Map f52930d;

    /* renamed from: e */
    public mh9 f52931e;

    /* renamed from: f */
    public lcd f52932f;

    /* renamed from: g */
    public boolean f52933g;

    /* renamed from: h */
    public boolean f52934h;

    /* renamed from: i */
    public boolean f52935i;

    public wzb(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "modifierNode");
        this.f52928b = abstractC12216c;
        this.f52929c = new fqb(new ucd[16], 0);
        this.f52930d = new LinkedHashMap();
        this.f52934h = true;
        this.f52935i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    @Override // p001o.c0c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo20007a(Map map, mh9 mh9Var, vp8 vp8Var, boolean z) {
        Object obj;
        boolean z2;
        boolean z3;
        int i;
        sq8.m48649h(map, "changes");
        sq8.m48649h(mh9Var, "parentCoordinates");
        sq8.m48649h(vp8Var, "internalPointerEvent");
        boolean zMo20007a = super.mo20007a(map, mh9Var, vp8Var, z);
        int i2 = 1;
        if (!this.f52928b.m17361J()) {
            return true;
        }
        alb.AbstractC12216c abstractC12216c = this.f52928b;
        int iM60153a = zzb.m60153a(16);
        for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216c; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
            if (abstractC12216cM48434f instanceof bdd) {
                this.f52931e = cdd.m20970a((bdd) abstractC12216cM48434f);
            } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            long jM51369g = ((ucd) entry.getKey()).m51369g();
            vcd vcdVar = (vcd) entry.getValue();
            int iM27354o = this.f52929c.m27354o() - i2;
            if (iM27354o < 0) {
                i = 0;
                break;
            }
            for (int i3 = 0; ((ucd) this.f52929c.m27353n()[i3]).m51369g() != jM51369g; i3++) {
                if (i3 == iM27354o) {
                    i = 0;
                    break;
                }
            }
            i = i2;
            if (i != 0) {
                ArrayList arrayList = new ArrayList(vcdVar.m52524d().size());
                List listM52524d = vcdVar.m52524d();
                int size = listM52524d.size();
                int i4 = 0;
                while (i4 < size) {
                    sy7 sy7Var = (sy7) listM52524d.get(i4);
                    long jM49081b = sy7Var.m49081b();
                    mh9 mh9Var2 = this.f52931e;
                    sq8.m48646e(mh9Var2);
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new sy7(jM49081b, mh9Var2.mo39060D(mh9Var, sy7Var.m49080a()), null));
                    i4++;
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                Map map2 = this.f52930d;
                ucd ucdVarM51363a = ucd.m51363a(jM51369g);
                mh9 mh9Var3 = this.f52931e;
                sq8.m48646e(mh9Var3);
                long jMo39060D = mh9Var3.mo39060D(mh9Var, vcdVar.m52528h());
                mh9 mh9Var4 = this.f52931e;
                sq8.m48646e(mh9Var4);
                map2.put(ucdVarM51363a, vcdVar.m52522a((731 & 1) != 0 ? vcdVar.f50112a : 0L, (731 & 2) != 0 ? vcdVar.f50113b : 0L, (731 & 4) != 0 ? vcdVar.f50114c : mh9Var4.mo39060D(mh9Var, vcdVar.m52526f()), (731 & 8) != 0 ? vcdVar.f50115d : false, (731 & 16) != 0 ? vcdVar.f50117f : 0L, (731 & 32) != 0 ? vcdVar.f50118g : jMo39060D, (731 & 64) != 0 ? vcdVar.f50119h : false, (731 & 128) != 0 ? vcdVar.f50120i : 0, arrayList3, (731 & 512) != 0 ? vcdVar.f50121j : 0L));
                i2 = 1;
            }
        }
        if (this.f52930d.isEmpty()) {
            this.f52929c.m27349i();
            m20013g().m27349i();
            return true;
        }
        for (int iM27354o2 = this.f52929c.m27354o() - 1; -1 < iM27354o2; iM27354o2--) {
            if (!map.containsKey(ucd.m51363a(((ucd) this.f52929c.m27353n()[iM27354o2]).m51369g()))) {
                this.f52929c.m27361v(iM27354o2);
            }
        }
        lcd lcdVar = new lcd(kh3.Q0(this.f52930d.values()), vp8Var);
        List listM36951b = lcdVar.m36951b();
        int size2 = listM36951b.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                obj = null;
                break;
            }
            Object obj2 = listM36951b.get(i5);
            if (vp8Var.m53179d(((vcd) obj2).m52525e())) {
                obj = obj2;
                break;
            }
            i5++;
        }
        vcd vcdVar2 = (vcd) obj;
        if (vcdVar2 != null) {
            if (z) {
                z2 = false;
                if (!this.f52934h && (vcdVar2.m52527g() || vcdVar2.m52529i())) {
                    sq8.m48646e(this.f52931e);
                    z3 = true;
                    this.f52934h = !mcd.m38745c(vcdVar2, r3.mo39063i());
                }
                if (this.f52934h == this.f52933g) {
                    int iM36953d = lcdVar.m36953d();
                    ocd.C15761a c15761a = ocd.f38119a;
                    if (ocd.m41981i(iM36953d, c15761a.m41984c()) || ocd.m41981i(lcdVar.m36953d(), c15761a.m41982a()) || ocd.m41981i(lcdVar.m36953d(), c15761a.m41983b())) {
                        lcdVar.m36954e(this.f52934h ? c15761a.m41982a() : c15761a.m41983b());
                    } else {
                        int iM36953d2 = lcdVar.m36953d();
                        ocd.C15761a c15761a2 = ocd.f38119a;
                        if (ocd.m41981i(iM36953d2, c15761a2.m41982a()) && this.f52933g && !this.f52935i) {
                            lcdVar.m36954e(c15761a2.m41984c());
                        } else if (ocd.m41981i(lcdVar.m36953d(), c15761a2.m41983b()) && this.f52934h && vcdVar2.m52527g()) {
                            lcdVar.m36954e(c15761a2.m41984c());
                        }
                    }
                }
            } else {
                z2 = false;
                this.f52934h = false;
            }
            z3 = true;
            if (this.f52934h == this.f52933g) {
            }
        } else {
            z2 = false;
            z3 = true;
        }
        boolean z4 = (zMo20007a || !ocd.m41981i(lcdVar.m36953d(), ocd.f38119a.m41984c()) || m55465l(this.f52932f, lcdVar)) ? z3 : z2;
        this.f52932f = lcdVar;
        return z4;
    }

    @Override // p001o.c0c
    /* renamed from: b */
    public void mo20008b(vp8 vp8Var) {
        sq8.m48649h(vp8Var, "internalPointerEvent");
        super.mo20008b(vp8Var);
        lcd lcdVar = this.f52932f;
        if (lcdVar == null) {
            return;
        }
        this.f52933g = this.f52934h;
        List listM36951b = lcdVar.m36951b();
        int size = listM36951b.size();
        for (int i = 0; i < size; i++) {
            vcd vcdVar = (vcd) listM36951b.get(i);
            if ((vcdVar.m52527g() || (vp8Var.m53179d(vcdVar.m52525e()) && this.f52934h)) ? false : true) {
                this.f52929c.m27359t(ucd.m51363a(vcdVar.m52525e()));
            }
        }
        this.f52934h = false;
        this.f52935i = ocd.m41981i(lcdVar.m36953d(), ocd.f38119a.m41983b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.c0c
    /* renamed from: d */
    public void mo20010d() {
        fqb fqbVarM20013g = m20013g();
        int iM27354o = fqbVarM20013g.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarM20013g.m27353n();
            int i = 0;
            do {
                ((wzb) objArrM27353n[i]).mo20010d();
                i++;
            } while (i < iM27354o);
        }
        alb.AbstractC12216c abstractC12216c = this.f52928b;
        int iM60153a = zzb.m60153a(16);
        for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216c; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
            if (abstractC12216cM48434f instanceof bdd) {
                ((bdd) abstractC12216cM48434f).mo18661t();
            } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.c0c
    /* renamed from: e */
    public boolean mo20011e(vp8 vp8Var) {
        fqb fqbVarM20013g;
        int iM27354o;
        sq8.m48649h(vp8Var, "internalPointerEvent");
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.f52930d.isEmpty() && this.f52928b.m17361J()) {
            lcd lcdVar = this.f52932f;
            sq8.m48646e(lcdVar);
            mh9 mh9Var = this.f52931e;
            sq8.m48646e(mh9Var);
            long jMo39063i = mh9Var.mo39063i();
            alb.AbstractC12216c abstractC12216c = this.f52928b;
            int iM60153a = zzb.m60153a(16);
            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216c; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                if (abstractC12216cM48434f instanceof bdd) {
                    ((bdd) abstractC12216cM48434f).mo18664y(lcdVar, ncd.Final, jMo39063i);
                } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                }
            }
            if (this.f52928b.m17361J() && (iM27354o = (fqbVarM20013g = m20013g()).m27354o()) > 0) {
                Object[] objArrM27353n = fqbVarM20013g.m27353n();
                do {
                    ((wzb) objArrM27353n[i]).mo20011e(vp8Var);
                    i++;
                } while (i < iM27354o);
            }
            z = true;
        }
        mo20008b(vp8Var);
        m55462i();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.c0c
    /* renamed from: f */
    public boolean mo20012f(Map map, mh9 mh9Var, vp8 vp8Var, boolean z) {
        fqb fqbVarM20013g;
        int iM27354o;
        sq8.m48649h(map, "changes");
        sq8.m48649h(mh9Var, "parentCoordinates");
        sq8.m48649h(vp8Var, "internalPointerEvent");
        if (this.f52930d.isEmpty() || !this.f52928b.m17361J()) {
            return false;
        }
        lcd lcdVar = this.f52932f;
        sq8.m48646e(lcdVar);
        mh9 mh9Var2 = this.f52931e;
        sq8.m48646e(mh9Var2);
        long jMo39063i = mh9Var2.mo39063i();
        alb.AbstractC12216c abstractC12216c = this.f52928b;
        int iM60153a = zzb.m60153a(16);
        for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216c; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
            if (abstractC12216cM48434f instanceof bdd) {
                ((bdd) abstractC12216cM48434f).mo18664y(lcdVar, ncd.Initial, jMo39063i);
            } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
            }
        }
        if (this.f52928b.m17361J() && (iM27354o = (fqbVarM20013g = m20013g()).m27354o()) > 0) {
            Object[] objArrM27353n = fqbVarM20013g.m27353n();
            int i = 0;
            do {
                wzb wzbVar = (wzb) objArrM27353n[i];
                Map map2 = this.f52930d;
                mh9 mh9Var3 = this.f52931e;
                sq8.m48646e(mh9Var3);
                wzbVar.mo20012f(map2, mh9Var3, vp8Var, z);
                i++;
            } while (i < iM27354o);
        }
        if (this.f52928b.m17361J()) {
            alb.AbstractC12216c abstractC12216c2 = this.f52928b;
            int iM60153a2 = zzb.m60153a(16);
            for (alb.AbstractC12216c abstractC12216cM48434f2 = abstractC12216c2; abstractC12216cM48434f2 != 0; abstractC12216cM48434f2 = sk5.m48434f(null)) {
                if (abstractC12216cM48434f2 instanceof bdd) {
                    ((bdd) abstractC12216cM48434f2).mo18664y(lcdVar, ncd.Main, jMo39063i);
                } else if ((abstractC12216cM48434f2.m17356E() & iM60153a2) != 0) {
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    public final void m55462i() {
        this.f52930d.clear();
        this.f52931e = null;
    }

    /* renamed from: j */
    public final alb.AbstractC12216c m55463j() {
        return this.f52928b;
    }

    /* renamed from: k */
    public final fqb m55464k() {
        return this.f52929c;
    }

    /* renamed from: l */
    public final boolean m55465l(lcd lcdVar, lcd lcdVar2) {
        if (lcdVar == null || lcdVar.m36951b().size() != lcdVar2.m36951b().size()) {
            return true;
        }
        int size = lcdVar2.m36951b().size();
        for (int i = 0; i < size; i++) {
            if (!s9c.m48050i(((vcd) lcdVar.m36951b().get(i)).m52526f(), ((vcd) lcdVar2.m36951b().get(i)).m52526f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void m55466m() {
        this.f52934h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f52928b + ", children=" + m20013g() + ", pointerIds=" + this.f52929c + ')';
    }
}
