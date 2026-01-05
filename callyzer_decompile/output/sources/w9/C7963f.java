package w9;

import ad.C0109p;
import com.google.android.gms.internal.measurement.b4;
import hb.C2876b;
import i9.C3184b;
import java.util.ArrayList;
import java.util.List;
import k4.C4001v;
import k9.C4032f;
import lc.InterfaceC4440c;
import ld.InterfaceC4447g;
import nc.InterfaceC4991b;
import pg.y7;
import rw.C6668r;
import sa.C6773a;
import sb.InterfaceC6779f;
import ta.C7083a;
import tx.c0;
import ug.C7455z;
import uw.C7565i;
import uw.InterfaceC7559c;
import v0.C7622f;
import zb.AbstractC8912f;
import zb.C8911e;
import zb.InterfaceC8918l;
import zb.InterfaceC8922p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w9.f */
/* loaded from: classes.dex */
public final class C7963f implements InterfaceC8922p, InterfaceC4440c, InterfaceC8918l {

    /* renamed from: a */
    public final /* synthetic */ C4001v f38308a;

    /* renamed from: b */
    public final /* synthetic */ C7622f f38309b;

    /* renamed from: c */
    public final String f38310c;

    /* renamed from: d */
    public final String f38311d;

    /* renamed from: e */
    public final C6668r f38312e;

    /* renamed from: f */
    public final InterfaceC6779f f38313f;

    /* renamed from: g */
    public final C7455z f38314g;

    /* renamed from: h */
    public final C0109p f38315h;

    /* renamed from: j */
    public final ArrayList f38316j;

    /* renamed from: k */
    public final AbstractC8912f f38317k;

    /* renamed from: l */
    public final C6773a f38318l;

    /* renamed from: m */
    public final InterfaceC4447g f38319m;

    /* renamed from: n */
    public final boolean f38320n;

    /* renamed from: p */
    public final boolean f38321p;

    /* renamed from: q */
    public final String f38322q;

    /* renamed from: r */
    public final C2876b f38323r;

    public C7963f(C7962e c7962e) {
        C4001v c4001v = (C4001v) c7962e.f38294a.m9130d();
        this.f38308a = c4001v;
        this.f38309b = (C7622f) c7962e.f38295b.m16407a();
        this.f38310c = c7962e.f38296c;
        String str = c7962e.f38297d;
        str = str == null ? (String) c0.m13468D(C7565i.f36440a, new C4032f(c7962e, (InterfaceC7559c) null, 16)) : str;
        this.f38311d = str;
        new C7083a(null, null, 7);
        List list = c7962e.f38298e;
        this.f38312e = c7962e.f38299f;
        InterfaceC6779f interfaceC6779f = c7962e.f38300g;
        this.f38313f = interfaceC6779f == null ? y7.m11945a(new C3184b((InterfaceC4991b) c4001v.f20704b, str)) : interfaceC6779f;
        this.f38314g = new C7455z(24);
        this.f38315h = c7962e.f38301h;
        this.f38316j = c7962e.f38302j;
        AbstractC8912f abstractC8912f = c7962e.f38303k;
        this.f38317k = abstractC8912f == null ? C8911e.f42873d : abstractC8912f;
        this.f38318l = C6773a.f32230c;
        InterfaceC4447g interfaceC4447g = c7962e.f38304l;
        this.f38319m = interfaceC4447g == null ? b4.m3151a(InterfaceC4447g.f22179a) : interfaceC4447g;
        Boolean bool = c7962e.f38305m;
        this.f38320n = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = c7962e.f38306n;
        this.f38321p = bool2 != null ? bool2.booleanValue() : false;
        this.f38322q = c7962e.f38307p;
        this.f38323r = new C2876b(list, 3);
    }
}
