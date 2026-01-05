package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import p001o.ewi;

/* loaded from: classes.dex */
public class cnf extends bnf {
    public static final ewi.C13274i s0 = null;
    public static final SparseIntArray t0;
    public final MaterialCardView q0;
    public long r0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        t0 = sparseIntArray;
        sparseIntArray.put(z8e.rvMappingList, 1);
    }

    public cnf(yt4 yt4Var, View view) {
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
        if (33 == i) {
            h0((ck6) obj);
        } else {
            if (73 != i) {
                return false;
            }
            i0((Integer) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.p0 = ck6Var;
    }

    public void i0(Integer num) {
        this.o0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.r0 = 0L;
        }
    }

    public cnf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[1]);
        this.r0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.q0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
