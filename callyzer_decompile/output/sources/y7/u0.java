package y7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import c6.C0872b;
import d6.C1617g;
import java.util.WeakHashMap;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 extends C0872b {

    /* renamed from: d */
    public final v0 f41813d;

    /* renamed from: e */
    public final WeakHashMap f41814e = new WeakHashMap();

    public u0(v0 v0Var) {
        this.f41813d = v0Var;
    }

    @Override // c6.C0872b
    /* renamed from: a */
    public final boolean mo2335a(View view, AccessibilityEvent accessibilityEvent) {
        C0872b c0872b = (C0872b) this.f41814e.get(view);
        return c0872b != null ? c0872b.mo2335a(view, accessibilityEvent) : this.f5422a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // c6.C0872b
    /* renamed from: b */
    public final C8989c mo2336b(View view) {
        C0872b c0872b = (C0872b) this.f41814e.get(view);
        return c0872b != null ? c0872b.mo2336b(view) : super.mo2336b(view);
    }

    @Override // c6.C0872b
    /* renamed from: c */
    public final void mo2337c(View view, AccessibilityEvent accessibilityEvent) {
        C0872b c0872b = (C0872b) this.f41814e.get(view);
        if (c0872b != null) {
            c0872b.mo2337c(view, accessibilityEvent);
        } else {
            super.mo2337c(view, accessibilityEvent);
        }
    }

    @Override // c6.C0872b
    /* renamed from: d */
    public final void mo2338d(View view, C1617g c1617g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
        v0 v0Var = this.f41813d;
        RecyclerView recyclerView = v0Var.f41816d;
        RecyclerView recyclerView2 = v0Var.f41816d;
        boolean zM1326J = recyclerView.m1326J();
        View.AccessibilityDelegate accessibilityDelegate = this.f5422a;
        if (zM1326J || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m15854P(view, c1617g);
        C0872b c0872b = (C0872b) this.f41814e.get(view);
        if (c0872b != null) {
            c0872b.mo2338d(view, c1617g);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // c6.C0872b
    /* renamed from: e */
    public final void mo2339e(View view, AccessibilityEvent accessibilityEvent) {
        C0872b c0872b = (C0872b) this.f41814e.get(view);
        if (c0872b != null) {
            c0872b.mo2339e(view, accessibilityEvent);
        } else {
            super.mo2339e(view, accessibilityEvent);
        }
    }

    @Override // c6.C0872b
    /* renamed from: f */
    public final boolean mo2340f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0872b c0872b = (C0872b) this.f41814e.get(viewGroup);
        return c0872b != null ? c0872b.mo2340f(viewGroup, view, accessibilityEvent) : this.f5422a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // c6.C0872b
    /* renamed from: g */
    public final boolean mo2341g(View view, int i10, Bundle bundle) {
        v0 v0Var = this.f41813d;
        RecyclerView recyclerView = v0Var.f41816d;
        RecyclerView recyclerView2 = v0Var.f41816d;
        if (recyclerView.m1326J() || recyclerView2.getLayoutManager() == null) {
            return super.mo2341g(view, i10, bundle);
        }
        C0872b c0872b = (C0872b) this.f41814e.get(view);
        if (c0872b != null) {
            if (c0872b.mo2341g(view, i10, bundle)) {
                return true;
            }
        } else if (super.mo2341g(view, i10, bundle)) {
            return true;
        }
        l0 l0Var = recyclerView2.getLayoutManager().f41620b.f2814b;
        return false;
    }

    @Override // c6.C0872b
    /* renamed from: h */
    public final void mo2342h(View view, int i10) {
        C0872b c0872b = (C0872b) this.f41814e.get(view);
        if (c0872b != null) {
            c0872b.mo2342h(view, i10);
        } else {
            super.mo2342h(view, i10);
        }
    }

    @Override // c6.C0872b
    /* renamed from: i */
    public final void mo2343i(View view, AccessibilityEvent accessibilityEvent) {
        C0872b c0872b = (C0872b) this.f41814e.get(view);
        if (c0872b != null) {
            c0872b.mo2343i(view, accessibilityEvent);
        } else {
            super.mo2343i(view, accessibilityEvent);
        }
    }
}
