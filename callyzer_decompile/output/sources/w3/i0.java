package w3;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import d4.AbstractC1592t;
import d4.C1573a;
import d4.C1582j;
import e1.AbstractC1910l;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import y2.EnumC8531a;
import y2.ViewOnAttachStateChangeListenerC8534d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements ViewTranslationCallback {

    /* renamed from: a */
    public static final i0 f37807a = new i0();

    public final boolean onClearTranslation(View view) {
        InterfaceC2137a interfaceC2137a;
        AbstractC4154l.m8921d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC8534d contentCaptureManager$ui_release = ((C7904v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f41467f = EnumC8531a.SHOW_ORIGINAL;
        AbstractC1910l abstractC1910lM15800c = contentCaptureManager$ui_release.m15800c();
        Object[] objArr = abstractC1910lM15800c.f9012c;
        long[] jArr = abstractC1910lM15800c.f9010a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        e1.j0 j0Var = ((o2) objArr[(i10 << 3) + i12]).f37907a.f7879d.f7868a;
                        Object objM5574g = j0Var.m5574g(AbstractC1592t.f7905B);
                        if (objM5574g == null) {
                            objM5574g = null;
                        }
                        if (objM5574g != null) {
                            Object objM5574g2 = j0Var.m5574g(C1582j.f7854m);
                            C1573a c1573a = (C1573a) (objM5574g2 != null ? objM5574g2 : null);
                            if (c1573a != null && (interfaceC2137a = (InterfaceC2137a) c1573a.f7826b) != null) {
                            }
                        }
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onHideTranslation(View view) {
        InterfaceC2139c interfaceC2139c;
        AbstractC4154l.m8921d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC8534d contentCaptureManager$ui_release = ((C7904v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f41467f = EnumC8531a.SHOW_ORIGINAL;
        AbstractC1910l abstractC1910lM15800c = contentCaptureManager$ui_release.m15800c();
        Object[] objArr = abstractC1910lM15800c.f9012c;
        long[] jArr = abstractC1910lM15800c.f9010a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        e1.j0 j0Var = ((o2) objArr[(i10 << 3) + i12]).f37907a.f7879d.f7868a;
                        Object objM5574g = j0Var.m5574g(AbstractC1592t.f7905B);
                        if (objM5574g == null) {
                            objM5574g = null;
                        }
                        if (AbstractC4154l.m8918a(objM5574g, Boolean.TRUE)) {
                            Object objM5574g2 = j0Var.m5574g(C1582j.f7853l);
                            C1573a c1573a = (C1573a) (objM5574g2 != null ? objM5574g2 : null);
                            if (c1573a != null && (interfaceC2139c = (InterfaceC2139c) c1573a.f7826b) != null) {
                            }
                        }
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean onShowTranslation(View view) {
        InterfaceC2139c interfaceC2139c;
        AbstractC4154l.m8921d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC8534d contentCaptureManager$ui_release = ((C7904v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f41467f = EnumC8531a.SHOW_TRANSLATED;
        AbstractC1910l abstractC1910lM15800c = contentCaptureManager$ui_release.m15800c();
        Object[] objArr = abstractC1910lM15800c.f9012c;
        long[] jArr = abstractC1910lM15800c.f9010a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        e1.j0 j0Var = ((o2) objArr[(i10 << 3) + i12]).f37907a.f7879d.f7868a;
                        Object objM5574g = j0Var.m5574g(AbstractC1592t.f7905B);
                        if (objM5574g == null) {
                            objM5574g = null;
                        }
                        if (AbstractC4154l.m8918a(objM5574g, Boolean.FALSE)) {
                            Object objM5574g2 = j0Var.m5574g(C1582j.f7853l);
                            C1573a c1573a = (C1573a) (objM5574g2 != null ? objM5574g2 : null);
                            if (c1573a != null && (interfaceC2139c = (InterfaceC2139c) c1573a.f7826b) != null) {
                            }
                        }
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
