package aws.smithy.kotlin.runtime.time;

import aws.smithy.kotlin.runtime.SdkBaseException;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ParseException extends SdkBaseException {
    public ParseException(String input, String message, int i10) {
        AbstractC4154l.m8923f(input, "input");
        AbstractC4154l.m8923f(message, "message");
        StringBuilder sb2 = new StringBuilder("parse `");
        AbstractC1452a.m4551B(sb2, input, "`: error at ", i10, ": ");
        sb2.append(message);
        super(sb2.toString());
    }
}
