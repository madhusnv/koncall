package p001o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes3.dex */
public class j9g extends oe1 {

    /* renamed from: r */
    public final hc1 f29997r;

    /* renamed from: s */
    public final String f29998s;

    /* renamed from: t */
    public final boolean f29999t;

    /* renamed from: u */
    public final gc1 f30000u;

    /* renamed from: v */
    public gc1 f30001v;

    public j9g(ema emaVar, hc1 hc1Var, nlf nlfVar) {
        super(emaVar, hc1Var, nlfVar.m40756b().toPaintCap(), nlfVar.m40759e().toPaintJoin(), nlfVar.m40761g(), nlfVar.m40763i(), nlfVar.m40764j(), nlfVar.m40760f(), nlfVar.m40758d());
        this.f29997r = hc1Var;
        this.f29998s = nlfVar.m40762h();
        this.f29999t = nlfVar.m40765k();
        gc1 gc1VarMo24960a = nlfVar.m40757c().mo24960a();
        this.f30000u = gc1VarMo24960a;
        gc1VarMo24960a.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a);
    }

    @Override // p001o.oe1, p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        super.mo20000d(obj, qmaVar);
        if (obj == mma.f35711b) {
            this.f30000u.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35706K) {
            gc1 gc1Var = this.f30001v;
            if (gc1Var != null) {
                this.f29997r.m30176F(gc1Var);
            }
            if (qmaVar == null) {
                this.f30001v = null;
                return;
            }
            vri vriVar = new vri(qmaVar);
            this.f30001v = vriVar;
            vriVar.m28369a(this);
            this.f29997r.m30184i(this.f30000u);
        }
    }

    @Override // p001o.oe1, p001o.dz5
    /* renamed from: g */
    public void mo20002g(Canvas canvas, Matrix matrix, int i) {
        if (this.f29999t) {
            return;
        }
        this.f38188i.setColor(((qh3) this.f30000u).m45489p());
        gc1 gc1Var = this.f30001v;
        if (gc1Var != null) {
            this.f38188i.setColorFilter((ColorFilter) gc1Var.mo28376h());
        }
        super.mo20002g(canvas, matrix, i);
    }

    @Override // p001o.j14
    public String getName() {
        return this.f29998s;
    }
}
