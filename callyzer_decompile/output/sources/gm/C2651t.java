package gm;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import ay.C0496f;
import c4.C0861k;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import fn.C2336i;
import gn.x2;
import gw.InterfaceC2741c;
import gw.InterfaceC2745g;
import h6.C2856l;
import hm.InterfaceC2979o;
import hm.InterfaceC2980p;
import hm.InterfaceC2983s;
import hn.C2985b;
import hn.C2987d;
import iw.InterfaceC3358a;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import jn.AbstractC3802a;
import jn.InterfaceC3803b;
import jw.C3858a;
import jw.C3859b;
import jw.C3862e;
import jw.InterfaceC3861d;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4490c;
import ln.C4494g;
import ng.C5070u;
import nn.C5113e;
import oj.C5392d;
import oo.C5431l;
import pg.d9;
import pg.r8;
import ph.C5950e;
import pn.C5979e;
import po.C5984e;
import qn.C6263l;
import rn.h0;
import rn.q0;
import rw.AbstractC6663m;
import rw.C6670t;
import so.C6877c;
import tx.InterfaceC7266z;
import tx.m0;
import ug.C7439j;
import uo.C7476a;
import uo.C7481f;
import uo.C7485j;
import wo.C8134s;
import wx.w0;
import xm.C8418z;
import xm.j4;
import xm.l2;
import xm.q4;
import xm.r3;
import xm.s2;
import xm.x1;
import xm.y2;
import xm.y5;
import yh.AbstractC8662f;
import yk.C8687a;
import yv.C8803r;
import yv.C8805t;
import yx.AbstractC8819m;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gm.t */
/* loaded from: classes3.dex */
public final class C2651t implements InterfaceC2634c, InterfaceC2979o, InterfaceC2980p, InterfaceC2983s, InterfaceC3803b, InterfaceC2741c, InterfaceC2745g, InterfaceC3358a {

    /* renamed from: Q */
    public final InterfaceC3861d f14293Q;

    /* renamed from: R */
    public final InterfaceC3861d f14294R;

    /* renamed from: S */
    public final InterfaceC3861d f14295S;

    /* renamed from: T */
    public final InterfaceC3861d f14296T;

    /* renamed from: U */
    public final InterfaceC3861d f14297U;

    /* renamed from: V */
    public final InterfaceC3861d f14298V;

    /* renamed from: W */
    public final InterfaceC3861d f14299W;

    /* renamed from: X */
    public final InterfaceC3861d f14300X;

    /* renamed from: Y */
    public final C2650s f14301Y;

    /* renamed from: Z */
    public final InterfaceC3861d f14302Z;

    /* renamed from: a */
    public final C8687a f14303a;

    /* renamed from: a0, reason: collision with root package name */
    public final InterfaceC3861d f44286a0;

    /* renamed from: b */
    public final C5392d f14304b;

    /* renamed from: b0, reason: collision with root package name */
    public final InterfaceC3861d f44287b0;

    /* renamed from: c */
    public final C2856l f14305c;

    /* renamed from: c0, reason: collision with root package name */
    public final InterfaceC3861d f44288c0;

    /* renamed from: d */
    public final C5070u f14306d;

    /* renamed from: d0, reason: collision with root package name */
    public final InterfaceC3861d f44289d0;

    /* renamed from: e */
    public final C5950e f14307e;

    /* renamed from: e0, reason: collision with root package name */
    public final InterfaceC3861d f44290e0;

    /* renamed from: f0, reason: collision with root package name */
    public final InterfaceC3861d f44291f0;

    /* renamed from: g0, reason: collision with root package name */
    public final InterfaceC3861d f44292g0;

    /* renamed from: h0, reason: collision with root package name */
    public final InterfaceC3861d f44293h0;

    /* renamed from: i0, reason: collision with root package name */
    public final InterfaceC3861d f44294i0;

    /* renamed from: j0, reason: collision with root package name */
    public final InterfaceC3861d f44295j0;

    /* renamed from: f */
    public final C2651t f14308f = this;

    /* renamed from: g */
    public final InterfaceC3861d f14309g = AbstractC1452a.m4569p(this, 3);

    /* renamed from: h */
    public final InterfaceC3861d f14310h = AbstractC1452a.m4569p(this, 2);

    /* renamed from: i */
    public final InterfaceC3861d f14311i = AbstractC1452a.m4569p(this, 4);

    /* renamed from: j */
    public final InterfaceC3861d f14312j = AbstractC1452a.m4569p(this, 5);

    /* renamed from: k */
    public final InterfaceC3861d f14313k = AbstractC1452a.m4569p(this, 6);

    /* renamed from: l */
    public final InterfaceC3861d f14314l = AbstractC1452a.m4569p(this, 7);

    /* renamed from: m */
    public final InterfaceC3861d f14315m = AbstractC1452a.m4569p(this, 8);

    /* renamed from: n */
    public final InterfaceC3861d f14316n = AbstractC1452a.m4569p(this, 9);

    /* renamed from: o */
    public final InterfaceC3861d f14317o = AbstractC1452a.m4569p(this, 10);

    /* renamed from: p */
    public final InterfaceC3861d f14318p = AbstractC1452a.m4569p(this, 11);

    /* renamed from: q */
    public final InterfaceC3861d f14319q = AbstractC1452a.m4569p(this, 12);

    /* renamed from: r */
    public final InterfaceC3861d f14320r = AbstractC1452a.m4569p(this, 13);

    /* renamed from: s */
    public final InterfaceC3861d f14321s = AbstractC1452a.m4569p(this, 14);

    /* renamed from: t */
    public final InterfaceC3861d f14322t = AbstractC1452a.m4569p(this, 15);

    /* renamed from: u */
    public final InterfaceC3861d f14323u = AbstractC1452a.m4569p(this, 16);

    /* renamed from: v */
    public final InterfaceC3861d f14324v = AbstractC1452a.m4569p(this, 17);

    /* renamed from: w */
    public final InterfaceC3861d f14325w = AbstractC1452a.m4569p(this, 18);

    /* renamed from: x */
    public final InterfaceC3861d f14326x = AbstractC1452a.m4569p(this, 19);

    /* renamed from: y */
    public final InterfaceC3861d f14327y = C3859b.m8404a(new C2650s(this, 1));

    /* renamed from: z */
    public final InterfaceC3861d f14328z = C3859b.m8404a(new C2650s(this, 21));

    /* renamed from: A */
    public final InterfaceC3861d f14277A = C3859b.m8404a(new C2650s(this, 20));

    /* renamed from: B */
    public final InterfaceC3861d f14278B = AbstractC1452a.m4569p(this, 30);

    /* renamed from: C */
    public final InterfaceC3861d f14279C = AbstractC1452a.m4569p(this, 29);

    /* renamed from: D */
    public final C3858a f14280D = new C3858a();

    /* renamed from: E */
    public final InterfaceC3861d f14281E = AbstractC1452a.m4569p(this, 32);

    /* renamed from: F */
    public final InterfaceC3861d f14282F = C3859b.m8404a(new C2650s(this, 31));

    /* renamed from: G */
    public final InterfaceC3861d f14283G = C3859b.m8404a(new C2650s(this, 33));

    /* renamed from: H */
    public final InterfaceC3861d f14284H = AbstractC1452a.m4569p(this, 28);

    /* renamed from: I */
    public final InterfaceC3861d f14285I = C3859b.m8404a(new C2650s(this, 27));

    /* renamed from: J */
    public final InterfaceC3861d f14286J = AbstractC1452a.m4569p(this, 35);

    /* renamed from: K */
    public final InterfaceC3861d f14287K = C3859b.m8404a(new C2650s(this, 34));

    /* renamed from: L */
    public final InterfaceC3861d f14288L = AbstractC1452a.m4569p(this, 26);

    /* renamed from: M */
    public final InterfaceC3861d f14289M = AbstractC1452a.m4569p(this, 25);

    /* renamed from: N */
    public final InterfaceC3861d f14290N = AbstractC1452a.m4569p(this, 36);

    /* renamed from: O */
    public final InterfaceC3861d f14291O = AbstractC1452a.m4569p(this, 24);

    /* renamed from: P */
    public final InterfaceC3861d f14292P = AbstractC1452a.m4569p(this, 23);

    public C2651t(C5070u c5070u, C2856l c2856l, C5392d c5392d, C5950e c5950e, C8687a c8687a) {
        this.f14303a = c8687a;
        this.f14304b = c5392d;
        this.f14305c = c2856l;
        this.f14306d = c5070u;
        this.f14307e = c5950e;
        C2650s c2650s = new C2650s(this, 22);
        C3858a c3858a = this.f14280D;
        InterfaceC3861d interfaceC3861dM8404a = C3859b.m8404a(c2650s);
        if (c3858a.f19860a != null) {
            throw new IllegalStateException();
        }
        c3858a.f19860a = interfaceC3861dM8404a;
        this.f14293Q = AbstractC1452a.m4569p(this, 37);
        this.f14294R = C3862e.m8405a(new C2650s(this, 0));
        this.f14295S = AbstractC1452a.m4569p(this, 39);
        this.f14296T = AbstractC1452a.m4569p(this, 40);
        this.f14297U = C3862e.m8405a(new C2650s(this, 38));
        this.f14298V = C3862e.m8405a(new C2650s(this, 41));
        this.f14299W = AbstractC1452a.m4569p(this, 44);
        this.f14300X = AbstractC1452a.m4569p(this, 45);
        this.f14301Y = new C2650s(this, 46);
        this.f14302Z = AbstractC1452a.m4569p(this, 43);
        this.f44286a0 = C3862e.m8405a(new C2650s(this, 42));
        this.f44287b0 = C3862e.m8405a(new C2650s(this, 47));
        this.f44288c0 = C3862e.m8405a(new C2650s(this, 48));
        this.f44289d0 = C3862e.m8405a(new C2650s(this, 49));
        this.f44290e0 = AbstractC1452a.m4569p(this, 51);
        this.f44291f0 = C3862e.m8405a(new C2650s(this, 50));
        this.f44292g0 = C3862e.m8405a(new C2650s(this, 52));
        this.f44293h0 = AbstractC1452a.m4569p(this, 53);
        this.f44294i0 = AbstractC1452a.m4569p(this, 55);
        this.f44295j0 = AbstractC1452a.m4569p(this, 54);
    }

    /* renamed from: a */
    public final C5113e m6611a() {
        return new C5113e((C8418z) this.f14296T.get(), (y5) this.f14281E.get());
    }

    /* renamed from: b */
    public final C2856l m6612b() {
        return new C2856l(this.f14305c.f15864a, false);
    }

    /* renamed from: c */
    public final C5979e m6613c() {
        return new C5979e(m6614d());
    }

    /* renamed from: d */
    public final x1 m6614d() {
        return new x1((x2) this.f14327y.get(), (C2336i) this.f14277A.get(), (C2987d) this.f14280D.get(), AbstractC3802a.m8397a(this.f14307e), (InterfaceC7266z) this.f14299W.get(), this.f14305c.f15864a, m6624n(), (y5) this.f14281E.get(), (q4) this.f14295S.get(), m6633w());
    }

    /* renamed from: e */
    public final l2 m6615e() {
        return new l2((x2) this.f14327y.get(), (C2336i) this.f14277A.get(), (C2987d) this.f14280D.get(), m6633w());
    }

    /* renamed from: f */
    public final C6263l m6616f() {
        return new C6263l(m6615e(), (y5) this.f14281E.get(), this.f14305c.f15864a, (C2336i) this.f14277A.get(), m6633w(), AbstractC3802a.m8397a(this.f14307e));
    }

    /* renamed from: g */
    public final C4490c m6617g() {
        return new C4490c((y5) this.f14281E.get(), (C8418z) this.f14296T.get(), this.f14305c.f15864a, m6633w());
    }

    /* renamed from: h */
    public final y2 m6618h() {
        return new y2((C2336i) this.f14277A.get(), (C2987d) this.f14280D.get(), m6633w());
    }

    /* renamed from: i */
    public final ao.c0 m6619i() {
        C2856l c2856l = this.f14305c;
        return new ao.c0(c2856l.f15864a, tx.c0.m13479b(m0.f34659a), m6629s(), (y5) this.f14281E.get(), m6614d(), m6633w(), m6632v(), m6625o(), m6624n(), (C8418z) this.f14296T.get(), (C8803r) this.f14293Q.get(), new C7439j(m6632v(), (C2985b) this.f14287K.get(), c2856l.f15864a));
    }

    /* renamed from: j */
    public final q0 m6620j() {
        return new q0(this.f14305c.f15864a, (s2) this.f14300X.get(), m6614d(), m6625o(), m6630t(), m6631u(), m6624n(), m6633w(), m6627q(), (C8418z) this.f14296T.get());
    }

    /* renamed from: k */
    public final void m6621k(PhoneStateReceiver phoneStateReceiver) {
        phoneStateReceiver.f7283c = AbstractC3802a.m8397a(this.f14307e);
        C0496f c0496f = m0.f34659a;
        phoneStateReceiver.f7284d = tx.c0.m13479b(AbstractC8819m.f42514a);
        phoneStateReceiver.f7286f = m6633w();
        phoneStateReceiver.f7287g = (h0) this.f14302Z.get();
        phoneStateReceiver.f7289i = m6633w();
        phoneStateReceiver.f7290j = m6631u();
        phoneStateReceiver.f7291k = m6634x();
        phoneStateReceiver.f7292l = (C8803r) this.f14293Q.get();
        phoneStateReceiver.f7293m = (C7481f) this.f44293h0.get();
        phoneStateReceiver.f7294n = (C7476a) this.f44295j0.get();
        phoneStateReceiver.f7295o = m6619i();
        phoneStateReceiver.f7296p = (C8418z) this.f14296T.get();
        phoneStateReceiver.f7297q = (y5) this.f14281E.get();
        phoneStateReceiver.f7298r = m6628r();
        phoneStateReceiver.f7299s = m6623m();
        phoneStateReceiver.f7300t = m6625o();
        phoneStateReceiver.f7301u = new C0861k(m6625o());
        phoneStateReceiver.f7302v = m6612b();
        phoneStateReceiver.f7303w = this.f14305c.f15864a;
    }

    /* renamed from: l */
    public final r3 m6622l() {
        return new r3((C2987d) this.f14280D.get(), (x2) this.f14327y.get(), (y5) this.f14281E.get(), m6630t(), AbstractC3802a.m8397a(this.f14307e), this.f14305c.f15864a, m6633w());
    }

    /* renamed from: m */
    public final C5431l m6623m() {
        C5431l c5431l = new C5431l(this.f14305c.f15864a, m6614d(), m6622l(), m6631u(), (y5) this.f14281E.get(), m6633w(), (C8803r) this.f14293Q.get(), m6634x());
        c5431l.f27328i = AbstractC3802a.m8397a(this.f14307e);
        return c5431l;
    }

    /* renamed from: n */
    public final C5984e m6624n() {
        return new C5984e(this.f14305c.f15864a, m6626p(), m6625o());
    }

    /* renamed from: o */
    public final C6877c m6625o() {
        return new C6877c((y5) this.f14281E.get(), m6633w());
    }

    /* renamed from: p */
    public final j4 m6626p() {
        return new j4((x2) this.f14327y.get(), (C2336i) this.f14277A.get(), (C2987d) this.f14280D.get(), this.f14305c.f15864a, m6633w());
    }

    /* renamed from: q */
    public final C7485j m6627q() {
        return new C7485j((y5) this.f14281E.get(), m6618h(), m6611a(), this.f14305c.f15864a, (C8803r) this.f14293Q.get(), m6633w(), (s2) this.f14300X.get());
    }

    /* renamed from: r */
    public final C4494g m6628r() {
        return new C4494g((q4) this.f14295S.get());
    }

    /* renamed from: s */
    public final AbstractC8662f m6629s() {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        Context context = this.f14305c.f15864a;
        Object systemService = context.getSystemService("telephony_subscription_service");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.telephony.SubscriptionManager");
        SubscriptionManager subscriptionManager = (SubscriptionManager) systemService;
        Set setG0 = C6670t.f31945a;
        try {
            if (d9.m11588a(context, "android.permission.READ_PHONE_STATE") && (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) != null) {
                setG0 = AbstractC6663m.g0(activeSubscriptionInfoList);
            }
        } catch (Exception unused) {
        }
        Set set = setG0;
        int i10 = AbstractC8662f.f41966c;
        if ((set instanceof AbstractC8662f) && !(set instanceof SortedSet)) {
            AbstractC8662f abstractC8662f = (AbstractC8662f) set;
            if (!abstractC8662f.mo15997g()) {
                return abstractC8662f;
            }
        }
        Object[] array = set.toArray();
        return AbstractC8662f.m16004k(array.length, array);
    }

    /* renamed from: t */
    public final w0 m6630t() {
        C8803r networkMonitorUtil = (C8803r) this.f14293Q.get();
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        w0 w0Var = networkMonitorUtil.f42471f;
        r8.m11853a(w0Var);
        return w0Var;
    }

    /* renamed from: u */
    public final C8134s m6631u() {
        C8134s c8134s = new C8134s(m6614d(), (y5) this.f14281E.get(), (C8418z) this.f14296T.get(), m6615e(), (C8803r) this.f14293Q.get(), (q4) this.f14295S.get(), AbstractC3802a.m8397a(this.f14307e), m6633w(), (s2) this.f14300X.get(), this.f14301Y);
        m6632v();
        return c8134s;
    }

    /* renamed from: v */
    public final TelephonyManager m6632v() {
        Object systemService = this.f14305c.f15864a.getSystemService("phone");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }

    /* renamed from: w */
    public final C8805t m6633w() {
        return new C8805t(this.f14305c.f15864a);
    }

    /* renamed from: x */
    public final C9000c m6634x() {
        return new C9000c(this.f14305c.f15864a, m6633w());
    }
}
