package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class ah7 extends zg7 {
    public static final ewi.C13274i M0;
    public static final SparseIntArray N0;
    public final d54 A0;
    public final d54 B0;
    public final d54 C0;
    public final d54 D0;
    public final d54 E0;
    public final d54 F0;
    public final d54 G0;
    public final d54 H0;
    public final d54 I0;
    public final d54 J0;
    public final d54 K0;
    public long L0;
    public final ConstraintLayout y0;
    public final LinearLayout z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(24);
        M0 = c13274i;
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(1, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(z8e.ivContactProfilePic, 13);
        sparseIntArray.put(z8e.tvReceivedFileText, 14);
        sparseIntArray.put(z8e.searchClose, 15);
        sparseIntArray.put(z8e.tvSelectDocCategoryText, 16);
        sparseIntArray.put(z8e.rvDocType, 17);
        sparseIntArray.put(z8e.tvSelectDocSubCategoryText, 18);
        sparseIntArray.put(z8e.rvDocSubType, 19);
        sparseIntArray.put(z8e.searchGlobalEditTextLayout, 20);
        sparseIntArray.put(z8e.searchGlobalEditText, 21);
        sparseIntArray.put(z8e.shimmerLayout, 22);
        sparseIntArray.put(z8e.rvCallLogsList, 23);
    }

    public ah7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 24, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.L0 != 0) {
                return true;
            }
            return this.A0.mo16290E() || this.D0.mo16290E() || this.E0.mo16290E() || this.F0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.J0.mo16290E() || this.K0.mo16290E() || this.B0.mo16290E() || this.C0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 1L;
        }
        this.A0.mo16291G();
        this.D0.mo16291G();
        this.E0.mo16291G();
        this.F0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
        this.J0.mo16291G();
        this.K0.mo16291G();
        this.B0.mo16291G();
        this.C0.mo16291G();
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
            this.L0 = 0L;
        }
        ewi.m25683r(this.A0);
        ewi.m25683r(this.D0);
        ewi.m25683r(this.E0);
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.J0);
        ewi.m25683r(this.K0);
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
    }

    public ah7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[13], (RecyclerView) objArr[23], (RecyclerView) objArr[19], (RecyclerView) objArr[17], (ShapeableImageView) objArr[15], (TextInputEditText) objArr[21], (TextInputLayout) objArr[20], (ShimmerFrameLayout) objArr[22], (MaterialTextView) objArr[14], (MaterialTextView) objArr[16], (MaterialTextView) objArr[18]);
        this.L0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.y0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.z0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[2];
        this.A0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[11];
        this.B0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[12];
        this.C0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[3];
        this.D0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[4];
        this.E0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[5];
        this.F0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[6];
        this.G0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[7];
        this.H0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[8];
        this.I0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[9];
        this.J0 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[10];
        this.K0 = d54Var11;
        m25693Z(d54Var11);
        a0(view);
        mo16291G();
    }
}
