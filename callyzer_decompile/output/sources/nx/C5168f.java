package nx;

import og.e2;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.f */
/* loaded from: classes3.dex */
public final class C5168f {

    /* renamed from: b */
    public static final C5168f f25263b = new C5168f();

    /* renamed from: a */
    public final boolean f25264a = true;

    public C5168f() {
        if (e2.m10624a("")) {
            return;
        }
        e2.m10624a("");
    }

    /* renamed from: a */
    public final void m10080a(StringBuilder sb2, String str) {
        a1.m14319B(sb2, str, "prefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("suffix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(str);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        m10080a(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
