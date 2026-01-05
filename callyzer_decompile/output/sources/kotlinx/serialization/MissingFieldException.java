package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: a */
    public final List f21170a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List missingFields, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        AbstractC4154l.m8923f(missingFields, "missingFields");
        this.f21170a = missingFields;
    }
}
