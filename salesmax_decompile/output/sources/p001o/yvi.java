package p001o;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes2.dex */
public abstract class yvi {

    /* renamed from: o.yvi$a */
    public static class C18504a {
        /* renamed from: a */
        public static AutofillId m58393a(View view) {
            return view.getAutofillId();
        }
    }

    /* renamed from: o.yvi$b */
    public static class C18505b {
        /* renamed from: a */
        public static ContentCaptureSession m58394a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* renamed from: o.yvi$c */
    public static class C18506c {
        /* renamed from: a */
        public static void m58395a(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    /* renamed from: a */
    public static s61 m58390a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return s61.m47892b(C18504a.m58393a(view));
        }
        return null;
    }

    /* renamed from: b */
    public static p14 m58391b(View view) {
        ContentCaptureSession contentCaptureSessionM58394a;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionM58394a = C18505b.m58394a(view)) == null) {
            return null;
        }
        return p14.m42849f(contentCaptureSessionM58394a, view);
    }

    /* renamed from: c */
    public static void m58392c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C18506c.m58395a(view, i);
        }
    }
}
