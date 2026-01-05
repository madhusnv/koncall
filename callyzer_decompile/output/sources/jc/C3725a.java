package jc;

import hc.AbstractC2880c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.a */
/* loaded from: classes.dex */
public final class C3725a extends AbstractC3740p implements InterfaceC3727c {

    /* renamed from: a */
    public final C3747w f19547a;

    /* renamed from: b */
    public final Long f19548b;

    public C3725a(C3747w stream) {
        AbstractC4154l.m8923f(stream, "stream");
        this.f19547a = stream;
        this.f19548b = stream.f19599a;
    }

    @Override // jc.InterfaceC3727c
    /* renamed from: a */
    public final AbstractC2880c mo8272a() {
        return this.f19547a;
    }

    @Override // jc.AbstractC3740p
    /* renamed from: b */
    public final byte[] mo8273b() {
        return ((AbstractC3740p) this.f19547a.f19600b).mo8273b();
    }

    @Override // jc.AbstractC3745u
    public final Long getContentLength() {
        return this.f19548b;
    }
}
