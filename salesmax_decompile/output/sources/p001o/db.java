package p001o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p001o.cc;

/* loaded from: classes2.dex */
public class db {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f19499c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f19500a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f19501b;

    /* renamed from: o.db$a */
    public static final class C12855a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final db f19502a;

        public C12855a(db dbVar) {
            this.f19502a = dbVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f19502a.mo6031a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            hc hcVarMo5184b = this.f19502a.mo5184b(view);
            if (hcVarMo5184b != null) {
                return (AccessibilityNodeProvider) hcVarMo5184b.m30162e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f19502a.mo5937f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            cc ccVarD1 = cc.d1(accessibilityNodeInfo);
            ccVarD1.O0(wvi.m55107T(view));
            ccVarD1.A0(wvi.m55103P(view));
            ccVarD1.I0(wvi.m55128o(view));
            ccVarD1.U0(wvi.m55095H(view));
            this.f19502a.mo5938g(view, ccVarD1);
            ccVarD1.m20782f(accessibilityNodeInfo.getText(), view);
            List listM22711c = db.m22711c(view);
            for (int i = 0; i < listM22711c.size(); i++) {
                ccVarD1.m20778b((cc.C12624a) listM22711c.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f19502a.mo9657h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f19502a.mo6032i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f19502a.mo5939j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f19502a.mo9658l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f19502a.mo9659m(view, accessibilityEvent);
        }
    }

    public db() {
        this(f19499c);
    }

    /* renamed from: c */
    public static List m22711c(View view) {
        List list = (List) view.getTag(u8e.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public boolean mo6031a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f19500a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public hc mo5184b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f19500a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new hc(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: d */
    public View.AccessibilityDelegate m22712d() {
        return this.f19501b;
    }

    /* renamed from: e */
    public final boolean m22713e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM20750r = cc.m20750r(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpanArrM20750r != null && i < clickableSpanArrM20750r.length; i++) {
                if (clickableSpan.equals(clickableSpanArrM20750r[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
        this.f19500a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo5938g(View view, cc ccVar) {
        this.f19500a.onInitializeAccessibilityNodeInfo(view, ccVar.c1());
    }

    /* renamed from: h */
    public void mo9657h(View view, AccessibilityEvent accessibilityEvent) {
        this.f19500a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo6032i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f19500a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo5939j(View view, int i, Bundle bundle) {
        List listM22711c = m22711c(view);
        boolean zPerformAccessibilityAction = false;
        int i2 = 0;
        while (true) {
            if (i2 >= listM22711c.size()) {
                break;
            }
            cc.C12624a c12624a = (cc.C12624a) listM22711c.get(i2);
            if (c12624a.m20802b() == i) {
                zPerformAccessibilityAction = c12624a.m20804d(view, bundle);
                break;
            }
            i2++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f19500a.performAccessibilityAction(view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != u8e.accessibility_action_clickable_span || bundle == null) ? zPerformAccessibilityAction : m22714k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: k */
    public final boolean m22714k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(u8e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m22713e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: l */
    public void mo9658l(View view, int i) {
        this.f19500a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo9659m(View view, AccessibilityEvent accessibilityEvent) {
        this.f19500a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public db(View.AccessibilityDelegate accessibilityDelegate) {
        this.f19500a = accessibilityDelegate;
        this.f19501b = new C12855a(this);
    }
}
