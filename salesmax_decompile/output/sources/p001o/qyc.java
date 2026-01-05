package p001o;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p001o.iz4;
import p001o.xga;

/* loaded from: classes2.dex */
public final class qyc implements xga.InterfaceC18153e {

    /* renamed from: a */
    public final long f42621a;

    /* renamed from: b */
    public final iz4 f42622b;

    /* renamed from: c */
    public final int f42623c;

    /* renamed from: d */
    public final o5g f42624d;

    /* renamed from: e */
    public final InterfaceC16488a f42625e;

    /* renamed from: f */
    public volatile Object f42626f;

    /* renamed from: o.qyc$a */
    public interface InterfaceC16488a {
        /* renamed from: a */
        Object mo6958a(Uri uri, InputStream inputStream);
    }

    public qyc(dz4 dz4Var, Uri uri, int i, InterfaceC16488a interfaceC16488a) {
        this(dz4Var, new iz4.C14403b().m32932i(uri).m32925b(1).m32924a(), i, interfaceC16488a);
    }

    /* renamed from: a */
    public long m45979a() {
        return this.f42624d.m41627n();
    }

    @Override // p001o.xga.InterfaceC18153e
    /* renamed from: b */
    public final void mo22073b() {
    }

    /* renamed from: c */
    public Map m45980c() {
        return this.f42624d.m41629p();
    }

    /* renamed from: d */
    public final Object m45981d() {
        return this.f42626f;
    }

    /* renamed from: e */
    public Uri m45982e() {
        return this.f42624d.m41628o();
    }

    @Override // p001o.xga.InterfaceC18153e
    public final void load() throws IOException {
        this.f42624d.m41630q();
        gz4 gz4Var = new gz4(this.f42624d, this.f42622b);
        try {
            gz4Var.m29673c();
            this.f42626f = this.f42625e.mo6958a((Uri) op0.m42515e(this.f42624d.getUri()), gz4Var);
        } finally {
            sqi.m48733l(gz4Var);
        }
    }

    public qyc(dz4 dz4Var, iz4 iz4Var, int i, InterfaceC16488a interfaceC16488a) {
        this.f42624d = new o5g(dz4Var);
        this.f42622b = iz4Var;
        this.f42623c = i;
        this.f42625e = interfaceC16488a;
        this.f42621a = tga.m49830a();
    }
}
