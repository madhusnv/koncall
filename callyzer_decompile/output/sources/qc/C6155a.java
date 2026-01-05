package qc;

import ww.AbstractC8193c;
import zb.InterfaceC8913g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.a */
/* loaded from: classes.dex */
public final class C6155a extends AbstractC8193c {

    /* renamed from: a */
    public C6161g f29998a;

    /* renamed from: b */
    public InterfaceC8913g f29999b;

    /* renamed from: c */
    public C6161g f30000c;

    /* renamed from: d */
    public /* synthetic */ Object f30001d;

    /* renamed from: e */
    public final /* synthetic */ C6161g f30002e;

    /* renamed from: f */
    public int f30003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6155a(C6161g c6161g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30002e = c6161g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30001d = obj;
        this.f30003f |= Integer.MIN_VALUE;
        return C6161g.m12194c(this.f30002e, null, this);
    }
}
