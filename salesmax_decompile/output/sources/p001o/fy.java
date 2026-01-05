package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;
import p001o.ewi;

/* loaded from: classes.dex */
public class fy extends ey {
    public static final ewi.C13274i q1;
    public static final SparseIntArray r1;
    public final ConstraintLayout l1;
    public final LinearLayout m1;
    public final LinearLayout n1;
    public boolean o1;
    public long p1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(48);
        q1 = c13274i;
        c13274i.m25699a(2, new String[]{"item_lead"}, new int[]{4}, new int[]{p9e.item_lead});
        c13274i.m25699a(3, new String[]{"content_custom_form"}, new int[]{5}, new int[]{p9e.content_custom_form});
        SparseIntArray sparseIntArray = new SparseIntArray();
        r1 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 6);
        sparseIntArray.put(z8e.actionBack, 7);
        sparseIntArray.put(z8e.leadTitle, 8);
        sparseIntArray.put(z8e.actionImportContacts, 9);
        sparseIntArray.put(z8e.callOutcome_ActionButton, 10);
        sparseIntArray.put(z8e.addLeadMobileNo, 11);
        sparseIntArray.put(z8e.ccp, 12);
        sparseIntArray.put(z8e.phoneNumber, 13);
        sparseIntArray.put(z8e.numberPlus, 14);
        sparseIntArray.put(z8e.alreadyExists, 15);
        sparseIntArray.put(z8e.addLeadAlterMobileNo, 16);
        sparseIntArray.put(z8e.ccpAlterr, 17);
        sparseIntArray.put(z8e.phoneNumberAlter, 18);
        sparseIntArray.put(z8e.addLeadNameLayout, 19);
        sparseIntArray.put(z8e.addLeadName, 20);
        sparseIntArray.put(z8e.addTagTitle, 21);
        sparseIntArray.put(z8e.rvUserTags, 22);
        sparseIntArray.put(z8e.addLeadSourceSearch, 23);
        sparseIntArray.put(z8e.addLeadSourceLayout, 24);
        sparseIntArray.put(z8e.addLeadSource, 25);
        sparseIntArray.put(z8e.mLeadSourceClose, 26);
        sparseIntArray.put(z8e.addLeadCompanyLayout, 27);
        sparseIntArray.put(z8e.addLeadCompany, 28);
        sparseIntArray.put(z8e.mClose, 29);
        sparseIntArray.put(z8e.addLeadCompanyWebsiteHint, 30);
        sparseIntArray.put(z8e.addLeadCompanyWebsite, 31);
        sparseIntArray.put(z8e.addLeadDesignationLayout, 32);
        sparseIntArray.put(z8e.addLeadDesignation, 33);
        sparseIntArray.put(z8e.addEmailLayout, 34);
        sparseIntArray.put(z8e.addLeadEmail, 35);
        sparseIntArray.put(z8e.addLeadEmailFields1, 36);
        sparseIntArray.put(z8e.emailPlus, 37);
        sparseIntArray.put(z8e.addLeadEmail2, 38);
        sparseIntArray.put(z8e.addLeadEmailFields2, 39);
        sparseIntArray.put(z8e.addLeadContactTypeLayout, 40);
        sparseIntArray.put(z8e.addLeadContactType, 41);
        sparseIntArray.put(z8e.addLeadContactSourceLayout, 42);
        sparseIntArray.put(z8e.addLeadContactSource, 43);
        sparseIntArray.put(z8e.addAddressLayout, 44);
        sparseIntArray.put(z8e.addLeadLocationLayout, 45);
        sparseIntArray.put(z8e.addLeadLocation, 46);
        sparseIntArray.put(z8e.locationPlus, 47);
    }

    public fy(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 48, q1, r1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.p1 != 0) {
                return true;
            }
            return this.W0.mo16290E() || this.U0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.p1 = 128L;
        }
        this.W0.mo16291G();
        this.U0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return q0((xz8) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return p0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (27 == i) {
            m0((Leads) obj);
        } else if (19 == i) {
            l0((FormFields) obj);
        } else if (73 == i) {
            t0((Integer) obj);
        } else if (33 == i) {
            s0((ck6) obj);
        } else {
            if (58 != i) {
                return false;
            }
            n0((Boolean) obj);
        }
        return true;
    }

    @Override // p001o.ey
    public void l0(FormFields formFields) {
        this.h1 = formFields;
        synchronized (this) {
            this.p1 |= 8;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.ey
    public void m0(Leads leads) {
        this.g1 = leads;
        synchronized (this) {
            this.p1 |= 4;
        }
        m28509h(27);
        super.m25692R();
    }

    @Override // p001o.ey
    public void n0(Boolean bool) {
        this.k1 = bool;
        synchronized (this) {
            this.p1 |= 64;
        }
        m28509h(58);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean z;
        int i;
        int i2;
        long j2;
        long j3;
        synchronized (this) {
            j = this.p1;
            this.p1 = 0L;
        }
        Leads leads = this.g1;
        FormFields formFields = this.h1;
        Integer num = this.i1;
        ck6 ck6Var = this.j1;
        Boolean bool = this.k1;
        long j4 = j & 196;
        if (j4 != 0) {
            z = leads == null;
            if (j4 != 0) {
                j = z ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
        } else {
            z = false;
        }
        boolean z2 = (j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) != 0 && ewi.m25676W(bool);
        long j5 = j & 196;
        if (j5 != 0) {
            if (z) {
                z2 = true;
            }
            if (j5 != 0) {
                if (z2) {
                    j2 = j | 512;
                    j3 = MediaStatus.COMMAND_PLAYBACK_RATE;
                } else {
                    j2 = j | 256;
                    j3 = MediaStatus.COMMAND_EDIT_TRACKS;
                }
                j = j2 | j3;
            }
            i2 = z2 ? 0 : 8;
            i = z2 ? 8 : 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if ((j & 132) != 0) {
            nr1.X0(this.L0, leads);
            this.W0.h0(leads);
        }
        if ((j & 160) != 0) {
            this.U0.h0(ck6Var);
        }
        if ((j & 136) != 0) {
            this.U0.i0(formFields);
        }
        if ((j & 144) != 0) {
            this.U0.j0(num);
        }
        if ((j & 196) != 0) {
            this.W0.m25689B().setVisibility(i);
            this.n1.setVisibility(i2);
        }
        long j6 = j & 128;
        if (j6 != 0) {
            ConstraintLayout constraintLayout = this.l1;
            boolean z3 = this.o1;
            wh1.m54388b(constraintLayout, false, z3, false, z3, false, true, false, true);
        }
        if (j6 != 0) {
            this.o1 = true;
        }
        ewi.m25683r(this.W0);
        ewi.m25683r(this.U0);
    }

    public final boolean p0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.p1 |= 2;
        }
        return true;
    }

    public final boolean q0(xz8 xz8Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.p1 |= 1;
        }
        return true;
    }

    public void s0(ck6 ck6Var) {
        this.j1 = ck6Var;
        synchronized (this) {
            this.p1 |= 32;
        }
        m28509h(33);
        super.m25692R();
    }

    public void t0(Integer num) {
        this.i1 = num;
        synchronized (this) {
            this.p1 |= 16;
        }
        m28509h(73);
        super.m25692R();
    }

    public fy(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (ShapeableImageView) objArr[7], (MaterialButton) objArr[9], (LinearLayout) objArr[44], (LinearLayout) objArr[34], (LinearLayout) objArr[16], (AppCompatAutoCompleteTextView) objArr[28], (TextInputLayout) objArr[27], (TextInputEditText) objArr[31], (TextInputLayout) objArr[30], (TextInputEditText) objArr[43], (TextInputLayout) objArr[42], (TextInputEditText) objArr[41], (TextInputLayout) objArr[40], (TextInputEditText) objArr[33], (TextInputLayout) objArr[32], (TextInputLayout) objArr[35], (TextInputLayout) objArr[38], (TextInputEditText) objArr[36], (TextInputEditText) objArr[39], (TextInputEditText) objArr[46], (TextInputLayout) objArr[45], (LinearLayout) objArr[11], (TextInputEditText) objArr[20], (TextInputLayout) objArr[19], (ShapeableImageView) objArr[1], (AppCompatAutoCompleteTextView) objArr[25], (TextInputLayout) objArr[24], (ConstraintLayout) objArr[23], (MaterialTextView) objArr[21], (MaterialTextView) objArr[15], (MaterialButton) objArr[10], (CountryCodePicker) objArr[12], (CountryCodePicker) objArr[17], (r14) objArr[5], (ShapeableImageView) objArr[37], (xz8) objArr[4], (ConstraintLayout) objArr[6], (MaterialTextView) objArr[8], (ShapeableImageView) objArr[47], (AppCompatImageView) objArr[29], (AppCompatImageView) objArr[26], (ShapeableImageView) objArr[14], (TextInputEditText) objArr[13], (TextInputEditText) objArr[18], (RecyclerView) objArr[22]);
        this.p1 = -1L;
        this.L0.setTag(null);
        m25693Z(this.U0);
        m25693Z(this.W0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.l1 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.m1 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.n1 = linearLayout2;
        linearLayout2.setTag(null);
        a0(view);
        mo16291G();
    }
}
