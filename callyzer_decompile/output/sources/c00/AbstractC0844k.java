package c00;

import java.util.logging.Logger;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.k */
/* loaded from: classes3.dex */
public abstract class AbstractC0844k {

    /* renamed from: a */
    public static final Logger f5345a = Logger.getLogger("okio.Okio");

    /* renamed from: a */
    public static final boolean m2262a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC5178p.m10116x(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
