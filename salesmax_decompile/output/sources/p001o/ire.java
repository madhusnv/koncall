package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;

/* loaded from: classes3.dex */
public final class ire {

    /* renamed from: a */
    public static final ire f29157a = new ire();

    /* renamed from: b */
    public static final h7f f29158b;

    /* renamed from: c */
    public static final h7f f29159c;

    /* renamed from: d */
    public static final h7f f29160d;

    /* renamed from: e */
    public static final h7f f29161e;

    /* renamed from: f */
    public static final h7f f29162f;

    /* renamed from: g */
    public static final t7f f29163g;

    static {
        aff.C12159f c12159f = aff.C12159f.f14618a;
        h7f h7fVar = new h7f(c12159f, new na9("code"));
        f29158b = h7fVar;
        h7f h7fVar2 = new h7f(c12159f, new na9("__type"));
        f29159c = h7fVar2;
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar3 = new h7f(c12163j, new na9(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE));
        f29160d = h7fVar3;
        h7f h7fVar4 = new h7f(c12163j, new na9("Message"));
        f29161e = h7fVar4;
        h7f h7fVar5 = new h7f(c12163j, new na9("errorMessage"));
        f29162f = h7fVar5;
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        f29163g = c17016a.m49538a();
    }

    /* renamed from: a */
    public final ij6 m32630a(ux7 ux7Var, byte[] bArr) {
        String strMo31726i;
        String strMo31726i2;
        sq8.m48649h(ux7Var, "headers");
        String strMo31726i3 = (String) ux7Var.get("x-amzn-error-message");
        if (strMo31726i3 == null) {
            strMo31726i3 = (String) ux7Var.get(":error-message");
        }
        String str = (String) ux7Var.get("X-Amzn-Errortype");
        if (bArr != null) {
            dn5.InterfaceC12997c interfaceC12997cMo23579h = new i89(bArr).mo23579h(f29163g);
            strMo31726i = null;
            strMo31726i2 = null;
            while (true) {
                Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
                int iM29946a = f29158b.m29946a();
                if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                    strMo31726i = interfaceC12997cMo23579h.mo31726i();
                } else {
                    int iM29946a2 = f29159c.m29946a();
                    if (numMo23583m != null && numMo23583m.intValue() == iM29946a2) {
                        strMo31726i2 = interfaceC12997cMo23579h.mo31726i();
                    } else {
                        int iM29946a3 = f29160d.m29946a();
                        if (numMo23583m == null || numMo23583m.intValue() != iM29946a3) {
                            int iM29946a4 = f29161e.m29946a();
                            if (numMo23583m == null || numMo23583m.intValue() != iM29946a4) {
                                int iM29946a5 = f29162f.m29946a();
                                if (numMo23583m == null || numMo23583m.intValue() != iM29946a5) {
                                    if (numMo23583m == null) {
                                        break;
                                    }
                                    interfaceC12997cMo23579h.skipValue();
                                }
                            }
                        }
                        strMo31726i3 = interfaceC12997cMo23579h.mo31726i();
                    }
                }
            }
        } else {
            strMo31726i = null;
            strMo31726i2 = null;
        }
        if (str == null) {
            str = strMo31726i == null ? strMo31726i2 : strMo31726i;
        }
        return new ij6(hre.m31019a(str), strMo31726i3, null);
    }
}
