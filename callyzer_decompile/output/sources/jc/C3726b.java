package jc;

import hc.AbstractC2880c;
import kotlin.jvm.internal.AbstractC4154l;
import wc.InterfaceC7989w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.b */
/* loaded from: classes.dex */
public final class C3726b extends AbstractC3741q implements InterfaceC3727c {

    /* renamed from: a */
    public final C3748x f19552a;

    /* renamed from: b */
    public final Long f19553b;

    /* renamed from: c */
    public final boolean f19554c;

    public C3726b(C3748x stream) {
        AbstractC4154l.m8923f(stream, "stream");
        this.f19552a = stream;
        this.f19553b = stream.f19601a;
        this.f19554c = stream.f19602b;
    }

    @Override // jc.InterfaceC3727c
    /* renamed from: a */
    public final AbstractC2880c mo8272a() {
        return this.f19552a;
    }

    @Override // jc.AbstractC3745u
    public final Long getContentLength() {
        return this.f19553b;
    }

    @Override // jc.AbstractC3745u
    public final boolean isOneShot() {
        return this.f19554c;
    }

    @Override // jc.AbstractC3741q
    public final InterfaceC7989w readFrom() {
        return ((AbstractC3741q) this.f19552a.f19603c).readFrom();
    }
}
