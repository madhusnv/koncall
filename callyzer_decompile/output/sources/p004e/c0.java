package p004e;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b3.C0575g;
import d6.AbstractC1614d;
import d7.AbstractC1646r;
import d7.EnumC1645q;
import d7.InterfaceC1649u;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6661k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    public final Runnable f8867a;

    /* renamed from: b */
    public final C6661k f8868b = new C6661k();

    /* renamed from: c */
    public AbstractC1887v f8869c;

    /* renamed from: d */
    public final OnBackInvokedCallback f8870d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f8871e;

    /* renamed from: f */
    public boolean f8872f;

    /* renamed from: g */
    public boolean f8873g;

    public c0(Runnable runnable) {
        this.f8867a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f8870d = i10 >= 34 ? new C1891z(new C1888w(this, 0), new C1888w(this, 1), new C1889x(this, 0), new C1889x(this, 1)) : new C1890y(0, new C1889x(this, 2));
        }
    }

    /* renamed from: a */
    public final void m5500a(InterfaceC1649u owner, AbstractC1887v onBackPressedCallback) {
        AbstractC4154l.m8923f(owner, "owner");
        AbstractC4154l.m8923f(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1646r lifecycle = owner.getLifecycle();
        if (lifecycle.mo5344b() == EnumC1645q.DESTROYED) {
            return;
        }
        onBackPressedCallback.f8902b.add(new a0(this, lifecycle, onBackPressedCallback));
        m5504e();
        onBackPressedCallback.f8903c = new C0575g(0, this, c0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: b */
    public final void m5501b() {
        AbstractC1887v abstractC1887vPrevious;
        AbstractC1887v abstractC1887v = this.f8869c;
        if (abstractC1887v == null) {
            C6661k c6661k = this.f8868b;
            ListIterator listIterator = c6661k.listIterator(c6661k.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC1887vPrevious = 0;
                    break;
                } else {
                    abstractC1887vPrevious = listIterator.previous();
                    if (((AbstractC1887v) abstractC1887vPrevious).f8901a) {
                        break;
                    }
                }
            }
            abstractC1887v = abstractC1887vPrevious;
        }
        this.f8869c = null;
        if (abstractC1887v != null) {
            abstractC1887v.mo1275a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: c */
    public final void m5502c() {
        AbstractC1887v abstractC1887vPrevious;
        AbstractC1887v abstractC1887v = this.f8869c;
        if (abstractC1887v == null) {
            C6661k c6661k = this.f8868b;
            ListIterator listIterator = c6661k.listIterator(c6661k.mo10411b());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC1887vPrevious = 0;
                    break;
                } else {
                    abstractC1887vPrevious = listIterator.previous();
                    if (((AbstractC1887v) abstractC1887vPrevious).f8901a) {
                        break;
                    }
                }
            }
            abstractC1887v = abstractC1887vPrevious;
        }
        this.f8869c = null;
        if (abstractC1887v != null) {
            abstractC1887v.mo1276b();
        } else {
            this.f8867a.run();
        }
    }

    /* renamed from: d */
    public final void m5503d(boolean z6) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f8871e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f8870d) == null) {
            return;
        }
        if (z6 && !this.f8872f) {
            AbstractC1614d.m5274j(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8872f = true;
        } else {
            if (z6 || !this.f8872f) {
                return;
            }
            AbstractC1614d.m5278n(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8872f = false;
        }
    }

    /* renamed from: e */
    public final void m5504e() {
        boolean z6 = this.f8873g;
        boolean z10 = false;
        C6661k c6661k = this.f8868b;
        if (c6661k == null || !c6661k.isEmpty()) {
            Iterator<E> it = c6661k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC1887v) it.next()).f8901a) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f8873g = z10;
        if (z10 == z6 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m5503d(z10);
    }
}
