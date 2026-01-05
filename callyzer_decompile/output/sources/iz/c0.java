package iz;

import gm.C2657z;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import nf.C5047i;
import pc.C5892t;
import xz.C8521c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: b */
    public C5047i f17810b;

    /* renamed from: e */
    public InterfaceC3385r f17813e;

    /* renamed from: f */
    public boolean f17814f;

    /* renamed from: g */
    public final boolean f17815g;

    /* renamed from: h */
    public final C3381n f17816h;

    /* renamed from: i */
    public boolean f17817i;

    /* renamed from: j */
    public boolean f17818j;

    /* renamed from: k */
    public final C3381n f17819k;

    /* renamed from: l */
    public InterfaceC3383p f17820l;

    /* renamed from: m */
    public C5892t f17821m;

    /* renamed from: n */
    public InterfaceC3369b f17822n;

    /* renamed from: o */
    public final SocketFactory f17823o;

    /* renamed from: p */
    public List f17824p;

    /* renamed from: q */
    public final List f17825q;

    /* renamed from: r */
    public final C8521c f17826r;

    /* renamed from: s */
    public final C3373f f17827s;

    /* renamed from: t */
    public int f17828t;

    /* renamed from: u */
    public int f17829u;

    /* renamed from: v */
    public int f17830v;

    /* renamed from: a */
    public C3382o f17809a = new C3382o();

    /* renamed from: c */
    public final ArrayList f17811c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f17812d = new ArrayList();

    public c0() {
        TimeZone timeZone = AbstractC4299e.f21707a;
        this.f17813e = new C2657z(18);
        this.f17814f = true;
        this.f17815g = true;
        C3381n c3381n = InterfaceC3369b.H0;
        this.f17816h = c3381n;
        this.f17817i = true;
        this.f17818j = true;
        this.f17819k = C3381n.f17960a;
        this.f17820l = InterfaceC3383p.I0;
        this.f17822n = c3381n;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC4154l.m8922e(socketFactory, "getDefault(...)");
        this.f17823o = socketFactory;
        this.f17824p = d0.f17832C;
        this.f17825q = d0.f17831B;
        this.f17826r = C8521c.f41446a;
        this.f17827s = C3373f.f17860c;
        this.f17828t = 10000;
        this.f17829u = 10000;
        this.f17830v = 10000;
    }
}
