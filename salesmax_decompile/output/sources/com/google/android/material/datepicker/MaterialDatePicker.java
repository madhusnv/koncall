package com.google.android.material.datepicker;

import android.R;
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
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001o.cbc;
import p001o.d36;
import p001o.ebe;
import p001o.gcc;
import p001o.lk0;
import p001o.n8e;
import p001o.n9e;
import p001o.ota;
import p001o.pae;
import p001o.r9j;
import p001o.rj8;
import p001o.sj8;
import p001o.u7e;
import p001o.v9e;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.xya;
import p001o.xzi;
import p001o.zya;

/* loaded from: classes3.dex */
public class MaterialDatePicker<S> extends DialogFragment {
    public static final Object s0 = "CONFIRM_BUTTON_TAG";
    public static final Object t0 = "CANCEL_BUTTON_TAG";
    public static final Object u0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: H */
    public boolean f12435H;

    /* renamed from: L */
    public int f12436L;

    /* renamed from: M */
    public int f12437M;

    /* renamed from: Q */
    public CharSequence f12438Q;

    /* renamed from: X */
    public int f12439X;

    /* renamed from: Y */
    public CharSequence f12440Y;

    /* renamed from: Z */
    public int f12441Z;

    /* renamed from: a */
    public final LinkedHashSet f12442a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashSet f12443b = new LinkedHashSet();

    /* renamed from: c */
    public final LinkedHashSet f12444c = new LinkedHashSet();

    /* renamed from: d */
    public final LinkedHashSet f12445d = new LinkedHashSet();

    /* renamed from: e */
    public int f12446e;

    /* renamed from: f */
    public DateSelector f12447f;

    /* renamed from: g */
    public PickerFragment f12448g;

    /* renamed from: h */
    public CalendarConstraints f12449h;
    public CharSequence h0;
    public int i0;
    public CharSequence j0;
    public TextView k0;
    public TextView l0;
    public CheckableImageButton m0;
    public zya n0;
    public Button o0;
    public boolean p0;

    /* renamed from: q */
    public DayViewDecorator f12450q;
    public CharSequence q0;
    public CharSequence r0;

    /* renamed from: s */
    public MaterialCalendar f12451s;

    /* renamed from: x */
    public int f12452x;

    /* renamed from: y */
    public CharSequence f12453y;

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$a */
    public class C11027a implements cbc {

        /* renamed from: a */
        public final /* synthetic */ int f12454a;

        /* renamed from: b */
        public final /* synthetic */ View f12455b;

        /* renamed from: c */
        public final /* synthetic */ int f12456c;

        /* renamed from: d */
        public final /* synthetic */ int f12457d;

        /* renamed from: e */
        public final /* synthetic */ int f12458e;

        public C11027a(int i, View view, int i2, int i3, int i4) {
            this.f12454a = i;
            this.f12455b = view;
            this.f12456c = i2;
            this.f12457d = i3;
            this.f12458e = i4;
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            sj8 sj8VarM46391f = r9jVar.m46391f(r9j.C16576m.m46449e());
            if (this.f12454a >= 0) {
                this.f12455b.getLayoutParams().height = this.f12454a + sj8VarM46391f.f45478b;
                View view2 = this.f12455b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f12455b;
            view3.setPadding(this.f12456c + sj8VarM46391f.f45477a, this.f12457d + sj8VarM46391f.f45478b, this.f12458e + sj8VarM46391f.f45479c, view3.getPaddingBottom());
            return r9jVar;
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$b */
    public class C11028b extends gcc {
        public C11028b() {
        }

        @Override // p001o.gcc
        /* renamed from: a */
        public void mo14494a() {
            MaterialDatePicker.this.o0.setEnabled(false);
        }

        @Override // p001o.gcc
        /* renamed from: b */
        public void mo14495b(Object obj) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.h1(materialDatePicker.T0());
            MaterialDatePicker.this.o0.setEnabled(MaterialDatePicker.this.Q0().z2());
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$c */
    public static final class C11029c {

        /* renamed from: a */
        public final DateSelector f12461a;

        /* renamed from: c */
        public CalendarConstraints f12463c;

        /* renamed from: d */
        public DayViewDecorator f12464d;

        /* renamed from: b */
        public int f12462b = 0;

        /* renamed from: e */
        public int f12465e = 0;

        /* renamed from: f */
        public CharSequence f12466f = null;

        /* renamed from: g */
        public int f12467g = 0;

        /* renamed from: h */
        public CharSequence f12468h = null;

        /* renamed from: i */
        public int f12469i = 0;

        /* renamed from: j */
        public CharSequence f12470j = null;

        /* renamed from: k */
        public int f12471k = 0;

        /* renamed from: l */
        public CharSequence f12472l = null;

        /* renamed from: m */
        public int f12473m = 0;

        /* renamed from: n */
        public CharSequence f12474n = null;

        /* renamed from: o */
        public Object f12475o = null;

        /* renamed from: p */
        public int f12476p = 0;

        public C11029c(DateSelector dateSelector) {
            this.f12461a = dateSelector;
        }

        /* renamed from: c */
        public static C11029c m14496c() {
            return new C11029c(new SingleDateSelector());
        }

        /* renamed from: d */
        public static C11029c m14497d() {
            return new C11029c(new RangeDateSelector());
        }

        /* renamed from: e */
        public static boolean m14498e(Month month, CalendarConstraints calendarConstraints) {
            return month.compareTo(calendarConstraints.m14457l()) >= 0 && month.compareTo(calendarConstraints.m14453h()) <= 0;
        }

        /* renamed from: a */
        public MaterialDatePicker m14499a() {
            if (this.f12463c == null) {
                this.f12463c = new CalendarConstraints.C11006b().m14463a();
            }
            if (this.f12465e == 0) {
                this.f12465e = this.f12461a.o0();
            }
            Object obj = this.f12475o;
            if (obj != null) {
                this.f12461a.M1(obj);
            }
            if (this.f12463c.m14456k() == null) {
                this.f12463c.m14460o(m14500b());
            }
            return MaterialDatePicker.c1(this);
        }

        /* renamed from: b */
        public final Month m14500b() {
            if (!this.f12461a.K2().isEmpty()) {
                Month monthM14505d = Month.m14505d(((Long) this.f12461a.K2().iterator().next()).longValue());
                if (m14498e(monthM14505d, this.f12463c)) {
                    return monthM14505d;
                }
            }
            Month monthM14506e = Month.m14506e();
            return m14498e(monthM14506e, this.f12463c) ? monthM14506e : this.f12463c.m14457l();
        }

        /* renamed from: f */
        public C11029c m14501f(CalendarConstraints calendarConstraints) {
            this.f12463c = calendarConstraints;
            return this;
        }

        /* renamed from: g */
        public C11029c m14502g(Object obj) {
            this.f12475o = obj;
            return this;
        }

        /* renamed from: h */
        public C11029c m14503h(CharSequence charSequence) {
            this.f12466f = charSequence;
            this.f12465e = 0;
            return this;
        }
    }

    public static Drawable O0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, lk0.m37353b(context, u7e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], lk0.m37353b(context, u7e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    public static CharSequence R0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    public static int U0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(x6e.mtrl_calendar_content_padding);
        int i = Month.m14506e().f12484d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(x6e.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(x6e.mtrl_calendar_month_horizontal_padding));
    }

    public static boolean Y0(Context context) {
        return f1(context, R.attr.windowFullscreen);
    }

    public static boolean a1(Context context) {
        return f1(context, x5e.nestedScrollable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(View view) {
        this.o0.setEnabled(Q0().z2());
        this.m0.toggle();
        this.f12436L = this.f12436L == 1 ? 0 : 1;
        j1(this.m0);
        g1();
    }

    public static MaterialDatePicker c1(C11029c c11029c) {
        MaterialDatePicker materialDatePicker = new MaterialDatePicker();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", c11029c.f12462b);
        bundle.putParcelable("DATE_SELECTOR_KEY", c11029c.f12461a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c11029c.f12463c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", c11029c.f12464d);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", c11029c.f12465e);
        bundle.putCharSequence("TITLE_TEXT_KEY", c11029c.f12466f);
        bundle.putInt("INPUT_MODE_KEY", c11029c.f12476p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", c11029c.f12467g);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", c11029c.f12468h);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", c11029c.f12469i);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", c11029c.f12470j);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", c11029c.f12471k);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", c11029c.f12472l);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", c11029c.f12473m);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", c11029c.f12474n);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    public static boolean f1(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ota.m42660d(context, x5e.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public boolean K0(DialogInterface.OnCancelListener onCancelListener) {
        return this.f12444c.add(onCancelListener);
    }

    public boolean L0(DialogInterface.OnDismissListener onDismissListener) {
        return this.f12445d.add(onDismissListener);
    }

    public boolean M0(View.OnClickListener onClickListener) {
        return this.f12443b.add(onClickListener);
    }

    public boolean N0(xya xyaVar) {
        return this.f12442a.add(xyaVar);
    }

    public final void P0(Window window) {
        if (this.p0) {
            return;
        }
        View viewFindViewById = requireView().findViewById(n8e.fullscreen_header);
        d36.m22295a(window, true, xzi.m57072h(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        wvi.x0(viewFindViewById, new C11027a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.p0 = true;
    }

    public final DateSelector Q0() {
        if (this.f12447f == null) {
            this.f12447f = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f12447f;
    }

    public final String S0() {
        return Q0().E0(requireContext());
    }

    public String T0() {
        return Q0().B1(getContext());
    }

    public final Object V0() {
        return Q0().Q2();
    }

    public final int W0(Context context) {
        int i = this.f12446e;
        return i != 0 ? i : Q0().I0(context);
    }

    public final void X0(Context context) {
        this.m0.setTag(u0);
        this.m0.setImageDrawable(O0(context));
        this.m0.setChecked(this.f12436L != 0);
        wvi.m0(this.m0, null);
        j1(this.m0);
        this.m0.setOnClickListener(new View.OnClickListener() { // from class: o.jua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31098a.b1(view);
            }
        });
    }

    public final boolean Z0() {
        return getResources().getConfiguration().orientation == 2;
    }

    public void d1(View view) {
        Iterator it = this.f12443b.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        dismiss();
    }

    public void e1(View view) {
        Iterator it = this.f12442a.iterator();
        while (it.hasNext()) {
            ((xya) it.next()).mo17576a(V0());
        }
        dismiss();
    }

    public final void g1() {
        int iW0 = W0(requireContext());
        MaterialCalendar materialCalendarY0 = MaterialCalendar.Y0(Q0(), iW0, this.f12449h, this.f12450q);
        this.f12451s = materialCalendarY0;
        PickerFragment pickerFragmentH0 = materialCalendarY0;
        if (this.f12436L == 1) {
            pickerFragmentH0 = MaterialTextInputPicker.H0(Q0(), iW0, this.f12449h);
        }
        this.f12448g = pickerFragmentH0;
        i1();
        h1(T0());
        AbstractC2124j abstractC2124jM6205q = getChildFragmentManager().m6205q();
        abstractC2124jM6205q.m6425p(n8e.mtrl_calendar_frame, this.f12448g);
        abstractC2124jM6205q.mo6262j();
        this.f12448g.F0(new C11028b());
    }

    public void h1(String str) {
        this.l0.setContentDescription(S0());
        this.l0.setText(str);
    }

    public final void i1() {
        this.k0.setText((this.f12436L == 1 && Z0()) ? this.r0 : this.q0);
    }

    public final void j1(CheckableImageButton checkableImageButton) {
        this.m0.setContentDescription(this.f12436L == 1 ? checkableImageButton.getContext().getString(v9e.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(v9e.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f12444c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f12446e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f12447f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f12449h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f12450q = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f12452x = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f12453y = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f12436L = bundle.getInt("INPUT_MODE_KEY");
        this.f12437M = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f12438Q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f12439X = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f12440Y = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f12441Z = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.h0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.i0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.j0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f12453y;
        if (text == null) {
            text = requireContext().getResources().getText(this.f12452x);
        }
        this.q0 = text;
        this.r0 = R0(text);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), W0(requireContext()));
        Context context = dialog.getContext();
        this.f12435H = Y0(context);
        this.n0 = new zya(context, null, x5e.materialCalendarStyle, pae.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ebe.MaterialCalendar, x5e.materialCalendarStyle, pae.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(ebe.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.n0.m60115U(context);
        this.n0.g0(ColorStateList.valueOf(color));
        this.n0.f0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f12435H ? n9e.mtrl_picker_fullscreen : n9e.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f12450q;
        if (dayViewDecorator != null) {
            dayViewDecorator.m14487h(context);
        }
        if (this.f12435H) {
            viewInflate.findViewById(n8e.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(U0(context), -2));
        } else {
            viewInflate.findViewById(n8e.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(U0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(n8e.mtrl_picker_header_selection_text);
        this.l0 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.m0 = (CheckableImageButton) viewInflate.findViewById(n8e.mtrl_picker_header_toggle);
        this.k0 = (TextView) viewInflate.findViewById(n8e.mtrl_picker_title_text);
        X0(context);
        this.o0 = (Button) viewInflate.findViewById(n8e.confirm_button);
        if (Q0().z2()) {
            this.o0.setEnabled(true);
        } else {
            this.o0.setEnabled(false);
        }
        this.o0.setTag(s0);
        CharSequence charSequence = this.f12438Q;
        if (charSequence != null) {
            this.o0.setText(charSequence);
        } else {
            int i = this.f12437M;
            if (i != 0) {
                this.o0.setText(i);
            }
        }
        CharSequence charSequence2 = this.f12440Y;
        if (charSequence2 != null) {
            this.o0.setContentDescription(charSequence2);
        } else if (this.f12439X != 0) {
            this.o0.setContentDescription(getContext().getResources().getText(this.f12439X));
        }
        this.o0.setOnClickListener(new View.OnClickListener() { // from class: o.hua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27556a.e1(view);
            }
        });
        Button button = (Button) viewInflate.findViewById(n8e.cancel_button);
        button.setTag(t0);
        CharSequence charSequence3 = this.h0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.f12441Z;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.j0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.i0 != 0) {
            button.setContentDescription(getContext().getResources().getText(this.i0));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: o.iua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29242a.d1(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f12445d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f12446e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f12447f);
        CalendarConstraints.C11006b c11006b = new CalendarConstraints.C11006b(this.f12449h);
        MaterialCalendar materialCalendar = this.f12451s;
        Month monthT0 = materialCalendar == null ? null : materialCalendar.T0();
        if (monthT0 != null) {
            c11006b.m14464b(monthT0.f12486f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c11006b.m14463a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f12450q);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f12452x);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f12453y);
        bundle.putInt("INPUT_MODE_KEY", this.f12436L);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f12437M);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f12438Q);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f12439X);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f12440Y);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f12441Z);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.h0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.i0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.j0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f12435H) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.n0);
            P0(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(x6e.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.n0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new rj8(requireDialog(), rect));
        }
        g1();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f12448g.G0();
        super.onStop();
    }
}
