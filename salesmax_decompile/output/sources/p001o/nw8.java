package p001o;

import ai.salesmax.model.AttendanceInfo;
import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.text.ParseException;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class nw8 extends mw8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i H0 = null;
    public static final SparseIntArray I0;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public final View.OnLongClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnLongClickListener E0;
    public final View.OnLongClickListener F0;
    public long G0;
    public final LinearLayout z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container, 8);
        sparseIntArray.put(z8e.activityFilter_badge, 9);
    }

    public nw8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 8L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.y0;
            AttendanceInfo attendanceInfo = this.w0;
            Integer num = this.x0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), attendanceInfo);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.y0;
            AttendanceInfo attendanceInfo2 = this.w0;
            Integer num2 = this.x0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), attendanceInfo2);
            }
            return false;
        }
        if (i != 6) {
            return false;
        }
        ck6 ck6Var3 = this.y0;
        AttendanceInfo attendanceInfo3 = this.w0;
        Integer num3 = this.x0;
        if (ck6Var3 != null) {
            return ck6Var3.mo707a(view, num3.intValue(), attendanceInfo3);
        }
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
            i0((AttendanceInfo) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.y0;
            AttendanceInfo attendanceInfo = this.w0;
            Integer num = this.x0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), attendanceInfo);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.y0;
            AttendanceInfo attendanceInfo2 = this.w0;
            Integer num2 = this.x0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), attendanceInfo2);
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        ck6 ck6Var3 = this.y0;
        AttendanceInfo attendanceInfo3 = this.w0;
        Integer num3 = this.x0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), attendanceInfo3);
        }
    }

    @Override // p001o.mw8
    public void h0(ck6 ck6Var) {
        this.y0 = ck6Var;
        synchronized (this) {
            this.G0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.mw8
    public void i0(AttendanceInfo attendanceInfo) {
        this.w0 = attendanceInfo;
        synchronized (this) {
            this.G0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.mw8
    public void j0(Integer num) {
        this.x0 = num;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() throws ParseException {
        long j;
        LeadsUser leadsUserAttendanceUser;
        String timeOfAttendance;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        AttendanceInfo attendanceInfo = this.w0;
        long j2 = 12 & j;
        if (j2 == 0 || attendanceInfo == null) {
            leadsUserAttendanceUser = null;
            timeOfAttendance = null;
        } else {
            leadsUserAttendanceUser = attendanceInfo.attendanceUser();
            timeOfAttendance = attendanceInfo.getTimeOfAttendance();
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.A0);
            this.p0.setOnLongClickListener(this.C0);
            this.q0.setOnClickListener(this.B0);
            this.q0.setOnLongClickListener(this.E0);
            this.r0.setOnClickListener(this.D0);
            this.r0.setOnLongClickListener(this.F0);
        }
        if (j2 != 0) {
            nr1.m40970o(this.q0, attendanceInfo);
            nr1.G2(this.s0, attendanceInfo);
            nr1.m40968m(this.t0, timeOfAttendance);
            nr1.m40969n(this.u0, attendanceInfo);
            nr1.m1(this.v0, leadsUserAttendanceUser);
        }
    }

    public nw8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[9], (FrameLayout) objArr[8], (MaterialCardView) objArr[1], (ShapeableImageView) objArr[2], (ShapeableImageView) objArr[7], (MaterialTextView) objArr[6], (Chip) objArr[4], (Chip) objArr[5], (MaterialTextView) objArr[3]);
        this.G0 = -1L;
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.z0 = linearLayout;
        linearLayout.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        a0(view);
        this.A0 = new jbc(this, 1);
        this.B0 = new jbc(this, 3);
        this.C0 = new sbc(this, 2);
        this.D0 = new jbc(this, 5);
        this.E0 = new sbc(this, 4);
        this.F0 = new sbc(this, 6);
        mo16291G();
    }
}
