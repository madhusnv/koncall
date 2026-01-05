package p8;

import android.view.View;
import android.view.ViewGroup;
import c9.C0919n;
import java.util.ArrayList;
import ng.C5070u;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.w */
/* loaded from: classes.dex */
public class C5862w extends AbstractC5857r {

    /* renamed from: B */
    public int f28632B;

    /* renamed from: y */
    public ArrayList f28635y = new ArrayList();

    /* renamed from: z */
    public boolean f28636z = true;

    /* renamed from: C */
    public boolean f28633C = false;

    /* renamed from: D */
    public int f28634D = 0;

    @Override // p8.AbstractC5857r
    /* renamed from: A */
    public final void mo11439A(View view) {
        super.mo11439A(view);
        int size = this.f28635y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5857r) this.f28635y.get(i10)).mo11439A(view);
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: B */
    public final void mo11440B() {
        if (this.f28635y.isEmpty()) {
            m11446H();
            m11456o();
            return;
        }
        C5847h c5847h = new C5847h();
        c5847h.f28584b = this;
        ArrayList arrayList = this.f28635y;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC5857r) obj).m11448a(c5847h);
        }
        this.f28632B = this.f28635y.size();
        if (this.f28636z) {
            ArrayList arrayList2 = this.f28635y;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((AbstractC5857r) obj2).mo11440B();
            }
            return;
        }
        for (int i12 = 1; i12 < this.f28635y.size(); i12++) {
            ((AbstractC5857r) this.f28635y.get(i12 - 1)).m11448a(new C5847h(1, (AbstractC5857r) this.f28635y.get(i12)));
        }
        AbstractC5857r abstractC5857r = (AbstractC5857r) this.f28635y.get(0);
        if (abstractC5857r != null) {
            abstractC5857r.mo11440B();
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: C */
    public final void mo11441C(C5850k c5850k) {
        this.f28623s = c5850k;
        this.f28634D |= 8;
        int size = this.f28635y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5857r) this.f28635y.get(i10)).mo11441C(c5850k);
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: D */
    public final void mo11442D() {
        this.f28634D |= 1;
        ArrayList arrayList = this.f28635y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC5857r) this.f28635y.get(i10)).mo11442D();
            }
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: E */
    public final void mo11443E(C5070u c5070u) {
        super.mo11443E(c5070u);
        this.f28634D |= 4;
        if (this.f28635y != null) {
            for (int i10 = 0; i10 < this.f28635y.size(); i10++) {
                ((AbstractC5857r) this.f28635y.get(i10)).mo11443E(c5070u);
            }
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: F */
    public final void mo11444F() {
        this.f28634D |= 2;
        int size = this.f28635y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5857r) this.f28635y.get(i10)).mo11444F();
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: G */
    public final void mo11445G(long j6) {
        this.f28608b = j6;
    }

    @Override // p8.AbstractC5857r
    /* renamed from: I */
    public final String mo11447I(String str) {
        String strMo11447I = super.mo11447I(str);
        for (int i10 = 0; i10 < this.f28635y.size(); i10++) {
            StringBuilder sbM11245p = AbstractC5601a.m11245p(strMo11447I, "\n");
            sbM11245p.append(((AbstractC5857r) this.f28635y.get(i10)).mo11447I(str + "  "));
            strMo11447I = sbM11245p.toString();
        }
        return strMo11447I;
    }

    /* renamed from: J */
    public final void m11465J(AbstractC5857r abstractC5857r) {
        this.f28635y.add(abstractC5857r);
        abstractC5857r.f28613g = this;
        if ((this.f28634D & 1) != 0) {
            abstractC5857r.mo11442D();
        }
        if ((this.f28634D & 2) != 0) {
            abstractC5857r.mo11444F();
        }
        if ((this.f28634D & 4) != 0) {
            abstractC5857r.mo11443E(this.f28624t);
        }
        if ((this.f28634D & 8) != 0) {
            abstractC5857r.mo11441C(this.f28623s);
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: b */
    public final void mo11449b(View view) {
        for (int i10 = 0; i10 < this.f28635y.size(); i10++) {
            ((AbstractC5857r) this.f28635y.get(i10)).mo11449b(view);
        }
        this.f28610d.add(view);
    }

    @Override // p8.AbstractC5857r
    public final void cancel() {
        super.cancel();
        int size = this.f28635y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5857r) this.f28635y.get(i10)).cancel();
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: d */
    public final void mo11427d(C5864y c5864y) {
        View view = c5864y.f28641b;
        if (m11459v(view)) {
            ArrayList arrayList = this.f28635y;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AbstractC5857r abstractC5857r = (AbstractC5857r) obj;
                if (abstractC5857r.m11459v(view)) {
                    abstractC5857r.mo11427d(c5864y);
                    c5864y.f28642c.add(abstractC5857r);
                }
            }
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: f */
    public final void mo11451f(C5864y c5864y) {
        int size = this.f28635y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5857r) this.f28635y.get(i10)).mo11451f(c5864y);
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: g */
    public final void mo11428g(C5864y c5864y) {
        View view = c5864y.f28641b;
        if (m11459v(view)) {
            ArrayList arrayList = this.f28635y;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AbstractC5857r abstractC5857r = (AbstractC5857r) obj;
                if (abstractC5857r.m11459v(view)) {
                    abstractC5857r.mo11428g(c5864y);
                    c5864y.f28642c.add(abstractC5857r);
                }
            }
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: l */
    public final AbstractC5857r clone() {
        C5862w c5862w = (C5862w) super.clone();
        c5862w.f28635y = new ArrayList();
        int size = this.f28635y.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5857r abstractC5857rClone = ((AbstractC5857r) this.f28635y.get(i10)).clone();
            c5862w.f28635y.add(abstractC5857rClone);
            abstractC5857rClone.f28613g = c5862w;
        }
        return c5862w;
    }

    @Override // p8.AbstractC5857r
    /* renamed from: n */
    public final void mo11455n(ViewGroup viewGroup, C0919n c0919n, C0919n c0919n2, ArrayList arrayList, ArrayList arrayList2) {
        long j6 = this.f28608b;
        int size = this.f28635y.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5857r abstractC5857r = (AbstractC5857r) this.f28635y.get(i10);
            if (j6 > 0 && (this.f28636z || i10 == 0)) {
                long j10 = abstractC5857r.f28608b;
                if (j10 > 0) {
                    abstractC5857r.mo11445G(j10 + j6);
                } else {
                    abstractC5857r.mo11445G(j6);
                }
            }
            abstractC5857r.mo11455n(viewGroup, c0919n, c0919n2, arrayList, arrayList2);
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: x */
    public final void mo11460x(View view) {
        super.mo11460x(view);
        int size = this.f28635y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5857r) this.f28635y.get(i10)).mo11460x(view);
        }
    }

    @Override // p8.AbstractC5857r
    /* renamed from: z */
    public final void mo11462z(View view) {
        for (int i10 = 0; i10 < this.f28635y.size(); i10++) {
            ((AbstractC5857r) this.f28635y.get(i10)).mo11462z(view);
        }
        this.f28610d.remove(view);
    }
}
