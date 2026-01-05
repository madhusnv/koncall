package mx;

import bx.C0797g;
import ex.InterfaceC2139c;
import fc.C2254b;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mx.k */
/* loaded from: classes3.dex */
public final class C4915k implements InterfaceC4911g {

    /* renamed from: a */
    public final /* synthetic */ int f24455a;

    /* renamed from: b */
    public final InterfaceC4911g f24456b;

    /* renamed from: c */
    public final InterfaceC2139c f24457c;

    public C4915k(InterfaceC4911g sequence, InterfaceC2139c interfaceC2139c, int i10) {
        this.f24455a = i10;
        switch (i10) {
            case 1:
                AbstractC4154l.m8923f(sequence, "sequence");
                this.f24456b = sequence;
                this.f24457c = interfaceC2139c;
                break;
            default:
                this.f24456b = sequence;
                this.f24457c = interfaceC2139c;
                break;
        }
    }

    @Override // mx.InterfaceC4911g
    public final Iterator iterator() {
        switch (this.f24455a) {
            case 0:
                return new C0797g(this);
            default:
                return new C2254b(this);
        }
    }
}
