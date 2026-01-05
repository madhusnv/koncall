package p001o;

import ai.salesmax.model.AttendanceInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kizitonwose.calendar.view.CalendarView;

/* loaded from: classes.dex */
public abstract class gg7 extends ewi {
    public rog A0;
    public final ShapeableImageView n0;
    public final ConstraintLayout o0;
    public final AppBarLayout p0;
    public final CalendarView q0;
    public final TextView r0;
    public final ImageView s0;
    public final ImageView t0;
    public final MaterialTextView u0;
    public final FrameLayout v0;
    public final mw8 w0;
    public AttendanceInfo x0;
    public Integer y0;
    public ck6 z0;

    public gg7(Object obj, View view, int i, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, AppBarLayout appBarLayout, CalendarView calendarView, TextView textView, ImageView imageView, ImageView imageView2, MaterialTextView materialTextView, FrameLayout frameLayout, mw8 mw8Var) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = constraintLayout;
        this.p0 = appBarLayout;
        this.q0 = calendarView;
        this.r0 = textView;
        this.s0 = imageView;
        this.t0 = imageView2;
        this.u0 = materialTextView;
        this.v0 = frameLayout;
        this.w0 = mw8Var;
    }

    public static gg7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static gg7 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (gg7) ewi.m25668F(layoutInflater, p9e.fragment_attendance_user, viewGroup, z, obj);
    }

    public AttendanceInfo h0() {
        return this.x0;
    }

    public abstract void k0(AttendanceInfo attendanceInfo);
}
