package y5;

import android.util.Base64;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y5.c */
/* loaded from: classes.dex */
public final class C8557c {

    /* renamed from: a */
    public final String f41538a;

    /* renamed from: b */
    public final String f41539b;

    /* renamed from: c */
    public final String f41540c;

    /* renamed from: d */
    public final List f41541d;

    /* renamed from: e */
    public final String f41542e;

    public C8557c(String str, String str2, String str3, List list) {
        this.f41538a = str;
        this.f41539b = str2;
        this.f41540c = str3;
        list.getClass();
        this.f41541d = list;
        this.f41542e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f41538a + ", mProviderPackage: " + this.f41539b + ", mQuery: " + this.f41540c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f41541d;
            if (i10 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            sb2.append(" ]");
            i10++;
        }
    }
}
