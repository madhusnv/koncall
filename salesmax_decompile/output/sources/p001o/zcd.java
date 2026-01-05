package p001o;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class zcd {

    /* renamed from: a */
    public final zh9 f56938a;

    /* renamed from: b */
    public final ty7 f56939b;

    /* renamed from: c */
    public final wcd f56940c;

    /* renamed from: d */
    public final uy7 f56941d;

    /* renamed from: e */
    public boolean f56942e;

    public zcd(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "root");
        this.f56938a = zh9Var;
        this.f56939b = new ty7(zh9Var.mo49884e());
        this.f56940c = new wcd();
        this.f56941d = new uy7();
    }

    /* renamed from: a */
    public final int m59189a(xcd xcdVar, ted tedVar, boolean z) {
        boolean z2;
        sq8.m48649h(xcdVar, "pointerEvent");
        sq8.m48649h(tedVar, "positionCalculator");
        if (this.f56942e) {
            return add.m16918a(false, false);
        }
        boolean z3 = true;
        try {
            this.f56942e = true;
            vp8 vp8VarM54221b = this.f56940c.m54221b(xcdVar, tedVar);
            Collection<vcd> collectionValues = vp8VarM54221b.m53176a().values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                z2 = false;
            } else {
                for (vcd vcdVar : collectionValues) {
                    if (vcdVar.m52527g() || vcdVar.m52529i()) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            boolean z4 = !z2;
            for (vcd vcdVar2 : vp8VarM54221b.m53176a().values()) {
                if (z4 || mcd.m38743a(vcdVar2)) {
                    zh9.g0(this.f56938a, vcdVar2.m52526f(), this.f56941d, edd.m24806g(vcdVar2.m52530j(), edd.f21438a.m24812d()), false, 8, null);
                    if (!this.f56941d.isEmpty()) {
                        this.f56939b.m50778a(vcdVar2.m52525e(), this.f56941d);
                        this.f56941d.clear();
                    }
                }
            }
            this.f56939b.m50781d();
            boolean zM50779b = this.f56939b.m50779b(vp8VarM54221b, z);
            if (vp8VarM54221b.m53178c()) {
                z3 = false;
            } else {
                Collection<vcd> collectionValues2 = vp8VarM54221b.m53176a().values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    for (vcd vcdVar3 : collectionValues2) {
                        if (mcd.m38747e(vcdVar3) && vcdVar3.m52531k()) {
                            break;
                        }
                    }
                }
                z3 = false;
            }
            return add.m16918a(zM50779b, z3);
        } finally {
            this.f56942e = false;
        }
    }

    /* renamed from: b */
    public final void m59190b() {
        if (this.f56942e) {
            return;
        }
        this.f56940c.m54220a();
        this.f56939b.m50780c();
    }
}
