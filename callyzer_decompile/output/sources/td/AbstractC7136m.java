package td;

import aws.smithy.kotlin.runtime.time.IncompleteException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.m */
/* loaded from: classes.dex */
public abstract class AbstractC7136m {
    /* renamed from: a */
    public static final String m13411a(int i10, int i11, int i12, String str) {
        return "expected " + (i10 == i11 ? "exactly" : "at least") + ' ' + i12 + " digits; " + str;
    }

    /* renamed from: b */
    public static final void m13412b(int i10, int i11, String input) {
        AbstractC4154l.m8923f(input, "input");
        if (i11 == 0) {
            if (i10 < input.length()) {
                return;
            }
        } else if (i10 + i11 <= input.length()) {
            return;
        }
        throw new IncompleteException(input, i11 == 0 ? C7128e.f34348a : new C7127d(i11));
    }
}
