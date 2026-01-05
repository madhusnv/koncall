package jc;

import hc.AbstractC2879b;
import hc.AbstractC2880c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.d */
/* loaded from: classes.dex */
public final class C3728d extends AbstractC3744t implements InterfaceC3727c {

    /* renamed from: a */
    public final AbstractC2879b f19556a;

    /* renamed from: b */
    public final Long f19557b;

    /* renamed from: c */
    public final boolean f19558c;

    public C3728d(AbstractC2879b stream) {
        AbstractC4154l.m8923f(stream, "stream");
        this.f19556a = stream;
        this.f19557b = stream.mo6995a();
        this.f19558c = stream.mo6996b();
    }

    @Override // jc.InterfaceC3727c
    /* renamed from: a */
    public final AbstractC2880c mo8272a() {
        return this.f19556a;
    }

    @Override // jc.AbstractC3745u
    public final Long getContentLength() {
        return this.f19557b;
    }

    @Override // jc.AbstractC3745u
    public final boolean isOneShot() {
        return this.f19558c;
    }

    @Override // jc.AbstractC3744t
    public final wc.e0 readFrom() {
        return this.f19556a.mo6994c();
    }
}
