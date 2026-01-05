package dt;

import kotlin.jvm.internal.C4168z;
import tq.EnumC7204p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.h */
/* loaded from: classes3.dex */
public final class C1802h extends AbstractC8193c {

    /* renamed from: a */
    public EnumC7204p f8719a;

    /* renamed from: b */
    public C4168z f8720b;

    /* renamed from: c */
    public C4168z f8721c;

    /* renamed from: d */
    public /* synthetic */ Object f8722d;

    /* renamed from: e */
    public final /* synthetic */ C1804j f8723e;

    /* renamed from: f */
    public int f8724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802h(C1804j c1804j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8723e = c1804j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8722d = obj;
        this.f8724f |= Integer.MIN_VALUE;
        return C1804j.m5475f(this.f8723e, null, this);
    }
}
