package p001o;

import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
public final class qyf {

    /* renamed from: a */
    public final C16491c f42629a;

    /* renamed from: o.qyf$a */
    public static class C16489a extends C16491c {

        /* renamed from: a */
        public final View f42630a;

        public C16489a(View view) {
            this.f42630a = view;
        }
    }

    /* renamed from: o.qyf$b */
    public static class C16490b extends C16489a {

        /* renamed from: b */
        public View f42631b;

        public C16490b(View view) {
            super(view);
            this.f42631b = view;
        }
    }

    /* renamed from: o.qyf$c */
    public static class C16491c {
    }

    public qyf(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f42629a = new C16490b(view);
        } else {
            this.f42629a = new C16489a(view);
        }
    }
}
