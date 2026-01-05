package net.schmizz.sshj.common;

import f00.AbstractC2175d;
import java.io.Closeable;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.j */
/* loaded from: classes3.dex */
public abstract class AbstractC5030j {

    /* renamed from: a */
    public static final char[] f24782a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m9936a(Closeable... closeableArr) throws IOException {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    AbstractC2175d.m5852b(AbstractC5030j.class).mo5841q(closeable, e2);
                }
            }
        }
    }

    /* renamed from: b */
    public static Object m9937b(String str, List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5028h interfaceC5028h = (InterfaceC5028h) it.next();
            if (interfaceC5028h.getName().equals(str)) {
                return interfaceC5028h.mo2133c();
            }
        }
        return null;
    }

    /* renamed from: c */
    public static LinkedList m9938c(List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(((InterfaceC5028h) it.next()).getName());
        }
        return linkedList;
    }

    /* renamed from: d */
    public static PublicKey m9939d(ECPoint eCPoint, EnumC5024d enumC5024d) throws NoSuchAlgorithmException, InvalidParameterSpecException {
        Objects.requireNonNull(enumC5024d, "Curve required");
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec(enumC5024d.getCurveName());
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(eCGenParameterSpec);
        return AbstractC5037q.m9950c("ECDSA").generatePublic(new ECPublicKeySpec(eCPoint, (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
    }

    /* renamed from: e */
    public static String m9940e(int i10, int i11, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            byte b10 = bArr[i10 + i12];
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            char[] cArr = f24782a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
