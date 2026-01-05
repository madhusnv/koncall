package p001o;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class bg2 {

    /* renamed from: a */
    public final String f16112a;

    /* renamed from: b */
    public final Map f16113b;

    public bg2(String str, Map map) {
        String lowerCase;
        sq8.m48649h(str, "scheme");
        sq8.m48649h(map, "authParams");
        this.f16112a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale locale = Locale.US;
                sq8.m48648g(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        sq8.m48648g(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f16113b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public final Map m18842a() {
        return this.f16113b;
    }

    /* renamed from: b */
    public final Charset m18843b() {
        String str = (String) this.f16113b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                sq8.m48648g(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return sh2.f45427g;
    }

    /* renamed from: c */
    public final String m18844c() {
        return (String) this.f16113b.get("realm");
    }

    /* renamed from: d */
    public final String m18845d() {
        return this.f16112a;
    }

    public boolean equals(Object obj) {
        return ufj.m51547a(this, obj);
    }

    public int hashCode() {
        return ufj.m51548b(this);
    }

    public String toString() {
        return ufj.m51549c(this);
    }
}
