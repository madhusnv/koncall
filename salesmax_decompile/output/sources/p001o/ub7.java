package p001o;

import android.util.Base64;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.List;

/* loaded from: classes2.dex */
public final class ub7 {

    /* renamed from: a */
    public final String f48661a;

    /* renamed from: b */
    public final String f48662b;

    /* renamed from: c */
    public final String f48663c;

    /* renamed from: d */
    public final List f48664d;

    /* renamed from: e */
    public final int f48665e = 0;

    /* renamed from: f */
    public final String f48666f;

    public ub7(String str, String str2, String str3, List list) {
        this.f48661a = (String) fgd.m26663g(str);
        this.f48662b = (String) fgd.m26663g(str2);
        this.f48663c = (String) fgd.m26663g(str3);
        this.f48664d = (List) fgd.m26663g(list);
        this.f48666f = m51327a(str, str2, str3);
    }

    /* renamed from: a */
    public final String m51327a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List m51328b() {
        return this.f48664d;
    }

    /* renamed from: c */
    public int m51329c() {
        return this.f48665e;
    }

    /* renamed from: d */
    public String m51330d() {
        return this.f48666f;
    }

    /* renamed from: e */
    public String m51331e() {
        return this.f48661a;
    }

    /* renamed from: f */
    public String m51332f() {
        return this.f48662b;
    }

    /* renamed from: g */
    public String m51333g() {
        return this.f48663c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f48661a + ", mProviderPackage: " + this.f48662b + ", mQuery: " + this.f48663c + ", mCertificates:");
        for (int i = 0; i < this.f48664d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f48664d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f48665e);
        return sb.toString();
    }
}
