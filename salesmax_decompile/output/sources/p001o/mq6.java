package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.aff;
import p001o.dn5;
import p001o.kq6;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class mq6 {
    /* renamed from: b */
    public static final void m39511b(kq6.C14901a c14901a, byte[] bArr) {
        i89 i89Var = new i89(bArr);
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        dn5.InterfaceC12997c interfaceC12997cMo23579h = i89Var.mo23579h(c17016a.m49538a());
        while (true) {
            Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
            int iM29946a = h7fVar.m29946a();
            if (numMo23583m != null && numMo23583m.intValue() == iM29946a) {
                c14901a.m36049d(interfaceC12997cMo23579h.mo31726i());
            } else if (numMo23583m == null) {
                return;
            } else {
                interfaceC12997cMo23579h.skipValue();
            }
        }
    }
}
