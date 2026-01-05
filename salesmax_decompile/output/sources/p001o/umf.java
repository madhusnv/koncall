package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import p001o.ewi;

/* loaded from: classes.dex */
public class umf extends tmf {
    public static final ewi.C13274i r0 = null;
    public static final SparseIntArray s0;
    public final LinearLayout p0;
    public long q0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        s0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetAddUser, 1);
        sparseIntArray.put(z8e.sheetCreateTeam, 2);
    }

    public umf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, r0, s0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.q0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.q0 = 1L;
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
            this.q0 = 0L;
        }
    }

    public umf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[1], (MaterialButton) objArr[2]);
        this.q0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.p0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
