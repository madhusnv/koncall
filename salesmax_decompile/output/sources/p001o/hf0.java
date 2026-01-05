package p001o;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public abstract class hf0 {

    /* renamed from: a */
    public static final g2e f26754a = jp3.m34194c(null, C13927a.f26755a, 1, null);

    /* renamed from: o.hf0$a */
    public static final class C13927a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C13927a f26755a = new C13927a();

        public C13927a() {
            super(0);
        }

        @Override // p001o.uk7
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* renamed from: a */
    public static final boolean m30317a(View view) {
        sq8.m48649h(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
