package p001o;

import androidx.navigation.AbstractC2347n;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class eve extends m7 {

    /* renamed from: a */
    public final dc9 f22220a;

    /* renamed from: b */
    public final Map f22221b;

    /* renamed from: c */
    public final wff f22222c;

    /* renamed from: d */
    public final Map f22223d;

    /* renamed from: e */
    public int f22224e;

    public eve(dc9 dc9Var, Map map) {
        sq8.m48649h(dc9Var, "serializer");
        sq8.m48649h(map, "typeMap");
        this.f22220a = dc9Var;
        this.f22221b = map;
        this.f22222c = xff.m56225a();
        this.f22223d = new LinkedHashMap();
        this.f22224e = -1;
    }

    @Override // p001o.m7
    /* renamed from: G */
    public boolean mo25644G(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        this.f22224e = i;
        return true;
    }

    @Override // p001o.m7
    /* renamed from: I */
    public void mo25645I(Object obj) {
        sq8.m48649h(obj, "value");
        m25647K(obj);
    }

    /* renamed from: J */
    public final Map m25646J(Object obj) {
        sq8.m48649h(obj, "value");
        super.mo25649n(this.f22220a, obj);
        return isa.m32693t(this.f22223d);
    }

    /* renamed from: K */
    public final void m25647K(Object obj) {
        String strMo16763e = this.f22220a.getDescriptor().mo16763e(this.f22224e);
        AbstractC2347n abstractC2347n = (AbstractC2347n) this.f22221b.get(strMo16763e);
        if (abstractC2347n != null) {
            this.f22223d.put(strMo16763e, abstractC2347n instanceof vg3 ? ((vg3) abstractC2347n).mo8843l(obj) : bh3.m18963e(abstractC2347n.mo8840i(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strMo16763e + ". Please provide NavType through typeMap.").toString());
    }

    @Override // p001o.h76
    /* renamed from: a */
    public wff mo25648a() {
        return this.f22222c;
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: n */
    public void mo25649n(iff iffVar, Object obj) {
        sq8.m48649h(iffVar, "serializer");
        m25647K(obj);
    }

    @Override // p001o.h76
    /* renamed from: s */
    public void mo25650s() {
        m25647K(null);
    }

    @Override // p001o.m7, p001o.h76
    /* renamed from: t */
    public h76 mo25651t(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        if (hve.m31224d(uefVar)) {
            this.f22224e = 0;
        }
        return super.mo25651t(uefVar);
    }
}
