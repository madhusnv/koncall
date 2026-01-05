package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class ct4 extends bt4 {
    public static final ewi.C13274i B0 = null;
    public static final SparseIntArray C0;
    public long A0;
    public final ConstraintLayout z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(z8e.no_account_text, 3);
        sparseIntArray.put(z8e.logOutButton, 4);
        sparseIntArray.put(z8e.no_account_invitation_text, 5);
        sparseIntArray.put(z8e.join_workspace_image, 6);
        sparseIntArray.put(z8e.profileList, 7);
        sparseIntArray.put(z8e.create_workspace_text, 8);
        sparseIntArray.put(z8e.create_workspace_detail_text, 9);
        sparseIntArray.put(z8e.create_workspace_image, 10);
        sparseIntArray.put(z8e.createWorkspaceActionButton, 11);
    }

    public ct4(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, B0, C0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.A0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.A0 = 2L;
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
        if (69 != i) {
            return false;
        }
        j0((Integer) obj);
        return true;
    }

    @Override // p001o.bt4
    public void j0(Integer num) {
        this.y0 = num;
        synchronized (this) {
            this.A0 |= 1;
        }
        m28509h(69);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        boolean z;
        synchronized (this) {
            j = this.A0;
            this.A0 = 0L;
        }
        Integer num = this.y0;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            str = num + " Pending Invites";
            z = num != null;
            if (j2 != 0) {
                j = z ? j | 8 : j | 4;
            }
        } else {
            str = null;
            z = false;
        }
        boolean z2 = (8 & j) != 0 && ewi.m25674U(num) > 0;
        long j3 = j & 3;
        if (j3 != 0) {
            if (!z) {
                z2 = false;
            }
            if (j3 != 0) {
                j |= z2 ? 32L : 16L;
            }
            if (z2) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.s0.setVisibility(i);
            fjh.m26938c(this.w0, str);
        }
    }

    public ct4(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[11], (TextView) objArr[9], (ShapeableImageView) objArr[10], (TextView) objArr[8], (ShapeableImageView) objArr[6], (TextView) objArr[1], (ShapeableImageView) objArr[4], (TextView) objArr[5], (TextView) objArr[3], (MaterialButton) objArr[2], (RecyclerView) objArr[7]);
        this.A0 = -1L;
        this.s0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.z0 = constraintLayout;
        constraintLayout.setTag(null);
        this.w0.setTag(null);
        a0(view);
        mo16291G();
    }
}
