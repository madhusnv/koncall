package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.card.MaterialCardView;
import p001o.ewi;

/* loaded from: classes.dex */
public class xof extends wof {
    public static final ewi.C13274i r0;
    public static final SparseIntArray s0;
    public final LinearLayout o0;
    public final MaterialCardView p0;
    public long q0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(3);
        r0 = c13274i;
        c13274i.m25699a(1, new String[]{"add_task_search_location"}, new int[]{2}, new int[]{p9e.add_task_search_location});
        s0 = null;
    }

    public xof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, r0, s0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.q0 != 0) {
                return true;
            }
            return this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.q0 = 2L;
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
        return h0((n40) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        return true;
    }

    public final boolean h0(n40 n40Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.q0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.q0 = 0L;
        }
        ewi.m25683r(this.n0);
    }

    public xof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (n40) objArr[2]);
        this.q0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.o0 = linearLayout;
        linearLayout.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[1];
        this.p0 = materialCardView;
        materialCardView.setTag(null);
        m25693Z(this.n0);
        a0(view);
        mo16291G();
    }
}
