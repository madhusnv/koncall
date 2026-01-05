package p001o;

import java.util.List;

/* loaded from: classes4.dex */
public class v3i extends RuntimeException {

    /* renamed from: a */
    public final List f49835a;

    public v3i(rcb rcbVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f49835a = null;
    }

    /* renamed from: a */
    public bt8 m52309a() {
        return new bt8(getMessage());
    }
}
