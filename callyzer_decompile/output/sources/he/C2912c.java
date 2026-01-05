package he;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.AbstractC4154l;
import wd.C7997e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: he.c */
/* loaded from: classes.dex */
public final class C2912c implements InterfaceC2917h {

    /* renamed from: a */
    public final Context f15946a;

    public C2912c(Context context) {
        this.f15946a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2912c) {
            return AbstractC4154l.m8918a(this.f15946a, ((C2912c) obj).f15946a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15946a.hashCode();
    }

    @Override // he.InterfaceC2917h
    /* renamed from: m */
    public final Object mo7024m(C7997e c7997e) {
        DisplayMetrics displayMetrics = this.f15946a.getResources().getDisplayMetrics();
        C2910a c2910a = new C2910a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C2916g(c2910a, c2910a);
    }
}
