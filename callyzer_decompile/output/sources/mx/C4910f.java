package mx;

import bx.C0797g;
import ex.InterfaceC2139c;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mx.f */
/* loaded from: classes3.dex */
public final class C4910f implements InterfaceC4911g {

    /* renamed from: a */
    public final InterfaceC4911g f24447a;

    /* renamed from: b */
    public final boolean f24448b;

    /* renamed from: c */
    public final InterfaceC2139c f24449c;

    public C4910f(InterfaceC4911g interfaceC4911g, boolean z6, InterfaceC2139c interfaceC2139c) {
        this.f24447a = interfaceC4911g;
        this.f24448b = z6;
        this.f24449c = interfaceC2139c;
    }

    @Override // mx.InterfaceC4911g
    public final Iterator iterator() {
        return new C0797g(this);
    }
}
