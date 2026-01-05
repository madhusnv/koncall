package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes5.dex */
public class C10727d {

    /* renamed from: a */
    public final Map f11193a;

    /* renamed from: com.bumptech.glide.d$a */
    public static final class a {

        /* renamed from: a */
        public final Map f11194a = new HashMap();

        /* renamed from: b */
        public C10727d m12679b() {
            return new C10727d(this);
        }
    }

    public C10727d(a aVar) {
        this.f11193a = Collections.unmodifiableMap(new HashMap(aVar.f11194a));
    }

    /* renamed from: a */
    public boolean m12677a(Class cls) {
        return this.f11193a.containsKey(cls);
    }
}
