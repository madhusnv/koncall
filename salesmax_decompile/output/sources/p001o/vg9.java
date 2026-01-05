package p001o;

import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public final class vg9 {

    /* renamed from: a */
    public final String f50303a;

    /* renamed from: b */
    public final Map f50304b;

    public vg9(String str, Map map) {
        sq8.m48649h(str, ClientCookie.VERSION_ATTR);
        sq8.m48649h(map, "extras");
        this.f50303a = str;
        this.f50304b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg9)) {
            return false;
        }
        vg9 vg9Var = (vg9) obj;
        return sq8.m48644c(this.f50303a, vg9Var.f50303a) && sq8.m48644c(this.f50304b, vg9Var.f50304b);
    }

    public int hashCode() {
        return (this.f50303a.hashCode() * 31) + this.f50304b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(i91.m31759d("lang", "kotlin", this.f50303a));
        if (!this.f50304b.isEmpty()) {
            Map mapM53970b = w50.m53970b(this.f50304b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(TokenParser.SP);
            sb2.append((Object) w50.m53971c(mapM53970b));
            sb.append(sb2.toString());
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public /* synthetic */ vg9(String str, Map map, int i, id5 id5Var) {
        this((i & 1) != 0 ? te9.f46955f.toString() : str, (i & 2) != 0 ? isa.m32681h() : map);
    }
}
