package z3;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import bg.C0657b;
import java.util.Objects;
import pg.q9;
import ug.g1;
import w3.C7892j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z3.a */
/* loaded from: classes.dex */
public final class C8862a {

    /* renamed from: a */
    public final Object f42642a;

    /* renamed from: b */
    public final View f42643b;

    public C8862a(ContentCaptureSession contentCaptureSession, View view) {
        this.f42642a = contentCaptureSession;
        this.f42643b = view;
    }

    /* renamed from: a */
    public final void m16333a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionM14964g = C7892j.m14964g(this.f42642a);
            C0657b c0657bM11835a = q9.m11835a(this.f42643b);
            Objects.requireNonNull(c0657bM11835a);
            contentCaptureSessionM14964g.notifyViewsDisappeared(C7892j.m14962d(c0657bM11835a.f4200a), new long[]{Long.MIN_VALUE});
        }
    }

    /* renamed from: b */
    public final AutofillId m16334b(long j6) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM14964g = C7892j.m14964g(this.f42642a);
        C0657b c0657bM11835a = q9.m11835a(this.f42643b);
        Objects.requireNonNull(c0657bM11835a);
        return contentCaptureSessionM14964g.newAutofillId(C7892j.m14962d(c0657bM11835a.f4200a), j6);
    }

    /* renamed from: c */
    public final g1 m16335c(AutofillId autofillId, long j6) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new g1(C7892j.m14964g(this.f42642a).newVirtualViewStructure(autofillId, j6));
        }
        return null;
    }

    /* renamed from: d */
    public final void m16336d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            C7892j.m14964g(this.f42642a).notifyViewAppeared(viewStructure);
        }
    }

    /* renamed from: e */
    public final void m16337e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            C7892j.m14964g(this.f42642a).notifyViewDisappeared(autofillId);
        }
    }

    /* renamed from: f */
    public final void m16338f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.f42642a).notifyViewTextChanged(autofillId, str);
        }
    }
}
