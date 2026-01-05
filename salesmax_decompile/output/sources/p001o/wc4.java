package p001o;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p001o.xd9;

/* loaded from: classes4.dex */
public abstract class wc4 {

    /* renamed from: a */
    public static final byte[] f51768a = new byte[0];

    /* renamed from: o.wc4$a */
    public static /* synthetic */ class C17816a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51769a;

        static {
            int[] iArr = new int[kgc.values().length];
            f51769a = iArr;
            try {
                iArr[kgc.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51769a[kgc.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51769a[kgc.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51769a[kgc.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m54200a(xd9.C18118c c18118c) throws GeneralSecurityException {
        int i = C17816a.f51769a[c18118c.m56070M().ordinal()];
        if (i == 1 || i == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(c18118c.m56069L()).array();
        }
        if (i == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(c18118c.m56069L()).array();
        }
        if (i == 4) {
            return f51768a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
