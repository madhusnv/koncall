package qc;

import ic.InterfaceC3227e;
import tc.C7117b;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.e */
/* loaded from: classes.dex */
public final class C6159e extends AbstractC8193c {

    /* renamed from: a */
    public C7117b f30017a;

    /* renamed from: b */
    public InterfaceC3227e f30018b;

    /* renamed from: c */
    public /* synthetic */ Object f30019c;

    /* renamed from: d */
    public final /* synthetic */ C6161g f30020d;

    /* renamed from: e */
    public int f30021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6159e(C6161g c6161g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30020d = c6161g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30019c = obj;
        this.f30021e |= Integer.MIN_VALUE;
        return this.f30020d.m12198b(null, this);
    }
}
