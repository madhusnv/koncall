package p001o;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p001o.cc;
import p001o.db;
import p001o.e9j;
import p001o.r9j;

/* loaded from: classes2.dex */
public abstract class wvi {

    /* renamed from: a */
    public static WeakHashMap f52768a = null;

    /* renamed from: b */
    public static Field f52769b = null;

    /* renamed from: c */
    public static boolean f52770c = false;

    /* renamed from: d */
    public static final int[] f52771d = {u8e.accessibility_custom_action_0, u8e.accessibility_custom_action_1, u8e.accessibility_custom_action_2, u8e.accessibility_custom_action_3, u8e.accessibility_custom_action_4, u8e.accessibility_custom_action_5, u8e.accessibility_custom_action_6, u8e.accessibility_custom_action_7, u8e.accessibility_custom_action_8, u8e.accessibility_custom_action_9, u8e.accessibility_custom_action_10, u8e.accessibility_custom_action_11, u8e.accessibility_custom_action_12, u8e.accessibility_custom_action_13, u8e.accessibility_custom_action_14, u8e.accessibility_custom_action_15, u8e.accessibility_custom_action_16, u8e.accessibility_custom_action_17, u8e.accessibility_custom_action_18, u8e.accessibility_custom_action_19, u8e.accessibility_custom_action_20, u8e.accessibility_custom_action_21, u8e.accessibility_custom_action_22, u8e.accessibility_custom_action_23, u8e.accessibility_custom_action_24, u8e.accessibility_custom_action_25, u8e.accessibility_custom_action_26, u8e.accessibility_custom_action_27, u8e.accessibility_custom_action_28, u8e.accessibility_custom_action_29, u8e.accessibility_custom_action_30, u8e.accessibility_custom_action_31};

    /* renamed from: e */
    public static final dcc f52772e = new dcc() { // from class: o.vvi
        @Override // p001o.dcc
        /* renamed from: a */
        public final n24 mo4207a(n24 n24Var) {
            return wvi.m55108U(n24Var);
        }
    };

    /* renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC17975e f52773f = new ViewTreeObserverOnGlobalLayoutListenerC17975e();

    /* renamed from: o.wvi$a */
    public class C17971a extends AbstractC17976f {
        public C17971a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo55140c(View view) {
            return Boolean.valueOf(C17982l.m55222d(view));
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo55141d(View view, Boolean bool) {
            C17982l.m55228j(view, bool.booleanValue());
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo55142g(Boolean bool, Boolean bool2) {
            return !m55160a(bool, bool2);
        }
    }

    /* renamed from: o.wvi$b */
    public class C17972b extends AbstractC17976f {
        public C17972b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo55140c(View view) {
            return C17982l.m55220b(view);
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo55141d(View view, CharSequence charSequence) {
            C17982l.m55226h(view, charSequence);
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo55142g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: o.wvi$c */
    public class C17973c extends AbstractC17976f {
        public C17973c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo55140c(View view) {
            return C17984n.m55236b(view);
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo55141d(View view, CharSequence charSequence) {
            C17984n.m55240f(view, charSequence);
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo55142g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: o.wvi$d */
    public class C17974d extends AbstractC17976f {
        public C17974d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo55140c(View view) {
            return Boolean.valueOf(C17982l.m55221c(view));
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo55141d(View view, Boolean bool) {
            C17982l.m55225g(view, bool.booleanValue());
        }

        @Override // p001o.wvi.AbstractC17976f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo55142g(Boolean bool, Boolean bool2) {
            return !m55160a(bool, bool2);
        }
    }

    /* renamed from: o.wvi$e */
    public static class ViewTreeObserverOnGlobalLayoutListenerC17975e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final WeakHashMap f52774a = new WeakHashMap();

        /* renamed from: a */
        public void m55155a(View view) {
            this.f52774a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                m55157c(view);
            }
        }

        /* renamed from: b */
        public final void m55156b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z) {
                wvi.m55109V(view, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        /* renamed from: c */
        public final void m55157c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: d */
        public void m55158d(View view) {
            this.f52774a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m55159e(view);
        }

        /* renamed from: e */
        public final void m55159e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f52774a.entrySet().iterator();
                while (it.hasNext()) {
                    m55156b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m55157c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: o.wvi$f */
    public static abstract class AbstractC17976f {

        /* renamed from: a */
        public final int f52775a;

        /* renamed from: b */
        public final Class f52776b;

        /* renamed from: c */
        public final int f52777c;

        /* renamed from: d */
        public final int f52778d;

        public AbstractC17976f(int i, Class cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        public boolean m55160a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: b */
        public final boolean m55161b() {
            return Build.VERSION.SDK_INT >= this.f52777c;
        }

        /* renamed from: c */
        public abstract Object mo55140c(View view);

        /* renamed from: d */
        public abstract void mo55141d(View view, Object obj);

        /* renamed from: e */
        public Object m55162e(View view) {
            if (m55161b()) {
                return mo55140c(view);
            }
            Object tag = view.getTag(this.f52775a);
            if (this.f52776b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* renamed from: f */
        public void m55163f(View view, Object obj) {
            if (m55161b()) {
                mo55141d(view, obj);
            } else if (mo55142g(m55162e(view), obj)) {
                wvi.m55123j(view);
                view.setTag(this.f52775a, obj);
                wvi.m55109V(view, this.f52778d);
            }
        }

        /* renamed from: g */
        public abstract boolean mo55142g(Object obj, Object obj2);

        public AbstractC17976f(int i, Class cls, int i2, int i3) {
            this.f52775a = i;
            this.f52776b = cls;
            this.f52778d = i2;
            this.f52777c = i3;
        }
    }

    /* renamed from: o.wvi$g */
    public static class C17977g {
        /* renamed from: a */
        public static WindowInsets m55164a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m55165b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m55166c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: o.wvi$h */
    public static class C17978h {

        /* renamed from: o.wvi$h$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public r9j f52779a = null;

            /* renamed from: b */
            public final /* synthetic */ View f52780b;

            /* renamed from: c */
            public final /* synthetic */ cbc f52781c;

            public a(View view, cbc cbcVar) {
                this.f52780b = view;
                this.f52781c = cbcVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                r9j r9jVarM46385x = r9j.m46385x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C17978h.m55167a(windowInsets, this.f52780b);
                    if (r9jVarM46385x.equals(this.f52779a)) {
                        return this.f52781c.mo3830a(view, r9jVarM46385x).m46406v();
                    }
                }
                this.f52779a = r9jVarM46385x;
                r9j r9jVarMo3830a = this.f52781c.mo3830a(view, r9jVarM46385x);
                if (i >= 30) {
                    return r9jVarMo3830a.m46406v();
                }
                wvi.j0(view);
                return r9jVarMo3830a.m46406v();
            }
        }

        /* renamed from: a */
        public static void m55167a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(u8e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static r9j m55168b(View view, r9j r9jVar, Rect rect) {
            WindowInsets windowInsetsM46406v = r9jVar.m46406v();
            if (windowInsetsM46406v != null) {
                return r9j.m46385x(view.computeSystemWindowInsets(windowInsetsM46406v, rect), view);
            }
            rect.setEmpty();
            return r9jVar;
        }

        /* renamed from: c */
        public static boolean m55169c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        public static boolean m55170d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        public static boolean m55171e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m55172f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m55173g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m55174h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m55175i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static r9j m55176j(View view) {
            return r9j.C16564a.m46407a(view);
        }

        /* renamed from: k */
        public static String m55177k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m55178l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m55179m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m55180n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m55181o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m55182p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m55183q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m55184r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m55185s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        public static void m55186t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        public static void m55187u(View view, cbc cbcVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(u8e.tag_on_apply_window_listener, cbcVar);
            }
            if (cbcVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(u8e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, cbcVar));
            }
        }

        /* renamed from: v */
        public static void m55188v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m55189w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        public static void m55190x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        public static boolean m55191y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        public static void m55192z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: o.wvi$i */
    public static class C17979i {
        /* renamed from: a */
        public static r9j m55193a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            r9j r9jVarM46384w = r9j.m46384w(rootWindowInsets);
            r9jVarM46384w.m46404t(r9jVarM46384w);
            r9jVarM46384w.m46389d(view.getRootView());
            return r9jVarM46384w;
        }

        /* renamed from: b */
        public static int m55194b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        public static void m55195c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        public static void m55196d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: o.wvi$j */
    public static class C17980j {
        /* renamed from: a */
        public static void m55197a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        public static void m55198b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        public static void m55199c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        public static void m55200d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        public static boolean m55201e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        /* renamed from: f */
        public static void m55202f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: o.wvi$k */
    public static class C17981k {
        /* renamed from: a */
        public static void m55203a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        public static AutofillId m55204b(View view) {
            return view.getAutofillId();
        }

        /* renamed from: c */
        public static int m55205c(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: d */
        public static int m55206d(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: e */
        public static boolean m55207e(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: f */
        public static boolean m55208f(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: g */
        public static boolean m55209g(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: h */
        public static boolean m55210h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: i */
        public static View m55211i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: j */
        public static boolean m55212j(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: k */
        public static void m55213k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: l */
        public static void m55214l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: m */
        public static void m55215m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: n */
        public static void m55216n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: o */
        public static void m55217o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: p */
        public static void m55218p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: o.wvi$l */
    public static class C17982l {
        /* renamed from: a */
        public static void m55219a(View view, final InterfaceC17987q interfaceC17987q) {
            ktf ktfVar = (ktf) view.getTag(u8e.tag_unhandled_key_listeners);
            if (ktfVar == null) {
                ktfVar = new ktf();
                view.setTag(u8e.tag_unhandled_key_listeners, ktfVar);
            }
            Objects.requireNonNull(interfaceC17987q);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(interfaceC17987q) { // from class: o.xvi
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            ktfVar.put(interfaceC17987q, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: b */
        public static CharSequence m55220b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        public static boolean m55221c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        public static boolean m55222d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        public static void m55223e(View view, InterfaceC17987q interfaceC17987q) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            ktf ktfVar = (ktf) view.getTag(u8e.tag_unhandled_key_listeners);
            if (ktfVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) ktfVar.get(interfaceC17987q)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: f */
        public static <T> T m55224f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        /* renamed from: g */
        public static void m55225g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        public static void m55226h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m55227i(View view, r61 r61Var) {
            view.setAutofillId(null);
        }

        /* renamed from: j */
        public static void m55228j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: o.wvi$m */
    public static class C17983m {
        /* renamed from: a */
        public static View.AccessibilityDelegate m55229a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        public static ContentCaptureSession m55230b(View view) {
            return view.getContentCaptureSession();
        }

        /* renamed from: c */
        public static List<Rect> m55231c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: d */
        public static void m55232d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: e */
        public static void m55233e(View view, q14 q14Var) {
            view.setContentCaptureSession(null);
        }

        /* renamed from: f */
        public static void m55234f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: o.wvi$n */
    public static class C17984n {
        /* renamed from: a */
        public static int m55235a(View view) {
            return view.getImportantForContentCapture();
        }

        /* renamed from: b */
        public static CharSequence m55236b(View view) {
            return view.getStateDescription();
        }

        /* renamed from: c */
        public static oaj m55237c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return oaj.m41885g(windowInsetsController);
            }
            return null;
        }

        /* renamed from: d */
        public static boolean m55238d(View view) {
            return view.isImportantForContentCapture();
        }

        /* renamed from: e */
        public static void m55239e(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        /* renamed from: f */
        public static void m55240f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: o.wvi$o */
    public static final class C17985o {
        /* renamed from: a */
        public static String[] m55241a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static n24 m55242b(View view, n24 n24Var) {
            ContentInfo contentInfoM40011f = n24Var.m40011f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM40011f);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoM40011f ? n24Var : n24.m40007g(contentInfoPerformReceiveContent);
        }

        /* renamed from: c */
        public static void m55243c(View view, String[] strArr, ccc cccVar) {
            if (cccVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC17986p(cccVar));
            }
        }
    }

    /* renamed from: o.wvi$p */
    public static final class OnReceiveContentListenerC17986p implements OnReceiveContentListener {

        /* renamed from: a */
        public final ccc f52782a;

        public OnReceiveContentListenerC17986p(ccc cccVar) {
            this.f52782a = cccVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            n24 n24VarM40007g = n24.m40007g(contentInfo);
            n24 n24VarMo20848a = this.f52782a.mo20848a(view, n24VarM40007g);
            if (n24VarMo20848a == null) {
                return null;
            }
            return n24VarMo20848a == n24VarM40007g ? contentInfo : n24VarMo20848a.m40011f();
        }
    }

    /* renamed from: o.wvi$q */
    public interface InterfaceC17987q {
    }

    /* renamed from: o.wvi$r */
    public static class C17988r {

        /* renamed from: d */
        public static final ArrayList f52783d = new ArrayList();

        /* renamed from: a */
        public WeakHashMap f52784a = null;

        /* renamed from: b */
        public SparseArray f52785b = null;

        /* renamed from: c */
        public WeakReference f52786c = null;

        /* renamed from: a */
        public static C17988r m55244a(View view) {
            C17988r c17988r = (C17988r) view.getTag(u8e.tag_unhandled_key_event_manager);
            if (c17988r != null) {
                return c17988r;
            }
            C17988r c17988r2 = new C17988r();
            view.setTag(u8e.tag_unhandled_key_event_manager, c17988r2);
            return c17988r2;
        }

        /* renamed from: b */
        public boolean m55245b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m55250g();
            }
            View viewM55246c = m55246c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM55246c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m55247d().put(keyCode, new WeakReference(viewM55246c));
                }
            }
            return viewM55246c != null;
        }

        /* renamed from: c */
        public final View m55246c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f52784a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM55246c = m55246c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM55246c != null) {
                            return viewM55246c;
                        }
                    }
                }
                if (m55248e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray m55247d() {
            if (this.f52785b == null) {
                this.f52785b = new SparseArray();
            }
            return this.f52785b;
        }

        /* renamed from: e */
        public final boolean m55248e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(u8e.tag_unhandled_key_listeners);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            tq.m50332a(arrayList.get(size));
            throw null;
        }

        /* renamed from: f */
        public boolean m55249f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f52786c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f52786c = new WeakReference(keyEvent);
            SparseArray sparseArrayM55247d = m55247d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayM55247d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayM55247d.valueAt(iIndexOfKey);
                sparseArrayM55247d.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayM55247d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                m55248e(view, keyEvent);
            }
            return true;
        }

        /* renamed from: g */
        public final void m55250g() {
            WeakHashMap weakHashMap = this.f52784a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f52783d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f52784a == null) {
                    this.f52784a = new WeakHashMap();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList arrayList2 = f52783d;
                    View view = (View) ((WeakReference) arrayList2.get(size)).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f52784a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f52784a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public static int m55088A(View view) {
        return view.getMinimumHeight();
    }

    public static void A0(View view, int i, int i2) {
        C17979i.m55196d(view, i, i2);
    }

    /* renamed from: B */
    public static int m55089B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, CharSequence charSequence) {
        G0().m55163f(view, charSequence);
    }

    /* renamed from: C */
    public static String[] m55090C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? C17985o.m55241a(view) : (String[]) view.getTag(u8e.tag_on_receive_content_mime_types);
    }

    public static void C0(View view, String str) {
        C17978h.m55188v(view, str);
    }

    /* renamed from: D */
    public static int m55091D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, float f) {
        C17978h.m55189w(view, f);
    }

    /* renamed from: E */
    public static int m55092E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, e9j.AbstractC13133b abstractC13133b) {
        e9j.m24610d(view, abstractC13133b);
    }

    /* renamed from: F */
    public static ViewParent m55093F(View view) {
        return view.getParentForAccessibility();
    }

    public static void F0(View view, float f) {
        C17978h.m55190x(view, f);
    }

    /* renamed from: G */
    public static r9j m55094G(View view) {
        return C17979i.m55193a(view);
    }

    public static AbstractC17976f G0() {
        return new C17973c(u8e.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: H */
    public static CharSequence m55095H(View view) {
        return (CharSequence) G0().m55162e(view);
    }

    public static void H0(View view) {
        C17978h.m55192z(view);
    }

    /* renamed from: I */
    public static String m55096I(View view) {
        return C17978h.m55177k(view);
    }

    /* renamed from: J */
    public static float m55097J(View view) {
        return C17978h.m55178l(view);
    }

    /* renamed from: K */
    public static oaj m55098K(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C17984n.m55237c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return w8j.m54105a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: L */
    public static int m55099L(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: M */
    public static float m55100M(View view) {
        return C17978h.m55179m(view);
    }

    /* renamed from: N */
    public static boolean m55101N(View view) {
        return m55126m(view) != null;
    }

    /* renamed from: O */
    public static boolean m55102O(View view) {
        return view.hasTransientState();
    }

    /* renamed from: P */
    public static boolean m55103P(View view) {
        Boolean bool = (Boolean) m55115b().m55162e(view);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: Q */
    public static boolean m55104Q(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: R */
    public static boolean m55105R(View view) {
        return view.isLaidOut();
    }

    /* renamed from: S */
    public static boolean m55106S(View view) {
        return C17978h.m55182p(view);
    }

    /* renamed from: T */
    public static boolean m55107T(View view) {
        Boolean bool = (Boolean) l0().m55162e(view);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: U */
    public static /* synthetic */ n24 m55108U(n24 n24Var) {
        return n24Var;
    }

    /* renamed from: V */
    public static void m55109V(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m55128o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m55128o(view));
                    u0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(view.getParent().getClass().getSimpleName());
                        sb.append(" does not fully implement ViewParent");
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m55128o(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* renamed from: W */
    public static void m55110W(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: X */
    public static void m55111X(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: Y */
    public static r9j m55112Y(View view, r9j r9jVar) {
        WindowInsets windowInsetsM46406v = r9jVar.m46406v();
        if (windowInsetsM46406v != null) {
            WindowInsets windowInsetsM55165b = C17977g.m55165b(view, windowInsetsM46406v);
            if (!windowInsetsM55165b.equals(windowInsetsM46406v)) {
                return r9j.m46385x(windowInsetsM55165b, view);
            }
        }
        return r9jVar;
    }

    /* renamed from: Z */
    public static void m55113Z(View view, cc ccVar) {
        view.onInitializeAccessibilityNodeInfo(ccVar.c1());
    }

    public static AbstractC17976f a0() {
        return new C17972b(u8e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: b */
    public static AbstractC17976f m55115b() {
        return new C17974d(u8e.tag_accessibility_heading, Boolean.class, 28);
    }

    public static boolean b0(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* renamed from: c */
    public static int m55116c(View view, CharSequence charSequence, jc jcVar) {
        int iM55130q = m55130q(view, charSequence);
        if (iM55130q != -1) {
            m55117d(view, new cc.C12624a(iM55130q, charSequence, jcVar));
        }
        return iM55130q;
    }

    public static n24 c0(View view, n24 n24Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(n24Var);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C17985o.m55242b(view, n24Var);
        }
        ccc cccVar = (ccc) view.getTag(u8e.tag_on_receive_content_listener);
        if (cccVar == null) {
            return m55135v(view).mo4207a(n24Var);
        }
        n24 n24VarMo20848a = cccVar.mo20848a(view, n24Var);
        if (n24VarMo20848a == null) {
            return null;
        }
        return m55135v(view).mo4207a(n24VarMo20848a);
    }

    /* renamed from: d */
    public static void m55117d(View view, cc.C12624a c12624a) {
        m55123j(view);
        h0(c12624a.m20802b(), view);
        m55129p(view).add(c12624a);
        m55109V(view, 0);
    }

    public static void d0(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: e */
    public static xyi m55118e(View view) {
        if (f52768a == null) {
            f52768a = new WeakHashMap();
        }
        xyi xyiVar = (xyi) f52768a.get(view);
        if (xyiVar != null) {
            return xyiVar;
        }
        xyi xyiVar2 = new xyi(view);
        f52768a.put(view, xyiVar2);
        return xyiVar2;
    }

    public static void e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: f */
    public static r9j m55119f(View view, r9j r9jVar, Rect rect) {
        return C17978h.m55168b(view, r9jVar, rect);
    }

    public static void f0(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: g */
    public static r9j m55120g(View view, r9j r9jVar) {
        WindowInsets windowInsetsM46406v = r9jVar.m46406v();
        if (windowInsetsM46406v != null) {
            WindowInsets windowInsetsM55164a = C17977g.m55164a(view, windowInsetsM46406v);
            if (!windowInsetsM55164a.equals(windowInsetsM46406v)) {
                return r9j.m46385x(windowInsetsM55164a, view);
            }
        }
        return r9jVar;
    }

    public static void g0(View view, int i) {
        h0(i, view);
        m55109V(view, 0);
    }

    /* renamed from: h */
    public static boolean m55121h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C17988r.m55244a(view).m55245b(view, keyEvent);
    }

    public static void h0(int i, View view) {
        List listM55129p = m55129p(view);
        for (int i2 = 0; i2 < listM55129p.size(); i2++) {
            if (((cc.C12624a) listM55129p.get(i2)).m20802b() == i) {
                listM55129p.remove(i2);
                return;
            }
        }
    }

    /* renamed from: i */
    public static boolean m55122i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C17988r.m55244a(view).m55249f(keyEvent);
    }

    public static void i0(View view, cc.C12624a c12624a, CharSequence charSequence, jc jcVar) {
        if (jcVar == null && charSequence == null) {
            g0(view, c12624a.m20802b());
        } else {
            m55117d(view, c12624a.m20801a(charSequence, jcVar));
        }
    }

    /* renamed from: j */
    public static void m55123j(View view) {
        db dbVarM55125l = m55125l(view);
        if (dbVarM55125l == null) {
            dbVarM55125l = new db();
        }
        m0(view, dbVarM55125l);
    }

    public static void j0(View view) {
        C17977g.m55166c(view);
    }

    /* renamed from: k */
    public static int m55124k() {
        return View.generateViewId();
    }

    public static void k0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C17983m.m55232d(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: l */
    public static db m55125l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM55126m = m55126m(view);
        if (accessibilityDelegateM55126m == null) {
            return null;
        }
        return accessibilityDelegateM55126m instanceof db.C12855a ? ((db.C12855a) accessibilityDelegateM55126m).f19502a : new db(accessibilityDelegateM55126m);
    }

    public static AbstractC17976f l0() {
        return new C17971a(u8e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: m */
    public static View.AccessibilityDelegate m55126m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? C17983m.m55229a(view) : m55127n(view);
    }

    public static void m0(View view, db dbVar) {
        if (dbVar == null && (m55126m(view) instanceof db.C12855a)) {
            dbVar = new db();
        }
        u0(view);
        view.setAccessibilityDelegate(dbVar == null ? null : dbVar.m22712d());
    }

    /* renamed from: n */
    public static View.AccessibilityDelegate m55127n(View view) {
        if (f52770c) {
            return null;
        }
        if (f52769b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f52769b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f52770c = true;
                return null;
            }
        }
        try {
            Object obj = f52769b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f52770c = true;
            return null;
        }
    }

    public static void n0(View view, boolean z) {
        m55115b().m55163f(view, Boolean.valueOf(z));
    }

    /* renamed from: o */
    public static CharSequence m55128o(View view) {
        return (CharSequence) a0().m55162e(view);
    }

    public static void o0(View view, CharSequence charSequence) {
        a0().m55163f(view, charSequence);
        if (charSequence != null) {
            f52773f.m55155a(view);
        } else {
            f52773f.m55158d(view);
        }
    }

    /* renamed from: p */
    public static List m55129p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(u8e.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(u8e.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: q */
    public static int m55130q(View view, CharSequence charSequence) {
        List listM55129p = m55129p(view);
        for (int i = 0; i < listM55129p.size(); i++) {
            if (TextUtils.equals(charSequence, ((cc.C12624a) listM55129p.get(i)).m20803c())) {
                return ((cc.C12624a) listM55129p.get(i)).m20802b();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f52771d;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < listM55129p.size(); i5++) {
                z &= ((cc.C12624a) listM55129p.get(i5)).m20802b() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    public static void q0(View view, ColorStateList colorStateList) {
        C17978h.m55183q(view, colorStateList);
    }

    /* renamed from: r */
    public static ColorStateList m55131r(View view) {
        return C17978h.m55173g(view);
    }

    public static void r0(View view, PorterDuff.Mode mode) {
        C17978h.m55184r(view, mode);
    }

    /* renamed from: s */
    public static PorterDuff.Mode m55132s(View view) {
        return C17978h.m55174h(view);
    }

    public static void s0(View view, float f) {
        C17978h.m55185s(view, f);
    }

    /* renamed from: t */
    public static Display m55133t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: u */
    public static float m55134u(View view) {
        return C17978h.m55175i(view);
    }

    public static void u0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public static dcc m55135v(View view) {
        return view instanceof dcc ? (dcc) view : f52772e;
    }

    public static void v0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17981k.m55215m(view, i);
        }
    }

    /* renamed from: w */
    public static boolean m55136w(View view) {
        return view.getFitsSystemWindows();
    }

    public static void w0(View view, boolean z) {
        C17978h.m55186t(view, z);
    }

    /* renamed from: x */
    public static int m55137x(View view) {
        return view.getImportantForAccessibility();
    }

    public static void x0(View view, cbc cbcVar) {
        C17978h.m55187u(view, cbcVar);
    }

    /* renamed from: y */
    public static int m55138y(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17981k.m55205c(view);
        }
        return 0;
    }

    public static void y0(View view, rcd rcdVar) {
        C17980j.m55200d(view, (PointerIcon) (rcdVar != null ? rcdVar.m46526a() : null));
    }

    /* renamed from: z */
    public static int m55139z(View view) {
        return view.getLayoutDirection();
    }

    public static void z0(View view, boolean z) {
        l0().m55163f(view, Boolean.valueOf(z));
    }
}
