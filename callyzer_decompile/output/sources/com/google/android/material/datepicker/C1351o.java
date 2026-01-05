package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w;
import c6.n0;
import com.google.android.material.internal.CheckableImageButton;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jh.ViewOnTouchListenerC3766a;
import og.v0;
import pg.s8;
import ph.C5952g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
public final class C1351o<S> extends DialogInterfaceOnCancelListenerC0358w {

    /* renamed from: B */
    public CharSequence f6881B;

    /* renamed from: C */
    public boolean f6882C;

    /* renamed from: D */
    public int f6883D;

    /* renamed from: E */
    public CheckableImageButton f6884E;

    /* renamed from: F */
    public C5952g f6885F;

    /* renamed from: G */
    public Button f6886G;

    /* renamed from: s */
    public final LinkedHashSet f6887s;

    /* renamed from: t */
    public final LinkedHashSet f6888t;

    /* renamed from: v */
    public int f6889v;

    /* renamed from: w */
    public AbstractC1358v f6890w;

    /* renamed from: x */
    public C1338b f6891x;

    /* renamed from: y */
    public C1350n f6892y;

    /* renamed from: z */
    public int f6893z;

    public C1351o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f6887s = new LinkedHashSet();
        this.f6888t = new LinkedHashSet();
    }

    /* renamed from: m */
    public static int m4099m(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM4112b = AbstractC1361y.m4112b();
        calendarM4112b.set(5, 1);
        Calendar calendarM4111a = AbstractC1361y.m4111a(calendarM4112b);
        calendarM4111a.get(2);
        calendarM4111a.get(1);
        int maximum = calendarM4111a.getMaximum(7);
        calendarM4111a.getActualMaximum(5);
        calendarM4111a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: n */
    public static boolean m4100n(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(v0.m11010c(R.attr.materialCalendarStyle, context, C1350n.class.getCanonicalName()), new int[]{i10});
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z6;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w
    /* renamed from: j */
    public final Dialog mo1271j() {
        Context contextRequireContext = requireContext();
        requireContext();
        int i10 = this.f6889v;
        if (i10 == 0) {
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i10);
        Context context = dialog.getContext();
        this.f6882C = m4100n(context, android.R.attr.windowFullscreen);
        int iM11010c = v0.m11010c(R.attr.colorSurface, context, C1351o.class.getCanonicalName());
        C5952g c5952g = new C5952g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f6885F = c5952g;
        c5952g.m11986g(context);
        this.f6885F.m11988i(ColorStateList.valueOf(iM11010c));
        C5952g c5952g2 = this.f6885F;
        View decorView = dialog.getWindow().getDecorView();
        Field field = c6.v0.f5527a;
        c5952g2.m11987h(n0.m2453e(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f6887s.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w, androidx.fragment.app.j0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6889v = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f6891x = (C1338b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6893z = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f6881B = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f6883D = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.j0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(this.f6882C ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        int i10 = 1;
        if (this.f6882C) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m4099m(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(R.id.mtrl_calendar_main_pane);
            View viewFindViewById2 = viewInflate.findViewById(R.id.mtrl_calendar_frame);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(m4099m(context), -1));
            Resources resources = requireContext().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i11 = C1354r.f6903d;
            viewFindViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        Field field = c6.v0.f5527a;
        textView.setAccessibilityLiveRegion(1);
        this.f6884E = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f6881B;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f6893z);
        }
        this.f6884E.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f6884E;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, s8.m11864b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], s8.m11864b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f6884E.setChecked(this.f6883D != 0);
        c6.v0.m2528j(this.f6884E, null);
        CheckableImageButton checkableImageButton2 = this.f6884E;
        this.f6884E.setContentDescription(checkableImageButton2.f6920d ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f6884E.setOnClickListener(new ViewOnClickListenerC1348l(i10, this));
        this.f6886G = (Button) viewInflate.findViewById(R.id.confirm_button);
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f6888t.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w, androidx.fragment.app.j0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f6889v);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C1338b c1338b = this.f6891x;
        C1337a c1337a = new C1337a();
        int i10 = C1337a.f6836b;
        int i11 = C1337a.f6836b;
        long j6 = c1338b.f6839a.f6901f;
        long j10 = c1338b.f6840b.f6901f;
        c1337a.f6837a = Long.valueOf(c1338b.f6842d.f6901f);
        C1340d c1340d = c1338b.f6841c;
        C1353q c1353q = this.f6892y.f6874d;
        if (c1353q != null) {
            c1337a.f6837a = Long.valueOf(c1353q.f6901f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c1340d);
        C1353q c1353qM4102c = C1353q.m4102c(j6);
        C1353q c1353qM4102c2 = C1353q.m4102c(j10);
        C1340d c1340d2 = (C1340d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l9 = c1337a.f6837a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C1338b(c1353qM4102c, c1353qM4102c2, c1340d2, l9 != null ? C1353q.m4102c(l9.longValue()) : null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f6893z);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f6881B);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w, androidx.fragment.app.j0
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = m1272k().getWindow();
        if (this.f6882C) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f6885F);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f6885F, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC3766a(m1272k(), rect));
        }
        requireContext();
        int i10 = this.f6889v;
        if (i10 == 0) {
            throw null;
        }
        C1338b c1338b = this.f6891x;
        C1350n c1350n = new C1350n();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1338b);
        bundle.putParcelable("CURRENT_MONTH_KEY", c1338b.f6842d);
        c1350n.setArguments(bundle);
        this.f6892y = c1350n;
        AbstractC1358v abstractC1358v = c1350n;
        if (this.f6884E.f6920d) {
            C1338b c1338b2 = this.f6891x;
            AbstractC1358v c1352p = new C1352p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1338b2);
            c1352p.setArguments(bundle2);
            abstractC1358v = c1352p;
        }
        this.f6890w = abstractC1358v;
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w, androidx.fragment.app.j0
    public final void onStop() {
        this.f6890w.f6915a.clear();
        super.onStop();
    }
}
