package c6;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.datastore.preferences.protobuf.AbstractC0315j;
import com.websoptimization.callyzerbiz.R;
import d6.C1613c;
import d6.InterfaceC1627q;
import g6.C2535j;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p013o.AbstractC5234t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a */
    public static Field f5527a = null;

    /* renamed from: b */
    public static boolean f5528b = false;

    /* renamed from: c */
    public static final int[] f5529c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: d */
    public static final h0 f5530d = new h0();

    /* renamed from: e */
    public static final j0 f5531e = new j0();

    /* renamed from: a */
    public static void m2519a(View view, y1 y1Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsM2539c = y1Var.m2539c();
        if (windowInsetsM2539c != null) {
            WindowInsets windowInsetsM2510a = i10 >= 30 ? s0.m2510a(view, windowInsetsM2539c) : l0.m2442a(view, windowInsetsM2539c);
            if (windowInsetsM2510a.equals(windowInsetsM2539c)) {
                return;
            }
            y1.m2537d(view, windowInsetsM2510a);
        }
    }

    /* renamed from: b */
    public static View.AccessibilityDelegate m2520b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r0.m2498a(view);
        }
        if (f5528b) {
            return null;
        }
        if (f5527a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5527a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5528b = true;
                return null;
            }
        }
        try {
            Object obj = f5527a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5528b = true;
            return null;
        }
    }

    /* renamed from: c */
    public static ArrayList m2521c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: d */
    public static String[] m2522d(AbstractC5234t abstractC5234t) {
        return Build.VERSION.SDK_INT >= 31 ? t0.m2515a(abstractC5234t) : (String[]) abstractC5234t.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: e */
    public static void m2523e(int i10, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequenceM2488a = null;
            if (i11 >= 28) {
                tag = q0.m2488a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z6 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : NewHope.SENDB_BYTES);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z6) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i11 >= 28) {
                        charSequenceM2488a = q0.m2488a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequenceM2488a = tag2;
                        }
                    }
                    text.add(charSequenceM2488a);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i11 >= 28) {
                charSequenceM2488a = q0.m2488a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequenceM2488a = tag3;
                }
            }
            text2.add(charSequenceM2488a);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static C0877g m2524f(View view, C0877g c0877g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0877g);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.m2516b(view, c0877g);
        }
        C2535j c2535j = (C2535j) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0894x interfaceC0894x = f5530d;
        if (c2535j == null) {
            if (view instanceof InterfaceC0894x) {
                interfaceC0894x = (InterfaceC0894x) view;
            }
            return interfaceC0894x.mo2388a(c0877g);
        }
        C0877g c0877gM6561a = C2535j.m6561a(view, c0877g);
        if (c0877gM6561a == null) {
            return null;
        }
        if (view instanceof InterfaceC0894x) {
            interfaceC0894x = (InterfaceC0894x) view;
        }
        return interfaceC0894x.mo2388a(c0877gM6561a);
    }

    /* renamed from: g */
    public static void m2525g(int i10, View view) {
        ArrayList arrayListM2521c = m2521c(view);
        for (int i11 = 0; i11 < arrayListM2521c.size(); i11++) {
            if (((C1613c) arrayListM2521c.get(i11)).m5264a() == i10) {
                arrayListM2521c.remove(i11);
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m2526h(View view, C1613c c1613c, InterfaceC1627q interfaceC1627q) {
        C1613c c1613c2 = new C1613c(null, c1613c.f8056b, null, interfaceC1627q, c1613c.f8057c);
        View.AccessibilityDelegate accessibilityDelegateM2520b = m2520b(view);
        C0872b c0872b = accessibilityDelegateM2520b == null ? null : accessibilityDelegateM2520b instanceof C0871a ? ((C0871a) accessibilityDelegateM2520b).f5417a : new C0872b(accessibilityDelegateM2520b);
        if (c0872b == null) {
            c0872b = new C0872b();
        }
        m2528j(view, c0872b);
        m2525g(c1613c2.m5264a(), view);
        m2521c(view).add(c1613c2);
        m2523e(0, view);
    }

    /* renamed from: i */
    public static void m2527i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            r0.m2499b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    /* renamed from: j */
    public static void m2528j(View view, C0872b c0872b) {
        if (c0872b == null && (m2520b(view) instanceof C0871a)) {
            c0872b = new C0872b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0872b == null ? null : c0872b.f5423b);
    }

    /* renamed from: k */
    public static void m2529k(View view, CharSequence charSequence) {
        new i0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).m2435i(view, charSequence);
        j0 j0Var = f5531e;
        if (charSequence == null) {
            j0Var.f5470a.remove(view);
            view.removeOnAttachStateChangeListener(j0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(j0Var);
        } else {
            j0Var.f5470a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(j0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(j0Var);
            }
        }
    }

    /* renamed from: l */
    public static void m2530l(View view, AbstractC0315j abstractC0315j) {
        if (Build.VERSION.SDK_INT >= 30) {
            g1.m2384f(view, abstractC0315j);
            return;
        }
        PathInterpolator pathInterpolator = d1.f5436d;
        View.OnApplyWindowInsetsListener c1Var = abstractC0315j != null ? new c1(view, abstractC0315j) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, c1Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(c1Var);
        }
    }
}
