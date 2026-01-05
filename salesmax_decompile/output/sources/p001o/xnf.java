package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.LeadFilter;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class xnf extends wnf {
    public static final ewi.C13274i l2;
    public static final SparseIntArray m2;
    public final ConstraintLayout T1;
    public final LinearLayout U1;
    public final LinearLayout V1;
    public final d54 W1;
    public final d54 X1;
    public final d54 Y1;
    public final d54 Z1;
    public final d54 a2;
    public final d54 b2;
    public final d54 c2;
    public final d54 d2;
    public final d54 e2;
    public final d54 f2;
    public final d54 g2;
    public final LinearLayout h2;
    public final LinearLayout i2;
    public boolean j2;
    public long k2;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(92);
        l2 = c13274i;
        c13274i.m25699a(5, new String[]{"content_custom_form"}, new int[]{12}, new int[]{p9e.content_custom_form});
        c13274i.m25699a(10, new String[]{"content_no_saved_view"}, new int[]{24}, new int[]{p9e.content_no_saved_view});
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(11, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        m2 = sparseIntArray;
        sparseIntArray.put(z8e.buttonSetting, 25);
        sparseIntArray.put(z8e.filterSheetTitle, 26);
        sparseIntArray.put(z8e.buttonCancel, 27);
        sparseIntArray.put(z8e.switchSmartViewsOption, 28);
        sparseIntArray.put(z8e.leadLifecycleMessage, 29);
        sparseIntArray.put(z8e.toggleGroupLeadLifecycle, 30);
        sparseIntArray.put(z8e.btnLifecycleNew, 31);
        sparseIntArray.put(z8e.btnLifecycleProspecting, 32);
        sparseIntArray.put(z8e.btnLifecycleOpportunity, 33);
        sparseIntArray.put(z8e.btnLifecycleClosed, 34);
        sparseIntArray.put(z8e.addLeadSourceLayout, 35);
        sparseIntArray.put(z8e.addLeadSource, 36);
        sparseIntArray.put(z8e.mLeadSourceClose, 37);
        sparseIntArray.put(z8e.addLeadSourceDrillDownOneSearch, 38);
        sparseIntArray.put(z8e.addLeadSourceDrillDownOneLayout, 39);
        sparseIntArray.put(z8e.addLeadSourceDrillDownOne, 40);
        sparseIntArray.put(z8e.mLeadSourceDrillDownOneClose, 41);
        sparseIntArray.put(z8e.addLeadTeamSearch, 42);
        sparseIntArray.put(z8e.addLeadTeamLayout, 43);
        sparseIntArray.put(z8e.addLeadTeam, 44);
        sparseIntArray.put(z8e.mLeadTeamClose, 45);
        sparseIntArray.put(z8e.addLeadUserSearch, 46);
        sparseIntArray.put(z8e.addLeadUserLayout, 47);
        sparseIntArray.put(z8e.addLeadUser, 48);
        sparseIntArray.put(z8e.mLeadUserClose, 49);
        sparseIntArray.put(z8e.bulkUploadSelectionTxt, 50);
        sparseIntArray.put(z8e.mAutoCompleteBulkUpload, 51);
        sparseIntArray.put(z8e.mADClose, 52);
        sparseIntArray.put(z8e.userTagsMessage, 53);
        sparseIntArray.put(z8e.rvFilterUserTags, 54);
        sparseIntArray.put(z8e.lastOutcomeMessage, 55);
        sparseIntArray.put(z8e.rvFilterOutcomes, 56);
        sparseIntArray.put(z8e.lastOutcomeMessageUnconnected, 57);
        sparseIntArray.put(z8e.rvFilterOutcomesUnconnected, 58);
        sparseIntArray.put(z8e.prospectingAttemptsMessage, 59);
        sparseIntArray.put(z8e.textProspectingAttemptsHint, 60);
        sparseIntArray.put(z8e.notPickingCallsMessage, 61);
        sparseIntArray.put(z8e.textUnsuccessfulAttemptsHint, 62);
        sparseIntArray.put(z8e.leadHasOpenTask, 63);
        sparseIntArray.put(z8e.isCustomer, 64);
        sparseIntArray.put(z8e.hasOpenPayment, 65);
        sparseIntArray.put(z8e.lastCalledTimeMessage, 66);
        sparseIntArray.put(z8e.btnLastCalledFrom, 67);
        sparseIntArray.put(z8e.btnLastCalledTo, 68);
        sparseIntArray.put(z8e.lastEngagedTimeMessage, 69);
        sparseIntArray.put(z8e.btnLastEngagedFrom, 70);
        sparseIntArray.put(z8e.btnLastEngagedTo, 71);
        sparseIntArray.put(z8e.lastLeadAssignedMessage, 72);
        sparseIntArray.put(z8e.btnLastAssignedFrom, 73);
        sparseIntArray.put(z8e.btnLastAssignedTo, 74);
        sparseIntArray.put(z8e.lastLeadCreatedMessage, 75);
        sparseIntArray.put(z8e.btnLastCreatedFrom, 76);
        sparseIntArray.put(z8e.btnLastCreatedTo, 77);
        sparseIntArray.put(z8e.sortByMessage, 78);
        sparseIntArray.put(z8e.toggleGroupSortBySelection, 79);
        sparseIntArray.put(z8e.btnLastAssigned, 80);
        sparseIntArray.put(z8e.btnLastCalled, 81);
        sparseIntArray.put(z8e.btnLastEngaged, 82);
        sparseIntArray.put(z8e.sortDirectionMessage, 83);
        sparseIntArray.put(z8e.toggleGroupSortDirection, 84);
        sparseIntArray.put(z8e.btnSortDescending, 85);
        sparseIntArray.put(z8e.btnSortAscending, 86);
        sparseIntArray.put(z8e.rvSmartViewList, 87);
        sparseIntArray.put(z8e.shimmerLayout, 88);
        sparseIntArray.put(z8e.itemLeadRoot, 89);
        sparseIntArray.put(z8e.buttonClear, 90);
        sparseIntArray.put(z8e.buttonDone, 91);
    }

    public xnf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 92, l2, m2));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.k2 != 0) {
                return true;
            }
            return this.a1.mo16290E() || this.W1.mo16290E() || this.Z1.mo16290E() || this.a2.mo16290E() || this.b2.mo16290E() || this.c2.mo16290E() || this.d2.mo16290E() || this.e2.mo16290E() || this.f2.mo16290E() || this.g2.mo16290E() || this.X1.mo16290E() || this.Y1.mo16290E() || this.Z0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.k2 = MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        }
        this.a1.mo16291G();
        this.W1.mo16291G();
        this.Z1.mo16291G();
        this.a2.mo16291G();
        this.b2.mo16291G();
        this.c2.mo16291G();
        this.d2.mo16291G();
        this.e2.mo16291G();
        this.f2.mo16291G();
        this.g2.mo16291G();
        this.X1.mo16291G();
        this.Y1.mo16291G();
        this.Z0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return t0((b44) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return u0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (85 == i) {
            p0(((Boolean) obj).booleanValue());
        } else if (19 == i) {
            l0((FormFields) obj);
        } else if (91 == i) {
            s0((Boolean) obj);
        } else if (86 == i) {
            q0(((Boolean) obj).booleanValue());
        } else if (33 == i) {
            v0((ck6) obj);
        } else if (47 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (73 == i) {
            w0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            n0((LeadFilter) obj);
        }
        return true;
    }

    @Override // p001o.wnf
    public void l0(FormFields formFields) {
        this.Q1 = formFields;
        synchronized (this) {
            this.k2 |= 8;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.wnf
    public void m0(boolean z) {
        this.P1 = z;
        synchronized (this) {
            this.k2 |= 128;
        }
        m28509h(47);
        super.m25692R();
    }

    @Override // p001o.wnf
    public void n0(LeadFilter leadFilter) {
        this.L1 = leadFilter;
        synchronized (this) {
            this.k2 |= 512;
        }
        m28509h(67);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6 A[PHI: r2
      0x00e6: PHI (r2v2 long) = (r2v1 long), (r2v12 long) binds: [B:37:0x00d2, B:43:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        int i3;
        int iM25688z;
        int iM25688z2;
        int i4;
        int i5;
        ck6 ck6Var;
        int i6;
        String str;
        String str2;
        String str3;
        String str4;
        Integer prospectingAttempts;
        Integer unsuccessfulCallAttempts;
        long j2;
        int iM25688z3;
        long j3;
        long j4;
        synchronized (this) {
            j = this.k2;
            this.k2 = 0L;
        }
        boolean z = this.N1;
        FormFields formFields = this.Q1;
        Boolean bool = this.M1;
        boolean z2 = this.O1;
        ck6 ck6Var2 = this.S1;
        boolean z3 = this.P1;
        Integer num = this.R1;
        LeadFilter leadFilter = this.L1;
        long j5 = j & 1040;
        if (j5 != 0) {
            boolean zM25676W = ewi.m25676W(bool);
            if (j5 != 0) {
                if (zM25676W) {
                    j3 = j | MediaStatus.COMMAND_EDIT_TRACKS | MediaStatus.COMMAND_LIKE | MediaStatus.COMMAND_STREAM_TRANSFER | 1048576 | Javac.GENERATED_MEMBER;
                    j4 = 67108864;
                } else {
                    j3 = j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE | MediaStatus.COMMAND_PLAYBACK_RATE | MediaStatus.COMMAND_UNFOLLOW | 524288 | 8388608;
                    j4 = 33554432;
                }
                j = j3 | j4;
            }
            iM25688z = zM25676W ? ewi.m25688z(this.Y0, u6e.backgroundAssigned) : ewi.m25688z(this.Y0, u6e.superfone_purple_10);
            iM25688z2 = ewi.m25688z(this.W0, zM25676W ? u6e.white : u6e.superfone_dark_grey);
            int iM25688z4 = zM25676W ? ewi.m25688z(this.X0, u6e.superfone_purple_10) : ewi.m25688z(this.X0, u6e.backgroundAssigned);
            int i7 = zM25676W ? 0 : 8;
            i4 = zM25676W ? 8 : 0;
            if (zM25676W) {
                j2 = j;
                iM25688z3 = ewi.m25688z(this.V0, u6e.superfone_dark_grey);
            } else {
                j2 = j;
                iM25688z3 = ewi.m25688z(this.V0, u6e.white);
            }
            i3 = i7;
            i2 = iM25688z4;
            i = iM25688z3;
            j = j2;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            iM25688z = 0;
            iM25688z2 = 0;
            i4 = 0;
        }
        long j6 = j & 1152;
        if (j6 == 0) {
            i5 = 0;
        } else {
            if (j6 != 0) {
                j |= z3 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
            }
            if (z3) {
                i5 = 8;
            }
        }
        long j7 = j & 1536;
        if (j7 != 0) {
            if (leadFilter != null) {
                String leadLifecycleStage = leadFilter.getLeadLifecycleStage();
                unsuccessfulCallAttempts = leadFilter.getUnsuccessfulCallAttempts();
                prospectingAttempts = leadFilter.getProspectingAttempts();
                ck6Var = ck6Var2;
                str4 = leadLifecycleStage;
            } else {
                ck6Var = ck6Var2;
                str4 = null;
                prospectingAttempts = null;
                unsuccessfulCallAttempts = null;
            }
            boolean z4 = str4 == "PROSPECTING";
            if (j7 != 0) {
                j |= z4 ? 4194304L : 2097152L;
            }
            String string = unsuccessfulCallAttempts != null ? unsuccessfulCallAttempts.toString() : null;
            String string2 = prospectingAttempts != null ? prospectingAttempts.toString() : null;
            str2 = string;
            i6 = z4 ? 0 : 8;
            str = string2;
        } else {
            ck6Var = ck6Var2;
            i6 = 0;
            str = null;
            str2 = null;
        }
        if ((j & 1152) != 0) {
            str3 = str2;
            this.s0.setVisibility(i5);
        } else {
            str3 = str2;
        }
        if ((j & 1040) != 0) {
            this.V0.setTextColor(i);
            this.W0.setTextColor(iM25688z2);
            this.X0.setCardBackgroundColor(i2);
            this.Y0.setCardBackgroundColor(iM25688z);
            this.U1.setVisibility(i3);
            this.h2.setVisibility(i4);
        }
        if ((1028 & j) != 0) {
            this.Z0.h0(z);
        }
        if ((1056 & j) != 0) {
            this.Z0.i0(z2);
        }
        if ((1032 & j) != 0) {
            this.a1.i0(formFields);
        }
        if ((1088 & j) != 0) {
            this.a1.h0(ck6Var);
        }
        if ((1280 & j) != 0) {
            this.a1.j0(num);
        }
        long j8 = MediaStatus.COMMAND_QUEUE_REPEAT_ALL & j;
        if (j8 != 0) {
            wh1.m54389c(this.T1, this.j2, true);
        }
        if ((j & 1536) != 0) {
            this.i2.setVisibility(i6);
            fjh.m26938c(this.D1, str);
            fjh.m26938c(this.F1, str3);
        }
        if (j8 != 0) {
            this.j2 = true;
        }
        ewi.m25683r(this.a1);
        ewi.m25683r(this.W1);
        ewi.m25683r(this.Z1);
        ewi.m25683r(this.a2);
        ewi.m25683r(this.b2);
        ewi.m25683r(this.c2);
        ewi.m25683r(this.d2);
        ewi.m25683r(this.e2);
        ewi.m25683r(this.f2);
        ewi.m25683r(this.g2);
        ewi.m25683r(this.X1);
        ewi.m25683r(this.Y1);
        ewi.m25683r(this.Z0);
    }

    @Override // p001o.wnf
    public void p0(boolean z) {
        this.N1 = z;
        synchronized (this) {
            this.k2 |= 4;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.wnf
    public void q0(boolean z) {
        this.O1 = z;
        synchronized (this) {
            this.k2 |= 32;
        }
        m28509h(86);
        super.m25692R();
    }

    @Override // p001o.wnf
    public void s0(Boolean bool) {
        this.M1 = bool;
        synchronized (this) {
            this.k2 |= 16;
        }
        m28509h(91);
        super.m25692R();
    }

    public final boolean t0(b44 b44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.k2 |= 1;
        }
        return true;
    }

    public final boolean u0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.k2 |= 2;
        }
        return true;
    }

    public void v0(ck6 ck6Var) {
        this.S1 = ck6Var;
        synchronized (this) {
            this.k2 |= 64;
        }
        m28509h(33);
        super.m25692R();
    }

    public void w0(Integer num) {
        this.R1 = num;
        synchronized (this) {
            this.k2 |= 256;
        }
        m28509h(73);
        super.m25692R();
    }

    public xnf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (AppCompatAutoCompleteTextView) objArr[36], (AppCompatAutoCompleteTextView) objArr[40], (TextInputLayout) objArr[39], (ConstraintLayout) objArr[38], (TextInputLayout) objArr[35], (ConstraintLayout) objArr[6], (AppCompatAutoCompleteTextView) objArr[44], (TextInputLayout) objArr[43], (ConstraintLayout) objArr[42], (AppCompatAutoCompleteTextView) objArr[48], (TextInputLayout) objArr[47], (ConstraintLayout) objArr[46], (Button) objArr[80], (Button) objArr[73], (Button) objArr[74], (Button) objArr[81], (Button) objArr[67], (Button) objArr[68], (Button) objArr[76], (Button) objArr[77], (Button) objArr[82], (Button) objArr[70], (Button) objArr[71], (Button) objArr[34], (Button) objArr[31], (Button) objArr[33], (Button) objArr[32], (Button) objArr[86], (Button) objArr[85], (TextInputLayout) objArr[50], (ShapeableImageView) objArr[27], (MaterialButton) objArr[90], (MaterialButton) objArr[91], (ShapeableImageView) objArr[25], (MaterialTextView) objArr[2], (MaterialTextView) objArr[4], (MaterialCardView) objArr[1], (MaterialCardView) objArr[3], (b44) objArr[24], (r14) objArr[12], (MaterialTextView) objArr[26], (MaterialSwitch) objArr[65], (MaterialSwitch) objArr[64], (MaterialCardView) objArr[89], (MaterialTextView) objArr[66], (MaterialTextView) objArr[69], (MaterialTextView) objArr[72], (MaterialTextView) objArr[75], (MaterialTextView) objArr[55], (MaterialTextView) objArr[57], (MaterialSwitch) objArr[63], (MaterialTextView) objArr[29], (AppCompatImageView) objArr[52], (AppCompatAutoCompleteTextView) objArr[51], (AppCompatImageView) objArr[37], (AppCompatImageView) objArr[41], (AppCompatImageView) objArr[45], (AppCompatImageView) objArr[49], (MaterialTextView) objArr[61], (MaterialTextView) objArr[59], (RecyclerView) objArr[56], (RecyclerView) objArr[58], (RecyclerView) objArr[54], (RecyclerView) objArr[87], (ShimmerFrameLayout) objArr[88], (MaterialTextView) objArr[78], (MaterialTextView) objArr[83], (LinearLayout) objArr[28], (TextInputEditText) objArr[8], (TextInputLayout) objArr[60], (TextInputEditText) objArr[9], (TextInputLayout) objArr[62], (MaterialButtonToggleGroup) objArr[30], (MaterialButtonToggleGroup) objArr[79], (MaterialButtonToggleGroup) objArr[84], (MaterialTextView) objArr[53]);
        this.k2 = -1L;
        this.s0.setTag(null);
        this.V0.setTag(null);
        this.W0.setTag(null);
        this.X0.setTag(null);
        this.Y0.setTag(null);
        m25693Z(this.Z0);
        m25693Z(this.a1);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T1 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[10];
        this.U1 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[11];
        this.V1 = linearLayout2;
        linearLayout2.setTag(null);
        d54 d54Var = (d54) objArr[13];
        this.W1 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[22];
        this.X1 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[23];
        this.Y1 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[14];
        this.Z1 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[15];
        this.a2 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[16];
        this.b2 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[17];
        this.c2 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[18];
        this.d2 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[19];
        this.e2 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[20];
        this.f2 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[21];
        this.g2 = d54Var11;
        m25693Z(d54Var11);
        LinearLayout linearLayout3 = (LinearLayout) objArr[5];
        this.h2 = linearLayout3;
        linearLayout3.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[7];
        this.i2 = linearLayout4;
        linearLayout4.setTag(null);
        this.D1.setTag(null);
        this.F1.setTag(null);
        a0(view);
        mo16291G();
    }
}
