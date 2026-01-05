package p001o;

import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class k09 extends j09 {
    public static final ewi.C13274i s0 = null;
    public static final SparseIntArray t0 = null;
    public long r0;

    public k09(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 2, s0, t0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.r0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.r0 = 4L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (67 == i) {
            j0((String) obj);
        } else {
            if (73 != i) {
                return false;
            }
            k0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.j09
    public void j0(String str) {
        this.p0 = str;
        synchronized (this) {
            this.r0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.j09
    public void k0(Integer num) {
        this.q0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.r0;
            this.r0 = 0L;
        }
        String str = this.p0;
        if ((j & 5) != 0) {
            nr1.f1(this.o0, str);
        }
    }

    public k09(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[0], (MaterialTextView) objArr[1]);
        this.r0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        a0(view);
        mo16291G();
    }
}
