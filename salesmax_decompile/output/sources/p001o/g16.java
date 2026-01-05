package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p001o.ifg;

/* loaded from: classes2.dex */
public class g16 {

    /* renamed from: a */
    public final nfg f24386a;

    /* renamed from: b */
    public final v92 f24387b;

    /* renamed from: c */
    public final v92 f24388c;

    /* renamed from: d */
    public C13599c f24389d;

    /* renamed from: e */
    public AbstractC13598b f24390e;

    /* renamed from: o.g16$a */
    public class C13597a implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ hfg f24391a;

        public C13597a(hfg hfgVar) {
            this.f24391a = hfgVar;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            if (this.f24391a.m30388s() == 2 && (th instanceof CancellationException)) {
                wja.m54627a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            wja.m54639m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + vjg.m52893a(this.f24391a.m30388s()), th);
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ifg ifgVar) {
            fgd.m26663g(ifgVar);
            g16.this.f24386a.mo22215b(ifgVar);
        }
    }

    /* renamed from: o.g16$b */
    public static abstract class AbstractC13598b {
        /* renamed from: d */
        public static AbstractC13598b m27913d(hfg hfgVar, hfg hfgVar2, List list) {
            return new k41(hfgVar, hfgVar2, list);
        }

        /* renamed from: a */
        public abstract List mo27914a();

        /* renamed from: b */
        public abstract hfg mo27915b();

        /* renamed from: c */
        public abstract hfg mo27916c();
    }

    /* renamed from: o.g16$c */
    public static class C13599c extends HashMap {
    }

    public g16(v92 v92Var, v92 v92Var2, nfg nfgVar) {
        this.f24387b = v92Var;
        this.f24388c = v92Var2;
        this.f24386a = nfgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m27904d() {
        C13599c c13599c = this.f24389d;
        if (c13599c != null) {
            Iterator it = c13599c.values().iterator();
            while (it.hasNext()) {
                ((hfg) it.next()).m30378i();
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void m27905e(v92 v92Var, v92 v92Var2, hfg hfgVar, hfg hfgVar2, Map.Entry entry) {
        hfg hfgVar3 = (hfg) entry.getValue();
        Size sizeMo35129e = hfgVar.m30387r().mo35129e();
        Rect rectMo18157a = ((s06) entry.getKey()).mo33179a().mo18157a();
        if (!hfgVar.m30389t()) {
            v92Var = null;
        }
        ifg.AbstractC14281a abstractC14281aM32079f = ifg.AbstractC14281a.m32079f(sizeMo35129e, rectMo18157a, v92Var, ((s06) entry.getKey()).mo33179a().mo18159c(), ((s06) entry.getKey()).mo33179a().mo18163g());
        Size sizeMo35129e2 = hfgVar2.m30387r().mo35129e();
        Rect rectMo18157a2 = ((s06) entry.getKey()).mo33180b().mo18157a();
        if (!hfgVar2.m30389t()) {
            v92Var2 = null;
        }
        bn7.m19424j(hfgVar3.m30379j(((s06) entry.getKey()).mo33179a().mo18158b(), abstractC14281aM32079f, ifg.AbstractC14281a.m32079f(sizeMo35129e2, rectMo18157a2, v92Var2, ((s06) entry.getKey()).mo33180b().mo18159c(), ((s06) entry.getKey()).mo33180b().mo18163g())), new C13597a(hfgVar3), gb2.m28295c());
    }

    /* renamed from: f */
    public void m27907f() {
        this.f24386a.release();
        elh.m25223d(new Runnable() { // from class: o.e16
            @Override // java.lang.Runnable
            public final void run() {
                this.f20729a.m27904d();
            }
        });
    }

    /* renamed from: g */
    public final void m27908g(final v92 v92Var, final v92 v92Var2, final hfg hfgVar, final hfg hfgVar2, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            m27905e(v92Var, v92Var2, hfgVar, hfgVar2, entry);
            ((hfg) entry.getValue()).m30374e(new Runnable() { // from class: o.f16
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22526a.m27905e(v92Var, v92Var2, hfgVar, hfgVar2, entry);
                }
            });
        }
    }

    /* renamed from: h */
    public final void m27909h(v92 v92Var, hfg hfgVar, Map map, boolean z) {
        this.f24386a.mo22214a(hfgVar.m30381l(v92Var, z));
    }

    /* renamed from: i */
    public C13599c m27910i(AbstractC13598b abstractC13598b) {
        elh.m25220a();
        this.f24390e = abstractC13598b;
        this.f24389d = new C13599c();
        hfg hfgVarMo27915b = this.f24390e.mo27915b();
        hfg hfgVarMo27916c = this.f24390e.mo27916c();
        for (s06 s06Var : this.f24390e.mo27914a()) {
            this.f24389d.put(s06Var, m27911j(hfgVarMo27915b, s06Var.mo33179a()));
        }
        m27909h(this.f24387b, hfgVarMo27915b, this.f24389d, true);
        m27909h(this.f24388c, hfgVarMo27916c, this.f24389d, false);
        m27908g(this.f24387b, this.f24388c, hfgVarMo27915b, hfgVarMo27916c, this.f24389d);
        return this.f24389d;
    }

    /* renamed from: j */
    public final hfg m27911j(hfg hfgVar, wfc wfcVar) {
        Rect rectMo18157a = wfcVar.mo18157a();
        int iMo18159c = wfcVar.mo18159c();
        boolean zMo18163g = wfcVar.mo18163g();
        Matrix matrix = new Matrix();
        fgd.m26657a(wuh.m55041j(wuh.m55037f(rectMo18157a, iMo18159c), wfcVar.mo18160d()));
        Rect rectM55047p = wuh.m55047p(wfcVar.mo18160d());
        return new hfg(wfcVar.mo18161e(), wfcVar.mo18158b(), hfgVar.m30387r().mo35131g().mo35136e(wfcVar.mo18160d()).mo35132a(), matrix, false, rectM55047p, hfgVar.m30385p() - iMo18159c, -1, hfgVar.m30391v() != zMo18163g);
    }
}
