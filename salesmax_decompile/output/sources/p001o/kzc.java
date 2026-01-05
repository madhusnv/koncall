package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class kzc {

    /* renamed from: a */
    public final izc f32874a;

    /* renamed from: b */
    public final long f32875b;

    /* renamed from: c */
    public boolean f32876c;

    /* renamed from: d */
    public xb1 f32877d;

    /* renamed from: e */
    public final List f32878e;

    /* renamed from: o.kzc$a */
    public static final class C14943a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14943a f32879a = new C14943a();

        public C14943a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(lq3 lq3Var) {
            sq8.m48649h(lq3Var, "it");
            return Boolean.valueOf(lq3Var.m37748j());
        }
    }

    public kzc(izc izcVar, long j, float f) {
        sq8.m48649h(izcVar, "party");
        this.f32874a = izcVar;
        this.f32875b = j;
        this.f32876c = true;
        this.f32877d = new jzc(izcVar.m32940g(), f, null, 4, null);
        this.f32878e = new ArrayList();
    }

    /* renamed from: a */
    public final long m36371a() {
        return this.f32875b;
    }

    /* renamed from: b */
    public final izc m36372b() {
        return this.f32874a;
    }

    /* renamed from: c */
    public final boolean m36373c() {
        return (this.f32877d.mo34785b() && this.f32878e.size() == 0) || (!this.f32876c && this.f32878e.size() == 0);
    }

    /* renamed from: d */
    public final List m36374d(float f, i74 i74Var) {
        sq8.m48649h(i74Var, "drawArea");
        if (this.f32876c) {
            this.f32878e.addAll(this.f32877d.mo34784a(f, this.f32874a, i74Var));
        }
        Iterator it = this.f32878e.iterator();
        while (it.hasNext()) {
            ((lq3) it.next()).m37749k(f, i74Var);
        }
        hh3.m30447G(this.f32878e, C14943a.f32879a);
        List list = this.f32878e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((lq3) obj).m37742d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(lzc.m38125a((lq3) it2.next()));
        }
        return arrayList2;
    }

    public /* synthetic */ kzc(izc izcVar, long j, float f, int i, id5 id5Var) {
        this(izcVar, (i & 2) != 0 ? System.currentTimeMillis() : j, f);
    }
}
