package p001o;

import ai.salesmax.model.AttendanceInfo;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kizitonwose.calendar.view.CalendarView;
import p001o.ewi;

/* loaded from: classes.dex */
public class hg7 extends gg7 {
    public static final ewi.C13274i E0;
    public static final SparseIntArray F0;
    public final ConstraintLayout B0;
    public final LinearLayout C0;
    public long D0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(12);
        E0 = c13274i;
        c13274i.m25699a(1, new String[]{"item_attendance_user_day"}, new int[]{2}, new int[]{p9e.item_attendance_user_day});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.calendarOverallTitle, 3);
        sparseIntArray.put(z8e.buttonClose, 4);
        sparseIntArray.put(z8e.leadTitle, 5);
        sparseIntArray.put(z8e.exFiveAppBarLayout, 6);
        sparseIntArray.put(z8e.exFivePreviousMonthImage, 7);
        sparseIntArray.put(z8e.exFiveMonthYearText, 8);
        sparseIntArray.put(z8e.exFiveNextMonthImage, 9);
        sparseIntArray.put(z8e.exFiveCalendar, 10);
        sparseIntArray.put(z8e.mapFragmentAttendanceLayout, 11);
    }

    public hg7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.D0 != 0) {
                return true;
            }
            return this.w0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 32L;
        }
        this.w0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return l0((mw8) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            n0((ck6) obj);
        } else if (73 == i) {
            p0((Integer) obj);
        } else if (7 == i) {
            m0((rog) obj);
        } else {
            if (5 != i) {
                return false;
            }
            k0((AttendanceInfo) obj);
        }
        return true;
    }

    @Override // p001o.gg7
    public void k0(AttendanceInfo attendanceInfo) {
        this.x0 = attendanceInfo;
        synchronized (this) {
            this.D0 |= 16;
        }
        m28509h(5);
        super.m25692R();
    }

    public final boolean l0(mw8 mw8Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.D0 |= 1;
        }
        return true;
    }

    public void m0(rog rogVar) {
        this.A0 = rogVar;
    }

    public void n0(ck6 ck6Var) {
        this.z0 = ck6Var;
        synchronized (this) {
            this.D0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.D0;
            this.D0 = 0L;
        }
        ck6 ck6Var = this.z0;
        Integer num = this.y0;
        AttendanceInfo attendanceInfo = this.x0;
        long j2 = 34 & j;
        long j3 = 36 & j;
        if ((j & 48) != 0) {
            this.w0.i0(attendanceInfo);
        }
        if (j2 != 0) {
            this.w0.h0(ck6Var);
        }
        if (j3 != 0) {
            this.w0.j0(num);
        }
        ewi.m25683r(this.w0);
    }

    public void p0(Integer num) {
        this.y0 = num;
        synchronized (this) {
            this.D0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    public hg7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (ShapeableImageView) objArr[4], (ConstraintLayout) objArr[3], (AppBarLayout) objArr[6], (CalendarView) objArr[10], (TextView) objArr[8], (ImageView) objArr[9], (ImageView) objArr[7], (MaterialTextView) objArr[5], (FrameLayout) objArr[11], (mw8) objArr[2]);
        this.D0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.B0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.C0 = linearLayout;
        linearLayout.setTag(null);
        m25693Z(this.w0);
        a0(view);
        mo16291G();
    }
}
