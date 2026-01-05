package p001o;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes2.dex */
public final class kj8 implements jj8 {

    /* renamed from: a */
    public final View f32301a;

    /* renamed from: b */
    public final gi9 f32302b;

    /* renamed from: c */
    public final qyf f32303c;

    /* renamed from: o.kj8$a */
    public static final class C14846a extends kf9 implements uk7 {
        public C14846a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = kj8.this.f32301a.getContext().getSystemService("input_method");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public kj8(View view) {
        sq8.m48649h(view, "view");
        this.f32301a = view;
        this.f32302b = si9.m48361b(cj9.NONE, new C14846a());
        this.f32303c = new qyf(view);
    }
}
