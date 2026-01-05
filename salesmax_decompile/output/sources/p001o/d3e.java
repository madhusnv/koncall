package p001o;

import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class d3e {

    /* renamed from: o.d3e$a */
    public static final class C12794a {

        /* renamed from: a */
        public final UUID f19073a;

        /* renamed from: b */
        public final int f19074b;

        /* renamed from: c */
        public final byte[] f19075c;

        /* renamed from: d */
        public final UUID[] f19076d;

        public C12794a(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
            this.f19073a = uuid;
            this.f19074b = i;
            this.f19075c = bArr;
            this.f19076d = uuidArr;
        }
    }

    /* renamed from: a */
    public static byte[] m22307a(UUID uuid, byte[] bArr) {
        return m22308b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m22308b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* renamed from: c */
    public static boolean m22309c(byte[] bArr) {
        return m22310d(bArr) != null;
    }

    /* renamed from: d */
    public static C12794a m22310d(byte[] bArr) {
        UUID[] uuidArr;
        zwc zwcVar = new zwc(bArr);
        if (zwcVar.m60026g() < 32) {
            return null;
        }
        zwcVar.m60017U(0);
        int iM60020a = zwcVar.m60020a();
        int iM60036q = zwcVar.m60036q();
        if (iM60036q != iM60020a) {
            ria.m46824h("PsshAtomUtil", "Advertised atom size (" + iM60036q + ") does not match buffer size: " + iM60020a);
            return null;
        }
        int iM60036q2 = zwcVar.m60036q();
        if (iM60036q2 != 1886614376) {
            ria.m46824h("PsshAtomUtil", "Atom type is not pssh: " + iM60036q2);
            return null;
        }
        int iM34447c = js0.m34447c(zwcVar.m60036q());
        if (iM34447c > 1) {
            ria.m46824h("PsshAtomUtil", "Unsupported pssh version: " + iM34447c);
            return null;
        }
        UUID uuid = new UUID(zwcVar.m59997A(), zwcVar.m59997A());
        if (iM34447c == 1) {
            int iM60008L = zwcVar.m60008L();
            uuidArr = new UUID[iM60008L];
            for (int i = 0; i < iM60008L; i++) {
                uuidArr[i] = new UUID(zwcVar.m59997A(), zwcVar.m59997A());
            }
        } else {
            uuidArr = null;
        }
        int iM60008L2 = zwcVar.m60008L();
        int iM60020a2 = zwcVar.m60020a();
        if (iM60008L2 == iM60020a2) {
            byte[] bArr2 = new byte[iM60008L2];
            zwcVar.m60031l(bArr2, 0, iM60008L2);
            return new C12794a(uuid, iM34447c, bArr2, uuidArr);
        }
        ria.m46824h("PsshAtomUtil", "Atom data size (" + iM60008L2 + ") does not match the bytes left: " + iM60020a2);
        return null;
    }

    /* renamed from: e */
    public static byte[] m22311e(byte[] bArr, UUID uuid) {
        C12794a c12794aM22310d = m22310d(bArr);
        if (c12794aM22310d == null) {
            return null;
        }
        if (uuid.equals(c12794aM22310d.f19073a)) {
            return c12794aM22310d.f19075c;
        }
        ria.m46824h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + c12794aM22310d.f19073a + ".");
        return null;
    }

    /* renamed from: f */
    public static UUID m22312f(byte[] bArr) {
        C12794a c12794aM22310d = m22310d(bArr);
        if (c12794aM22310d == null) {
            return null;
        }
        return c12794aM22310d.f19073a;
    }

    /* renamed from: g */
    public static int m22313g(byte[] bArr) {
        C12794a c12794aM22310d = m22310d(bArr);
        if (c12794aM22310d == null) {
            return -1;
        }
        return c12794aM22310d.f19074b;
    }
}
