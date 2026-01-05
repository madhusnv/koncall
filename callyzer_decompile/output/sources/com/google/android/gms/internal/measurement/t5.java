package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t5 extends AbstractC1292h {

    /* renamed from: c */
    public final /* synthetic */ int f6393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(String str, int i10) {
        super(str);
        this.f6393c = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1292h
    /* renamed from: d */
    public final InterfaceC1298n mo3299d(C0919n c0919n, List list) {
        switch (this.f6393c) {
            case 0:
                return InterfaceC1298n.f6309i;
            case 1:
            case 2:
                return this;
            case 3:
                return new C1291g(Double.valueOf(0.0d));
            default:
                return InterfaceC1298n.f6309i;
        }
    }
}
