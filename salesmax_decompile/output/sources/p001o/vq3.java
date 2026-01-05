package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Map;
import p001o.q71;

/* loaded from: classes2.dex */
public final class vq3 {

    /* renamed from: a */
    public final String f50711a;

    /* renamed from: b */
    public final Map f50712b;

    /* renamed from: c */
    public final wq3 f50713c;

    public vq3(String str, Map map, wq3 wq3Var) {
        sq8.m48649h(str, "name");
        sq8.m48649h(map, "properties");
        sq8.m48649h(wq3Var, "sectionType");
        this.f50711a = str;
        this.f50712b = map;
        this.f50713c = wq3Var;
    }

    /* renamed from: d */
    public static /* synthetic */ String m53203d(vq3 vq3Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return vq3Var.m53206c(str, str2);
    }

    /* renamed from: a */
    public final boolean m53204a(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f50712b.containsKey(str);
    }

    /* renamed from: b */
    public final String m53205b() {
        return this.f50711a;
    }

    /* renamed from: c */
    public final String m53206c(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        q71 q71Var = (q71) this.f50712b.get(str);
        if (q71Var == null) {
            return null;
        }
        if (q71Var instanceof q71.C16309b) {
            if (str2 == null) {
                return ((q71.C16309b) q71Var).m44917a();
            }
            throw new IllegalArgumentException(("property '" + str + "' is a string, but caller specified a sub-key").toString());
        }
        if (!(q71Var instanceof q71.C16308a)) {
            throw new szb();
        }
        if (str2 != null) {
            return (String) ((q71.C16308a) q71Var).get(str2);
        }
        throw new IllegalArgumentException(("property '" + str + "' has sub-properties, caller must specify a sub-key").toString());
    }

    /* renamed from: e */
    public final Map m53207e() {
        return this.f50712b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq3)) {
            return false;
        }
        vq3 vq3Var = (vq3) obj;
        return sq8.m48644c(this.f50711a, vq3Var.f50711a) && sq8.m48644c(this.f50712b, vq3Var.f50712b) && this.f50713c == vq3Var.f50713c;
    }

    /* renamed from: f */
    public final wq3 m53208f() {
        return this.f50713c;
    }

    public int hashCode() {
        return (((this.f50711a.hashCode() * 31) + this.f50712b.hashCode()) * 31) + this.f50713c.hashCode();
    }

    public String toString() {
        return "ConfigSection(name=" + this.f50711a + ", properties=" + this.f50712b + ", sectionType=" + this.f50713c + ')';
    }

    public /* synthetic */ vq3(String str, Map map, wq3 wq3Var, int i, id5 id5Var) {
        this(str, map, (i & 4) != 0 ? wq3.PROFILE : wq3Var);
    }
}
