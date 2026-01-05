package p001o;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class p14 {

    /* renamed from: a */
    public final Object f39171a;

    /* renamed from: b */
    public final View f39172b;

    /* renamed from: o.p14$a */
    public static class C15937a {
        /* renamed from: a */
        public static Bundle m42855a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* renamed from: o.p14$b */
    public static class C15938b {
        /* renamed from: a */
        public static AutofillId m42856a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        /* renamed from: b */
        public static ViewStructure m42857b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        /* renamed from: c */
        public static ViewStructure m42858c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        /* renamed from: d */
        public static void m42859d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        /* renamed from: e */
        public static void m42860e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        /* renamed from: f */
        public static void m42861f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* renamed from: o.p14$c */
    public static class C15939c {
        /* renamed from: a */
        public static void m42862a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        }
    }

    public p14(ContentCaptureSession contentCaptureSession, View view) {
        this.f39171a = contentCaptureSession;
        this.f39172b = view;
    }

    /* renamed from: f */
    public static p14 m42849f(ContentCaptureSession contentCaptureSession, View view) {
        return new p14(contentCaptureSession, view);
    }

    /* renamed from: a */
    public AutofillId m42850a(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM41343a = o14.m41343a(this.f39171a);
        s61 s61VarM58390a = yvi.m58390a(this.f39172b);
        Objects.requireNonNull(s61VarM58390a);
        return C15938b.m42856a(contentCaptureSessionM41343a, s61VarM58390a.m47893a(), j);
    }

    /* renamed from: b */
    public jzi m42851b(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return jzi.m34799f(C15938b.m42858c(o14.m41343a(this.f39171a), autofillId, j));
        }
        return null;
    }

    /* renamed from: c */
    public void m42852c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C15938b.m42860e(o14.m41343a(this.f39171a), autofillId, charSequence);
        }
    }

    /* renamed from: d */
    public void m42853d(List list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C15939c.m42862a(o14.m41343a(this.f39171a), list);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureM42857b = C15938b.m42857b(o14.m41343a(this.f39171a), this.f39172b);
            C15937a.m42855a(viewStructureM42857b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C15938b.m42859d(o14.m41343a(this.f39171a), viewStructureM42857b);
            for (int i2 = 0; i2 < list.size(); i2++) {
                C15938b.m42859d(o14.m41343a(this.f39171a), (ViewStructure) list.get(i2));
            }
            ViewStructure viewStructureM42857b2 = C15938b.m42857b(o14.m41343a(this.f39171a), this.f39172b);
            C15937a.m42855a(viewStructureM42857b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C15938b.m42859d(o14.m41343a(this.f39171a), viewStructureM42857b2);
        }
    }

    /* renamed from: e */
    public void m42854e(long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession contentCaptureSessionM41343a = o14.m41343a(this.f39171a);
            s61 s61VarM58390a = yvi.m58390a(this.f39172b);
            Objects.requireNonNull(s61VarM58390a);
            C15938b.m42861f(contentCaptureSessionM41343a, s61VarM58390a.m47893a(), jArr);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureM42857b = C15938b.m42857b(o14.m41343a(this.f39171a), this.f39172b);
            C15937a.m42855a(viewStructureM42857b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C15938b.m42859d(o14.m41343a(this.f39171a), viewStructureM42857b);
            ContentCaptureSession contentCaptureSessionM41343a2 = o14.m41343a(this.f39171a);
            s61 s61VarM58390a2 = yvi.m58390a(this.f39172b);
            Objects.requireNonNull(s61VarM58390a2);
            C15938b.m42861f(contentCaptureSessionM41343a2, s61VarM58390a2.m47893a(), jArr);
            ViewStructure viewStructureM42857b2 = C15938b.m42857b(o14.m41343a(this.f39171a), this.f39172b);
            C15937a.m42855a(viewStructureM42857b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C15938b.m42859d(o14.m41343a(this.f39171a), viewStructureM42857b2);
        }
    }
}
