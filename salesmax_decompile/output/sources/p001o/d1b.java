package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.ht6;

/* loaded from: classes2.dex */
public final class d1b extends e8 {

    /* renamed from: e */
    public static final C12780a f18964e = new C12780a(null);

    /* renamed from: b */
    public final e1b f18965b;

    /* renamed from: c */
    public final List f18966c;

    /* renamed from: d */
    public final List f18967d;

    /* renamed from: o.d1b$a */
    public static final class C12780a {
        public C12780a() {
        }

        public /* synthetic */ C12780a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final d1b m22230a(e1b e1bVar, zue zueVar) {
            List listM18963e;
            sq8.m48649h(e1bVar, "measurer");
            sq8.m48649h(zueVar, "polygon");
            ArrayList<yc4> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = zueVar.m59950g().size();
            for (int i = 0; i < size; i++) {
                ht6 ht6Var = (ht6) zueVar.m59950g().get(i);
                int size2 = ht6Var.m31109a().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if ((ht6Var instanceof ht6.C14063a) && i2 == ht6Var.m31109a().size() / 2) {
                        arrayList2.add(vyh.m53620a(ht6Var, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(ht6Var.m31109a().get(i2));
                }
            }
            Float fValueOf = Float.valueOf(0.0f);
            int iM23088v = dh3.m23088v(arrayList, 9);
            if (iM23088v == 0) {
                listM18963e = bh3.m18963e(fValueOf);
            } else {
                ArrayList arrayList3 = new ArrayList(iM23088v + 1);
                arrayList3.add(fValueOf);
                for (yc4 yc4Var : arrayList) {
                    float fFloatValue = fValueOf.floatValue();
                    float fMo18840a = e1bVar.mo18840a(yc4Var);
                    if (!(fMo18840a >= 0.0f)) {
                        throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero".toString());
                    }
                    y3i y3iVar = y3i.f54824a;
                    fValueOf = Float.valueOf(fFloatValue + fMo18840a);
                    arrayList3.add(fValueOf);
                }
                listM18963e = arrayList3;
            }
            float fFloatValue2 = ((Number) kh3.r0(listM18963e)).floatValue();
            apb apbVar = new apb(listM18963e.size());
            int size3 = listM18963e.size();
            for (int i3 = 0; i3 < size3; i3++) {
                apbVar.m17637h(((Number) listM18963e.get(i3)).floatValue() / fFloatValue2);
            }
            String unused = sdd.f45289a;
            List listM18961c = bh3.m18961c();
            int size4 = arrayList2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                int iIntValue = ((Number) ((hwc) arrayList2.get(i4)).m31230d()).intValue();
                listM18961c.add(new bnd((apbVar.m31461b(iIntValue) + apbVar.m31461b(iIntValue + 1)) / 2, (ht6) ((hwc) arrayList2.get(i4)).m31229c()));
            }
            return new d1b(e1bVar, bh3.m18959a(listM18961c), arrayList, apbVar, null);
        }
    }

    /* renamed from: o.d1b$b */
    public final class C12781b {

        /* renamed from: a */
        public final yc4 f18968a;

        /* renamed from: b */
        public final float f18969b;

        /* renamed from: c */
        public float f18970c;

        /* renamed from: d */
        public float f18971d;

        /* renamed from: e */
        public final /* synthetic */ d1b f18972e;

        public C12781b(d1b d1bVar, yc4 yc4Var, float f, float f2) {
            sq8.m48649h(yc4Var, "cubic");
            this.f18972e = d1bVar;
            this.f18968a = yc4Var;
            if (!(f2 >= f)) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress".toString());
            }
            this.f18969b = d1bVar.f18965b.mo18840a(yc4Var);
            this.f18970c = f;
            this.f18971d = f2;
        }

        /* renamed from: f */
        public static /* synthetic */ void m22231f(C12781b c12781b, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c12781b.f18970c;
            }
            if ((i & 2) != 0) {
                f2 = c12781b.f18971d;
            }
            c12781b.m22236e(f, f2);
        }

        /* renamed from: a */
        public final hwc m22232a(float f) {
            float fM18607j = bce.m18607j(f, this.f18970c, this.f18971d);
            float f2 = this.f18971d;
            float f3 = this.f18970c;
            float fMo18841b = this.f18972e.f18965b.mo18841b(this.f18968a, ((fM18607j - f3) / (f2 - f3)) * this.f18969b);
            boolean z = false;
            if (0.0f <= fMo18841b && fMo18841b <= 1.0f) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1".toString());
            }
            String unused = sdd.f45289a;
            hwc hwcVarM57504m = this.f18968a.m57504m(fMo18841b);
            return vyh.m53620a(new C12781b(this.f18972e, (yc4) hwcVarM57504m.m31227a(), this.f18970c, fM18607j), new C12781b(this.f18972e, (yc4) hwcVarM57504m.m31228b(), fM18607j, this.f18971d));
        }

        /* renamed from: b */
        public final yc4 m22233b() {
            return this.f18968a;
        }

        /* renamed from: c */
        public final float m22234c() {
            return this.f18971d;
        }

        /* renamed from: d */
        public final float m22235d() {
            return this.f18970c;
        }

        /* renamed from: e */
        public final void m22236e(float f, float f2) {
            if (!(f2 >= f)) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress".toString());
            }
            this.f18970c = f;
            this.f18971d = f2;
        }

        public String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.f18970c + " .. " + this.f18971d + "], size=" + this.f18969b + ", cubic=" + this.f18968a + ')';
        }
    }

    public /* synthetic */ d1b(e1b e1bVar, List list, List list2, i37 i37Var, id5 id5Var) {
        this(e1bVar, list, list2, i37Var);
    }

    /* renamed from: A */
    public /* bridge */ int m22224A(C12781b c12781b) {
        return super.lastIndexOf(c12781b);
    }

    @Override // p001o.b7, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C12781b) {
            return m22225j((C12781b) obj);
        }
        return false;
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f18966c.size();
    }

    @Override // p001o.e8, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C12781b) {
            return m22229y((C12781b) obj);
        }
        return -1;
    }

    /* renamed from: j */
    public /* bridge */ boolean m22225j(C12781b c12781b) {
        return super.contains(c12781b);
    }

    @Override // p001o.e8, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C12781b) {
            return m22224A((C12781b) obj);
        }
        return -1;
    }

    /* renamed from: o */
    public final d1b m22226o(float f) {
        if (!(0.0f <= f && f <= 1.0f)) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1".toString());
        }
        if (f < 1.0E-4f) {
            return this;
        }
        Iterator it = this.f18966c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C12781b c12781b = (C12781b) it.next();
            if (f <= c12781b.m22234c() && c12781b.m22235d() <= f) {
                break;
            }
            i++;
        }
        hwc hwcVarM22232a = ((C12781b) this.f18966c.get(i)).m22232a(f);
        C12781b c12781b2 = (C12781b) hwcVarM22232a.m31227a();
        C12781b c12781b3 = (C12781b) hwcVarM22232a.m31228b();
        String unused = sdd.f45289a;
        List listM21252q = ch3.m21252q(c12781b3.m22233b());
        int size = this.f18966c.size();
        for (int i2 = 1; i2 < size; i2++) {
            List list = this.f18966c;
            listM21252q.add(((C12781b) list.get((i2 + i) % list.size())).m22233b());
        }
        listM21252q.add(c12781b2.m22233b());
        apb apbVar = new apb(this.f18966c.size() + 2);
        int size2 = this.f18966c.size() + 2;
        int i3 = 0;
        while (i3 < size2) {
            apbVar.m17637h(i3 == 0 ? 0.0f : i3 == this.f18966c.size() + 1 ? 1.0f : gri.m29423j(((C12781b) this.f18966c.get(((i + i3) - 1) % this.f18966c.size())).m22234c() - f, 1.0f));
            i3++;
        }
        List listM18961c = bh3.m18961c();
        int size3 = this.f18967d.size();
        for (int i4 = 0; i4 < size3; i4++) {
            listM18961c.add(new bnd(gri.m29423j(((bnd) this.f18967d.get(i4)).m19451b() - f, 1.0f), ((bnd) this.f18967d.get(i4)).m19450a()));
        }
        return new d1b(this.f18965b, bh3.m18959a(listM18961c), listM21252q, apbVar);
    }

    @Override // p001o.e8, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C12781b get(int i) {
        return (C12781b) this.f18966c.get(i);
    }

    /* renamed from: r */
    public final List m22228r() {
        return this.f18967d;
    }

    /* renamed from: y */
    public /* bridge */ int m22229y(C12781b c12781b) {
        return super.indexOf(c12781b);
    }

    public d1b(e1b e1bVar, List list, List list2, i37 i37Var) {
        int i = 0;
        if (!(i37Var.m31462c() == list2.size() + 1)) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1".toString());
        }
        if (!(i37Var.m31460a() == 0.0f)) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero".toString());
        }
        if (!(i37Var.m31465g() == 1.0f)) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one".toString());
        }
        this.f18965b = e1bVar;
        this.f18967d = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        float fM31461b = 0.0f;
        while (i < size) {
            int i2 = i + 1;
            if (i37Var.m31461b(i2) - i37Var.m31461b(i) > 1.0E-4f) {
                arrayList.add(new C12781b(this, (yc4) list2.get(i), fM31461b, i37Var.m31461b(i2)));
                fM31461b = i37Var.m31461b(i2);
            }
            i = i2;
        }
        C12781b.m22231f((C12781b) arrayList.get(ch3.m21248m(arrayList)), 0.0f, 1.0f, 1, null);
        this.f18966c = arrayList;
    }
}
