package p001o;

import android.graphics.Path;
import java.util.List;
import p001o.gc1;
import p001o.plf;

/* loaded from: classes3.dex */
public class blf implements zzc, gc1.InterfaceC13670b {

    /* renamed from: b */
    public final String f16487b;

    /* renamed from: c */
    public final boolean f16488c;

    /* renamed from: d */
    public final ema f16489d;

    /* renamed from: e */
    public final gc1 f16490e;

    /* renamed from: f */
    public boolean f16491f;

    /* renamed from: a */
    public final Path f16486a = new Path();

    /* renamed from: g */
    public final qp3 f16492g = new qp3();

    public blf(ema emaVar, hc1 hc1Var, llf llfVar) {
        this.f16487b = llfVar.m37447b();
        this.f16488c = llfVar.m37449d();
        this.f16489d = emaVar;
        gc1 gc1VarMo24960a = llfVar.m37448c().mo24960a();
        this.f16490e = gc1VarMo24960a;
        hc1Var.m30184i(gc1VarMo24960a);
        gc1VarMo24960a.m28369a(this);
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        m19335c();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            j14 j14Var = (j14) list.get(i);
            if (j14Var instanceof txh) {
                txh txhVar = (txh) j14Var;
                if (txhVar.m50755i() == plf.EnumC16137a.SIMULTANEOUSLY) {
                    this.f16492g.m45742a(txhVar);
                    txhVar.m50751c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m19335c() {
        this.f16491f = false;
        this.f16489d.invalidateSelf();
    }

    @Override // p001o.zzc
    public Path getPath() {
        if (this.f16491f) {
            return this.f16486a;
        }
        this.f16486a.reset();
        if (this.f16488c) {
            this.f16491f = true;
            return this.f16486a;
        }
        this.f16486a.set((Path) this.f16490e.mo28376h());
        this.f16486a.setFillType(Path.FillType.EVEN_ODD);
        this.f16492g.m45743b(this.f16486a);
        this.f16491f = true;
        return this.f16486a;
    }
}
