package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class pj7 extends oj7 {
    public static final ewi.C13274i t0 = null;
    public static final SparseIntArray u0;
    public final ConstraintLayout r0;
    public long s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u0 = sparseIntArray;
        sparseIntArray.put(z8e.no_account_text, 1);
        sparseIntArray.put(z8e.logOutButton, 2);
        sparseIntArray.put(z8e.profileList, 3);
    }

    public pj7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, t0, u0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.s0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.s0 = 2L;
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
        if (18 != i) {
            return false;
        }
        j0((String) obj);
        return true;
    }

    public void j0(String str) {
        this.q0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.s0 = 0L;
        }
    }

    public pj7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[2], (TextView) objArr[1], (RecyclerView) objArr[3]);
        this.s0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.r0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
