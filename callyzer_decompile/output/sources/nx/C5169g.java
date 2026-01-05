package nx;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.g */
/* loaded from: classes3.dex */
public final class C5169g {

    /* renamed from: d */
    public static final C5169g f25265d;

    /* renamed from: a */
    public final boolean f25266a;

    /* renamed from: b */
    public final C5167e f25267b;

    /* renamed from: c */
    public final C5168f f25268c;

    static {
        C5167e c5167e = C5167e.f25262a;
        C5168f c5168f = C5168f.f25263b;
        f25265d = new C5169g(false, c5167e, c5168f);
        new C5169g(true, c5167e, c5168f);
    }

    public C5169g(boolean z6, C5167e bytes, C5168f number) {
        AbstractC4154l.m8923f(bytes, "bytes");
        AbstractC4154l.m8923f(number, "number");
        this.f25266a = z6;
        this.f25267b = bytes;
        this.f25268c = number;
    }

    public final String toString() {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("HexFormat(\n    upperCase = ");
        sbM4568o.append(this.f25266a);
        sbM4568o.append(",\n    bytes = BytesHexFormat(\n");
        this.f25267b.m10079a(sbM4568o, "        ");
        sbM4568o.append('\n');
        sbM4568o.append("    ),");
        sbM4568o.append('\n');
        sbM4568o.append("    number = NumberHexFormat(");
        sbM4568o.append('\n');
        this.f25268c.m10080a(sbM4568o, "        ");
        sbM4568o.append('\n');
        sbM4568o.append("    )");
        sbM4568o.append('\n');
        sbM4568o.append(")");
        return sbM4568o.toString();
    }
}
