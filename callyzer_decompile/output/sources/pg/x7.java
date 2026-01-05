package pg;

import da.AbstractC1678a;
import ec.C2005c;
import ec.C2011i;
import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;
import og.ud;
import sb.C6776c;
import sb.C6778e;
import td.C7126c;
import vc.AbstractC7699b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class x7 {

    /* renamed from: a */
    public static final /* synthetic */ int f29112a = 0;

    /* renamed from: a */
    public static final C6778e m11930a(String accessKeyId, String secretAccessKey, String str, C7126c c7126c, String str2, String str3) {
        InterfaceC2004b interfaceC2004b;
        AbstractC4154l.m8923f(accessKeyId, "accessKeyId");
        AbstractC4154l.m8923f(secretAccessKey, "secretAccessKey");
        if (str2 == null && str3 == null) {
            interfaceC2004b = C2011i.f9543a;
        } else {
            C2005c c2005cM10980f = ud.m10980f();
            ud.m10983i(c2005cM10980f, AbstractC7699b.f37205a, str2);
            ud.m10983i(c2005cM10980f, AbstractC1678a.f8215b, str3);
            interfaceC2004b = c2005cM10980f;
        }
        return C6776c.m12972a(accessKeyId, secretAccessKey, str, c7126c, interfaceC2004b, 16);
    }

    /* renamed from: b */
    public static /* synthetic */ C6778e m11931b(int i10, String str, String str2, String str3, String str4, String str5) {
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        return m11930a(str, str2, str3, null, str4, str5);
    }
}
