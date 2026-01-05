package mx;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mx.c */
/* loaded from: classes3.dex */
public final class C4907c implements InterfaceC4911g, InterfaceC4908d {

    /* renamed from: a */
    public final InterfaceC4911g f24444a;

    /* renamed from: b */
    public final int f24445b;

    public C4907c(InterfaceC4911g sequence, int i10) {
        AbstractC4154l.m8923f(sequence, "sequence");
        this.f24444a = sequence;
        this.f24445b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // mx.InterfaceC4908d
    /* renamed from: a */
    public final InterfaceC4911g mo9803a(int i10) {
        int i11 = this.f24445b + i10;
        return i11 < 0 ? new C4907c(this, i10) : new C4907c(this.f24444a, i11);
    }

    @Override // mx.InterfaceC4911g
    public final Iterator iterator() {
        return new C4906b(this);
    }
}
