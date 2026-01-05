package p001o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k28 {

    /* renamed from: a */
    public final Map f31393a = new HashMap();

    /* renamed from: b */
    public Map f31394b;

    /* renamed from: a */
    public synchronized Map m34931a() {
        if (this.f31394b == null) {
            this.f31394b = Collections.unmodifiableMap(new HashMap(this.f31393a));
        }
        return this.f31394b;
    }
}
