package d6;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import c6.e0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d6.c */
/* loaded from: classes.dex */
public final class C1613c {

    /* renamed from: e */
    public static final C1613c f8043e;

    /* renamed from: f */
    public static final C1613c f8044f;

    /* renamed from: g */
    public static final C1613c f8045g;

    /* renamed from: h */
    public static final C1613c f8046h;

    /* renamed from: i */
    public static final C1613c f8047i;

    /* renamed from: j */
    public static final C1613c f8048j;

    /* renamed from: k */
    public static final C1613c f8049k;

    /* renamed from: l */
    public static final C1613c f8050l;

    /* renamed from: m */
    public static final C1613c f8051m;

    /* renamed from: n */
    public static final C1613c f8052n;

    /* renamed from: o */
    public static final C1613c f8053o;

    /* renamed from: p */
    public static final C1613c f8054p;

    /* renamed from: a */
    public final Object f8055a;

    /* renamed from: b */
    public final int f8056b;

    /* renamed from: c */
    public final Class f8057c;

    /* renamed from: d */
    public final InterfaceC1627q f8058d;

    static {
        new C1613c(1, (String) null);
        new C1613c(2, (String) null);
        new C1613c(4, (String) null);
        new C1613c(8, (String) null);
        f8043e = new C1613c(16, (String) null);
        new C1613c(32, (String) null);
        f8044f = new C1613c(64, (String) null);
        f8045g = new C1613c(128, (String) null);
        new C1613c(AbstractC1620j.class, 256);
        new C1613c(AbstractC1620j.class, 512);
        new C1613c(AbstractC1621k.class, 1024);
        new C1613c(AbstractC1621k.class, NewHope.SENDB_BYTES);
        f8046h = new C1613c(4096, (String) null);
        f8047i = new C1613c(8192, (String) null);
        new C1613c(16384, (String) null);
        new C1613c(32768, (String) null);
        new C1613c(65536, (String) null);
        new C1613c(AbstractC1625o.class, 131072);
        f8048j = new C1613c(262144, (String) null);
        f8049k = new C1613c(524288, (String) null);
        f8050l = new C1613c(1048576, (String) null);
        new C1613c(AbstractC1626p.class, 2097152);
        int i10 = Build.VERSION.SDK_INT;
        new C1613c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C1613c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC1623m.class);
        f8051m = new C1613c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f8052n = new C1613c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f8053o = new C1613c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f8054p = new C1613c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C1613c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C1613c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C1613c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C1613c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C1613c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C1613c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC1624n.class);
        new C1613c(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC1622l.class);
        new C1613c(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C1613c(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C1613c(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C1613c(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C1613c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C1613c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C1613c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C1613c(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C1613c(i10 >= 34 ? e0.m2359f() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C1613c(int i10, String str) {
        this(null, i10, str, null, null);
    }

    /* renamed from: a */
    public final int m5264a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f8055a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1613c)) {
            return false;
        }
        Object obj2 = ((C1613c) obj).f8055a;
        Object obj3 = this.f8055a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f8055a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strM5282d = C1617g.m5282d(this.f8056b);
        if (strM5282d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f8055a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM5282d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strM5282d);
        return sb2.toString();
    }

    public C1613c(Class cls, int i10) {
        this(null, i10, null, null, cls);
    }

    public C1613c(Object obj, int i10, CharSequence charSequence, InterfaceC1627q interfaceC1627q, Class cls) {
        this.f8056b = i10;
        this.f8058d = interfaceC1627q;
        if (obj == null) {
            this.f8055a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f8055a = obj;
        }
        this.f8057c = cls;
    }
}
