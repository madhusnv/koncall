package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p001o.ebe;
import p001o.n8e;
import p001o.n9e;
import p001o.ota;
import p001o.pae;
import p001o.v9e;
import p001o.x5e;
import p001o.zlh;
import p001o.zya;

/* loaded from: classes3.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.InterfaceC11170d {

    /* renamed from: H */
    public CharSequence f13173H;

    /* renamed from: M */
    public CharSequence f13175M;

    /* renamed from: X */
    public CharSequence f13177X;

    /* renamed from: Y */
    public MaterialButton f13178Y;

    /* renamed from: Z */
    public Button f13179Z;

    /* renamed from: e */
    public TimePickerView f13184e;

    /* renamed from: f */
    public ViewStub f13185f;

    /* renamed from: g */
    public C11175c f13186g;

    /* renamed from: h */
    public C11177e f13187h;
    public TimeModel i0;

    /* renamed from: q */
    public zlh f13188q;

    /* renamed from: s */
    public int f13189s;

    /* renamed from: x */
    public int f13190x;

    /* renamed from: a */
    public final Set f13180a = new LinkedHashSet();

    /* renamed from: b */
    public final Set f13181b = new LinkedHashSet();

    /* renamed from: c */
    public final Set f13182c = new LinkedHashSet();

    /* renamed from: d */
    public final Set f13183d = new LinkedHashSet();

    /* renamed from: y */
    public int f13191y = 0;

    /* renamed from: L */
    public int f13174L = 0;

    /* renamed from: Q */
    public int f13176Q = 0;
    public int h0 = 0;
    public int j0 = 0;

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$a */
    public class ViewOnClickListenerC11162a implements View.OnClickListener {
        public ViewOnClickListenerC11162a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.this.f13180a.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$b */
    public class ViewOnClickListenerC11163b implements View.OnClickListener {
        public ViewOnClickListenerC11163b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.this.f13181b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$c */
    public class ViewOnClickListenerC11164c implements View.OnClickListener {
        public ViewOnClickListenerC11164c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            materialTimePicker.h0 = materialTimePicker.h0 == 0 ? 1 : 0;
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            materialTimePicker2.c1(materialTimePicker2.f13178Y);
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$d */
    public static final class C11165d {

        /* renamed from: b */
        public Integer f13196b;

        /* renamed from: d */
        public CharSequence f13198d;

        /* renamed from: f */
        public CharSequence f13200f;

        /* renamed from: h */
        public CharSequence f13202h;

        /* renamed from: a */
        public TimeModel f13195a = new TimeModel();

        /* renamed from: c */
        public int f13197c = 0;

        /* renamed from: e */
        public int f13199e = 0;

        /* renamed from: g */
        public int f13201g = 0;

        /* renamed from: i */
        public int f13203i = 0;

        /* renamed from: j */
        public MaterialTimePicker m15512j() {
            return MaterialTimePicker.Z0(this);
        }

        /* renamed from: k */
        public C11165d m15513k(int i) {
            this.f13195a.m15531i(i);
            return this;
        }

        /* renamed from: l */
        public C11165d m15514l(int i) {
            this.f13195a.m15532j(i);
            return this;
        }

        /* renamed from: m */
        public C11165d m15515m(int i) {
            TimeModel timeModel = this.f13195a;
            int i2 = timeModel.f13207d;
            int i3 = timeModel.f13208e;
            TimeModel timeModel2 = new TimeModel(i);
            this.f13195a = timeModel2;
            timeModel2.m15532j(i3);
            this.f13195a.m15531i(i2);
            return this;
        }

        /* renamed from: n */
        public C11165d m15516n(CharSequence charSequence) {
            this.f13198d = charSequence;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0() {
        zlh zlhVar = this.f13188q;
        if (zlhVar instanceof C11177e) {
            ((C11177e) zlhVar).m15583j();
        }
    }

    public static MaterialTimePicker Z0(C11165d c11165d) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", c11165d.f13195a);
        if (c11165d.f13196b != null) {
            bundle.putInt("TIME_PICKER_INPUT_MODE", c11165d.f13196b.intValue());
        }
        bundle.putInt("TIME_PICKER_TITLE_RES", c11165d.f13197c);
        if (c11165d.f13198d != null) {
            bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", c11165d.f13198d);
        }
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", c11165d.f13199e);
        if (c11165d.f13200f != null) {
            bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", c11165d.f13200f);
        }
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", c11165d.f13201g);
        if (c11165d.f13202h != null) {
            bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", c11165d.f13202h);
        }
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", c11165d.f13203i);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    public boolean P0(DialogInterface.OnCancelListener onCancelListener) {
        return this.f13182c.add(onCancelListener);
    }

    public boolean Q0(DialogInterface.OnDismissListener onDismissListener) {
        return this.f13183d.add(onDismissListener);
    }

    public boolean R0(View.OnClickListener onClickListener) {
        return this.f13181b.add(onClickListener);
    }

    public boolean S0(View.OnClickListener onClickListener) {
        return this.f13180a.add(onClickListener);
    }

    public final Pair T0(int i) {
        if (i == 0) {
            return new Pair(Integer.valueOf(this.f13189s), Integer.valueOf(v9e.material_timepicker_text_input_mode_description));
        }
        if (i == 1) {
            return new Pair(Integer.valueOf(this.f13190x), Integer.valueOf(v9e.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i);
    }

    public int U0() {
        return this.i0.f13207d % 24;
    }

    public int V0() {
        return this.i0.f13208e;
    }

    public final int W0() {
        int i = this.j0;
        if (i != 0) {
            return i;
        }
        TypedValue typedValueM42657a = ota.m42657a(requireContext(), x5e.materialTimePickerTheme);
        if (typedValueM42657a == null) {
            return 0;
        }
        return typedValueM42657a.data;
    }

    public final zlh X0(int i, TimePickerView timePickerView, ViewStub viewStub) {
        if (i != 0) {
            if (this.f13187h == null) {
                this.f13187h = new C11177e((LinearLayout) viewStub.inflate(), this.i0);
            }
            this.f13187h.m15580f();
            return this.f13187h;
        }
        C11175c c11175c = this.f13186g;
        if (c11175c == null) {
            c11175c = new C11175c(timePickerView, this.i0);
        }
        this.f13186g = c11175c;
        return c11175c;
    }

    public final void a1(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.i0 = timeModel;
        if (timeModel == null) {
            this.i0 = new TimeModel();
        }
        this.h0 = bundle.getInt("TIME_PICKER_INPUT_MODE", this.i0.f13206c != 1 ? 0 : 1);
        this.f13191y = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f13173H = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f13174L = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f13175M = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f13176Q = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f13177X = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.j0 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    public final void b1() {
        Button button = this.f13179Z;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    public final void c1(MaterialButton materialButton) {
        if (materialButton == null || this.f13184e == null || this.f13185f == null) {
            return;
        }
        zlh zlhVar = this.f13188q;
        if (zlhVar != null) {
            zlhVar.mo15561e();
        }
        zlh zlhVarX0 = X0(this.h0, this.f13184e, this.f13185f);
        this.f13188q = zlhVarX0;
        zlhVarX0.show();
        this.f13188q.invalidate();
        Pair pairT0 = T0(this.h0);
        materialButton.setIconResource(((Integer) pairT0.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairT0.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f13182c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        a1(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), W0());
        Context context = dialog.getContext();
        zya zyaVar = new zya(context, null, x5e.materialTimePickerStyle, pae.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ebe.MaterialTimePicker, x5e.materialTimePickerStyle, pae.Widget_MaterialComponents_TimePicker);
        this.f13190x = typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialTimePicker_clockIcon, 0);
        this.f13189s = typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialTimePicker_keyboardIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(ebe.MaterialTimePicker_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        zyaVar.m60115U(context);
        zyaVar.g0(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(zyaVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        zyaVar.f0(window.getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(n9e.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(n8e.material_timepicker_view);
        this.f13184e = timePickerView;
        timePickerView.m15549P(this);
        this.f13185f = (ViewStub) viewGroup2.findViewById(n8e.material_textinput_timepicker);
        this.f13178Y = (MaterialButton) viewGroup2.findViewById(n8e.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(n8e.header_title);
        int i = this.f13191y;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f13173H)) {
            textView.setText(this.f13173H);
        }
        c1(this.f13178Y);
        Button button = (Button) viewGroup2.findViewById(n8e.material_timepicker_ok_button);
        button.setOnClickListener(new ViewOnClickListenerC11162a());
        int i2 = this.f13174L;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f13175M)) {
            button.setText(this.f13175M);
        }
        Button button2 = (Button) viewGroup2.findViewById(n8e.material_timepicker_cancel_button);
        this.f13179Z = button2;
        button2.setOnClickListener(new ViewOnClickListenerC11163b());
        int i3 = this.f13176Q;
        if (i3 != 0) {
            this.f13179Z.setText(i3);
        } else if (!TextUtils.isEmpty(this.f13177X)) {
            this.f13179Z.setText(this.f13177X);
        }
        b1();
        this.f13178Y.setOnClickListener(new ViewOnClickListenerC11164c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f13188q = null;
        this.f13186g = null;
        this.f13187h = null;
        TimePickerView timePickerView = this.f13184e;
        if (timePickerView != null) {
            timePickerView.m15549P(null);
            this.f13184e = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f13183d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.i0);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.h0);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f13191y);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f13173H);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f13174L);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f13175M);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f13176Q);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f13177X);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.j0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f13188q instanceof C11177e) {
            view.postDelayed(new Runnable() { // from class: o.hza
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27822a.Y0();
                }
            }, 100L);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        b1();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC11170d
    /* renamed from: z */
    public void mo15502z() {
        this.h0 = 1;
        c1(this.f13178Y);
        this.f13187h.m15583j();
    }
}
