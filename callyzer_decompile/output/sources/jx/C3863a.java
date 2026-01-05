package jx;

import ix.AbstractC3360a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jx.a */
/* loaded from: classes3.dex */
public final class C3863a extends AbstractC3360a {
    @Override // ix.AbstractC3363d
    /* renamed from: b */
    public final double mo7675b(double d2) {
        return ThreadLocalRandom.current().nextDouble(d2);
    }

    @Override // ix.AbstractC3360a
    /* renamed from: d */
    public final Random mo7674d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC4154l.m8922e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
