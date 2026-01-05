package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class hw8 extends gw8 {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final LinearLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.toggleGroup, 1);
        sparseIntArray.put(z8e.btnToday, 2);
        sparseIntArray.put(z8e.btnWeek, 3);
        sparseIntArray.put(z8e.btnMonth, 4);
        sparseIntArray.put(z8e.commentsClose, 5);
        sparseIntArray.put(z8e.homeCommentsCard, 6);
        sparseIntArray.put(z8e.rvActivityStatusList, 7);
    }

    public hw8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 1L;
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
            this.v0 = 0L;
        }
    }

    public hw8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[4], (Button) objArr[2], (Button) objArr[3], (ShapeableImageView) objArr[5], (MaterialCardView) objArr[6], (RecyclerView) objArr[7], (MaterialButtonToggleGroup) objArr[1]);
        this.v0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.u0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
