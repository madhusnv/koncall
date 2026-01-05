package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class nqe extends mqe {
    public static final ewi.C13274i d1;
    public static final SparseIntArray e1;
    public final ConstraintLayout P0;
    public final LinearLayout Q0;
    public final d54 R0;
    public final d54 S0;
    public final d54 T0;
    public final d54 U0;
    public final d54 V0;
    public final d54 W0;
    public final d54 X0;
    public final d54 Y0;
    public final d54 Z0;
    public final d54 a1;
    public final d54 b1;
    public long c1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(40);
        d1 = c13274i;
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(7, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        e1 = sparseIntArray;
        sparseIntArray.put(z8e.goBackToAllSearch, 20);
        sparseIntArray.put(z8e.tvSearchTerm, 21);
        sparseIntArray.put(z8e.searchLeadsEditText, 22);
        sparseIntArray.put(z8e.accountInvitation, 23);
        sparseIntArray.put(z8e.tvContactName, 24);
        sparseIntArray.put(z8e.tvTutorialEnglish, 25);
        sparseIntArray.put(z8e.tvTutorialHindi, 26);
        sparseIntArray.put(z8e.tvMakingCall, 27);
        sparseIntArray.put(z8e.tvPreferences, 28);
        sparseIntArray.put(z8e.tvAutoCalling, 29);
        sparseIntArray.put(z8e.tvFollowups, 30);
        sparseIntArray.put(z8e.tvSendTemplate, 31);
        sparseIntArray.put(z8e.tvCompleteTask, 32);
        sparseIntArray.put(z8e.tvSaveDocument, 33);
        sparseIntArray.put(z8e.tvChangeNumber, 34);
        sparseIntArray.put(z8e.tvUserActivity, 35);
        sparseIntArray.put(z8e.tvAddNewUser, 36);
        sparseIntArray.put(z8e.tvAppDialer, 37);
        sparseIntArray.put(z8e.tvPersonalCalls, 38);
        sparseIntArray.put(z8e.shimmerLayout, 39);
    }

    public nqe(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 40, d1, e1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.c1 != 0) {
                return true;
            }
            return this.R0.mo16290E() || this.U0.mo16290E() || this.V0.mo16290E() || this.W0.mo16290E() || this.X0.mo16290E() || this.Y0.mo16290E() || this.Z0.mo16290E() || this.a1.mo16290E() || this.b1.mo16290E() || this.S0.mo16290E() || this.T0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.c1 = 2L;
        }
        this.R0.mo16291G();
        this.U0.mo16291G();
        this.V0.mo16291G();
        this.W0.mo16291G();
        this.X0.mo16291G();
        this.Y0.mo16291G();
        this.Z0.mo16291G();
        this.a1.mo16291G();
        this.b1.mo16291G();
        this.S0.mo16291G();
        this.T0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (50 != i) {
            return false;
        }
        k0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.mqe
    public void k0(boolean z) {
        this.O0 = z;
        synchronized (this) {
            this.c1 |= 1;
        }
        m28509h(50);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.c1;
            this.c1 = 0L;
        }
        boolean z = this.O0;
        long j4 = j & 3;
        int i2 = 0;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z) {
                    j2 = j | 8;
                    j3 = 32;
                } else {
                    j2 = j | 4;
                    j3 = 16;
                }
                j = j2 | j3;
            }
            i = z ? 0 : 8;
            if (z) {
                i2 = 8;
            }
        } else {
            i = 0;
        }
        if ((j & 3) != 0) {
            this.o0.setVisibility(i2);
            this.q0.setVisibility(i);
            this.r0.setVisibility(i);
            this.t0.setVisibility(i2);
            this.u0.setVisibility(i);
            this.I0.setVisibility(i);
            this.J0.setVisibility(i2);
        }
        ewi.m25683r(this.R0);
        ewi.m25683r(this.U0);
        ewi.m25683r(this.V0);
        ewi.m25683r(this.W0);
        ewi.m25683r(this.X0);
        ewi.m25683r(this.Y0);
        ewi.m25683r(this.Z0);
        ewi.m25683r(this.a1);
        ewi.m25683r(this.b1);
        ewi.m25683r(this.S0);
        ewi.m25683r(this.T0);
    }

    public nqe(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[23], (ChipGroup) objArr[6], (ShapeableImageView) objArr[20], (MaterialButton) objArr[3], (RecyclerView) objArr[8], (TextInputEditText) objArr[22], (TextInputLayout) objArr[4], (MaterialCardView) objArr[1], (ShimmerFrameLayout) objArr[39], (Chip) objArr[36], (Chip) objArr[37], (Chip) objArr[29], (Chip) objArr[34], (Chip) objArr[32], (MaterialTextView) objArr[24], (Chip) objArr[30], (Chip) objArr[27], (Chip) objArr[38], (Chip) objArr[28], (Chip) objArr[33], (MaterialTextView) objArr[21], (MaterialTextView) objArr[2], (MaterialTextView) objArr[5], (Chip) objArr[31], (Chip) objArr[25], (Chip) objArr[26], (Chip) objArr[35]);
        this.c1 = -1L;
        this.o0.setTag(null);
        this.q0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[7];
        this.Q0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[9];
        this.R0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[18];
        this.S0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[19];
        this.T0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[10];
        this.U0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[11];
        this.V0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[12];
        this.W0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[13];
        this.X0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[14];
        this.Y0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[15];
        this.Z0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[16];
        this.a1 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[17];
        this.b1 = d54Var11;
        m25693Z(d54Var11);
        this.r0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        a0(view);
        mo16291G();
    }
}
