package net.schmizz.sshj.common;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.PublicKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.HashMap;
import og.of;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5025e {

    /* renamed from: a */
    public static final InterfaceC2173b f24778a = AbstractC2175d.m5852b(AbstractC5025e.class);

    /* renamed from: b */
    public static final HashMap f24779b;

    /* renamed from: c */
    public static final HashMap f24780c;

    static {
        HashMap map = new HashMap();
        f24779b = map;
        HashMap map2 = new HashMap();
        f24780c = map2;
        map2.put("256", EnumC5024d.SECP256R1);
        map2.put("384", EnumC5024d.SECP384R1);
        map2.put("521", EnumC5024d.SECP521R1);
        map.put("256", "nistp256");
        map.put("384", "nistp384");
        map.put("521", "nistp521");
    }

    /* renamed from: a */
    public static boolean m9932a(Key key, int i10) {
        return ("ECDSA".equals(key.getAlgorithm()) || "EC".equals(key.getAlgorithm())) && (key instanceof ECKey) && ((ECKey) key).getParams().getCurve().getField().getFieldSize() == i10;
    }

    /* renamed from: b */
    public static PublicKey m9933b(AbstractC5022b abstractC5022b, String str) throws GeneralSecurityException {
        String strConcat = "ecdsa-sha2-nistp".concat(str);
        try {
            String strM9929x = abstractC5022b.m9929x();
            int iM9930y = (int) abstractC5022b.m9930y();
            byte bM9924s = abstractC5022b.m9924s();
            int i10 = iM9930y - 1;
            byte[] bArr = new byte[i10 / 2];
            byte[] bArr2 = new byte[i10 / 2];
            abstractC5022b.m9928w(bArr);
            abstractC5022b.m9928w(bArr2);
            InterfaceC2173b interfaceC2173b = f24778a;
            if (interfaceC2173b.mo5829e()) {
                interfaceC2173b.debug("Key algo: " + strConcat + ", Key curve: " + strM9929x + ", Key Len: " + iM9930y + ", 0x04: " + ((int) bM9924s) + "\nx: " + Arrays.toString(bArr) + "\ny: " + Arrays.toString(bArr2));
            }
            if (f24779b.containsValue(strM9929x)) {
                return AbstractC5030j.m9939d(new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2)), (EnumC5024d) f24780c.get(str));
            }
            throw new GeneralSecurityException("Unknown curve ".concat(strM9929x));
        } catch (Exception e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    /* renamed from: c */
    public static void m9934c(PublicKey publicKey, AbstractC5022b abstractC5022b) {
        ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
        byte[] bArrM10802a = of.m10802a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        String str = "nistp" + eCPublicKey.getParams().getCurve().getField().getFieldSize();
        abstractC5022b.getClass();
        abstractC5022b.m9917l(str, StandardCharsets.UTF_8);
        abstractC5022b.m9912g(bArrM10802a.length, bArrM10802a);
    }
}
