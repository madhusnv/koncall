package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class vh7 extends uh7 {
    public static final ewi.C13274i q0;
    public static final SparseIntArray r0;
    public final FrameLayout o0;
    public long p0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(2);
        q0 = c13274i;
        c13274i.m25699a(0, new String[]{"no_internet"}, new int[]{1}, new int[]{p9e.no_internet});
        r0 = null;
    }

    public vh7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 2, q0, r0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.p0 != 0) {
                return true;
            }
            return this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.p0 = 2L;
        }
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return h0((bzb) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        return true;
    }

    public final boolean h0(bzb bzbVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.p0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.p0 = 0L;
        }
        ewi.m25683r(this.n0);
    }

    public vh7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (bzb) objArr[1]);
        this.p0 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.o0 = frameLayout;
        frameLayout.setTag(null);
        m25693Z(this.n0);
        a0(view);
        mo16291G();
    }
}
