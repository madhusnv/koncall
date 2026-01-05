package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.gh9;

/* loaded from: classes3.dex */
public class hp3 extends hc1 {

    /* renamed from: B */
    public gc1 f27265B;

    /* renamed from: C */
    public final List f27266C;

    /* renamed from: D */
    public final RectF f27267D;

    /* renamed from: E */
    public final RectF f27268E;

    /* renamed from: F */
    public final Paint f27269F;

    /* renamed from: o.hp3$a */
    public static /* synthetic */ class C14019a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27270a;

        static {
            int[] iArr = new int[gh9.EnumC13716b.values().length];
            f27270a = iArr;
            try {
                iArr[gh9.EnumC13716b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27270a[gh9.EnumC13716b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public hp3(ema emaVar, gh9 gh9Var, List list, ama amaVar) {
        int i;
        hc1 hc1Var;
        super(emaVar, gh9Var);
        this.f27266C = new ArrayList();
        this.f27267D = new RectF();
        this.f27268E = new RectF();
        this.f27269F = new Paint();
        fg0 fg0VarM28695u = gh9Var.m28695u();
        if (fg0VarM28695u != null) {
            gc1 gc1VarMo24960a = fg0VarM28695u.mo24960a();
            this.f27265B = gc1VarMo24960a;
            m30184i(gc1VarMo24960a);
            this.f27265B.m28369a(this);
        } else {
            this.f27265B = null;
        }
        rla rlaVar = new rla(amaVar.m17447k().size());
        int size = list.size() - 1;
        hc1 hc1Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            gh9 gh9Var2 = (gh9) list.get(size);
            hc1 hc1VarM30170u = hc1.m30170u(this, gh9Var2, emaVar, amaVar);
            if (hc1VarM30170u != null) {
                rlaVar.m46936i(hc1VarM30170u.m30198y().m28678d(), hc1VarM30170u);
                if (hc1Var2 != null) {
                    hc1Var2.m30178H(hc1VarM30170u);
                    hc1Var2 = null;
                } else {
                    this.f27266C.add(0, hc1VarM30170u);
                    int i2 = C14019a.f27270a[gh9Var2.m28682h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        hc1Var2 = hc1VarM30170u;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < rlaVar.m46940m(); i++) {
            hc1 hc1Var3 = (hc1) rlaVar.m46932c(rlaVar.m46935h(i));
            if (hc1Var3 != null && (hc1Var = (hc1) rlaVar.m46932c(hc1Var3.m30198y().m28684j())) != null) {
                hc1Var3.m30180J(hc1Var);
            }
        }
    }

    @Override // p001o.hc1
    /* renamed from: G */
    public void mo30177G(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
        for (int i2 = 0; i2 < this.f27266C.size(); i2++) {
            ((hc1) this.f27266C.get(i2)).mo19999c(yc9Var, i, list, yc9Var2);
        }
    }

    @Override // p001o.hc1
    /* renamed from: I */
    public void mo30179I(boolean z) {
        super.mo30179I(z);
        Iterator it = this.f27266C.iterator();
        while (it.hasNext()) {
            ((hc1) it.next()).mo30179I(z);
        }
    }

    @Override // p001o.hc1
    /* renamed from: K */
    public void mo30181K(float f) {
        super.mo30181K(f);
        if (this.f27265B != null) {
            f = ((((Float) this.f27265B.mo28376h()).floatValue() * this.f26621o.m28676b().m17445i()) - this.f26621o.m28676b().m17452p()) / (this.f26620n.m25327p().m17441e() + 0.01f);
        }
        if (this.f27265B == null) {
            f -= this.f26621o.m28692r();
        }
        if (this.f26621o.m28696v() != 0.0f && !"__container".equals(this.f26621o.m28683i())) {
            f /= this.f26621o.m28696v();
        }
        for (int size = this.f27266C.size() - 1; size >= 0; size--) {
            ((hc1) this.f27266C.get(size)).mo30181K(f);
        }
    }

    @Override // p001o.hc1, p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        super.mo20000d(obj, qmaVar);
        if (obj == mma.f35700E) {
            if (qmaVar == null) {
                gc1 gc1Var = this.f27265B;
                if (gc1Var != null) {
                    gc1Var.m28380n(null);
                    return;
                }
                return;
            }
            vri vriVar = new vri(qmaVar);
            this.f27265B = vriVar;
            vriVar.m28369a(this);
            m30184i(this.f27265B);
        }
    }

    @Override // p001o.hc1, p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        super.mo20001e(rectF, matrix, z);
        for (int size = this.f27266C.size() - 1; size >= 0; size--) {
            this.f27267D.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((hc1) this.f27266C.get(size)).mo20001e(this.f27267D, this.f26619m, true);
            rectF.union(this.f27267D);
        }
    }

    @Override // p001o.hc1
    /* renamed from: t */
    public void mo23320t(Canvas canvas, Matrix matrix, int i) {
        ve9.m52656a("CompositionLayer#draw");
        this.f27268E.set(0.0f, 0.0f, this.f26621o.m28686l(), this.f26621o.m28685k());
        matrix.mapRect(this.f27268E);
        boolean z = this.f26620n.m25296I() && this.f27266C.size() > 1 && i != 255;
        if (z) {
            this.f27269F.setAlpha(i);
            hri.m31033m(canvas, this.f27268E, this.f27269F);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f27266C.size() - 1; size >= 0; size--) {
            if (!this.f27268E.isEmpty() ? canvas.clipRect(this.f27268E) : true) {
                ((hc1) this.f27266C.get(size)).mo20002g(canvas, matrix, i);
            }
        }
        canvas.restore();
        ve9.m52657b("CompositionLayer#draw");
    }
}
