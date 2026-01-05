package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kizitonwose.calendar.view.WeekCalendarView;

/* loaded from: classes.dex */
public final class fg7 {

    /* renamed from: a */
    public final LinearLayout f23274a;

    /* renamed from: b */
    public final ShapeableImageView f23275b;

    /* renamed from: c */
    public final Button f23276c;

    /* renamed from: d */
    public final Button f23277d;

    /* renamed from: e */
    public final Button f23278e;

    /* renamed from: f */
    public final ShapeableImageView f23279f;

    /* renamed from: g */
    public final ConstraintLayout f23280g;

    /* renamed from: h */
    public final WeekCalendarView f23281h;

    /* renamed from: i */
    public final Toolbar f23282i;

    /* renamed from: j */
    public final MaterialTextView f23283j;

    /* renamed from: k */
    public final RecyclerView f23284k;

    /* renamed from: l */
    public final MaterialButtonToggleGroup f23285l;

    public fg7(LinearLayout linearLayout, ShapeableImageView shapeableImageView, Button button, Button button2, Button button3, ShapeableImageView shapeableImageView2, ConstraintLayout constraintLayout, WeekCalendarView weekCalendarView, Toolbar toolbar, MaterialTextView materialTextView, RecyclerView recyclerView, MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f23274a = linearLayout;
        this.f23275b = shapeableImageView;
        this.f23276c = button;
        this.f23277d = button2;
        this.f23278e = button3;
        this.f23279f = shapeableImageView2;
        this.f23280g = constraintLayout;
        this.f23281h = weekCalendarView;
        this.f23282i = toolbar;
        this.f23283j = materialTextView;
        this.f23284k = recyclerView;
        this.f23285l = materialButtonToggleGroup;
    }

    /* renamed from: a */
    public static fg7 m26642a(View view) {
        int i = z8e.actionLastLocation;
        ShapeableImageView shapeableImageView = (ShapeableImageView) uvi.m52060a(view, i);
        if (shapeableImageView != null) {
            i = z8e.btnAbsent;
            Button button = (Button) uvi.m52060a(view, i);
            if (button != null) {
                i = z8e.btnLeave;
                Button button2 = (Button) uvi.m52060a(view, i);
                if (button2 != null) {
                    i = z8e.btnPresent;
                    Button button3 = (Button) uvi.m52060a(view, i);
                    if (button3 != null) {
                        i = z8e.buttonClose;
                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) uvi.m52060a(view, i);
                        if (shapeableImageView2 != null) {
                            i = z8e.calendarOverallTitle;
                            ConstraintLayout constraintLayout = (ConstraintLayout) uvi.m52060a(view, i);
                            if (constraintLayout != null) {
                                i = z8e.exSevenCalendar;
                                WeekCalendarView weekCalendarView = (WeekCalendarView) uvi.m52060a(view, i);
                                if (weekCalendarView != null) {
                                    i = z8e.exSevenToolbar;
                                    Toolbar toolbar = (Toolbar) uvi.m52060a(view, i);
                                    if (toolbar != null) {
                                        i = z8e.leadTitle;
                                        MaterialTextView materialTextView = (MaterialTextView) uvi.m52060a(view, i);
                                        if (materialTextView != null) {
                                            i = z8e.rvAbsentStatusList;
                                            RecyclerView recyclerView = (RecyclerView) uvi.m52060a(view, i);
                                            if (recyclerView != null) {
                                                i = z8e.toggleAttendanceType;
                                                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) uvi.m52060a(view, i);
                                                if (materialButtonToggleGroup != null) {
                                                    return new fg7((LinearLayout) view, shapeableImageView, button, button2, button3, shapeableImageView2, constraintLayout, weekCalendarView, toolbar, materialTextView, recyclerView, materialButtonToggleGroup);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static fg7 m26643c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(p9e.fragment_attendance_overall, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return m26642a(viewInflate);
    }

    /* renamed from: b */
    public LinearLayout m26644b() {
        return this.f23274a;
    }
}
