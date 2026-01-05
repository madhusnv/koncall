package p001o;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes2.dex */
public final class sf0 implements wih {

    /* renamed from: a */
    public final View f45331a;

    /* renamed from: b */
    public ActionMode f45332b;

    /* renamed from: c */
    public final jgh f45333c;

    /* renamed from: d */
    public xih f45334d;

    /* renamed from: o.sf0$a */
    public static final class C16821a extends kf9 implements uk7 {
        public C16821a() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69030invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69030invoke() {
            sf0.this.f45332b = null;
        }
    }

    public sf0(View view) {
        sq8.m48649h(view, "view");
        this.f45331a = view;
        this.f45333c = new jgh(new C16821a(), null, null, null, null, null, 62, null);
        this.f45334d = xih.Hidden;
    }
}
