package ty;

import java.util.HashMap;
import java.util.Map;
import net.schmizz.sshj.common.AbstractC5022b;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5021a;
import net.schmizz.sshj.sftp.SFTPException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.o */
/* loaded from: classes3.dex */
public class C7281o extends AbstractC5022b {
    public C7281o(EnumC7272f enumC7272f) {
        m9911f(enumC7272f.toByte());
    }

    /* renamed from: A */
    public final void m13604A(C7268b c7268b) {
        HashMap map = c7268b.f34711h;
        C5021a c5021a = new C5021a();
        int i10 = c7268b.f34705b;
        c5021a.m9918m(i10);
        if (EnumC7267a.SIZE.isSet(i10)) {
            c5021a.m9920o(c7268b.f34706c);
        }
        if (EnumC7267a.UIDGID.isSet(i10)) {
            c5021a.m9918m(c7268b.f34707d);
            c5021a.m9918m(c7268b.f34708e);
        }
        if (EnumC7267a.MODE.isSet(i10)) {
            c5021a.m9918m(c7268b.f34704a.f9605b);
        }
        if (EnumC7267a.ACMODTIME.isSet(i10)) {
            c5021a.m9918m(c7268b.f34709f);
            c5021a.m9918m(c7268b.f34710g);
        }
        if (EnumC7267a.EXTENDED.isSet(i10)) {
            c5021a.m9918m(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c5021a.m9916k((String) entry.getKey());
                c5021a.m9916k((String) entry.getValue());
            }
        }
        byte[] bArrM9910d = c5021a.m9910d();
        m9914i(0, bArrM9910d.length, bArrM9910d);
    }

    /* renamed from: B */
    public final EnumC7272f m13605B() throws SFTPException {
        try {
            return EnumC7272f.fromByte(m9924s());
        } catch (Buffer$BufferException e2) {
            throw new SFTPException(e2);
        }
    }
}
