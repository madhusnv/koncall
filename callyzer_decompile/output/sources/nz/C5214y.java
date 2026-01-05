package nz;

import iz.C3368a;
import iz.C3391x;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import l1.C4327p;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.y */
/* loaded from: classes3.dex */
public final class C5214y {

    /* renamed from: a */
    public final C3368a f25425a;

    /* renamed from: b */
    public final C4327p f25426b;

    /* renamed from: c */
    public final C5190a f25427c;

    /* renamed from: d */
    public final boolean f25428d;

    /* renamed from: e */
    public final List f25429e;

    /* renamed from: f */
    public int f25430f;

    /* renamed from: g */
    public Object f25431g;

    /* renamed from: h */
    public final ArrayList f25432h;

    public C5214y(C3368a address, C4327p routeDatabase, C5190a connectionUser, boolean z6) {
        List listM9022k;
        AbstractC4154l.m8923f(address, "address");
        AbstractC4154l.m8923f(routeDatabase, "routeDatabase");
        AbstractC4154l.m8923f(connectionUser, "connectionUser");
        this.f25425a = address;
        this.f25426b = routeDatabase;
        this.f25427c = connectionUser;
        this.f25428d = z6;
        C6668r c6668r = C6668r.f31943a;
        this.f25429e = c6668r;
        this.f25431g = c6668r;
        this.f25432h = new ArrayList();
        C3391x url = address.f17780h;
        connectionUser.getClass();
        AbstractC4154l.m8923f(url, "url");
        C5205p c5205p = connectionUser.f25297a;
        c5205p.f25362d.mo7773o(c5205p, url);
        URI uriM7803h = url.m7803h();
        if (uriM7803h.getHost() == null) {
            listM9022k = AbstractC4299e.m9022k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = address.f17779g.select(uriM7803h);
            listM9022k = (listSelect == null || listSelect.isEmpty()) ? AbstractC4299e.m9022k(new Proxy[]{Proxy.NO_PROXY}) : AbstractC4299e.m9021j(listSelect);
        }
        this.f25429e = listM9022k;
        this.f25430f = 0;
        AbstractC4154l.m8923f(url, "url");
        C5205p c5205p2 = connectionUser.f25297a;
        c5205p2.f25362d.mo7772n(c5205p2, url, listM9022k);
    }

    /* renamed from: a */
    public final boolean m10209a() {
        return this.f25430f < this.f25429e.size() || !this.f25432h.isEmpty();
    }
}
