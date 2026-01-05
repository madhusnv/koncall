package m8;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m8.d */
/* loaded from: classes.dex */
public final class C4674d extends RuntimeException {

    /* renamed from: a */
    public final EnumC4675e f23118a;

    /* renamed from: b */
    public final Throwable f23119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4674d(EnumC4675e callbackName, Throwable th2) {
        super(th2);
        AbstractC4154l.m8923f(callbackName, "callbackName");
        this.f23118a = callbackName;
        this.f23119b = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f23119b;
    }
}
