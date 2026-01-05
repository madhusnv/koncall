package d7;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p014p.C5785a;
import p015q.C6054a;
import p015q.C6056c;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.w */
/* loaded from: classes.dex */
public final class C1651w extends AbstractC1646r {

    /* renamed from: a */
    public final boolean f8146a = true;

    /* renamed from: b */
    public C6054a f8147b = new C6054a();

    /* renamed from: c */
    public EnumC1645q f8148c;

    /* renamed from: d */
    public final WeakReference f8149d;

    /* renamed from: e */
    public int f8150e;

    /* renamed from: f */
    public boolean f8151f;

    /* renamed from: g */
    public boolean f8152g;

    /* renamed from: h */
    public final ArrayList f8153h;

    /* renamed from: i */
    public final m1 f8154i;

    public C1651w(InterfaceC1649u interfaceC1649u) {
        EnumC1645q enumC1645q = EnumC1645q.INITIALIZED;
        this.f8148c = enumC1645q;
        this.f8153h = new ArrayList();
        this.f8149d = new WeakReference(interfaceC1649u);
        this.f8154i = wx.c1.m15372c(enumC1645q);
    }

    @Override // d7.AbstractC1646r
    /* renamed from: a */
    public final void mo5343a(InterfaceC1648t observer) {
        InterfaceC1647s c1635h;
        InterfaceC1649u interfaceC1649u;
        AbstractC4154l.m8923f(observer, "observer");
        m5354f("addObserver");
        EnumC1645q enumC1645q = this.f8148c;
        EnumC1645q initialState = EnumC1645q.DESTROYED;
        if (enumC1645q != initialState) {
            initialState = EnumC1645q.INITIALIZED;
        }
        AbstractC4154l.m8923f(initialState, "initialState");
        C1650v c1650v = new C1650v();
        HashMap map = AbstractC1653y.f8160a;
        boolean z6 = observer instanceof InterfaceC1647s;
        boolean z10 = observer instanceof InterfaceC1633f;
        Object obj = null;
        if (z6 && z10) {
            c1635h = new C1635h((InterfaceC1633f) observer, (InterfaceC1647s) observer);
        } else if (z10) {
            c1635h = new C1635h((InterfaceC1633f) observer, (InterfaceC1647s) null);
        } else if (z6) {
            c1635h = (InterfaceC1647s) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (AbstractC1653y.m5364b(cls) == 2) {
                Object obj2 = AbstractC1653y.f8161b.get(cls);
                AbstractC4154l.m8920c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC1653y.m5363a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC1636i[] interfaceC1636iArr = new InterfaceC1636i[size];
                if (size > 0) {
                    AbstractC1653y.m5363a((Constructor) list.get(0), observer);
                    throw null;
                }
                c1635h = new C1632e(i, interfaceC1636iArr);
            } else {
                c1635h = new C1635h(observer);
            }
        }
        c1650v.f8141b = c1635h;
        c1650v.f8140a = initialState;
        C6054a c6054a = this.f8147b;
        C6056c c6056cMo12061a = c6054a.mo12061a(observer);
        if (c6056cMo12061a != null) {
            obj = c6056cMo12061a.f29550b;
        } else {
            HashMap map2 = c6054a.f29545e;
            C6056c c6056c = new C6056c(observer, c1650v);
            c6054a.f29559d++;
            C6056c c6056c2 = c6054a.f29557b;
            if (c6056c2 == null) {
                c6054a.f29556a = c6056c;
                c6054a.f29557b = c6056c;
            } else {
                c6056c2.f29551c = c6056c;
                c6056c.f29552d = c6056c2;
                c6054a.f29557b = c6056c;
            }
            map2.put(observer, c6056c);
        }
        if (((C1650v) obj) == null && (interfaceC1649u = (InterfaceC1649u) this.f8149d.get()) != null) {
            i = (this.f8150e != 0 || this.f8151f) ? 1 : 0;
            EnumC1645q enumC1645qM5353e = m5353e(observer);
            this.f8150e++;
            while (c1650v.f8140a.compareTo(enumC1645qM5353e) < 0 && this.f8147b.f29545e.containsKey(observer)) {
                EnumC1645q enumC1645q2 = c1650v.f8140a;
                ArrayList arrayList = this.f8153h;
                arrayList.add(enumC1645q2);
                C1642n c1642n = EnumC1644p.Companion;
                EnumC1645q enumC1645q3 = c1650v.f8140a;
                c1642n.getClass();
                EnumC1644p enumC1644pM5328b = C1642n.m5328b(enumC1645q3);
                if (enumC1644pM5328b == null) {
                    throw new IllegalStateException("no event up from " + c1650v.f8140a);
                }
                c1650v.m5352a(interfaceC1649u, enumC1644pM5328b);
                arrayList.remove(arrayList.size() - 1);
                enumC1645qM5353e = m5353e(observer);
            }
            if (i == 0) {
                m5358j();
            }
            this.f8150e--;
        }
    }

    @Override // d7.AbstractC1646r
    /* renamed from: b */
    public final EnumC1645q mo5344b() {
        return this.f8148c;
    }

    @Override // d7.AbstractC1646r
    /* renamed from: c */
    public final wx.w0 mo5345c() {
        return new wx.w0(this.f8154i);
    }

    @Override // d7.AbstractC1646r
    /* renamed from: d */
    public final void mo5346d(InterfaceC1648t observer) {
        AbstractC4154l.m8923f(observer, "observer");
        m5354f("removeObserver");
        this.f8147b.mo12062b(observer);
    }

    /* renamed from: e */
    public final EnumC1645q m5353e(InterfaceC1648t interfaceC1648t) {
        HashMap map = this.f8147b.f29545e;
        C6056c c6056c = map.containsKey(interfaceC1648t) ? ((C6056c) map.get(interfaceC1648t)).f29552d : null;
        EnumC1645q enumC1645q = c6056c != null ? ((C1650v) c6056c.f29550b).f8140a : null;
        ArrayList arrayList = this.f8153h;
        EnumC1645q enumC1645q2 = arrayList.isEmpty() ? null : (EnumC1645q) arrayList.get(arrayList.size() - 1);
        EnumC1645q state1 = this.f8148c;
        AbstractC4154l.m8923f(state1, "state1");
        if (enumC1645q == null || enumC1645q.compareTo(state1) >= 0) {
            enumC1645q = state1;
        }
        return (enumC1645q2 == null || enumC1645q2.compareTo(enumC1645q) >= 0) ? enumC1645q : enumC1645q2;
    }

    /* renamed from: f */
    public final void m5354f(String str) {
        if (this.f8146a) {
            C5785a.m11334g().f28364a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC5601a.m11238i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: g */
    public final void m5355g(EnumC1644p event) {
        AbstractC4154l.m8923f(event, "event");
        m5354f("handleLifecycleEvent");
        m5356h(event.getTargetState());
    }

    /* renamed from: h */
    public final void m5356h(EnumC1645q next) {
        if (this.f8148c == next) {
            return;
        }
        InterfaceC1649u interfaceC1649u = (InterfaceC1649u) this.f8149d.get();
        EnumC1645q current = this.f8148c;
        AbstractC4154l.m8923f(current, "current");
        AbstractC4154l.m8923f(next, "next");
        if (current == EnumC1645q.INITIALIZED && next == EnumC1645q.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + EnumC1645q.CREATED + "' to be moved to '" + next + "' in component " + interfaceC1649u).toString());
        }
        EnumC1645q enumC1645q = EnumC1645q.DESTROYED;
        if (current == enumC1645q && current != next) {
            throw new IllegalStateException(("State is '" + enumC1645q + "' and cannot be moved to `" + next + "` in component " + interfaceC1649u).toString());
        }
        this.f8148c = next;
        if (this.f8151f || this.f8150e != 0) {
            this.f8152g = true;
            return;
        }
        this.f8151f = true;
        m5358j();
        this.f8151f = false;
        if (this.f8148c == enumC1645q) {
            this.f8147b = new C6054a();
        }
    }

    /* renamed from: i */
    public final void m5357i(EnumC1645q state) {
        AbstractC4154l.m8923f(state, "state");
        m5354f("setCurrentState");
        m5356h(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f8152g = false;
        r7.f8154i.m15398j(r7.f8148c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5358j() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.C1651w.m5358j():void");
    }
}
