package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p001o.gc1;

/* loaded from: classes3.dex */
public class rke implements dz5, zzc, ev7, gc1.InterfaceC13670b, ad9 {

    /* renamed from: a */
    public final Matrix f43729a = new Matrix();

    /* renamed from: b */
    public final Path f43730b = new Path();

    /* renamed from: c */
    public final ema f43731c;

    /* renamed from: d */
    public final hc1 f43732d;

    /* renamed from: e */
    public final String f43733e;

    /* renamed from: f */
    public final boolean f43734f;

    /* renamed from: g */
    public final gc1 f43735g;

    /* renamed from: h */
    public final gc1 f43736h;

    /* renamed from: i */
    public final tuh f43737i;

    /* renamed from: j */
    public x14 f43738j;

    public rke(ema emaVar, hc1 hc1Var, qke qkeVar) {
        this.f43731c = emaVar;
        this.f43732d = hc1Var;
        this.f43733e = qkeVar.m45583c();
        this.f43734f = qkeVar.m45586f();
        gc1 gc1VarMo24960a = qkeVar.m45582b().mo24960a();
        this.f43735g = gc1VarMo24960a;
        hc1Var.m30184i(gc1VarMo24960a);
        gc1VarMo24960a.m28369a(this);
        gc1 gc1VarMo24960a2 = qkeVar.m45584d().mo24960a();
        this.f43736h = gc1VarMo24960a2;
        hc1Var.m30184i(gc1VarMo24960a2);
        gc1VarMo24960a2.m28369a(this);
        tuh tuhVarM46677b = qkeVar.m45585e().m46677b();
        this.f43737i = tuhVarM46677b;
        tuhVarM46677b.m50694a(hc1Var);
        tuhVarM46677b.m50695b(this);
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        this.f43731c.invalidateSelf();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        this.f43738j.mo19334b(list, list2);
    }

    @Override // p001o.zc9
    /* renamed from: c */
    public void mo19999c(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
        zeb.m59358m(yc9Var, i, list, yc9Var2, this);
    }

    @Override // p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        if (this.f43737i.m50696c(obj, qmaVar)) {
            return;
        }
        if (obj == mma.f35730u) {
            this.f43735g.m28380n(qmaVar);
        } else if (obj == mma.f35731v) {
            this.f43736h.m28380n(qmaVar);
        }
    }

    @Override // p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        this.f43738j.mo20001e(rectF, matrix, z);
    }

    @Override // p001o.ev7
    /* renamed from: f */
    public void mo24703f(ListIterator listIterator) {
        if (this.f43738j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((j14) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f43738j = new x14(this.f43731c, this.f43732d, "Repeater", this.f43734f, arrayList, null);
    }

    @Override // p001o.dz5
    /* renamed from: g */
    public void mo20002g(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.f43735g.mo28376h()).floatValue();
        float fFloatValue2 = ((Float) this.f43736h.mo28376h()).floatValue();
        float fFloatValue3 = ((Float) this.f43737i.m50702i().mo28376h()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) this.f43737i.m50698e().mo28376h()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f43729a.set(matrix);
            float f = i2;
            this.f43729a.preConcat(this.f43737i.m50700g(f + fFloatValue2));
            this.f43738j.mo20002g(canvas, this.f43729a, (int) (i * zeb.m59356k(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // p001o.j14
    public String getName() {
        return this.f43733e;
    }

    @Override // p001o.zzc
    public Path getPath() {
        Path path = this.f43738j.getPath();
        this.f43730b.reset();
        float fFloatValue = ((Float) this.f43735g.mo28376h()).floatValue();
        float fFloatValue2 = ((Float) this.f43736h.mo28376h()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.f43729a.set(this.f43737i.m50700g(i + fFloatValue2));
            this.f43730b.addPath(path, this.f43729a);
        }
        return this.f43730b;
    }
}
