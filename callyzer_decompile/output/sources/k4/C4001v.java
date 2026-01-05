package k4;

import a2.AbstractC0030c;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.InterfaceC0893w;
import c6.b1;
import c6.v0;
import c6.v1;
import c6.y1;
import c9.C0927v;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.x0;
import com.skydoves.balloon.internals.DefinitionKt;
import e1.C1915q;
import ee.C2039g;
import ex.InterfaceC2139c;
import h1.AbstractC2773d;
import h1.C2780k;
import h1.C2781l;
import h1.C2790u;
import hb.C2876b;
import iz.C3368a;
import iz.C3378k;
import iz.C3391x;
import iz.InterfaceC3383p;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import k1.d1;
import k9.C4033g;
import kotlin.jvm.internal.AbstractC4154l;
import l0.AbstractC4308h;
import l0.InterfaceC4301a;
import l1.AbstractC4323l;
import l1.C4312a;
import l1.C4318g;
import l1.InterfaceC4313b;
import lc.InterfaceC4440c;
import lj.C4481d;
import lj.C4482e;
import lp.C4504f;
import ng.C5070u;
import nz.C5206q;
import nz.C5208s;
import nz.InterfaceC5211v;
import nz.InterfaceC5212w;
import o5.C5295d;
import og.ud;
import oi.C5388b;
import p012n.C4925e;
import p012n.InterfaceC4934n;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;
import p012n.SubMenuC4939s;
import p012n.ViewOnKeyListenerC4926f;
import p013o.C5223i;
import p013o.InterfaceC5226l;
import p013o.k1;
import p016r.InterfaceC6409a;
import p3.C5819q;
import p3.C5820r;
import p3.C5821s;
import pg.e9;
import pg.o7;
import q9.C6148f;
import qa.AbstractC6151b;
import rw.C6661k;
import s1.j0;
import s1.k0;
import s4.InterfaceC6747c;
import sc.C6781a;
import sc.C6802v;
import sc.InterfaceC6783c;
import sc.InterfaceC6796p;
import t2.InterfaceC7003b;
import tb.C7105p;
import tc.C7117b;
import tk.C7171a;
import tx.InterfaceC7266z;
import u2.AbstractC7311h;
import u2.AbstractC7321r;
import ub.C7391g;
import ub.InterfaceC7385a;
import ud.C7410n;
import ud.C7416t;
import ud.InterfaceC7409m;
import ud.InterfaceC7411o;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import w3.C7904v;
import wc.C7985s;
import wc.InterfaceC7989w;
import xm.y5;
import yc.C8615d;
import zb.AbstractC8923q;
import zc.InterfaceC8929f;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.v */
/* loaded from: classes.dex */
public final class C4001v implements InterfaceC4301a, InterfaceC4313b, InterfaceC6783c, k1, InterfaceC4440c, InterfaceC5212w, InterfaceC4934n, InterfaceC5226l, InterfaceC0893w, InterfaceC3383p, InterfaceC6796p, InterfaceC7385a {

    /* renamed from: a */
    public final /* synthetic */ int f20703a;

    /* renamed from: b */
    public Object f20704b;

    public /* synthetic */ C4001v(int i10, Object obj) {
        this.f20703a = i10;
        this.f20704b = obj;
    }

    @Override // p012n.InterfaceC4934n
    /* renamed from: a */
    public void mo393a(MenuC4929i menuC4929i, boolean z6) {
        if (menuC4929i instanceof SubMenuC4939s) {
            ((SubMenuC4939s) menuC4929i).f24613v.mo9861j().m9854c(false);
        }
        InterfaceC4934n interfaceC4934n = ((C5223i) this.f20704b).f25518e;
        if (interfaceC4934n != null) {
            interfaceC4934n.mo393a(menuC4929i, z6);
        }
    }

    @Override // l0.InterfaceC4301a, p016r.InterfaceC6409a
    public InterfaceFutureC8957d apply(Object obj) {
        return AbstractC4308h.m9033c(((InterfaceC6409a) this.f20704b).apply(obj));
    }

    @Override // sc.InterfaceC6796p
    /* renamed from: b */
    public Object mo7561b(Object obj, C8615d c8615d) {
        C6802v c6802v = (C6802v) obj;
        InterfaceC7409m interfaceC7409m = (InterfaceC7409m) this.f20704b;
        if (!((C7117b) c6802v.f32332b).f34312c.m339s("X-Amzn-Trace-Id")) {
            C7416t c7416t = (C7416t) interfaceC7409m;
            String strM13806a = c7416t.m13806a("_X_AMZN_TRACE_ID");
            if (c7416t.m13806a("AWS_LAMBDA_FUNCTION_NAME") != null && strM13806a != null) {
                ((C7117b) c6802v.f32332b).f34312c.m318F(AbstractC6151b.f29993a.m12988d(strM13806a), "X-Amzn-Trace-Id");
            }
        }
        return c6802v;
    }

    @Override // iz.InterfaceC3383p
    /* renamed from: c */
    public List mo7745c(String hostname) {
        AbstractC4154l.m8923f(hostname, "hostname");
        return (List) tx.c0.m13468D(C7565i.f36440a, new C4504f(this, hostname, null, 23));
    }

    @Override // p013o.k1
    /* renamed from: d */
    public void mo8765d(MenuC4929i menuC4929i, MenuItem menuItem) {
        ((ViewOnKeyListenerC4926f) this.f20704b).f24508f.removeCallbacksAndMessages(menuC4929i);
    }

    @Override // c6.InterfaceC0893w
    /* renamed from: e */
    public y1 mo2531e(View view, y1 y1Var) {
        v1 v1Var = y1Var.f5541a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f20704b;
        if (!Objects.equals(coordinatorLayout.f2183p, y1Var)) {
            coordinatorLayout.f2183p = y1Var;
            boolean z6 = y1Var.m2538a() > 0;
            coordinatorLayout.f2184q = z6;
            coordinatorLayout.setWillNotDraw(!z6 && coordinatorLayout.getBackground() == null);
            if (!v1Var.mo2496o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    Field field = v0.f5527a;
                    if (childAt.getFitsSystemWindows() && ((C5295d) childAt.getLayoutParams()).f25981a != null && v1Var.mo2496o()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return y1Var;
    }

    @Override // p012n.InterfaceC4934n
    /* renamed from: f */
    public boolean mo397f(MenuC4929i menuC4929i) {
        C5223i c5223i = (C5223i) this.f20704b;
        if (menuC4929i == c5223i.f25516c) {
            return false;
        }
        ((SubMenuC4939s) menuC4929i).f24614w.getClass();
        c5223i.getClass();
        InterfaceC4934n interfaceC4934n = c5223i.f25518e;
        if (interfaceC4934n != null) {
            return interfaceC4934n.mo397f(menuC4929i);
        }
        return false;
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: g */
    public boolean mo8766g(C3391x url) {
        AbstractC4154l.m8923f(url, "url");
        return ((C5208s) this.f20704b).mo8766g(url);
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: h */
    public boolean mo8767h() {
        return ((C5208s) this.f20704b).f25414m.m10161l();
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: i */
    public C3368a mo8768i() {
        return ((C5208s) this.f20704b).f25412k;
    }

    @Override // ub.InterfaceC7385a
    public boolean isClosedForRead() {
        return ((InterfaceC7989w) this.f20704b).isClosedForRead();
    }

    @Override // sc.InterfaceC6783c
    /* renamed from: j */
    public Object mo8769j(C6802v c6802v, C6781a c6781a) {
        switch (this.f20703a) {
            case 5:
                String str = (String) ud.m10978d(c6802v.f32331a, AbstractC8923q.f42882a);
                C2876b c2876b = ((C4033g) this.f20704b).f20849r;
                c2876b.getClass();
                Object obj = c2876b.f15901b.get(str);
                if (obj == null) {
                    obj = c2876b.f15902c;
                }
                List list = (List) obj;
                List list2 = c2876b.f15900a;
                return list2 != null ? e9.m11605c(list2, list) : list;
            default:
                String str2 = (String) ud.m10978d(c6802v.f32331a, AbstractC8923q.f42882a);
                C2876b c2876b2 = ((C6148f) this.f20704b).f29990r;
                c2876b2.getClass();
                Object obj2 = c2876b2.f15901b.get(str2);
                if (obj2 == null) {
                    obj2 = c2876b2.f15902c;
                }
                List list3 = (List) obj2;
                List list4 = c2876b2.f15900a;
                return list4 != null ? e9.m11605c(list4, list3) : list3;
        }
    }

    @Override // ub.InterfaceC7385a
    /* renamed from: k */
    public Object mo8770k(C7985s c7985s, long j6, C7391g c7391g) {
        return ((InterfaceC7989w) this.f20704b).read(c7985s, j6, c7391g);
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: l */
    public C6661k mo8771l() {
        return ((C5208s) this.f20704b).f25418r;
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: m */
    public InterfaceC5211v mo8772m() {
        return ((C5208s) this.f20704b).m10204a();
    }

    @Override // l1.InterfaceC4313b
    /* renamed from: n */
    public Object mo8773n(d1 d1Var, Float f6, Float f10, InterfaceC2139c interfaceC2139c, C4318g c4318g) {
        Object objM9041a = AbstractC4323l.m9041a(d1Var, f6.floatValue(), AbstractC2773d.m6779b(DefinitionKt.NO_Float_VALUE, f10.floatValue(), 28), (C2790u) this.f20704b, interfaceC2139c, c4318g);
        return objM9041a == EnumC7794a.COROUTINE_SUSPENDED ? objM9041a : (C4312a) objM9041a;
    }

    @Override // p013o.k1
    /* renamed from: o */
    public void mo8774o(MenuC4929i menuC4929i, MenuItemC4930j menuItemC4930j) {
        ViewOnKeyListenerC4926f viewOnKeyListenerC4926f = (ViewOnKeyListenerC4926f) this.f20704b;
        Handler handler = viewOnKeyListenerC4926f.f24508f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC4926f.f24510h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (menuC4929i == ((C4925e) arrayList.get(i10)).f24499b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new b1(1, this, i11 < arrayList.size() ? (C4925e) arrayList.get(i11) : null, menuItemC4930j, menuC4929i, false), menuC4929i, SystemClock.uptimeMillis() + 200);
    }

    @Override // nz.InterfaceC5212w
    /* renamed from: p */
    public boolean mo8775p(C5206q c5206q) {
        return ((C5208s) this.f20704b).mo8775p(c5206q);
    }

    /* renamed from: q */
    public String m8776q(Object obj) throws IOException {
        StringWriter stringWriter = new StringWriter();
        try {
            C4481d c4481d = (C4481d) this.f20704b;
            C4482e c4482e = new C4482e(stringWriter, c4481d.f22309a, c4481d.f22310b, c4481d.f22311c, c4481d.f22312d);
            c4482e.m9330g(obj);
            c4482e.m9332i();
            c4482e.f22314b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* renamed from: r */
    public Pattern m8777r(String str) {
        Object obj;
        C2039g c2039g = (C2039g) this.f20704b;
        synchronized (c2039g) {
            obj = ((C7171a) c2039g.f9606c).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        C2039g c2039g2 = (C2039g) this.f20704b;
        synchronized (c2039g2) {
            ((C7171a) c2039g2.f9606c).put(str, patternCompile);
        }
        return patternCompile;
    }

    /* renamed from: s */
    public j4 m8778s(C0927v c0927v, C7904v c7904v) {
        int i10;
        long jM15026H;
        long j6;
        boolean z6;
        C1915q c1915q = (C1915q) this.f20704b;
        List list = (List) c0927v.f5668b;
        C1915q c1915q2 = new C1915q(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            C5821s c5821s = (C5821s) list.get(i11);
            long j10 = c5821s.f28494a;
            C5820r c5820r = (C5820r) c1915q.m5598b(j10);
            if (c5820r == null) {
                i10 = i11;
                j6 = c5821s.f28495b;
                jM15026H = c5821s.f28497d;
                z6 = false;
            } else {
                long j11 = c5820r.f28491a;
                boolean z10 = c5820r.f28493c;
                i10 = i11;
                jM15026H = c7904v.m15026H(c5820r.f28492b);
                j6 = j11;
                z6 = z10;
            }
            long j12 = c5821s.f28494a;
            List list2 = list;
            int i12 = size;
            c1915q2.m5601e(j12, new C5819q(j12, c5821s.f28495b, c5821s.f28497d, c5821s.f28498e, c5821s.f28499f, j6, jM15026H, z6, c5821s.f28500g, c5821s.f28502i, c5821s.f28503j, c5821s.f28504k));
            boolean z11 = c5821s.f28498e;
            if (z11) {
                c1915q.m5601e(j10, new C5820r(c5821s.f28495b, c5821s.f28496c, z11));
            } else {
                c1915q.m5602f(j10);
            }
            i11 = i10 + 1;
            list = list2;
            size = i12;
        }
        return new j4(c1915q2, c0927v);
    }

    /* renamed from: t */
    public void m8779t(C5388b c5388b) {
        l1 l1Var = (l1) this.f20704b;
        ArrayList arrayList = l1Var.f6278c;
        synchronized (arrayList) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    if (c5388b.equals(((Pair) arrayList.get(i10)).first)) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i1 i1Var = new i1(c5388b);
            arrayList.add(new Pair(c5388b, i1Var));
            if (l1Var.f6281f != null) {
                try {
                    l1Var.f6281f.registerOnMeasurementEventListener(i1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            l1Var.m3482c(new x0(l1Var, i1Var, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public void m8780u(float f6, InterfaceC6747c interfaceC6747c, InterfaceC7266z interfaceC7266z) {
        if (f6 <= interfaceC6747c.mo8435T(k0.f32083a)) {
            return;
        }
        AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
        InterfaceC7559c interfaceC7559c = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
        AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
        try {
            float fFloatValue = ((Number) ((C2780k) this.f20704b).f15490b.getValue()).floatValue();
            C2780k c2780k = (C2780k) this.f20704b;
            if (c2780k.f15494f) {
                this.f20704b = AbstractC2773d.m6789l(c2780k, fFloatValue - f6, DefinitionKt.NO_Float_VALUE, 30);
                tx.c0.m13502y(interfaceC7266z, null, null, new j0(this, interfaceC7559c, 0), 3);
            } else {
                this.f20704b = new C2780k(h1.y1.f15664a, Float.valueOf(-f6), objArr2 == true ? 1 : 0, 60);
                tx.c0.m13502y(interfaceC7266z, null, null, new j0(this, objArr == true ? 1 : 0, 1), 3);
            }
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
        } catch (Throwable th2) {
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m8781v(java.lang.String r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lo.C4498d
            if (r0 == 0) goto L13
            r0 = r8
            lo.d r0 = (lo.C4498d) r0
            int r1 = r0.f22384d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22384d = r1
            goto L18
        L13:
            lo.d r0 = new lo.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f22382b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f22384d
            r3 = 2131952797(0x7f13049d, float:1.9542047E38)
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            java.lang.String r7 = r0.f22381a
            og.od.m10798c(r8)
            goto L50
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            og.od.m10798c(r8)
            if (r7 == 0) goto L89
            boolean r8 = nx.AbstractC5178p.m10101L(r7)
            if (r8 == 0) goto L41
            goto L89
        L41:
            java.lang.Object r8 = r6.f20704b
            xm.y5 r8 = (xm.y5) r8
            r0.f22381a = r7
            r0.f22384d = r5
            java.lang.Object r8 = r8.m15696l(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L60
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L60
            goto L7e
        L60:
            java.util.Iterator r8 = r8.iterator()
        L64:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r8.next()
            mm.m r0 = (mm.C4802m) r0
            java.lang.String r0 = r0.f23891c
            boolean r0 = kotlin.jvm.internal.AbstractC4154l.m8918a(r0, r7)
            if (r0 == 0) goto L64
            kn.l r7 = new kn.l
            r7.<init>()
            return r7
        L7e:
            kn.l r7 = new kn.l
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r3)
            r7.<init>(r4, r8)
            return r7
        L89:
            kn.l r7 = new kn.l
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r3)
            r7.<init>(r4, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C4001v.m8781v(java.lang.String, ww.c):java.lang.Object");
    }

    public C4001v(C4001v c4001v, C7105p c7105p) {
        this.f20703a = 17;
        this.f20704b = c7105p;
        c4001v.m8779t(new C5388b(1, this));
    }

    public C4001v(y5 userSIMRepository) {
        this.f20703a = 7;
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f20704b = userSIMRepository;
    }

    public C4001v(C4033g config) {
        this.f20703a = 5;
        AbstractC4154l.m8923f(config, "config");
        this.f20704b = config;
    }

    public C4001v(C6148f config) {
        this.f20703a = 22;
        AbstractC4154l.m8923f(config, "config");
        this.f20704b = config;
    }

    public C4001v(byte b10, int i10) {
        Object c5070u;
        this.f20703a = i10;
        switch (i10) {
            case 4:
                this.f20704b = new C3378k();
                break;
            case 8:
                this.f20704b = null;
                break;
            case 18:
                this.f20704b = new C1915q((Object) null);
                break;
            case 20:
                InterfaceC7411o.f35200a.getClass();
                C7416t env = C7410n.f35199b;
                AbstractC4154l.m8923f(env, "env");
                this.f20704b = env;
                break;
            case 24:
                this.f20704b = new C2780k(h1.y1.f15664a, Float.valueOf(DefinitionKt.NO_Float_VALUE), new C2781l(DefinitionKt.NO_Float_VALUE), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 25:
                break;
            case 29:
                this.f20704b = o7.m11807b(Looper.getMainLooper());
                break;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    c5070u = new C4005z();
                } else {
                    c5070u = new C5070u(19);
                }
                this.f20704b = c5070u;
                break;
        }
    }

    public C4001v(int i10) {
        this.f20703a = 28;
        C2039g c2039g = new C2039g(10, (char) 0);
        c2039g.f9605b = i10;
        c2039g.f9606c = new C7171a(AbstractC0030c.m112c(i10, 4, 3, 1), c2039g);
        this.f20704b = c2039g;
    }

    public C4001v(InterfaceC7003b interfaceC7003b) {
        this.f20703a = 16;
        this.f20704b = new WeakReference(interfaceC7003b);
    }

    public C4001v(InterfaceC8929f hr2) {
        this.f20703a = 19;
        AbstractC4154l.m8923f(hr2, "hr");
        this.f20704b = hr2;
    }
}
