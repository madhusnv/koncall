package p001o;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
public abstract class oed {

    /* renamed from: o.oed$a */
    public static class C15780a {
        /* renamed from: a */
        public static boolean m42136a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        public static int m42137b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        public static void m42138c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        public static void m42139d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m42133a(PopupWindow popupWindow, boolean z) {
        C15780a.m42138c(popupWindow, z);
    }

    /* renamed from: b */
    public static void m42134b(PopupWindow popupWindow, int i) {
        C15780a.m42139d(popupWindow, i);
    }

    /* renamed from: c */
    public static void m42135c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
