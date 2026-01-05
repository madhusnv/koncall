package c6;

import android.os.Build;
import android.view.View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC4154l;
import sw.C6962f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a */
    public int f5478a;

    /* renamed from: b */
    public int f5479b;

    /* renamed from: c */
    public int f5480c;

    /* renamed from: d */
    public final Serializable f5481d;

    public k0(C6962f map) {
        AbstractC4154l.m8923f(map, "map");
        this.f5481d = map;
        this.f5479b = -1;
        this.f5480c = map.f33715h;
        m2434h();
    }

    /* renamed from: b */
    public void m2433b() {
        if (((C6962f) this.f5481d).f33715h != this.f5480c) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    public abstract Object mo2414d(View view);

    /* renamed from: f */
    public abstract void mo2415f(View view, Object obj);

    /* renamed from: h */
    public void m2434h() {
        while (true) {
            int i10 = this.f5478a;
            C6962f c6962f = (C6962f) this.f5481d;
            if (i10 >= c6962f.f33713f || c6962f.f33710c[i10] >= 0) {
                return;
            } else {
                this.f5478a = i10 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f5478a < ((C6962f) this.f5481d).f33713f;
    }

    /* renamed from: i */
    public void m2435i(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f5479b) {
            mo2415f(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f5479b) {
            tag = mo2414d(view);
        } else {
            tag = view.getTag(this.f5478a);
            if (!((Class) this.f5481d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo2416j(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM2520b = v0.m2520b(view);
            C0872b c0872b = accessibilityDelegateM2520b == null ? null : accessibilityDelegateM2520b instanceof C0871a ? ((C0871a) accessibilityDelegateM2520b).f5417a : new C0872b(accessibilityDelegateM2520b);
            if (c0872b == null) {
                c0872b = new C0872b();
            }
            v0.m2528j(view, c0872b);
            view.setTag(this.f5478a, obj);
            v0.m2523e(this.f5480c, view);
        }
    }

    /* renamed from: j */
    public abstract boolean mo2416j(Object obj, Object obj2);

    public void remove() {
        C6962f c6962f = (C6962f) this.f5481d;
        m2433b();
        if (this.f5479b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c6962f.m13231f();
        c6962f.m13240r(this.f5479b);
        this.f5479b = -1;
        this.f5480c = c6962f.f33715h;
    }

    public k0(int i10, Class cls, int i11, int i12) {
        this.f5478a = i10;
        this.f5481d = cls;
        this.f5480c = i11;
        this.f5479b = i12;
    }
}
