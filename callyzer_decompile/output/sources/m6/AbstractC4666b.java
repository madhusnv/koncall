package m6;

import al.C0174b;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import bl.C0689a;
import c6.C0872b;
import c6.v0;
import com.google.android.material.chip.Chip;
import com.skydoves.balloon.internals.DefinitionKt;
import d6.C1617g;
import hh.C2926c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m6.b */
/* loaded from: classes.dex */
public abstract class AbstractC4666b extends C0872b {

    /* renamed from: n */
    public static final Rect f23065n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C0174b f23066o = new C0174b(20);

    /* renamed from: p */
    public static final C0689a f23067p = new C0689a(20);

    /* renamed from: h */
    public final AccessibilityManager f23072h;

    /* renamed from: i */
    public final Chip f23073i;

    /* renamed from: j */
    public C4665a f23074j;

    /* renamed from: d */
    public final Rect f23068d = new Rect();

    /* renamed from: e */
    public final Rect f23069e = new Rect();

    /* renamed from: f */
    public final Rect f23070f = new Rect();

    /* renamed from: g */
    public final int[] f23071g = new int[2];

    /* renamed from: k */
    public int f23075k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f23076l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f23077m = Integer.MIN_VALUE;

    public AbstractC4666b(Chip chip) {
        this.f23073i = chip;
        this.f23072h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        Field field = v0.f5527a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    /* renamed from: s */
    private void m9547s(int i10) {
        int i11 = this.f23077m;
        if (i11 == i10) {
            return;
        }
        this.f23077m = i10;
        m9554r(i10, 128);
        m9554r(i11, 256);
    }

    @Override // c6.C0872b
    /* renamed from: b */
    public final C8989c mo2336b(View view) {
        if (this.f23074j == null) {
            this.f23074j = new C4665a(this, 0);
        }
        return this.f23074j;
    }

    @Override // c6.C0872b
    /* renamed from: d */
    public final void mo2338d(View view, C1617g c1617g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
        this.f5422a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C2926c) this).f15958q;
        accessibilityNodeInfo.setCheckable(chip.m4081e());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        if (chip.m4081e() || chip.isClickable()) {
            c1617g.m5292k(chip.m4081e() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            c1617g.m5292k("android.view.View");
        }
        c1617g.m5300s(chip.getText());
    }

    /* renamed from: j */
    public final boolean m9548j(int i10) {
        if (this.f23076l != i10) {
            return false;
        }
        this.f23076l = Integer.MIN_VALUE;
        C2926c c2926c = (C2926c) this;
        if (i10 == 1) {
            Chip chip = c2926c.f15958q;
            chip.f6819n = false;
            chip.refreshDrawableState();
        }
        m9554r(i10, 8);
        return true;
    }

    /* renamed from: k */
    public final C1617g m9549k(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C1617g c1617g = new C1617g(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c1617g.m5292k("android.view.View");
        Rect rect = f23065n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        c1617g.f8063b = -1;
        Chip chip = this.f23073i;
        accessibilityNodeInfoObtain.setParent(chip);
        mo7032p(i10, c1617g);
        if (c1617g.m5288g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f23069e;
        c1617g.m5287f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c1617g.f8064c = i10;
        accessibilityNodeInfoObtain.setSource(chip, i10);
        if (this.f23075k == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c1617g.m5283a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c1617g.m5283a(64);
        }
        boolean z6 = this.f23076l == i10;
        if (z6) {
            c1617g.m5283a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c1617g.m5283a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z6);
        int[] iArr = this.f23071g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f23068d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c1617g.m5287f(rect3);
            if (c1617g.f8063b != -1) {
                C1617g c1617g2 = new C1617g(AccessibilityNodeInfo.obtain());
                for (int i11 = c1617g.f8063b; i11 != -1; i11 = c1617g2.f8063b) {
                    c1617g2.f8063b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c1617g2.f8062a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo7032p(i11, c1617g2);
                    c1617g2.m5287f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f23070f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1617g.f8062a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= DefinitionKt.NO_Float_VALUE || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c1617g;
    }

    /* renamed from: l */
    public final boolean m9550l(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.f23072h;
        int i10 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x3 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Rect rect = Chip.f6808x;
                Chip chip = ((C2926c) this).f15958q;
                if (chip.m4080d() && chip.getCloseIconTouchBounds().contains(x3, y10)) {
                    i10 = 1;
                }
                m9547s(i10);
                return true;
            }
            if (action == 10 && this.f23077m != Integer.MIN_VALUE) {
                m9547s(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public abstract void mo7031m(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9551n(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.AbstractC4666b.m9551n(int, android.graphics.Rect):boolean");
    }

    /* renamed from: o */
    public final C1617g m9552o(int i10) {
        if (i10 != -1) {
            return m9549k(i10);
        }
        Chip chip = this.f23073i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C1617g c1617g = new C1617g(accessibilityNodeInfoObtain);
        Field field = v0.f5527a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo7031m(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c1617g.f8062a.addChild(chip, ((Integer) arrayList.get(i11)).intValue());
        }
        return c1617g;
    }

    /* renamed from: p */
    public abstract void mo7032p(int i10, C1617g c1617g);

    /* renamed from: q */
    public final boolean m9553q(int i10) {
        int i11;
        Chip chip = this.f23073i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i11 = this.f23076l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m9548j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f23076l = i10;
        C2926c c2926c = (C2926c) this;
        if (i10 == 1) {
            Chip chip2 = c2926c.f15958q;
            chip2.f6819n = true;
            chip2.refreshDrawableState();
        }
        m9554r(i10, 8);
        return true;
    }

    /* renamed from: r */
    public final void m9554r(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i10 == Integer.MIN_VALUE || !this.f23072h.isEnabled() || (parent = (view = this.f23073i).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            C1617g c1617gM9552o = m9552o(i10);
            accessibilityEventObtain.getText().add(c1617gM9552o.m5288g());
            AccessibilityNodeInfo accessibilityNodeInfo = c1617gM9552o.f8062a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i10);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
