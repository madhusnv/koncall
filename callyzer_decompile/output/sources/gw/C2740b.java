package gw;

import android.app.Application;
import d7.a1;
import fw.C2389c;
import gm.C2645n;
import gm.C2647p;
import iw.InterfaceC3358a;
import iw.InterfaceC3359b;
import kotlin.jvm.internal.a0;
import og.o1;
import p004e.AbstractActivityC1878m;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gw.b */
/* loaded from: classes3.dex */
public final class C2740b implements InterfaceC3359b {

    /* renamed from: a */
    public final /* synthetic */ int f15280a;

    /* renamed from: b */
    public final AbstractActivityC1878m f15281b;

    /* renamed from: c */
    public final Object f15282c;

    /* renamed from: d */
    public final Object f15283d;

    /* renamed from: e */
    public volatile InterfaceC3358a f15284e;

    public C2740b(AbstractActivityC1878m abstractActivityC1878m, int i10) {
        this.f15280a = i10;
        switch (i10) {
            case 1:
                this.f15282c = new Object();
                this.f15281b = abstractActivityC1878m;
                this.f15283d = abstractActivityC1878m;
                break;
            default:
                this.f15282c = new Object();
                this.f15281b = abstractActivityC1878m;
                this.f15283d = new C2740b(abstractActivityC1878m, 1);
                break;
        }
    }

    /* renamed from: d */
    public static a1 m6734d(AbstractActivityC1878m abstractActivityC1878m, AbstractActivityC1878m abstractActivityC1878m2) {
        return new a1(abstractActivityC1878m.getViewModelStore(), new C2389c(2, abstractActivityC1878m2), abstractActivityC1878m.getDefaultViewModelCreationExtras());
    }

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        switch (this.f15280a) {
            case 0:
                if (((C2645n) this.f15284e) == null) {
                    synchronized (this.f15282c) {
                        try {
                            if (((C2645n) this.f15284e) == null) {
                                this.f15284e = m6735b();
                            }
                        } finally {
                        }
                    }
                }
                return (C2645n) this.f15284e;
            default:
                if (((C2647p) this.f15284e) == null) {
                    synchronized (this.f15282c) {
                        try {
                            if (((C2647p) this.f15284e) == null) {
                                this.f15284e = ((C2742d) m6734d(this.f15281b, (AbstractActivityC1878m) this.f15283d).m5303a(a0.m8901a(C2742d.class))).f15285b;
                            }
                        } finally {
                        }
                    }
                }
                return (C2647p) this.f15284e;
        }
    }

    /* renamed from: b */
    public C2645n m6735b() {
        String str;
        AbstractActivityC1878m abstractActivityC1878m = this.f15281b;
        if (abstractActivityC1878m.getApplication() instanceof InterfaceC3359b) {
            C2647p c2647p = (C2647p) ((InterfaceC2739a) o1.m10790b(InterfaceC2739a.class, (C2740b) this.f15283d));
            return new C2645n(c2647p.f14269a, c2647p.f14270b);
        }
        StringBuilder sb2 = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(abstractActivityC1878m.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + abstractActivityC1878m.getApplication().getClass();
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: c */
    public C8989c m6736c() {
        C2740b c2740b = (C2740b) this.f15283d;
        return ((C2742d) m6734d(c2740b.f15281b, (AbstractActivityC1878m) c2740b.f15283d).m5303a(a0.m8901a(C2742d.class))).f15286c;
    }
}
