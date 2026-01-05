package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p001o.ewi;

/* loaded from: classes.dex */
public class gs5 extends fs5 {
    public static final ewi.C13274i p0 = null;
    public static final SparseIntArray q0 = null;
    public long o0;

    public gs5(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 1, p0, q0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.o0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.o0 = 1L;
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
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.o0 = 0L;
        }
    }

    public gs5(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[0]);
        this.o0 = -1L;
        this.n0.setTag(null);
        a0(view);
        mo16291G();
    }
}
