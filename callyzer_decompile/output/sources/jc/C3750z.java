package jc;

import wc.InterfaceC7989w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.z */
/* loaded from: classes.dex */
public final class C3750z extends AbstractC3741q {

    /* renamed from: a */
    public final Long f19607a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7989w f19608b;

    public C3750z(Long l9, InterfaceC7989w interfaceC7989w) {
        this.f19608b = interfaceC7989w;
        this.f19607a = l9;
    }

    @Override // jc.AbstractC3745u
    public final Long getContentLength() {
        return this.f19607a;
    }

    @Override // jc.AbstractC3745u
    public final boolean isOneShot() {
        return true;
    }

    @Override // jc.AbstractC3741q
    public final InterfaceC7989w readFrom() {
        return this.f19608b;
    }
}
