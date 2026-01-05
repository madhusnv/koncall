package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p001o.bgg;
import p001o.ifg;

/* loaded from: classes2.dex */
public class rfg {

    /* renamed from: a */
    public final nfg f43513a;

    /* renamed from: b */
    public final v92 f43514b;

    /* renamed from: c */
    public C16604c f43515c;

    /* renamed from: d */
    public AbstractC16603b f43516d;

    /* renamed from: o.rfg$a */
    public class C16602a implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ hfg f43517a;

        public C16602a(hfg hfgVar) {
            this.f43517a = hfgVar;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            if (this.f43517a.m30388s() == 2 && (th instanceof CancellationException)) {
                wja.m54627a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            wja.m54639m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + vjg.m52893a(this.f43517a.m30388s()), th);
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ifg ifgVar) {
            fgd.m26663g(ifgVar);
            rfg.this.f43513a.mo22215b(ifgVar);
        }
    }

    /* renamed from: o.rfg$b */
    public static abstract class AbstractC16603b {
        /* renamed from: c */
        public static AbstractC16603b m46673c(hfg hfgVar, List list) {
            return new s51(hfgVar, list);
        }

        /* renamed from: a */
        public abstract List mo46674a();

        /* renamed from: b */
        public abstract hfg mo46675b();
    }

    /* renamed from: o.rfg$c */
    public static class C16604c extends HashMap {
    }

    public rfg(v92 v92Var, nfg nfgVar) {
        this.f43514b = v92Var;
        this.f43513a = nfgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m46661f() {
        C16604c c16604c = this.f43515c;
        if (c16604c != null) {
            Iterator it = c16604c.values().iterator();
            while (it.hasNext()) {
                ((hfg) it.next()).m30378i();
            }
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m46663h(Map map, bgg.AbstractC12390h abstractC12390h) {
        for (Map.Entry entry : map.entrySet()) {
            int iMo18944b = abstractC12390h.mo18944b() - ((wfc) entry.getKey()).mo18159c();
            if (((wfc) entry.getKey()).mo18163g()) {
                iMo18944b = -iMo18944b;
            }
            ((hfg) entry.getValue()).m30373C(wuh.m55052u(iMo18944b), -1);
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void m46662g(hfg hfgVar, Map.Entry entry) {
        hfg hfgVar2 = (hfg) entry.getValue();
        bn7.m19424j(hfgVar2.m30379j(((wfc) entry.getKey()).mo18158b(), ifg.AbstractC14281a.m32079f(hfgVar.m30387r().mo35129e(), ((wfc) entry.getKey()).mo18157a(), hfgVar.m30389t() ? this.f43514b : null, ((wfc) entry.getKey()).mo18159c(), ((wfc) entry.getKey()).mo18163g()), null), new C16602a(hfgVar2), gb2.m28295c());
    }

    /* renamed from: e */
    public nfg m46665e() {
        return this.f43513a;
    }

    /* renamed from: i */
    public void m46666i() {
        this.f43513a.release();
        elh.m25223d(new Runnable() { // from class: o.qfg
            @Override // java.lang.Runnable
            public final void run() {
                this.f41837a.m46661f();
            }
        });
    }

    /* renamed from: j */
    public final void m46667j(final hfg hfgVar, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            m46662g(hfgVar, entry);
            ((hfg) entry.getValue()).m30374e(new Runnable() { // from class: o.pfg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40004a.m46662g(hfgVar, entry);
                }
            });
        }
    }

    /* renamed from: k */
    public final void m46668k(hfg hfgVar) {
        this.f43513a.mo22214a(hfgVar.m30380k(this.f43514b));
    }

    /* renamed from: l */
    public void m46669l(hfg hfgVar, final Map map) {
        hfgVar.m30375f(new hu3() { // from class: o.ofg
            @Override // p001o.hu3
            public final void accept(Object obj) {
                rfg.m46663h(map, (bgg.AbstractC12390h) obj);
            }
        });
    }

    /* renamed from: m */
    public C16604c m46670m(AbstractC16603b abstractC16603b) {
        elh.m25220a();
        this.f43516d = abstractC16603b;
        this.f43515c = new C16604c();
        hfg hfgVarMo46675b = abstractC16603b.mo46675b();
        for (wfc wfcVar : abstractC16603b.mo46674a()) {
            this.f43515c.put(wfcVar, m46671n(hfgVarMo46675b, wfcVar));
        }
        m46668k(hfgVarMo46675b);
        m46667j(hfgVarMo46675b, this.f43515c);
        m46669l(hfgVarMo46675b, this.f43515c);
        return this.f43515c;
    }

    /* renamed from: n */
    public final hfg m46671n(hfg hfgVar, wfc wfcVar) {
        Rect rectM55047p;
        Rect rectMo18157a = wfcVar.mo18157a();
        int iMo18159c = wfcVar.mo18159c();
        boolean zMo18163g = wfcVar.mo18163g();
        Matrix matrix = new Matrix(hfgVar.m30386q());
        Matrix matrixM55036e = wuh.m55036e(new RectF(rectMo18157a), wuh.m55049r(wfcVar.mo18160d()), iMo18159c, zMo18163g);
        matrix.postConcat(matrixM55036e);
        fgd.m26657a(wuh.m55041j(wuh.m55037f(rectMo18157a, iMo18159c), wfcVar.mo18160d()));
        if (wfcVar.mo18164j()) {
            fgd.m26658b(wfcVar.mo18157a().contains(hfgVar.m30383n()), String.format("Output crop rect %s must contain input crop rect %s", wfcVar.mo18157a(), hfgVar.m30383n()));
            rectM55047p = new Rect();
            RectF rectF = new RectF(hfgVar.m30383n());
            matrixM55036e.mapRect(rectF);
            rectF.round(rectM55047p);
        } else {
            rectM55047p = wuh.m55047p(wfcVar.mo18160d());
        }
        Rect rect = rectM55047p;
        return new hfg(wfcVar.mo18161e(), wfcVar.mo18158b(), hfgVar.m30387r().mo35131g().mo35136e(wfcVar.mo18160d()).mo35132a(), matrix, false, rect, hfgVar.m30385p() - iMo18159c, -1, hfgVar.m30391v() != zMo18163g);
    }
}
