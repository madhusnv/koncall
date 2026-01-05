package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zi4 {

    /* renamed from: c */
    public static final C18650a f57243c = new C18650a(null);

    /* renamed from: d */
    public static final kx0 f57244d = new kx0("CustomUserAgentMetadata");

    /* renamed from: a */
    public final Map f57245a;

    /* renamed from: b */
    public final List f57246b;

    /* renamed from: o.zi4$a */
    public static final class C18650a {
        public C18650a() {
        }

        public /* synthetic */ C18650a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static final Map m59485b(Map map, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (e9g.m24597K((String) entry.getKey(), str, false, 2, null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(hsa.m31055e(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String strSubstring = ((String) entry2.getKey()).substring(str.length());
                sq8.m48648g(strSubstring, "substring(...)");
                linkedHashMap2.put(strSubstring, entry2.getValue());
            }
            return linkedHashMap2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final zi4 m59486a(f9d f9dVar) {
            sq8.m48649h(f9dVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
            return new zi4(isa.m32687n(m59485b(f9dVar.mo26797g(), "AWS_CUSTOM_METADATA_"), m59485b(f9dVar.mo26794b(), "aws.customMetadata.")), null, 2, 0 == true ? 1 : 0);
        }

        /* renamed from: c */
        public final kx0 m59487c() {
            return zi4.f57244d;
        }
    }

    public zi4(Map map, List list) {
        sq8.m48649h(map, "extras");
        sq8.m48649h(list, "typedExtras");
        this.f57245a = isa.m32696w(map);
        this.f57246b = kh3.T0(list);
    }

    /* renamed from: b */
    public final void m59481b(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        this.f57245a.put(str, str2);
    }

    /* renamed from: c */
    public final Map m59482c() {
        return this.f57245a;
    }

    /* renamed from: d */
    public final List m59483d() {
        return this.f57246b;
    }

    /* renamed from: e */
    public final zi4 m59484e(zi4 zi4Var) {
        sq8.m48649h(zi4Var, "other");
        return new zi4(isa.m32687n(this.f57245a, zi4Var.f57245a), kh3.x0(this.f57246b, zi4Var.f57246b));
    }

    public /* synthetic */ zi4(Map map, List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? isa.m32681h() : map, (i & 2) != 0 ? ch3.m21246k() : list);
    }
}
