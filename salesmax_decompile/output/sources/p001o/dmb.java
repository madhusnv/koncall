package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.d1b;

/* loaded from: classes2.dex */
public final class dmb {

    /* renamed from: d */
    public static final C12991a f20241d = new C12991a(null);

    /* renamed from: a */
    public final zue f20242a;

    /* renamed from: b */
    public final zue f20243b;

    /* renamed from: c */
    public final List f20244c;

    /* renamed from: o.dmb$a */
    public static final class C12991a {
        public C12991a() {
        }

        public /* synthetic */ C12991a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final List m23556a(zue zueVar, zue zueVar2) {
            hwc hwcVarM53620a;
            hwc hwcVarM53620a2;
            sq8.m48649h(zueVar, "p1");
            sq8.m48649h(zueVar2, "p2");
            d1b.C12780a c12780a = d1b.f18964e;
            d1b d1bVarM22230a = c12780a.m22230a(new bg0(zueVar.m59948e(), zueVar.m59949f()), zueVar);
            d1b d1bVarM22230a2 = c12780a.m22230a(new bg0(zueVar2.m59948e(), zueVar2.m59949f()), zueVar2);
            hx5 hx5VarM42653c = ot6.m42653c(d1bVarM22230a.m22228r(), d1bVarM22230a2.m22228r());
            float fM31263a = hx5VarM42653c.m31263a(0.0f);
            String unused = emb.f21932a;
            d1b d1bVarM22226o = d1bVarM22230a2.m22226o(fM31263a);
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            d1b.C12781b c12781b = (d1b.C12781b) kh3.i0(d1bVarM22230a, 0);
            d1b.C12781b c12781b2 = (d1b.C12781b) kh3.i0(d1bVarM22226o, 0);
            int i = 1;
            int i2 = 1;
            while (c12781b != null && c12781b2 != null) {
                float fM22234c = i == d1bVarM22230a.size() ? 1.0f : c12781b.m22234c();
                float fM31264b = i2 == d1bVarM22226o.size() ? 1.0f : hx5VarM42653c.m31264b(gri.m29423j(c12781b2.m22234c() + fM31263a, 1.0f));
                float fMin = Math.min(fM22234c, fM31264b);
                String unused2 = emb.f21932a;
                float f = 1.0E-6f + fMin;
                if (fM22234c > f) {
                    String unused3 = emb.f21932a;
                    hwcVarM53620a = c12781b.m22232a(fMin);
                } else {
                    hwcVarM53620a = vyh.m53620a(c12781b, kh3.i0(d1bVarM22230a, i));
                    i++;
                }
                d1b.C12781b c12781b3 = (d1b.C12781b) hwcVarM53620a.m31227a();
                c12781b = (d1b.C12781b) hwcVarM53620a.m31228b();
                if (fM31264b > f) {
                    String unused4 = emb.f21932a;
                    hwcVarM53620a2 = c12781b2.m22232a(gri.m29423j(hx5VarM42653c.m31263a(fMin) - fM31263a, 1.0f));
                } else {
                    hwcVarM53620a2 = vyh.m53620a(c12781b2, kh3.i0(d1bVarM22226o, i2));
                    i2++;
                }
                d1b.C12781b c12781b4 = (d1b.C12781b) hwcVarM53620a2.m31227a();
                c12781b2 = (d1b.C12781b) hwcVarM53620a2.m31228b();
                String unused5 = emb.f21932a;
                arrayList.add(vyh.m53620a(c12781b3.m22233b(), c12781b4.m22233b()));
            }
            if (c12781b == null && c12781b2 == null) {
                z = true;
            }
            if (z) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched".toString());
        }
    }

    public dmb(zue zueVar, zue zueVar2) {
        sq8.m48649h(zueVar, "start");
        sq8.m48649h(zueVar2, "end");
        this.f20242a = zueVar;
        this.f20243b = zueVar2;
        this.f20244c = f20241d.m23556a(zueVar, zueVar2);
    }

    /* renamed from: a */
    public final List m23555a(float f) {
        List listM18961c = bh3.m18961c();
        int size = this.f20244c.size();
        yc4 yc4Var = null;
        yc4 yc4Var2 = null;
        int i = 0;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = gri.m29422i(((yc4) ((hwc) this.f20244c.get(i)).m31229c()).m57501j()[i2], ((yc4) ((hwc) this.f20244c.get(i)).m31230d()).m57501j()[i2], f);
            }
            yc4 yc4Var3 = new yc4(fArr);
            if (yc4Var2 == null) {
                yc4Var2 = yc4Var3;
            }
            if (yc4Var != null) {
                listM18961c.add(yc4Var);
            }
            i++;
            yc4Var = yc4Var3;
        }
        if (yc4Var != null && yc4Var2 != null) {
            listM18961c.add(ad4.m16894a(yc4Var.m57493b(), yc4Var.m57494c(), yc4Var.m57497f(), yc4Var.m57498g(), yc4Var.m57499h(), yc4Var.m57500i(), yc4Var2.m57493b(), yc4Var2.m57494c()));
        }
        return bh3.m18959a(listM18961c);
    }
}
