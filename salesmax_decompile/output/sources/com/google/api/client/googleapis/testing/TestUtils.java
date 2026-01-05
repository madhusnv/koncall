package com.google.api.client.googleapis.testing;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p001o.fga;
import p001o.x0g;

/* loaded from: classes3.dex */
public final class TestUtils {
    private static final String UTF_8 = "UTF-8";

    private TestUtils() {
    }

    public static Map<String, String> parseQuery(String str) throws IOException {
        HashMap map = new HashMap();
        Iterator it = x0g.m55532e('&').m55534g(str).iterator();
        while (it.hasNext()) {
            ArrayList arrayListM26652h = fga.m26652h(x0g.m55532e('=').m55534g((String) it.next()));
            if (arrayListM26652h.size() != 2) {
                throw new IOException("Invalid Query String");
            }
            map.put(URLDecoder.decode((String) arrayListM26652h.get(0), "UTF-8"), URLDecoder.decode((String) arrayListM26652h.get(1), "UTF-8"));
        }
        return map;
    }
}
