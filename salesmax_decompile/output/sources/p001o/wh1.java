package p001o;

import android.view.View;
import android.view.ViewGroup;
import p001o.r9j;

/* loaded from: classes2.dex */
public abstract class wh1 {

    /* renamed from: o.wh1$a */
    public static final class C17864a extends kf9 implements sl7 {

        /* renamed from: a */
        public final /* synthetic */ boolean f51976a;

        /* renamed from: b */
        public final /* synthetic */ boolean f51977b;

        /* renamed from: c */
        public final /* synthetic */ boolean f51978c;

        /* renamed from: d */
        public final /* synthetic */ boolean f51979d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17864a(boolean z, boolean z2, boolean z3, boolean z4) {
            super(4);
            this.f51976a = z;
            this.f51977b = z2;
            this.f51978c = z3;
            this.f51979d = z4;
        }

        /* renamed from: a */
        public final void m54395a(View view, r9j r9jVar, hi8 hi8Var, gi8 gi8Var) {
            sq8.m48649h(view, "view");
            sq8.m48649h(r9jVar, "insets");
            sq8.m48649h(hi8Var, "padding");
            sq8.m48649h(gi8Var, "<anonymous parameter 3>");
            sj8 sj8VarM46391f = r9jVar.m46391f(r9j.C16576m.m46449e());
            sq8.m48648g(sj8VarM46391f, "getInsets(...)");
            view.setPadding(hi8Var.m30631b() + (this.f51976a ? sj8VarM46391f.f45477a : 0), hi8Var.m30633d() + (this.f51977b ? sj8VarM46391f.f45478b : 0), hi8Var.m30632c() + (this.f51978c ? sj8VarM46391f.f45479c : 0), hi8Var.m30630a() + (this.f51979d ? sj8VarM46391f.f45480d : 0));
        }

        @Override // p001o.sl7
        /* renamed from: j */
        public /* bridge */ /* synthetic */ Object mo37376j(Object obj, Object obj2, Object obj3, Object obj4) {
            m54395a((View) obj, (r9j) obj2, (hi8) obj3, (gi8) obj4);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wh1$b */
    public static final class ViewOnAttachStateChangeListenerC17865b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            sq8.m48649h(view, "v");
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            sq8.m48649h(view, "v");
        }
    }

    /* renamed from: b */
    public static final void m54388b(View view, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        sq8.m48649h(view, "<this>");
        if (z == z5 && z2 == z6 && z3 == z7 && z4 == z8) {
            return;
        }
        m54390d(view, new C17864a(z5, z6, z7, z8));
    }

    /* renamed from: c */
    public static final void m54389c(View view, boolean z, boolean z2) {
        sq8.m48649h(view, "<this>");
        if (z == z2 || !z2) {
            return;
        }
        view.setSystemUiVisibility(1792);
    }

    /* renamed from: d */
    public static final void m54390d(View view, final sl7 sl7Var) {
        sq8.m48649h(view, "<this>");
        sq8.m48649h(sl7Var, "block");
        final hi8 hi8VarM54393g = m54393g(view);
        final gi8 gi8VarM54392f = m54392f(view);
        wvi.x0(view, new cbc() { // from class: o.vh1
            @Override // p001o.cbc
            /* renamed from: a */
            public final r9j mo3830a(View view2, r9j r9jVar) {
                return wh1.m54391e(sl7Var, hi8VarM54393g, gi8VarM54392f, view2, r9jVar);
            }
        });
        m54394h(view);
    }

    /* renamed from: e */
    public static final r9j m54391e(sl7 sl7Var, hi8 hi8Var, gi8 gi8Var, View view, r9j r9jVar) {
        sq8.m48649h(sl7Var, "$block");
        sq8.m48649h(hi8Var, "$initialPadding");
        sq8.m48649h(gi8Var, "$initialMargin");
        sq8.m48649h(view, "v");
        sq8.m48649h(r9jVar, "insets");
        sl7Var.mo37376j(view, r9jVar, hi8Var, gi8Var);
        return r9jVar;
    }

    /* renamed from: f */
    public static final gi8 m54392f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return new gi8(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        throw new IllegalArgumentException("Invalid view layout params");
    }

    /* renamed from: g */
    public static final hi8 m54393g(View view) {
        return new hi8(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    /* renamed from: h */
    public static final void m54394h(View view) {
        sq8.m48649h(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC17865b());
        }
    }
}
