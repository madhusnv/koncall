package aws.smithy.kotlin.runtime.time;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TakeWhileMNException extends ParseException {

    /* renamed from: b */
    public final int f3514b;

    /* renamed from: c */
    public final int f3515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeWhileMNException(String input, int i10, int i11, int i12) {
        super(input, "expected at least " + i11 + " matches of predicate; only matched " + i12, i10);
        AbstractC4154l.m8923f(input, "input");
        this.f3514b = i11;
        this.f3515c = i12;
    }
}
