package aws.smithy.kotlin.runtime.time;

import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5930k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IncompleteException extends ParseException {

    /* renamed from: b */
    public final AbstractC5930k f3513b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompleteException(String input, AbstractC5930k abstractC5930k) {
        super(input, abstractC5930k.toString(), input.length() - 1);
        AbstractC4154l.m8923f(input, "input");
        this.f3513b = abstractC5930k;
    }
}
