package ua;

import ad.C0109p;
import bb.C0641b;
import com.google.android.gms.internal.measurement.b4;
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
import sb.InterfaceC6775b;
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
/* renamed from: ua.b */
/* loaded from: classes.dex */
public final class C7382b implements InterfaceC8922p, InterfaceC4440c, InterfaceC8918l {

    /* renamed from: a */
    public final /* synthetic */ C4001v f35100a;

    /* renamed from: b */
    public final /* synthetic */ C7622f f35101b;

    /* renamed from: c */
    public final String f35102c;

    /* renamed from: d */
    public final String f35103d;

    /* renamed from: e */
    public final C6668r f35104e;

    /* renamed from: f */
    public final InterfaceC6775b f35105f;

    /* renamed from: g */
    public final C7455z f35106g;

    /* renamed from: h */
    public final C0109p f35107h;

    /* renamed from: j */
    public final ArrayList f35108j;

    /* renamed from: k */
    public final AbstractC8912f f35109k;

    /* renamed from: l */
    public final C6773a f35110l;

    /* renamed from: m */
    public final InterfaceC4447g f35111m;

    /* renamed from: n */
    public final boolean f35112n;

    /* renamed from: p */
    public final boolean f35113p;

    /* renamed from: q */
    public final String f35114q;

    /* renamed from: r */
    public final C0641b f35115r;

    public C7382b(C7381a c7381a) {
        C4001v c4001v = (C4001v) c7381a.f35089a.m9130d();
        this.f35100a = c4001v;
        this.f35101b = (C7622f) c7381a.f35090b.m16407a();
        this.f35102c = c7381a.f35091c;
        String str = c7381a.f35092d;
        str = str == null ? (String) c0.m13468D(C7565i.f36440a, new C4032f(c7381a, (InterfaceC7559c) null, 14)) : str;
        this.f35103d = str;
        new C7083a(null, null, 7);
        List list = c7381a.f35093e;
        this.f35104e = c7381a.f35094f;
        this.f35105f = y7.m11945a(new C3184b((InterfaceC4991b) c4001v.f20704b, str));
        this.f35106g = new C7455z(21);
        this.f35107h = null;
        this.f35108j = c7381a.f35095g;
        AbstractC8912f abstractC8912f = c7381a.f35096h;
        this.f35109k = abstractC8912f == null ? C8911e.f42873d : abstractC8912f;
        this.f35110l = C6773a.f32230c;
        this.f35111m = b4.m3151a(InterfaceC4447g.f22179a);
        Boolean bool = c7381a.f35097j;
        this.f35112n = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = c7381a.f35098k;
        this.f35113p = bool2 != null ? bool2.booleanValue() : false;
        this.f35114q = c7381a.f35099l;
        this.f35115r = new C0641b(list, 1);
    }
}
