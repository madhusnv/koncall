package b8;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.C4168z;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.l */
/* loaded from: classes.dex */
public final class C0617l extends AbstractC8193c {

    /* renamed from: a */
    public C0618m f4039a;

    /* renamed from: b */
    public InterfaceC2137a f4040b;

    /* renamed from: c */
    public C4168z f4041c;

    /* renamed from: d */
    public long f4042d;

    /* renamed from: e */
    public /* synthetic */ Object f4043e;

    /* renamed from: f */
    public final /* synthetic */ C0618m f4044f;

    /* renamed from: g */
    public int f4045g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0617l(C0618m c0618m, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4044f = c0618m;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4043e = obj;
        this.f4045g |= Integer.MIN_VALUE;
        return this.f4044f.m1772b(0L, null, this);
    }
}
