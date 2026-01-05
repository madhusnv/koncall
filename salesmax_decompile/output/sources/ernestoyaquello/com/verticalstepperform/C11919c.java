package ernestoyaquello.com.verticalstepperform;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import ernestoyaquello.com.verticalstepperform.AbstractC11918b;
import ernestoyaquello.com.verticalstepperform.VerticalStepperFormView;
import p001o.c64;
import p001o.i0i;
import p001o.m7e;
import p001o.q8e;

/* renamed from: ernestoyaquello.com.verticalstepperform.c */
/* loaded from: classes6.dex */
public class C11919c implements AbstractC11918b.a {

    /* renamed from: a */
    public AbstractC11918b f13907a;

    /* renamed from: b */
    public VerticalStepperFormView.C11915c f13908b;

    /* renamed from: c */
    public View f13909c;

    /* renamed from: d */
    public TextView f13910d;

    /* renamed from: e */
    public TextView f13911e;

    /* renamed from: f */
    public TextView f13912f;

    /* renamed from: g */
    public ImageView f13913g;

    /* renamed from: h */
    public TextView f13914h;

    /* renamed from: i */
    public ImageView f13915i;

    /* renamed from: j */
    public View f13916j;

    /* renamed from: k */
    public MaterialButton f13917k;

    /* renamed from: l */
    public MaterialButton f13918l;

    /* renamed from: m */
    public View f13919m;

    /* renamed from: n */
    public View f13920n;

    /* renamed from: o */
    public View f13921o;

    /* renamed from: p */
    public View f13922p;

    /* renamed from: q */
    public View f13923q;

    /* renamed from: r */
    public View f13924r;

    /* renamed from: ernestoyaquello.com.verticalstepperform.c$a */
    public class a extends AbstractC11918b {
        public a() {
            super("");
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: A */
        public void mo16155A(boolean z) {
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public Integer mo16183k() {
            return 0;
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public AbstractC11918b.b mo16191s(Integer num) {
            return null;
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void mo16164J(Integer num) {
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: c */
        public View mo16175c() {
            return null;
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: l */
        public String mo16184l() {
            return m16185m();
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: x */
        public void mo16196x(boolean z) {
            if (m16180h().m16116D()) {
                return;
            }
            m16195w("", z);
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: y */
        public void mo16197y(boolean z) {
        }

        @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b
        /* renamed from: z */
        public void mo16198z(boolean z) {
        }
    }

    public C11919c(AbstractC11918b.a aVar, AbstractC11918b abstractC11918b) {
        this(aVar, abstractC11918b, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m16204r(VerticalStepperFormView verticalStepperFormView, View view) {
        if (this.f13908b.f13855L) {
            verticalStepperFormView.m16145z(verticalStepperFormView.m16142w(this.f13907a), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m16205s(VerticalStepperFormView verticalStepperFormView, View view) {
        verticalStepperFormView.m16145z(verticalStepperFormView.m16142w(this.f13907a) + 1, true);
    }

    /* renamed from: A */
    public final void m16207A(boolean z) {
        boolean z2 = this.f13907a.m16190r() || this.f13907a.m16189q();
        float f = z2 ? 1.0f : this.f13908b.f13857N;
        float f2 = z2 ? 1.0f : 0.0f;
        this.f13910d.setAlpha(f);
        this.f13911e.setAlpha(f2);
        this.f13909c.setAlpha(f);
        int i = !this.f13907a.m16187o() ? z2 ? this.f13908b.f13877o : this.f13908b.f13876n : this.f13908b.f13878p;
        VerticalStepperFormView.C11915c c11915c = this.f13908b;
        if (c11915c.f13852I && !z2) {
            i = c11915c.f13875m;
        }
        Drawable drawable = c64.getDrawable(this.f13909c.getContext(), m7e.circle_step_done);
        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        this.f13909c.setBackground(drawable);
        if (this.f13907a.m16190r() || !this.f13907a.m16189q()) {
            m16221w();
        } else {
            m16220v();
        }
        m16208B();
        m16209C(z);
        m16224z(z);
    }

    /* renamed from: B */
    public final boolean m16208B() {
        CharSequence text = this.f13911e.getText();
        String string = text == null ? "" : text.toString();
        String strM16215n = m16215n();
        if (strM16215n.equals(string)) {
            return false;
        }
        if (strM16215n.isEmpty()) {
            return true;
        }
        this.f13911e.setText(strM16215n);
        return true;
    }

    /* renamed from: C */
    public final void m16209C(boolean z) {
        if (!m16215n().isEmpty() && (this.f13907a.m16190r() || this.f13907a.m16189q())) {
            i0i.m31349j(this.f13911e, z);
        } else {
            i0i.m31350k(this.f13911e, z);
        }
    }

    /* renamed from: D */
    public final boolean m16210D() {
        CharSequence text = this.f13910d.getText();
        String string = text == null ? "" : text.toString();
        String strM16186n = this.f13907a.m16186n();
        if (strM16186n.equals(string)) {
            return false;
        }
        this.f13910d.setText(strM16186n);
        return true;
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
    /* renamed from: a */
    public void mo16146a(int i, boolean z) {
        if (this.f13907a.m16178f() != null) {
            if (this.f13907a.m16189q()) {
                m16214m();
            } else {
                m16213l();
            }
            m16207A(z);
        }
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
    /* renamed from: b */
    public void mo16147b(int i, boolean z) {
        if (this.f13907a.m16178f() == null || !m16223y()) {
            return;
        }
        m16224z(z);
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
    /* renamed from: c */
    public void mo16148c(int i, boolean z) {
        if (this.f13907a.m16178f() != null) {
            m16210D();
        }
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
    /* renamed from: d */
    public void mo16149d(int i, boolean z) {
        if (this.f13907a.m16178f() != null) {
            m16222x();
        }
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
    /* renamed from: e */
    public void mo16150e(int i, boolean z) {
        if (this.f13907a.m16178f() == null || !m16208B()) {
            return;
        }
        m16209C(z);
    }

    @Override // ernestoyaquello.com.verticalstepperform.AbstractC11918b.a
    /* renamed from: f */
    public void mo16151f(int i, boolean z) {
        if (this.f13907a.m16178f() != null) {
            if (!this.f13907a.m16190r()) {
                i0i.m31350k(this.f13921o, z);
                m16207A(z);
                return;
            }
            i0i.m31349j(this.f13921o, z);
            if (this.f13907a.m16193u(z) == this.f13907a.m16189q()) {
                m16207A(z);
            }
        }
    }

    /* renamed from: j */
    public void m16211j() {
        m16213l();
        m16212k();
    }

    /* renamed from: k */
    public void m16212k() {
        this.f13918l.setEnabled(false);
        this.f13918l.setAlpha(this.f13908b.f13857N);
        VerticalStepperFormView.C11915c c11915c = this.f13908b;
        if (c11915c.f13852I) {
            MaterialButton materialButton = this.f13918l;
            int i = c11915c.f13875m;
            i0i.m31347h(materialButton, i, c11915c.f13888z, i, c11915c.f13844A);
        }
    }

    /* renamed from: l */
    public void m16213l() {
        this.f13917k.setEnabled(false);
        this.f13917k.setAlpha(this.f13908b.f13857N);
        VerticalStepperFormView.C11915c c11915c = this.f13908b;
        if (c11915c.f13852I) {
            MaterialButton materialButton = this.f13917k;
            int i = c11915c.f13875m;
            i0i.m31347h(materialButton, i, c11915c.f13886x, i, c11915c.f13887y);
        }
    }

    /* renamed from: m */
    public void m16214m() {
        this.f13917k.setEnabled(true);
        this.f13917k.setAlpha(1.0f);
        VerticalStepperFormView.C11915c c11915c = this.f13908b;
        if (c11915c.f13852I) {
            i0i.m31347h(this.f13917k, c11915c.f13879q, c11915c.f13886x, c11915c.f13880r, c11915c.f13887y);
        }
    }

    /* renamed from: n */
    public final String m16215n() {
        String strM16185m = (!this.f13908b.f13851H || this.f13907a.m16190r()) ? this.f13907a.m16185m() : this.f13907a.mo16184l();
        return strM16185m == null ? "" : strM16185m;
    }

    /* renamed from: o */
    public AbstractC11918b m16216o() {
        return this.f13907a;
    }

    /* renamed from: p */
    public View m16217p(VerticalStepperFormView verticalStepperFormView, ViewGroup viewGroup, int i) {
        if (this.f13907a.m16178f() != null) {
            throw new IllegalStateException("This step has already been initialized");
        }
        this.f13908b = verticalStepperFormView.f13832b;
        View viewInflate = LayoutInflater.from(verticalStepperFormView.getContext()).inflate(i, viewGroup, false);
        this.f13907a.m16188p(viewInflate, verticalStepperFormView);
        AbstractC11918b abstractC11918b = this.f13907a;
        abstractC11918b.m16166L(abstractC11918b.mo16175c());
        m16219u(verticalStepperFormView, viewInflate);
        return this.f13907a.m16178f();
    }

    /* renamed from: q */
    public boolean m16218q() {
        return this.f13907a instanceof a;
    }

    /* renamed from: u */
    public final void m16219u(final VerticalStepperFormView verticalStepperFormView, View view) {
        String strM16181i;
        if (this.f13907a.m16176d() != null) {
            ((ViewGroup) this.f13907a.m16178f().findViewById(q8e.step_content)).addView(this.f13907a.m16176d());
        }
        this.f13909c = view.findViewById(q8e.step_number_circle);
        this.f13912f = (TextView) view.findViewById(q8e.step_number);
        this.f13910d = (TextView) view.findViewById(q8e.step_title);
        this.f13911e = (TextView) view.findViewById(q8e.step_subtitle);
        this.f13913g = (ImageView) view.findViewById(q8e.step_done_icon);
        this.f13914h = (TextView) view.findViewById(q8e.step_error_message);
        this.f13915i = (ImageView) view.findViewById(q8e.step_error_icon);
        this.f13916j = view.findViewById(q8e.step_header);
        this.f13917k = (MaterialButton) view.findViewById(q8e.step_button);
        this.f13918l = (MaterialButton) view.findViewById(q8e.step_cancel_button);
        this.f13919m = view.findViewById(q8e.line1);
        this.f13920n = view.findViewById(q8e.line2);
        this.f13921o = this.f13907a.m16178f().findViewById(q8e.step_content_and_button);
        this.f13922p = this.f13907a.m16178f().findViewById(q8e.step_error_container);
        this.f13923q = this.f13907a.m16178f().findViewById(q8e.title_subtitle_container);
        this.f13924r = this.f13907a.m16178f().findViewById(q8e.error_content_button_container);
        this.f13912f.setTypeface(this.f13908b.f13858O);
        this.f13910d.setTypeface(this.f13908b.f13859P);
        this.f13911e.setTypeface(this.f13908b.f13860Q);
        this.f13914h.setTypeface(this.f13908b.f13861R);
        this.f13910d.setTextColor(this.f13908b.f13884v);
        this.f13911e.setTextColor(this.f13908b.f13885w);
        this.f13912f.setTextColor(this.f13908b.f13883u);
        this.f13913g.setColorFilter(this.f13908b.f13883u);
        this.f13914h.setTextColor(this.f13908b.f13845B);
        this.f13915i.setColorFilter(this.f13908b.f13845B);
        Drawable drawable = c64.getDrawable(verticalStepperFormView.getContext(), m7e.circle_step_done);
        drawable.setColorFilter(new PorterDuffColorFilter(this.f13908b.f13876n, PorterDuff.Mode.SRC_IN));
        this.f13909c.setBackground(drawable);
        MaterialButton materialButton = this.f13917k;
        VerticalStepperFormView.C11915c c11915c = this.f13908b;
        i0i.m31347h(materialButton, c11915c.f13879q, c11915c.f13886x, c11915c.f13880r, c11915c.f13887y);
        MaterialButton materialButton2 = this.f13918l;
        VerticalStepperFormView.C11915c c11915c2 = this.f13908b;
        i0i.m31347h(materialButton2, c11915c2.f13881s, c11915c2.f13888z, c11915c2.f13882t, c11915c2.f13844A);
        ViewGroup.LayoutParams layoutParams = this.f13909c.getLayoutParams();
        int i = this.f13908b.f13868f;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f13909c.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f13919m.getLayoutParams();
        layoutParams2.width = this.f13908b.f13873k;
        this.f13919m.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f13920n.getLayoutParams();
        layoutParams3.width = this.f13908b.f13873k;
        this.f13920n.setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f13923q.getLayoutParams();
        layoutParams4.setMarginStart(this.f13908b.f13874l);
        this.f13923q.setLayoutParams(layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f13924r.getLayoutParams();
        layoutParams5.setMarginStart(this.f13908b.f13874l);
        this.f13924r.setLayoutParams(layoutParams5);
        this.f13912f.setTextSize(0, this.f13908b.f13869g);
        this.f13910d.setTextSize(0, this.f13908b.f13870h);
        this.f13911e.setTextSize(0, this.f13908b.f13871i);
        this.f13914h.setTextSize(0, this.f13908b.f13872j);
        this.f13916j.setOnClickListener(new View.OnClickListener() { // from class: o.y5g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f54953a.m16204r(verticalStepperFormView, view2);
            }
        });
        this.f13917k.setOnClickListener(new View.OnClickListener() { // from class: o.z5g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f56571a.m16205s(verticalStepperFormView, view2);
            }
        });
        this.f13918l.setOnClickListener(new View.OnClickListener() { // from class: o.a6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                verticalStepperFormView.m16132m();
            }
        });
        int iM16142w = verticalStepperFormView.m16142w(this.f13907a);
        int i2 = iM16142w + 1;
        boolean z = i2 == verticalStepperFormView.getTotalNumberOfSteps();
        String strM16186n = !m16218q() ? this.f13907a.m16186n() : this.f13908b.f13866d;
        String strM16185m = !m16218q() ? this.f13907a.m16185m() : this.f13908b.f13867e;
        if (this.f13907a.m16181i().isEmpty()) {
            VerticalStepperFormView.C11915c c11915c3 = this.f13908b;
            strM16181i = z ? c11915c3.f13864b : c11915c3.f13863a;
        } else {
            strM16181i = this.f13907a.m16181i();
        }
        this.f13912f.setText(String.valueOf(i2));
        this.f13907a.m16172R(strM16186n, false);
        this.f13907a.m16171Q(strM16185m, false);
        this.f13907a.m16168N(strM16181i, false);
        VerticalStepperFormView.C11915c c11915c4 = this.f13908b;
        if (c11915c4.f13849F && z) {
            String str = c11915c4.f13865c;
            if (str == null) {
                str = "";
            }
            this.f13918l.setText(str);
            this.f13918l.setVisibility(0);
        }
        if (!this.f13908b.f13850G && z) {
            this.f13917k.setVisibility(8);
        }
        if (!this.f13908b.f13848E && !m16218q()) {
            this.f13917k.setVisibility(8);
        }
        if (z) {
            this.f13919m.setVisibility(8);
            this.f13920n.setVisibility(8);
        }
        mo16146a(iM16142w, false);
        mo16151f(iM16142w, false);
    }

    /* renamed from: v */
    public final void m16220v() {
        this.f13913g.setVisibility(0);
        this.f13912f.setVisibility(8);
    }

    /* renamed from: w */
    public final void m16221w() {
        this.f13913g.setVisibility(8);
        this.f13912f.setVisibility(0);
    }

    /* renamed from: x */
    public final boolean m16222x() {
        CharSequence text = this.f13917k.getText();
        String string = text == null ? "" : text.toString();
        String strM16181i = this.f13907a.m16181i();
        if (strM16181i.equals(string)) {
            return false;
        }
        this.f13917k.setText(strM16181i);
        return true;
    }

    /* renamed from: y */
    public final boolean m16223y() {
        CharSequence text = this.f13914h.getText();
        String string = text == null ? "" : text.toString();
        String strM16179g = this.f13907a.m16179g();
        if (strM16179g.equals(string)) {
            return false;
        }
        if (strM16179g.isEmpty()) {
            return true;
        }
        this.f13914h.setText(strM16179g);
        return true;
    }

    /* renamed from: z */
    public final void m16224z(boolean z) {
        if (!this.f13907a.m16190r() || this.f13907a.m16189q() || this.f13907a.m16179g().isEmpty()) {
            i0i.m31350k(this.f13922p, z);
        } else {
            i0i.m31349j(this.f13922p, z);
        }
    }

    public C11919c(AbstractC11918b.a aVar, AbstractC11918b abstractC11918b, boolean z) {
        abstractC11918b = z ? new a() : abstractC11918b;
        this.f13907a = abstractC11918b;
        abstractC11918b.m16173a(this);
        this.f13907a.m16173a(aVar);
    }
}
