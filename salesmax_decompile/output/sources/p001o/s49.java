package p001o;

import ai.salesmax.model.ContactNumberSummary;
import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class s49 extends r49 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0 = null;
    public final View.OnClickListener u0;
    public final View.OnClickListener v0;
    public long w0;

    public s49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, x0, y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.w0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.w0 = 8L;
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
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((ContactNumberSummary) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.t0;
            ContactNumberSummary contactNumberSummary = this.r0;
            Integer num = this.s0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), contactNumberSummary);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.t0;
        ContactNumberSummary contactNumberSummary2 = this.r0;
        Integer num2 = this.s0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), contactNumberSummary2);
        }
    }

    public void h0(ck6 ck6Var) {
        this.t0 = ck6Var;
        synchronized (this) {
            this.w0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(ContactNumberSummary contactNumberSummary) {
        this.r0 = contactNumberSummary;
        synchronized (this) {
            this.w0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.s0 = num;
        synchronized (this) {
            this.w0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        boolean zIsSelected;
        String phoneNumber;
        LeadsUser doNotTrackSetByUser;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        ContactNumberSummary contactNumberSummary = this.r0;
        long j2 = 12 & j;
        String profilePic = null;
        if (j2 != 0) {
            if (contactNumberSummary != null) {
                phoneNumber = contactNumberSummary.getPhoneNumber();
                zIsSelected = contactNumberSummary.isSelected();
                doNotTrackSetByUser = contactNumberSummary.getDoNotTrackSetByUser();
            } else {
                doNotTrackSetByUser = null;
                zIsSelected = false;
                phoneNumber = null;
            }
            if (doNotTrackSetByUser != null) {
                String name = doNotTrackSetByUser.getName();
                profilePic = doNotTrackSetByUser.getProfilePic();
                str = name;
            } else {
                str = null;
            }
        } else {
            str = null;
            zIsSelected = false;
            phoneNumber = null;
        }
        if (j2 != 0) {
            np3.m40895a(this.n0, zIsSelected);
            nr1.m40940K(this.o0, profilePic);
            nr1.g1(this.o0, str);
            nr1.f1(this.q0, phoneNumber);
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.v0);
            this.p0.setOnClickListener(this.u0);
        }
    }

    public s49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (CheckBox) objArr[3], (Chip) objArr[2], (MaterialCardView) objArr[0], (MaterialTextView) objArr[1]);
        this.w0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        this.u0 = new jbc(this, 1);
        this.v0 = new jbc(this, 2);
        mo16291G();
    }
}
