package c6;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.websoptimization.callyzerbiz.R;
import d6.C1613c;
import d6.C1617g;
import d6.InterfaceC1627q;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.b */
/* loaded from: classes.dex */
public class C0872b {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f5421c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f5422a;

    /* renamed from: b */
    public final C0871a f5423b;

    public C0872b() {
        this(f5421c);
    }

    /* renamed from: a */
    public boolean mo2335a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5422a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C8989c mo2336b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f5422a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C8989c(8, accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo2337c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5422a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo2338d(View view, C1617g c1617g) {
        this.f5422a.onInitializeAccessibilityNodeInfo(view, c1617g.f8062a);
    }

    /* renamed from: e */
    public void mo2339e(View view, AccessibilityEvent accessibilityEvent) {
        this.f5422a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo2340f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5422a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo2341g(View view, int i10, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z6 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            C1613c c1613c = (C1613c) list.get(i11);
            if (c1613c.m5264a() == i10) {
                Class cls = c1613c.f8057c;
                InterfaceC1627q interfaceC1627q = c1613c.f8058d;
                if (interfaceC1627q != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception unused) {
                        }
                    }
                    zPerformAccessibilityAction = interfaceC1627q.mo5301c(view);
                }
            } else {
                i11++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f5422a.performAccessibilityAction(view, i10, bundle);
        }
        if (zPerformAccessibilityAction || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i13 = 0;
            while (true) {
                if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z6 = true;
                    break;
                }
                i13++;
            }
        }
        return z6;
    }

    /* renamed from: h */
    public void mo2342h(View view, int i10) {
        this.f5422a.sendAccessibilityEvent(view, i10);
    }

    /* renamed from: i */
    public void mo2343i(View view, AccessibilityEvent accessibilityEvent) {
        this.f5422a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0872b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5422a = accessibilityDelegate;
        this.f5423b = new C0871a(this);
    }
}
