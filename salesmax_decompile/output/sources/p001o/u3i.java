package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public class u3i extends RuntimeException {

    /* renamed from: a */
    public final List f48303a;

    public u3i(scb scbVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f48303a = null;
    }

    /* renamed from: a */
    public ct8 m50928a() {
        return new ct8(getMessage());
    }
}
