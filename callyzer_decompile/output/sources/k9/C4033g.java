package k9;

import ad.C0109p;
import com.google.android.gms.internal.measurement.b4;
import hb.C2876b;
import i9.C3184b;
import java.util.ArrayList;
import java.util.List;
import k4.C4001v;
import lc.InterfaceC4440c;
import ld.InterfaceC4447g;
import nc.InterfaceC4991b;
import pg.y7;
import ph.C5950e;
import rw.C6668r;
import sa.C6773a;
import sb.InterfaceC6775b;
import ta.C7083a;
import tx.c0;
import uw.C7565i;
import uw.InterfaceC7559c;
import v0.C7622f;
import zb.AbstractC8912f;
import zb.C8911e;
import zb.InterfaceC8918l;
import zb.InterfaceC8922p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k9.g */
/* loaded from: classes.dex */
public final class C4033g implements InterfaceC8922p, InterfaceC4440c, InterfaceC8918l {

    /* renamed from: a */
    public final /* synthetic */ C4001v f20834a;

    /* renamed from: b */
    public final /* synthetic */ C7622f f20835b;

    /* renamed from: c */
    public final String f20836c;

    /* renamed from: d */
    public final String f20837d;

    /* renamed from: e */
    public final C6668r f20838e;

    /* renamed from: f */
    public final InterfaceC6775b f20839f;

    /* renamed from: g */
    public final C5950e f20840g;

    /* renamed from: h */
    public final C0109p f20841h;

    /* renamed from: j */
    public final ArrayList f20842j;

    /* renamed from: k */
    public final AbstractC8912f f20843k;

    /* renamed from: l */
    public final C6773a f20844l;

    /* renamed from: m */
    public final InterfaceC4447g f20845m;

    /* renamed from: n */
    public final boolean f20846n;

    /* renamed from: p */
    public final boolean f20847p;

    /* renamed from: q */
    public final String f20848q;

    /* renamed from: r */
    public final C2876b f20849r;

    public C4033g(C4031e c4031e) {
        C4001v c4001v = (C4001v) c4031e.f20818a.m9130d();
        this.f20834a = c4001v;
        this.f20835b = (C7622f) c4031e.f20819b.m16407a();
        this.f20836c = c4031e.f20820c;
        String str = c4031e.f20821d;
        str = str == null ? (String) c0.m13468D(C7565i.f36440a, new C4032f(c4031e, (InterfaceC7559c) null, 0)) : str;
        this.f20837d = str;
        new C7083a(null, null, 7);
        List list = c4031e.f20822e;
        this.f20838e = c4031e.f20823f;
        this.f20839f = y7.m11945a(new C3184b((InterfaceC4991b) c4001v.f20704b, str));
        this.f20840g = new C5950e(20);
        this.f20841h = c4031e.f20824g;
        this.f20842j = c4031e.f20825h;
        AbstractC8912f abstractC8912f = c4031e.f20826j;
        this.f20843k = abstractC8912f == null ? C8911e.f42873d : abstractC8912f;
        this.f20844l = C6773a.f32230c;
        InterfaceC4447g interfaceC4447g = c4031e.f20827k;
        this.f20845m = interfaceC4447g == null ? b4.m3151a(InterfaceC4447g.f22179a) : interfaceC4447g;
        Boolean bool = c4031e.f20828l;
        this.f20846n = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = c4031e.f20829m;
        this.f20847p = bool2 != null ? bool2.booleanValue() : false;
        this.f20848q = c4031e.f20830n;
        this.f20849r = new C2876b(list, 1);
    }
}
