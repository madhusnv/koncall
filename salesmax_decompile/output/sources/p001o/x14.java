package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p001o.gc1;

/* loaded from: classes3.dex */
public class x14 implements dz5, zzc, gc1.InterfaceC13670b, zc9 {

    /* renamed from: a */
    public final Paint f53045a;

    /* renamed from: b */
    public final RectF f53046b;

    /* renamed from: c */
    public final Matrix f53047c;

    /* renamed from: d */
    public final Path f53048d;

    /* renamed from: e */
    public final RectF f53049e;

    /* renamed from: f */
    public final String f53050f;

    /* renamed from: g */
    public final boolean f53051g;

    /* renamed from: h */
    public final List f53052h;

    /* renamed from: i */
    public final ema f53053i;

    /* renamed from: j */
    public List f53054j;

    /* renamed from: k */
    public tuh f53055k;

    public x14(ema emaVar, hc1 hc1Var, glf glfVar) {
        this(emaVar, hc1Var, glfVar.m29012c(), glfVar.m29013d(), m55544f(emaVar, hc1Var, glfVar.m29011b()), m55545h(glfVar.m29011b()));
    }

    /* renamed from: f */
    public static List m55544f(ema emaVar, hc1 hc1Var, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            j14 j14VarMo16967a = ((z24) list.get(i)).mo16967a(emaVar, hc1Var);
            if (j14VarMo16967a != null) {
                arrayList.add(j14VarMo16967a);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static rg0 m55545h(List list) {
        for (int i = 0; i < list.size(); i++) {
            z24 z24Var = (z24) list.get(i);
            if (z24Var instanceof rg0) {
                return (rg0) z24Var;
            }
        }
        return null;
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        this.f53053i.invalidateSelf();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f53052h.size());
        arrayList.addAll(list);
        for (int size = this.f53052h.size() - 1; size >= 0; size--) {
            j14 j14Var = (j14) this.f53052h.get(size);
            j14Var.mo19334b(arrayList, this.f53052h.subList(0, size));
            arrayList.add(j14Var);
        }
    }

    @Override // p001o.zc9
    /* renamed from: c */
    public void mo19999c(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
        if (yc9Var.m57518g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                yc9Var2 = yc9Var2.m57512a(getName());
                if (yc9Var.m57514c(getName(), i)) {
                    list.add(yc9Var2.m57520i(this));
                }
            }
            if (yc9Var.m57519h(getName(), i)) {
                int iM57516e = i + yc9Var.m57516e(getName(), i);
                for (int i2 = 0; i2 < this.f53052h.size(); i2++) {
                    j14 j14Var = (j14) this.f53052h.get(i2);
                    if (j14Var instanceof zc9) {
                        ((zc9) j14Var).mo19999c(yc9Var, iM57516e, list, yc9Var2);
                    }
                }
            }
        }
    }

    @Override // p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        tuh tuhVar = this.f53055k;
        if (tuhVar != null) {
            tuhVar.m50696c(obj, qmaVar);
        }
    }

    @Override // p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        this.f53047c.set(matrix);
        tuh tuhVar = this.f53055k;
        if (tuhVar != null) {
            this.f53047c.preConcat(tuhVar.m50699f());
        }
        this.f53049e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f53052h.size() - 1; size >= 0; size--) {
            j14 j14Var = (j14) this.f53052h.get(size);
            if (j14Var instanceof dz5) {
                ((dz5) j14Var).mo20001e(this.f53049e, this.f53047c, z);
                rectF.union(this.f53049e);
            }
        }
    }

    @Override // p001o.dz5
    /* renamed from: g */
    public void mo20002g(Canvas canvas, Matrix matrix, int i) {
        if (this.f53051g) {
            return;
        }
        this.f53047c.set(matrix);
        tuh tuhVar = this.f53055k;
        if (tuhVar != null) {
            this.f53047c.preConcat(tuhVar.m50699f());
            i = (int) (((((this.f53055k.m50701h() == null ? 100 : ((Integer) this.f53055k.m50701h().mo28376h()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.f53053i.m25296I() && m55548k() && i != 255;
        if (z) {
            this.f53046b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo20001e(this.f53046b, this.f53047c, true);
            this.f53045a.setAlpha(i);
            hri.m31033m(canvas, this.f53046b, this.f53045a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f53052h.size() - 1; size >= 0; size--) {
            Object obj = this.f53052h.get(size);
            if (obj instanceof dz5) {
                ((dz5) obj).mo20002g(canvas, this.f53047c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // p001o.j14
    public String getName() {
        return this.f53050f;
    }

    @Override // p001o.zzc
    public Path getPath() {
        this.f53047c.reset();
        tuh tuhVar = this.f53055k;
        if (tuhVar != null) {
            this.f53047c.set(tuhVar.m50699f());
        }
        this.f53048d.reset();
        if (this.f53051g) {
            return this.f53048d;
        }
        for (int size = this.f53052h.size() - 1; size >= 0; size--) {
            j14 j14Var = (j14) this.f53052h.get(size);
            if (j14Var instanceof zzc) {
                this.f53048d.addPath(((zzc) j14Var).getPath(), this.f53047c);
            }
        }
        return this.f53048d;
    }

    /* renamed from: i */
    public List m55546i() {
        if (this.f53054j == null) {
            this.f53054j = new ArrayList();
            for (int i = 0; i < this.f53052h.size(); i++) {
                j14 j14Var = (j14) this.f53052h.get(i);
                if (j14Var instanceof zzc) {
                    this.f53054j.add((zzc) j14Var);
                }
            }
        }
        return this.f53054j;
    }

    /* renamed from: j */
    public Matrix m55547j() {
        tuh tuhVar = this.f53055k;
        if (tuhVar != null) {
            return tuhVar.m50699f();
        }
        this.f53047c.reset();
        return this.f53047c;
    }

    /* renamed from: k */
    public final boolean m55548k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f53052h.size(); i2++) {
            if ((this.f53052h.get(i2) instanceof dz5) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public x14(ema emaVar, hc1 hc1Var, String str, boolean z, List list, rg0 rg0Var) {
        this.f53045a = new we9();
        this.f53046b = new RectF();
        this.f53047c = new Matrix();
        this.f53048d = new Path();
        this.f53049e = new RectF();
        this.f53050f = str;
        this.f53053i = emaVar;
        this.f53051g = z;
        this.f53052h = list;
        if (rg0Var != null) {
            tuh tuhVarM46677b = rg0Var.m46677b();
            this.f53055k = tuhVarM46677b;
            tuhVarM46677b.m50694a(hc1Var);
            this.f53055k.m50695b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            j14 j14Var = (j14) list.get(size);
            if (j14Var instanceof ev7) {
                arrayList.add((ev7) j14Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((ev7) arrayList.get(size2)).mo24703f(list.listIterator(list.size()));
        }
    }
}
