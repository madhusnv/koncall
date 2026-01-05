package bg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import w3.C7892j;
import w3.C7904v;
import x2.AbstractC8284h;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bg.b */
/* loaded from: classes.dex */
public final class C0657b {

    /* renamed from: a */
    public final Object f4200a;

    /* renamed from: a */
    public void m1918a() {
        ((AutofillManager) this.f4200a).commit();
    }

    /* renamed from: b */
    public ApplicationInfo m1919b(int i10, String str) {
        return ((Context) this.f4200a).getPackageManager().getApplicationInfo(str, i10);
    }

    /* renamed from: c */
    public PackageInfo m1920c(int i10, String str) {
        return ((Context) this.f4200a).getPackageManager().getPackageInfo(str, i10);
    }

    /* renamed from: d */
    public boolean m1921d() {
        String nameForUid;
        Context context = (Context) this.f4200a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC0656a.m1907p(context);
        }
        if (!AbstractC8947b.m16428e() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    /* renamed from: e */
    public void m1922e(C7904v c7904v, int i10, AutofillValue autofillValue) {
        ((AutofillManager) this.f4200a).notifyValueChanged(c7904v, i10, autofillValue);
    }

    /* renamed from: f */
    public void m1923f(C7904v c7904v, int i10, Rect rect) {
        ((AutofillManager) this.f4200a).notifyViewEntered(c7904v, i10, rect);
    }

    /* renamed from: g */
    public void m1924g(C7904v c7904v, int i10) {
        ((AutofillManager) this.f4200a).notifyViewExited(c7904v, i10);
    }

    /* renamed from: h */
    public void m1925h(View view, int i10, boolean z6) {
        if (Build.VERSION.SDK_INT >= 27) {
            AbstractC8284h.m15494a(view, (AutofillManager) this.f4200a, i10, z6);
        }
    }

    /* renamed from: i */
    public void m1926i(C7904v c7904v, int i10, Rect rect) {
        ((AutofillManager) this.f4200a).requestAutofill(c7904v, i10, rect);
    }

    /* renamed from: j */
    public AutofillId m1927j() {
        return C7892j.m14962d(this.f4200a);
    }
}
