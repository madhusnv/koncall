package p001o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ux0 implements px0 {

    /* renamed from: a */
    public Map f49586a = new HashMap();

    /* renamed from: a */
    public Object m52095a(String str) {
        return this.f49586a.get(str);
    }

    @Override // p001o.px0
    /* renamed from: r */
    public void mo18902r() {
        this.f49586a.clear();
    }

    public String toString() {
        return this.f49586a.toString();
    }
}
