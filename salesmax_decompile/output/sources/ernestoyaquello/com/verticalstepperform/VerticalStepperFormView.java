package ernestoyaquello.com.verticalstepperform;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageButton;
import ernestoyaquello.com.verticalstepperform.AbstractC11918b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001o.a7e;
import p001o.b6g;
import p001o.c64;
import p001o.f9e;
import p001o.jbe;
import p001o.ppe;
import p001o.q8e;
import p001o.t6e;
import p001o.w9e;

/* loaded from: classes6.dex */
public class VerticalStepperFormView extends LinearLayout {

    /* renamed from: H */
    public boolean f13829H;

    /* renamed from: L */
    public boolean f13830L;

    /* renamed from: a */
    public C11914b f13831a;

    /* renamed from: b */
    public C11915c f13832b;

    /* renamed from: c */
    public b6g f13833c;

    /* renamed from: d */
    public ViewTreeObserverOnGlobalLayoutListenerC11916d f13834d;

    /* renamed from: e */
    public List f13835e;

    /* renamed from: f */
    public boolean f13836f;

    /* renamed from: g */
    public LinearLayout f13837g;

    /* renamed from: h */
    public ScrollView f13838h;

    /* renamed from: q */
    public ProgressBar f13839q;

    /* renamed from: s */
    public AppCompatImageButton f13840s;

    /* renamed from: x */
    public AppCompatImageButton f13841x;

    /* renamed from: y */
    public View f13842y;

    /* renamed from: ernestoyaquello.com.verticalstepperform.VerticalStepperFormView$b */
    public class C11914b implements AbstractC11918b.a {
        public C11914b() {
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
        /* renamed from: a */
        public void mo16146a(int i, boolean z) {
            VerticalStepperFormView.this.m16127R();
            VerticalStepperFormView.this.m16120K();
            VerticalStepperFormView.this.m16138s();
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
        /* renamed from: b */
        public void mo16147b(int i, boolean z) {
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
        /* renamed from: c */
        public void mo16148c(int i, boolean z) {
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
        /* renamed from: d */
        public void mo16149d(int i, boolean z) {
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
        /* renamed from: e */
        public void mo16150e(int i, boolean z) {
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
        /* renamed from: f */
        public void mo16151f(int i, boolean z) {
            VerticalStepperFormView.this.m16127R();
            VerticalStepperFormView.this.m16124O(z);
            VerticalStepperFormView.this.m16138s();
        }
    }

    /* renamed from: ernestoyaquello.com.verticalstepperform.VerticalStepperFormView$c */
    public class C11915c {

        /* renamed from: A */
        public int f13844A;

        /* renamed from: B */
        public int f13845B;

        /* renamed from: C */
        public int f13846C;

        /* renamed from: D */
        public boolean f13847D;

        /* renamed from: E */
        public boolean f13848E;

        /* renamed from: F */
        public boolean f13849F;

        /* renamed from: G */
        public boolean f13850G;

        /* renamed from: H */
        public boolean f13851H;

        /* renamed from: I */
        public boolean f13852I;

        /* renamed from: J */
        public boolean f13853J;

        /* renamed from: K */
        public boolean f13854K;

        /* renamed from: L */
        public boolean f13855L;

        /* renamed from: M */
        public boolean f13856M;

        /* renamed from: N */
        public float f13857N;

        /* renamed from: O */
        public Typeface f13858O;

        /* renamed from: P */
        public Typeface f13859P;

        /* renamed from: Q */
        public Typeface f13860Q;

        /* renamed from: R */
        public Typeface f13861R;

        /* renamed from: a */
        public String f13863a;

        /* renamed from: b */
        public String f13864b;

        /* renamed from: c */
        public String f13865c;

        /* renamed from: d */
        public String f13866d;

        /* renamed from: e */
        public String f13867e;

        /* renamed from: f */
        public int f13868f;

        /* renamed from: g */
        public int f13869g;

        /* renamed from: h */
        public int f13870h;

        /* renamed from: i */
        public int f13871i;

        /* renamed from: j */
        public int f13872j;

        /* renamed from: k */
        public int f13873k;

        /* renamed from: l */
        public int f13874l;

        /* renamed from: m */
        public int f13875m;

        /* renamed from: n */
        public int f13876n;

        /* renamed from: o */
        public int f13877o;

        /* renamed from: p */
        public int f13878p;

        /* renamed from: q */
        public int f13879q;

        /* renamed from: r */
        public int f13880r;

        /* renamed from: s */
        public int f13881s;

        /* renamed from: t */
        public int f13882t;

        /* renamed from: u */
        public int f13883u;

        /* renamed from: v */
        public int f13884v;

        /* renamed from: w */
        public int f13885w;

        /* renamed from: x */
        public int f13886x;

        /* renamed from: y */
        public int f13887y;

        /* renamed from: z */
        public int f13888z;

        public C11915c() {
        }
    }

    /* renamed from: ernestoyaquello.com.verticalstepperform.VerticalStepperFormView$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC11916d implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC11916d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z = VerticalStepperFormView.this.f13830L;
            VerticalStepperFormView verticalStepperFormView = VerticalStepperFormView.this;
            verticalStepperFormView.f13830L = verticalStepperFormView.m16117E();
            if (!VerticalStepperFormView.this.f13836f || VerticalStepperFormView.this.f13830L == z) {
                return;
            }
            VerticalStepperFormView.this.m16124O(true);
        }
    }

    public VerticalStepperFormView(Context context) {
        super(context);
        m16118I(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m16102F(View view) {
        m16144y(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m16103G(View view) {
        m16143x(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m16104H(int i, boolean z) {
        AbstractC11918b abstractC11918bM16216o = ((C11919c) this.f13835e.get(i)).m16216o();
        View viewM16178f = abstractC11918bM16216o.m16178f();
        View viewM16176d = abstractC11918bM16216o.m16176d();
        this.f13838h.getDrawingRect(new Rect());
        if (viewM16176d == null || r1.top > viewM16176d.getY()) {
            if (z) {
                this.f13838h.smoothScrollTo(0, viewM16178f.getTop());
            } else {
                this.f13838h.scrollTo(0, viewM16178f.getTop());
            }
        }
    }

    private C11919c getOpenStepHelper() {
        for (int i = 0; i < this.f13835e.size(); i++) {
            C11919c c11919c = (C11919c) this.f13835e.get(i);
            if (c11919c.m16216o().m16190r()) {
                return c11919c;
            }
        }
        return null;
    }

    private void setProgress(int i) {
        if (i < 0 || i > this.f13835e.size()) {
            return;
        }
        this.f13839q.setProgress(i);
    }

    /* renamed from: A */
    public void m16113A() {
        this.f13842y.setVisibility(8);
    }

    /* renamed from: B */
    public void m16114B(b6g b6gVar, C11919c[] c11919cArr) {
        this.f13833c = b6gVar;
        ArrayList arrayList = new ArrayList(Arrays.asList(c11919cArr));
        this.f13835e = arrayList;
        this.f13839q.setMax(arrayList.size());
        this.f13842y.setBackgroundColor(this.f13832b.f13846C);
        if (!this.f13832b.f13847D) {
            m16113A();
        }
        for (int i = 0; i < this.f13835e.size(); i++) {
            this.f13837g.addView(m16115C(i));
        }
        m16145z(0, false);
        this.f13836f = true;
    }

    /* renamed from: C */
    public final View m16115C(int i) {
        return ((C11919c) this.f13835e.get(i)).m16217p(this, this.f13837g, m16141v(i, i + 1 == this.f13835e.size()));
    }

    /* renamed from: D */
    public boolean m16116D() {
        return this.f13829H;
    }

    /* renamed from: E */
    public final boolean m16117E() {
        Rect rect = new Rect();
        this.f13837g.getWindowVisibleDisplayFrame(rect);
        int height = this.f13837g.getRootView().getHeight();
        return ((double) (height - rect.bottom)) > ((double) height) * 0.2d;
    }

    /* renamed from: I */
    public final void m16118I(Context context, AttributeSet attributeSet, int i) {
        LayoutInflater.from(context).inflate(f9e.vertical_stepper_form_layout, (ViewGroup) this, true);
        this.f13834d = new ViewTreeObserverOnGlobalLayoutListenerC11916d();
        C11915c c11915c = new C11915c();
        this.f13832b = c11915c;
        c11915c.f13863a = getResources().getString(w9e.vertical_stepper_form_continue_button);
        this.f13832b.f13864b = getResources().getString(w9e.vertical_stepper_form_confirm_button);
        this.f13832b.f13865c = getResources().getString(w9e.vertical_stepper_form_cancel_button);
        this.f13832b.f13866d = getResources().getString(w9e.vertical_stepper_form_confirmation_step_title);
        C11915c c11915c2 = this.f13832b;
        c11915c2.f13867e = "";
        c11915c2.f13868f = getResources().getDimensionPixelSize(a7e.vertical_stepper_form_width_circle);
        this.f13832b.f13869g = getResources().getDimensionPixelSize(a7e.vertical_stepper_form_text_size_circle);
        this.f13832b.f13870h = getResources().getDimensionPixelSize(a7e.vertical_stepper_form_text_size_title);
        this.f13832b.f13871i = getResources().getDimensionPixelSize(a7e.vertical_stepper_form_text_size_subtitle);
        this.f13832b.f13872j = getResources().getDimensionPixelSize(a7e.vertical_stepper_form_text_size_error_message);
        this.f13832b.f13873k = getResources().getDimensionPixelSize(a7e.vertical_stepper_form_width_vertical_line);
        this.f13832b.f13874l = getResources().getDimensionPixelSize(a7e.vertical_stepper_form_space_between_numbers_and_content);
        this.f13832b.f13875m = c64.getColor(context, t6e.vertical_stepper_form_background_color_disabled_elements);
        this.f13832b.f13876n = c64.getColor(context, t6e.vertical_stepper_form_background_color_circle);
        this.f13832b.f13877o = c64.getColor(context, t6e.vertical_stepper_form_background_color_circle);
        this.f13832b.f13878p = c64.getColor(context, t6e.vertical_stepper_form_background_color_circle);
        this.f13832b.f13879q = c64.getColor(context, t6e.vertical_stepper_form_background_color_next_button);
        this.f13832b.f13880r = c64.getColor(context, t6e.vertical_stepper_form_background_color_next_button_pressed);
        this.f13832b.f13881s = c64.getColor(context, t6e.vertical_stepper_form_background_color_cancel_button);
        this.f13832b.f13882t = c64.getColor(context, t6e.vertical_stepper_form_background_color_cancel_button_pressed);
        this.f13832b.f13883u = c64.getColor(context, t6e.vertical_stepper_form_text_color_circle);
        this.f13832b.f13884v = c64.getColor(context, t6e.vertical_stepper_form_text_color_title);
        this.f13832b.f13885w = c64.getColor(context, t6e.vertical_stepper_form_text_color_subtitle);
        this.f13832b.f13886x = c64.getColor(context, t6e.vertical_stepper_form_text_color_next_button);
        this.f13832b.f13887y = c64.getColor(context, t6e.vertical_stepper_form_text_color_next_button_pressed);
        this.f13832b.f13888z = c64.getColor(context, t6e.vertical_stepper_form_text_color_cancel_button);
        this.f13832b.f13844A = c64.getColor(context, t6e.vertical_stepper_form_text_color_cancel_button_pressed);
        this.f13832b.f13845B = c64.getColor(context, t6e.vertical_stepper_form_text_color_error_message);
        this.f13832b.f13846C = c64.getColor(context, t6e.vertical_stepper_form_background_color_bottom_navigation);
        C11915c c11915c3 = this.f13832b;
        c11915c3.f13847D = true;
        c11915c3.f13848E = true;
        c11915c3.f13849F = false;
        c11915c3.f13850G = true;
        c11915c3.f13851H = true;
        c11915c3.f13852I = false;
        c11915c3.f13853J = true;
        c11915c3.f13854K = false;
        c11915c3.f13855L = true;
        c11915c3.f13856M = false;
        c11915c3.f13857N = 0.3f;
        c11915c3.f13858O = Typeface.defaultFromStyle(i);
        this.f13832b.f13859P = Typeface.defaultFromStyle(i);
        this.f13832b.f13860Q = Typeface.defaultFromStyle(i);
        this.f13832b.f13861R = Typeface.defaultFromStyle(i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, jbe.VerticalStepperFormView, i, 0);
            if (typedArrayObtainStyledAttributes.hasValue(jbe.VerticalStepperFormView_form_next_button_text)) {
                this.f13832b.f13863a = typedArrayObtainStyledAttributes.getString(jbe.VerticalStepperFormView_form_next_button_text);
            }
            if (typedArrayObtainStyledAttributes.hasValue(jbe.VerticalStepperFormView_form_last_button_text)) {
                this.f13832b.f13864b = typedArrayObtainStyledAttributes.getString(jbe.VerticalStepperFormView_form_last_button_text);
            }
            if (typedArrayObtainStyledAttributes.hasValue(jbe.VerticalStepperFormView_form_cancel_button_text)) {
                this.f13832b.f13865c = typedArrayObtainStyledAttributes.getString(jbe.VerticalStepperFormView_form_cancel_button_text);
            }
            if (typedArrayObtainStyledAttributes.hasValue(jbe.VerticalStepperFormView_form_confirmation_step_title_text)) {
                this.f13832b.f13866d = typedArrayObtainStyledAttributes.getString(jbe.VerticalStepperFormView_form_confirmation_step_title_text);
            }
            if (typedArrayObtainStyledAttributes.hasValue(jbe.VerticalStepperFormView_form_confirmation_step_subtitle_text)) {
                this.f13832b.f13867e = typedArrayObtainStyledAttributes.getString(jbe.VerticalStepperFormView_form_confirmation_step_subtitle_text);
            }
            C11915c c11915c4 = this.f13832b;
            c11915c4.f13868f = typedArrayObtainStyledAttributes.getDimensionPixelSize(jbe.VerticalStepperFormView_form_circle_size, c11915c4.f13868f);
            C11915c c11915c5 = this.f13832b;
            c11915c5.f13869g = typedArrayObtainStyledAttributes.getDimensionPixelSize(jbe.VerticalStepperFormView_form_circle_text_size, c11915c5.f13869g);
            C11915c c11915c6 = this.f13832b;
            c11915c6.f13870h = typedArrayObtainStyledAttributes.getDimensionPixelSize(jbe.VerticalStepperFormView_form_title_text_size, c11915c6.f13870h);
            C11915c c11915c7 = this.f13832b;
            c11915c7.f13871i = typedArrayObtainStyledAttributes.getDimensionPixelSize(jbe.VerticalStepperFormView_form_subtitle_text_size, c11915c7.f13871i);
            C11915c c11915c8 = this.f13832b;
            c11915c8.f13872j = typedArrayObtainStyledAttributes.getDimensionPixelSize(jbe.VerticalStepperFormView_form_error_message_text_size, c11915c8.f13872j);
            C11915c c11915c9 = this.f13832b;
            c11915c9.f13873k = typedArrayObtainStyledAttributes.getDimensionPixelSize(jbe.VerticalStepperFormView_form_vertical_line_width, c11915c9.f13873k);
            C11915c c11915c10 = this.f13832b;
            c11915c10.f13874l = typedArrayObtainStyledAttributes.getDimensionPixelSize(jbe.f30105x3538fdfe, c11915c10.f13874l);
            C11915c c11915c11 = this.f13832b;
            c11915c11.f13875m = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_disabled_elements_background_color, c11915c11.f13875m);
            C11915c c11915c12 = this.f13832b;
            c11915c12.f13876n = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_circle_background_color, c11915c12.f13876n);
            C11915c c11915c13 = this.f13832b;
            c11915c13.f13877o = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_circle_completed_background_color, c11915c13.f13877o);
            C11915c c11915c14 = this.f13832b;
            c11915c14.f13878p = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_circle_error_background_color, c11915c14.f13878p);
            C11915c c11915c15 = this.f13832b;
            c11915c15.f13879q = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_next_button_background_color, c11915c15.f13879q);
            C11915c c11915c16 = this.f13832b;
            c11915c16.f13880r = typedArrayObtainStyledAttributes.getColor(jbe.f30106x3df443d0, c11915c16.f13880r);
            C11915c c11915c17 = this.f13832b;
            c11915c17.f13881s = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_cancel_button_background_color, c11915c17.f13881s);
            C11915c c11915c18 = this.f13832b;
            c11915c18.f13882t = typedArrayObtainStyledAttributes.getColor(jbe.f30102xd2684357, c11915c18.f13882t);
            C11915c c11915c19 = this.f13832b;
            c11915c19.f13883u = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_circle_text_color, c11915c19.f13883u);
            C11915c c11915c20 = this.f13832b;
            c11915c20.f13884v = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_title_text_color, c11915c20.f13884v);
            C11915c c11915c21 = this.f13832b;
            c11915c21.f13885w = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_subtitle_text_color, c11915c21.f13885w);
            C11915c c11915c22 = this.f13832b;
            c11915c22.f13886x = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_next_button_text_color, c11915c22.f13886x);
            C11915c c11915c23 = this.f13832b;
            c11915c23.f13887y = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_next_button_pressed_text_color, c11915c23.f13887y);
            C11915c c11915c24 = this.f13832b;
            c11915c24.f13888z = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_cancel_button_text_color, c11915c24.f13888z);
            C11915c c11915c25 = this.f13832b;
            c11915c25.f13844A = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_cancel_button_pressed_text_color, c11915c25.f13844A);
            C11915c c11915c26 = this.f13832b;
            c11915c26.f13845B = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_error_message_text_color, c11915c26.f13845B);
            C11915c c11915c27 = this.f13832b;
            c11915c27.f13846C = typedArrayObtainStyledAttributes.getColor(jbe.VerticalStepperFormView_form_bottom_navigation_background_color, c11915c27.f13846C);
            C11915c c11915c28 = this.f13832b;
            c11915c28.f13847D = typedArrayObtainStyledAttributes.getBoolean(jbe.VerticalStepperFormView_form_display_bottom_navigation, c11915c28.f13847D);
            C11915c c11915c29 = this.f13832b;
            c11915c29.f13848E = typedArrayObtainStyledAttributes.getBoolean(jbe.VerticalStepperFormView_form_display_step_buttons, c11915c29.f13848E);
            C11915c c11915c30 = this.f13832b;
            c11915c30.f13849F = typedArrayObtainStyledAttributes.getBoolean(jbe.VerticalStepperFormView_form_display_cancel_button_in_last_step, c11915c30.f13849F);
            C11915c c11915c31 = this.f13832b;
            c11915c31.f13850G = typedArrayObtainStyledAttributes.getBoolean(jbe.VerticalStepperFormView_form_display_next_button_in_last_step, c11915c31.f13850G);
            C11915c c11915c32 = this.f13832b;
            c11915c32.f13851H = typedArrayObtainStyledAttributes.getBoolean(jbe.f30104xdfddd0d0, c11915c32.f13851H);
            C11915c c11915c33 = this.f13832b;
            c11915c33.f13852I = typedArrayObtainStyledAttributes.getBoolean(jbe.f30103x839f37e4, c11915c33.f13852I);
            C11915c c11915c34 = this.f13832b;
            c11915c34.f13853J = typedArrayObtainStyledAttributes.getBoolean(jbe.VerticalStepperFormView_form_include_confirmation_step, c11915c34.f13853J);
            C11915c c11915c35 = this.f13832b;
            c11915c35.f13854K = typedArrayObtainStyledAttributes.getBoolean(jbe.VerticalStepperFormView_form_allow_non_linear_navigation, c11915c35.f13854K);
            C11915c c11915c36 = this.f13832b;
            c11915c36.f13855L = typedArrayObtainStyledAttributes.getBoolean(jbe.VerticalStepperFormView_form_allow_step_opening_on_header_click, c11915c36.f13855L);
            C11915c c11915c37 = this.f13832b;
            c11915c37.f13856M = typedArrayObtainStyledAttributes.getBoolean(jbe.VerticalStepperFormView_form_close_last_step_on_completion, c11915c37.f13856M);
            C11915c c11915c38 = this.f13832b;
            c11915c38.f13857N = typedArrayObtainStyledAttributes.getFloat(jbe.VerticalStepperFormView_form_alpha_of_disabled_elements, c11915c38.f13857N);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(jbe.VerticalStepperFormView_form_step_number_font_family, -1);
            if (resourceId != -1) {
                this.f13832b.f13858O = ppe.m44036g(context, resourceId);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(jbe.VerticalStepperFormView_form_step_title_font_family, -1);
            if (resourceId2 != -1) {
                this.f13832b.f13859P = ppe.m44036g(context, resourceId2);
            }
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(jbe.VerticalStepperFormView_form_step_subtitle_font_family, -1);
            if (resourceId3 != -1) {
                this.f13832b.f13860Q = ppe.m44036g(context, resourceId3);
            }
            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(jbe.VerticalStepperFormView_form_step_error_message_font_family, -1);
            if (resourceId4 != -1) {
                this.f13832b.f13861R = ppe.m44036g(context, resourceId4);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f13831a = new C11914b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[Catch: all -> 0x003f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0012, B:9:0x0021, B:10:0x0031, B:12:0x0039), top: B:18:0x0003 }] */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m16119J(int i, boolean z) {
        if (i >= 0) {
            if (i < this.f13835e.size()) {
                int openStepPosition = getOpenStepPosition();
                if (openStepPosition != -1) {
                    ((C11919c) this.f13835e.get(openStepPosition)).m16216o().m16174b(z);
                }
                ((C11919c) this.f13835e.get(i)).m16216o().m16162H(z);
            } else if (i == this.f13835e.size()) {
                m16131l(false);
            }
        }
    }

    /* renamed from: K */
    public int m16120K() {
        int i = 0;
        for (int i2 = 0; i2 < this.f13835e.size(); i2++) {
            if (((C11919c) this.f13835e.get(i2)).m16216o().m16189q()) {
                i++;
            }
        }
        setProgress(i);
        return i;
    }

    /* renamed from: L */
    public final void m16121L() {
        this.f13840s.setOnClickListener(new View.OnClickListener() { // from class: o.yti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f56039a.m16102F(view);
            }
        });
        this.f13841x.setOnClickListener(new View.OnClickListener() { // from class: o.zti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f57708a.m16103G(view);
            }
        });
        m16128i();
    }

    /* renamed from: M */
    public final void m16122M() {
        getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f13834d);
    }

    /* renamed from: N */
    public final void m16123N(Serializable[] serializableArr, int i, boolean[] zArr, boolean[] zArr2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, boolean z) {
        for (int i2 = 0; i2 < zArr.length; i2++) {
            AbstractC11918b abstractC11918bM16216o = ((C11919c) this.f13835e.get(i2)).m16216o();
            abstractC11918bM16216o.m16165K(serializableArr[i2]);
            abstractC11918bM16216o.m16163I(zArr2[i2]);
            abstractC11918bM16216o.m16172R(strArr[i2], false);
            abstractC11918bM16216o.m16171Q(strArr2[i2], false);
            abstractC11918bM16216o.m16168N(strArr3[i2], false);
            if (zArr[i2]) {
                abstractC11918bM16216o.m16192t(false);
            } else {
                abstractC11918bM16216o.m16195w(strArr4[i2], false);
            }
        }
        m16145z(i, false);
        if (z) {
            this.f13829H = true;
            ((C11919c) this.f13835e.get(getOpenStepPosition())).m16211j();
            m16127R();
        }
        m16120K();
    }

    /* renamed from: O */
    public synchronized void m16124O(boolean z) {
        m16125P(getOpenStepPosition(), z);
    }

    /* renamed from: P */
    public void m16125P(final int i, final boolean z) {
        if (i < 0 || i >= this.f13835e.size()) {
            return;
        }
        this.f13838h.post(new Runnable() { // from class: o.aui
            @Override // java.lang.Runnable
            public final void run() {
                this.f15270a.m16104H(i, z);
            }
        });
    }

    /* renamed from: Q */
    public C11917a m16126Q(b6g b6gVar, AbstractC11918b... abstractC11918bArr) {
        return new C11917a(this, b6gVar, abstractC11918bArr);
    }

    /* renamed from: R */
    public synchronized void m16127R() {
        int openStepPosition = getOpenStepPosition();
        if (openStepPosition >= 0 && openStepPosition < this.f13835e.size()) {
            C11919c c11919c = (C11919c) this.f13835e.get(openStepPosition);
            if (this.f13829H || openStepPosition <= 0) {
                m16135p();
            } else {
                m16139t();
            }
            if (this.f13829H || openStepPosition + 1 >= this.f13835e.size() || !(this.f13832b.f13854K || c11919c.m16216o().m16189q())) {
                m16134o();
            } else {
                m16137r();
            }
        }
    }

    public synchronized AbstractC11918b getOpenStep() {
        C11919c openStepHelper;
        openStepHelper = getOpenStepHelper();
        return openStepHelper != null ? openStepHelper.m16216o() : null;
    }

    public synchronized int getOpenStepPosition() {
        for (int i = 0; i < this.f13835e.size(); i++) {
            if (((C11919c) this.f13835e.get(i)).m16216o().m16190r()) {
                return i;
            }
        }
        return -1;
    }

    public int getTotalNumberOfSteps() {
        return this.f13835e.size();
    }

    /* renamed from: i */
    public final void m16128i() {
        this.f13830L = m16117E();
        getRootView().getViewTreeObserver().addOnGlobalLayoutListener(this.f13834d);
    }

    /* renamed from: j */
    public boolean m16129j(int i) {
        boolean zM16189q = true;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            zM16189q &= ((C11919c) this.f13835e.get(i2)).m16216o().m16189q();
        }
        return zM16189q;
    }

    /* renamed from: k */
    public boolean m16130k() {
        return m16129j(this.f13835e.size());
    }

    /* renamed from: l */
    public final synchronized void m16131l(boolean z) {
        if (this.f13829H) {
            return;
        }
        String strM16179g = "";
        List list = this.f13835e;
        C11919c c11919c = (C11919c) list.get(list.size() - 1);
        AbstractC11918b abstractC11918bM16216o = c11919c.m16216o();
        boolean z2 = false;
        if (!z && !abstractC11918bM16216o.m16189q() && c11919c.m16218q()) {
            strM16179g = abstractC11918bM16216o.m16179g();
            abstractC11918bM16216o.m16193u(true);
            if (abstractC11918bM16216o.m16189q()) {
                z2 = true;
            }
        }
        int openStepPosition = getOpenStepPosition();
        if (openStepPosition >= 0 && openStepPosition < this.f13835e.size() && (z || m16130k())) {
            this.f13829H = true;
            ((C11919c) this.f13835e.get(openStepPosition)).m16211j();
            m16127R();
            b6g b6gVar = this.f13833c;
            if (b6gVar != null) {
                if (z) {
                    b6gVar.mo1911s();
                } else {
                    b6gVar.mo1910W();
                }
            }
        } else if (z2) {
            abstractC11918bM16216o.m16195w(strM16179g, true);
        }
        if (!z && this.f13832b.f13856M) {
            abstractC11918bM16216o.m16174b(true);
        }
    }

    /* renamed from: m */
    public void m16132m() {
        m16131l(true);
    }

    /* renamed from: n */
    public final void m16133n(View view) {
        view.setAlpha(this.f13832b.f13857N);
        view.setEnabled(false);
    }

    /* renamed from: o */
    public void m16134o() {
        m16133n(this.f13841x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m16122M();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m16140u();
        m16121L();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            boolean z = bundle.getBoolean("formCompleted");
            String[] stringArray = bundle.getStringArray("errorMessages");
            String[] stringArray2 = bundle.getStringArray("buttonTexts");
            String[] stringArray3 = bundle.getStringArray("subtitles");
            String[] stringArray4 = bundle.getStringArray("titles");
            boolean[] booleanArray = bundle.getBooleanArray("completedSteps");
            boolean[] booleanArray2 = bundle.getBooleanArray("errorSteps");
            int i = bundle.getInt("openStep");
            Serializable[] serializableArr = (Serializable[]) bundle.getSerializable("stepsData");
            parcelable = bundle.getParcelable("superState");
            m16123N(serializableArr, i, booleanArray, booleanArray2, stringArray4, stringArray3, stringArray2, stringArray, z);
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable, java.io.Serializable[]] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        ?? r1 = new Serializable[this.f13835e.size()];
        int size = this.f13835e.size();
        boolean[] zArr = new boolean[size];
        boolean[] zArr2 = new boolean[this.f13835e.size()];
        String[] strArr = new String[this.f13835e.size()];
        String[] strArr2 = new String[this.f13835e.size()];
        String[] strArr3 = new String[this.f13835e.size()];
        String[] strArr4 = new String[this.f13835e.size()];
        for (int i = 0; i < size; i++) {
            AbstractC11918b abstractC11918bM16216o = ((C11919c) this.f13835e.get(i)).m16216o();
            r1[i] = abstractC11918bM16216o.mo16183k();
            zArr[i] = abstractC11918bM16216o.m16189q();
            zArr2[i] = abstractC11918bM16216o.m16187o();
            strArr[i] = abstractC11918bM16216o.m16186n();
            strArr2[i] = abstractC11918bM16216o.m16185m();
            strArr3[i] = abstractC11918bM16216o.m16181i();
            if (!abstractC11918bM16216o.m16189q()) {
                strArr4[i] = abstractC11918bM16216o.m16179g();
            }
        }
        int iIndexOf = this.f13835e.indexOf(getOpenStepHelper());
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("openStep", iIndexOf);
        bundle.putSerializable("stepsData", r1);
        bundle.putBooleanArray("completedSteps", zArr);
        bundle.putBooleanArray("errorSteps", zArr2);
        bundle.putStringArray("titles", strArr);
        bundle.putStringArray("subtitles", strArr2);
        bundle.putStringArray("buttonTexts", strArr3);
        bundle.putStringArray("errorMessages", strArr4);
        bundle.putBoolean("formCompleted", this.f13829H);
        return bundle;
    }

    /* renamed from: p */
    public void m16135p() {
        m16133n(this.f13840s);
    }

    /* renamed from: q */
    public final void m16136q(View view) {
        view.setAlpha(1.0f);
        view.setEnabled(true);
    }

    /* renamed from: r */
    public void m16137r() {
        m16136q(this.f13841x);
    }

    /* renamed from: s */
    public final void m16138s() {
        if (m16130k()) {
            ((C11919c) this.f13835e.get(r0.size() - 1)).m16214m();
        } else {
            ((C11919c) this.f13835e.get(r0.size() - 1)).m16213l();
        }
    }

    /* renamed from: t */
    public void m16139t() {
        m16136q(this.f13840s);
    }

    /* renamed from: u */
    public final void m16140u() {
        this.f13837g = (LinearLayout) findViewById(q8e.content);
        this.f13838h = (ScrollView) findViewById(q8e.steps_scroll);
        this.f13839q = (ProgressBar) findViewById(q8e.progress_bar);
        this.f13840s = (AppCompatImageButton) findViewById(q8e.down_previous);
        this.f13841x = (AppCompatImageButton) findViewById(q8e.down_next);
        this.f13842y = findViewById(q8e.bottom_navigation);
    }

    /* renamed from: v */
    public int m16141v(int i, boolean z) {
        return f9e.step_layout;
    }

    /* renamed from: w */
    public int m16142w(AbstractC11918b abstractC11918b) {
        for (int i = 0; i < this.f13835e.size(); i++) {
            if (((C11919c) this.f13835e.get(i)).m16216o() == abstractC11918b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public synchronized boolean m16143x(boolean z) {
        return m16145z(getOpenStepPosition() + 1, z);
    }

    /* renamed from: y */
    public synchronized boolean m16144y(boolean z) {
        return m16145z(getOpenStepPosition() - 1, z);
    }

    /* renamed from: z */
    public synchronized boolean m16145z(int i, boolean z) {
        if (this.f13829H) {
            return false;
        }
        if (getOpenStepPosition() != i && i >= 0 && i <= this.f13835e.size()) {
            boolean zM16129j = m16129j(i);
            if ((this.f13832b.f13854K && i < this.f13835e.size()) || zM16129j) {
                m16119J(i, z);
                return true;
            }
        }
        return false;
    }

    public VerticalStepperFormView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16118I(context, attributeSet, 0);
    }

    public VerticalStepperFormView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16118I(context, attributeSet, i);
    }
}
