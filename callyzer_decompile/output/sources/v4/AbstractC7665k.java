package v4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import b3.AbstractC0574f;
import b3.C0585q;
import b3.InterfaceC0579k;
import b3.e0;
import c3.C0848c;
import v3.AbstractC7634f;
import v3.C7649u;
import v3.g0;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.k */
/* loaded from: classes.dex */
public abstract class AbstractC7665k {

    /* renamed from: a */
    public static final C7664j f37130a = new C7664j();

    /* renamed from: a */
    public static final boolean m14681a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final Rect m14682b(InterfaceC0579k interfaceC0579k, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        e0 e0VarM1722g = AbstractC0574f.m1722g(((C0585q) interfaceC0579k).f3941f);
        C0848c c0848cM1725j = e0VarM1722g != null ? AbstractC0574f.m1725j(e0VarM1722g) : null;
        if (c0848cM1725j == null) {
            return null;
        }
        int i10 = (int) c0848cM1725j.f5354a;
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = (int) c0848cM1725j.f5355b;
        int i14 = iArr[1];
        int i15 = iArr2[1];
        return new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) c0848cM1725j.f5356c) + i11) - i12, (((int) c0848cM1725j.f5357d) + i14) - i15);
    }

    /* renamed from: c */
    public static final View m14683c(AbstractC7878q abstractC7878q) {
        C7672r c7672r = AbstractC7634f.m14563x(abstractC7878q.f37670a).f36856q;
        View interopView = c7672r != null ? c7672r.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    /* renamed from: d */
    public static final void m14684d(C7672r c7672r, g0 g0Var) {
        long jMo13299V = ((C7649u) g0Var.f36832K.f22539c).mo13299V(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo13299V >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo13299V & 4294967295L)));
        c7672r.layout(iRound, iRound2, c7672r.getMeasuredWidth() + iRound, c7672r.getMeasuredHeight() + iRound2);
    }
}
