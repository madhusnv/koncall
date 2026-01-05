package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p001o.ewi;

/* loaded from: classes.dex */
public class is5 extends hs5 {
    public static final ewi.C13274i q0 = null;
    public static final SparseIntArray r0;
    public final LinearLayout o0;
    public long p0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        r0 = sparseIntArray;
        sparseIntArray.put(z8e.profileList, 1);
    }

    public is5(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 2, q0, r0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.p0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.p0 = 1L;
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
            this.p0 = 0L;
        }
    }

    public is5(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[1]);
        this.p0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.o0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
