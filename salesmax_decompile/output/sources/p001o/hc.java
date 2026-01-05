package p001o;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class hc {

    /* renamed from: a */
    public final Object f26601a;

    /* renamed from: o.hc$a */
    public static class C13906a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final hc f26602a;

        public C13906a(hc hcVar) {
            this.f26602a = hcVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            cc ccVarMo17631b = this.f26602a.mo17631b(i);
            if (ccVarMo17631b == null) {
                return null;
            }
            return ccVarMo17631b.c1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i) {
            List listM30161c = this.f26602a.m30161c(str, i);
            if (listM30161c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM30161c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((cc) listM30161c.get(i2)).c1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            cc ccVarMo17632d = this.f26602a.mo17632d(i);
            if (ccVarMo17632d == null) {
                return null;
            }
            return ccVarMo17632d.c1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f26602a.mo17633f(i, i2, bundle);
        }
    }

    /* renamed from: o.hc$b */
    public static class C13907b extends C13906a {
        public C13907b(hc hcVar) {
            super(hcVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f26602a.m30160a(i, cc.d1(accessibilityNodeInfo), str, bundle);
        }
    }

    public hc() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f26601a = new C13907b(this);
        } else {
            this.f26601a = new C13906a(this);
        }
    }

    /* renamed from: a */
    public void m30160a(int i, cc ccVar, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public cc mo17631b(int i) {
        return null;
    }

    /* renamed from: c */
    public List m30161c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public cc mo17632d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object m30162e() {
        return this.f26601a;
    }

    /* renamed from: f */
    public boolean mo17633f(int i, int i2, Bundle bundle) {
        return false;
    }

    public hc(Object obj) {
        this.f26601a = obj;
    }
}
