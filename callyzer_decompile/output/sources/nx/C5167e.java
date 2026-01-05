package nx;

import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.util.AbstractC1452a;
import og.e2;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.e */
/* loaded from: classes3.dex */
public final class C5167e {

    /* renamed from: a */
    public static final C5167e f25262a;

    static {
        C5167e c5167e = new C5167e();
        if (!e2.m10624a("  ") && !e2.m10624a("") && !e2.m10624a("")) {
            e2.m10624a("");
        }
        f25262a = c5167e;
    }

    /* renamed from: a */
    public final void m10079a(StringBuilder sb2, String str) {
        AbstractC1452a.m4551B(sb2, str, "bytesPerLine = ", Integer.MAX_VALUE, ",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("bytesPerGroup = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSeparator = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        a1.m14319B(sb2, str, "bytePrefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSuffix = \"");
        sb2.append("");
        sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        m10079a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
