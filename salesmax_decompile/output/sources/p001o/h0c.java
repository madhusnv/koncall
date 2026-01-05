package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class h0c {

    /* renamed from: a */
    public static final h0c f26051a = new h0c();

    /* renamed from: a */
    public static final boolean m29722a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !(f9g.a0(str, TokenParser.SP, 0, false, 6, null) >= 0);
    }
}
