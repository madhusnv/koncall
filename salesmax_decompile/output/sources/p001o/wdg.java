package p001o;

import ai.salesmax.view.ViewProfileData;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class wdg extends vdg {
    public static final ewi.C13274i A0 = null;
    public static final SparseIntArray B0;
    public final NestedScrollView w0;
    public final ConstraintLayout x0;
    public boolean y0;
    public long z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B0 = sparseIntArray;
        sparseIntArray.put(z8e.supportDetail, 2);
        sparseIntArray.put(z8e.pleaseReachUs, 3);
        sparseIntArray.put(z8e.mobileNumber, 4);
        sparseIntArray.put(z8e.emailAddress, 5);
        sparseIntArray.put(z8e.actionGroup, 6);
        sparseIntArray.put(z8e.leadCall, 7);
        sparseIntArray.put(z8e.leadWhatsapp, 8);
        sparseIntArray.put(z8e.shareLocalDbContent, 9);
        sparseIntArray.put(z8e.chatWithUsButton, 10);
    }

    public wdg(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 11, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.z0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 1L;
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
        long j;
        synchronized (this) {
            j = this.z0;
            this.z0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.x0;
            boolean z = this.y0;
            wh1.m54388b(constraintLayout, z, z, z, z, true, true, true, true);
        }
        if (j2 != 0) {
            this.y0 = true;
        }
    }

    public wdg(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[6], (MaterialButton) objArr[10], (ViewProfileData) objArr[5], (MaterialButton) objArr[7], (MaterialButton) objArr[8], (ViewProfileData) objArr[4], (MaterialTextView) objArr[3], (MaterialButton) objArr[9], (LinearLayout) objArr[2]);
        this.z0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.w0 = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
