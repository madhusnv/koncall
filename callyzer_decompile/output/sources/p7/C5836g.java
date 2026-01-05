package p7;

import an.v1;
import an.w1;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C0336a;
import androidx.fragment.app.g1;
import androidx.fragment.app.i1;
import androidx.fragment.app.j0;
import androidx.fragment.app.j1;
import androidx.fragment.app.o1;
import bt.i0;
import c9.C0914i;
import d7.C1639l;
import d7.b1;
import d7.w0;
import ex.InterfaceC2137a;
import f1.C2177b;
import fw.C2389c;
import g7.C2536a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import jt.C3855d;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.C4412l;
import l7.d0;
import l7.m0;
import l7.n0;
import mq.C4833a;
import og.pe;
import pg.n7;
import qw.C6361k;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@m0("fragment")
/* renamed from: p7.g */
/* loaded from: classes.dex */
public class C5836g extends n0 {

    /* renamed from: c */
    public final Context f28530c;

    /* renamed from: d */
    public final j1 f28531d;

    /* renamed from: e */
    public final int f28532e;

    /* renamed from: f */
    public final LinkedHashSet f28533f = new LinkedHashSet();

    /* renamed from: g */
    public final ArrayList f28534g = new ArrayList();

    /* renamed from: h */
    public final C1639l f28535h = new C1639l(4, this);

    /* renamed from: i */
    public final C4833a f28536i = new C4833a(7, this);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: p7.g$a */
    public static final class a extends w0 {

        /* renamed from: b */
        public WeakReference f28537b;

        @Override // d7.w0
        /* renamed from: d */
        public final void mo1209d() {
            WeakReference weakReference = this.f28537b;
            if (weakReference == null) {
                AbstractC4154l.m8928k("completeTransition");
                throw null;
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) weakReference.get();
            if (interfaceC2137a != null) {
                interfaceC2137a.invoke();
            }
        }
    }

    public C5836g(Context context, j1 j1Var, int i10) {
        this.f28530c = context;
        this.f28531d = j1Var;
        this.f28532e = i10;
    }

    /* renamed from: k */
    public static void m11409k(C5836g c5836g, String str, int i10) {
        boolean z6 = (i10 & 2) == 0;
        boolean z10 = (i10 & 4) != 0;
        ArrayList arrayList = c5836g.f28534g;
        if (z10) {
            AbstractC6663m.m12755S(arrayList, new v1(str, 21));
        }
        arrayList.add(new C6361k(str, Boolean.valueOf(z6)));
    }

    /* renamed from: n */
    public static boolean m11410n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // l7.n0
    /* renamed from: a */
    public final AbstractC4422v mo9193a() {
        return new C5837h(this);
    }

    @Override // l7.n0
    /* renamed from: d */
    public final void mo9226d(List list, d0 d0Var) {
        j1 j1Var = this.f28531d;
        if (j1Var.m1164O()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4409i c4409i = (C4409i) it.next();
            boolean zIsEmpty = ((List) m9225b().f22080e.f39340a.getValue()).isEmpty();
            if (d0Var == null || zIsEmpty || !d0Var.f22017b || !this.f28533f.remove(c4409i.f22050f)) {
                C0336a c0336aM11412m = m11412m(c4409i, d0Var);
                String str = c4409i.f22050f;
                if (!zIsEmpty) {
                    C4409i c4409i2 = (C4409i) AbstractC6663m.m12751O((List) m9225b().f22080e.f39340a.getValue());
                    if (c4409i2 != null) {
                        m11409k(this, c4409i2.f22050f, 6);
                    }
                    m11409k(this, str, 6);
                    if (!c0336aM11412m.f2441h) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    c0336aM11412m.f2440g = true;
                    c0336aM11412m.f2442i = str;
                }
                c0336aM11412m.m1090e();
                if (m11410n()) {
                    c4409i.toString();
                }
                m9225b().m9223i(c4409i);
            } else {
                j1Var.m1199x(new i1(j1Var, c4409i.f22050f, 0), false);
                m9225b().m9223i(c4409i);
            }
        }
    }

    @Override // l7.n0
    /* renamed from: e */
    public final void mo9227e(final C4412l c4412l) {
        this.f22086a = c4412l;
        this.f22087b = true;
        m11410n();
        o1 o1Var = new o1() { // from class: p7.e
            @Override // androidx.fragment.app.o1
            /* renamed from: a */
            public final void mo1121a(j1 j1Var, j0 j0Var) {
                Object objPrevious;
                AbstractC4154l.m8923f(j1Var, "<unused var>");
                C4412l c4412l2 = c4412l;
                List list = (List) c4412l2.f22080e.f39340a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (AbstractC4154l.m8918a(((C4409i) objPrevious).f22050f, j0Var.getTag())) {
                            break;
                        }
                    }
                }
                C4409i c4409i = (C4409i) objPrevious;
                boolean zM11410n = C5836g.m11410n();
                C5836g c5836g = this;
                if (zM11410n) {
                    j0Var.toString();
                    Objects.toString(c4409i);
                    Objects.toString(c5836g.f28531d);
                }
                if (c4409i != null) {
                    j0Var.getViewLifecycleOwnerLiveData().m5315e(j0Var, new C3855d(1, new w1(20, c5836g, j0Var, c4409i)));
                    j0Var.getLifecycle().mo5343a(c5836g.f28535h);
                    c5836g.m11411l(j0Var, c4409i, c4412l2);
                }
            }
        };
        j1 j1Var = this.f28531d;
        j1Var.f2594p.add(o1Var);
        j1Var.f2592n.add(new C5838i(c4412l, this));
    }

    @Override // l7.n0
    /* renamed from: f */
    public final void mo9228f(C4409i c4409i) {
        String str = c4409i.f22050f;
        j1 j1Var = this.f28531d;
        if (j1Var.m1164O()) {
            return;
        }
        C0336a c0336aM11412m = m11412m(c4409i, null);
        List list = (List) m9225b().f22080e.f39340a.getValue();
        if (list.size() > 1) {
            C4409i c4409i2 = (C4409i) AbstractC6663m.m12744H(list, pe.m10832g(list) - 1);
            if (c4409i2 != null) {
                m11409k(this, c4409i2.f22050f, 6);
            }
            m11409k(this, str, 4);
            j1Var.m1199x(new g1(j1Var, str, -1), false);
            m11409k(this, str, 2);
            if (!c0336aM11412m.f2441h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            c0336aM11412m.f2440g = true;
            c0336aM11412m.f2442i = str;
        }
        c0336aM11412m.m1090e();
        m9225b().m9218d(c4409i);
    }

    @Override // l7.n0
    /* renamed from: g */
    public final void mo9229g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f28533f;
            linkedHashSet.clear();
            AbstractC6663m.m12765x(linkedHashSet, stringArrayList);
        }
    }

    @Override // l7.n0
    /* renamed from: h */
    public final Bundle mo9230h() {
        LinkedHashSet linkedHashSet = this.f28533f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return n7.m11799a(new C6361k("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r10 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if (r8 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (kotlin.jvm.internal.AbstractC4154l.m8918a(r12.f22050f, r7.f22050f) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r11 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r4.add(r9);
     */
    @Override // l7.n0
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo9231i(l7.C4409i r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C5836g.mo9231i(l7.i, boolean):void");
    }

    /* renamed from: l */
    public final void m11411l(j0 fragment, C4409i c4409i, C4412l c4412l) {
        AbstractC4154l.m8923f(fragment, "fragment");
        b1 viewModelStore = fragment.getViewModelStore();
        AbstractC4154l.m8922e(viewModelStore, "<get-viewModelStore>(...)");
        C2177b c2177b = new C2177b(1);
        c2177b.m5865a(a0.m8901a(a.class), new C5835f(0));
        C2389c c2389cM5866b = c2177b.m5866b();
        C2536a defaultCreationExtras = C2536a.f13867b;
        AbstractC4154l.m8923f(defaultCreationExtras, "defaultCreationExtras");
        C0914i c0914i = new C0914i(viewModelStore, c2389cM5866b, defaultCreationExtras);
        C4147e c4147eM8901a = a0.m8901a(a.class);
        String strM8913b = c4147eM8901a.m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        ((a) c0914i.m2630j(c4147eM8901a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM8913b))).f28537b = new WeakReference(new i0(c4409i, c4412l, this, fragment));
    }

    /* renamed from: m */
    public final C0336a m11412m(C4409i c4409i, d0 d0Var) {
        AbstractC4422v abstractC4422v = c4409i.f22046b;
        AbstractC4154l.m8921d(abstractC4422v, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleM12163a = c4409i.f22052h.m12163a();
        String str = ((C5837h) abstractC4422v).f28538g;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f28530c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        j1 j1Var = this.f28531d;
        androidx.fragment.app.b1 b1VarM1161I = j1Var.m1161I();
        context.getClassLoader();
        j0 j0VarM1119a = b1VarM1161I.m1119a(str);
        AbstractC4154l.m8922e(j0VarM1119a, "instantiate(...)");
        j0VarM1119a.setArguments(bundleM12163a);
        C0336a c0336a = new C0336a(j1Var);
        int i10 = d0Var != null ? d0Var.f22021f : -1;
        int i11 = d0Var != null ? d0Var.f22022g : -1;
        int i12 = d0Var != null ? d0Var.f22023h : -1;
        int i13 = d0Var != null ? d0Var.f22024i : -1;
        if (i10 != -1 || i11 != -1 || i12 != -1 || i13 != -1) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i11 == -1) {
                i11 = 0;
            }
            if (i12 == -1) {
                i12 = 0;
            }
            int i14 = i13 != -1 ? i13 : 0;
            c0336a.f2435b = i10;
            c0336a.f2436c = i11;
            c0336a.f2437d = i12;
            c0336a.f2438e = i14;
        }
        String str2 = c4409i.f22050f;
        int i15 = this.f28532e;
        if (i15 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c0336a.m1092g(i15, j0VarM1119a, str2, 2);
        c0336a.m1094i(j0VarM1119a);
        c0336a.f2449p = true;
        return c0336a;
    }
}
