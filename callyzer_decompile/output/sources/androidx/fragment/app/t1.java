package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a */
    public final ArrayList f2702a = new ArrayList();

    /* renamed from: b */
    public final HashMap f2703b = new HashMap();

    /* renamed from: c */
    public final HashMap f2704c = new HashMap();

    /* renamed from: d */
    public n1 f2705d;

    /* renamed from: a */
    public final void m1260a(j0 j0Var) {
        if (this.f2702a.contains(j0Var)) {
            throw new IllegalStateException("Fragment already added: " + j0Var);
        }
        synchronized (this.f2702a) {
            this.f2702a.add(j0Var);
        }
        j0Var.mAdded = true;
    }

    /* renamed from: b */
    public final j0 m1261b(String str) {
        s1 s1Var = (s1) this.f2703b.get(str);
        if (s1Var != null) {
            return s1Var.f2696c;
        }
        return null;
    }

    /* renamed from: c */
    public final j0 m1262c(String str) {
        j0 j0VarFindFragmentByWho;
        for (s1 s1Var : this.f2703b.values()) {
            if (s1Var != null && (j0VarFindFragmentByWho = s1Var.f2696c.findFragmentByWho(str)) != null) {
                return j0VarFindFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final ArrayList m1263d() {
        ArrayList arrayList = new ArrayList();
        for (s1 s1Var : this.f2703b.values()) {
            if (s1Var != null) {
                arrayList.add(s1Var);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final ArrayList m1264e() {
        ArrayList arrayList = new ArrayList();
        for (s1 s1Var : this.f2703b.values()) {
            if (s1Var != null) {
                arrayList.add(s1Var.f2696c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List m1265f() {
        ArrayList arrayList;
        if (this.f2702a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f2702a) {
            arrayList = new ArrayList(this.f2702a);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void m1266g(s1 s1Var) {
        j0 j0Var = s1Var.f2696c;
        String str = j0Var.mWho;
        HashMap map = this.f2703b;
        if (map.get(str) != null) {
            return;
        }
        map.put(j0Var.mWho, s1Var);
        if (j0Var.mRetainInstanceChangedWhileDetached) {
            if (j0Var.mRetainInstance) {
                this.f2705d.m1210e(j0Var);
            } else {
                this.f2705d.m1212g(j0Var);
            }
            j0Var.mRetainInstanceChangedWhileDetached = false;
        }
        if (j1.m1152K(2)) {
            j0Var.toString();
        }
    }

    /* renamed from: h */
    public final void m1267h(s1 s1Var) {
        j0 j0Var = s1Var.f2696c;
        if (j0Var.mRetainInstance) {
            this.f2705d.m1212g(j0Var);
        }
        String str = j0Var.mWho;
        HashMap map = this.f2703b;
        if (map.get(str) == s1Var && ((s1) map.put(j0Var.mWho, null)) != null && j1.m1152K(2)) {
            j0Var.toString();
        }
    }

    /* renamed from: i */
    public final Bundle m1268i(String str, Bundle bundle) {
        HashMap map = this.f2704c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
