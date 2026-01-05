package uy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import kl.C4105a;
import net.schmizz.sshj.common.AbstractC5030j;
import nl.C5105b;
import ol.C5398a;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uy.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7572b extends AbstractC7571a {
    /* renamed from: e */
    public static byte[] m14308e(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5398a(bigInteger));
        arrayList.add(new C5398a(bigInteger2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4105a c4105a = new C4105a(new C8687a(19), byteArrayOutputStream);
        try {
            c4105a.m8878h(new C5105b(arrayList));
            c4105a.flush();
            AbstractC5030j.m9936a(c4105a);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            AbstractC5030j.m9936a(c4105a);
            throw th2;
        }
    }
}
