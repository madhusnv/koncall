package bi;

import ai.AbstractC0151h;
import ai.AbstractC0152i;
import ai.AbstractC0159p;
import ai.InterfaceC0144a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1374a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import hi.r1;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bi.g */
/* loaded from: classes.dex */
public final class C0668g implements InterfaceC0144a {

    /* renamed from: c */
    public static final byte[] f4221c = new byte[0];

    /* renamed from: a */
    public final r1 f4222a;

    /* renamed from: b */
    public final C0663b f4223b;

    public C0668g(r1 r1Var, C0663b c0663b) {
        this.f4222a = r1Var;
        this.f4223b = c0663b;
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: a */
    public final byte[] mo308a(byte[] bArr, byte[] bArr2) {
        AbstractC1374a abstractC1374a;
        r1 r1Var = this.f4222a;
        Logger logger = AbstractC0159p.f493a;
        synchronized (AbstractC0159p.class) {
            try {
                AbstractC0152i abstractC0152i = AbstractC0159p.m365b(r1Var.m7191r()).f492a;
                Class cls = (Class) abstractC0152i.f484b;
                if (!((Map) abstractC0152i.f485c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + abstractC0152i.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) AbstractC0159p.f496d.get(r1Var.m7191r())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + r1Var.m7191r());
                }
                AbstractC1382i abstractC1382iM7192s = r1Var.m7192s();
                try {
                    AbstractC0151h abstractC0151hMo352f = abstractC0152i.mo352f();
                    AbstractC1374a abstractC1374aMo314B = abstractC0151hMo352f.mo314B(abstractC1382iM7192s);
                    abstractC0151hMo352f.mo324L(abstractC1374aMo314B);
                    abstractC1374a = (AbstractC1374a) abstractC0151hMo352f.mo341u(abstractC1374aMo314B);
                } catch (InvalidProtocolBufferException e2) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC0152i.mo352f().f482a).getName()), e2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        byte[] bArrM4157c = abstractC1374a.m4157c();
        byte[] bArrMo308a = this.f4223b.mo308a(bArrM4157c, f4221c);
        byte[] bArrMo308a2 = ((InterfaceC0144a) AbstractC0159p.m366c(this.f4222a.m7191r(), bArrM4157c)).mo308a(bArr, bArr2);
        return ByteBuffer.allocate(bArrMo308a.length + 4 + bArrMo308a2.length).putInt(bArrMo308a.length).put(bArrMo308a).put(bArrMo308a2).array();
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: b */
    public final byte[] mo309b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((InterfaceC0144a) AbstractC0159p.m366c(this.f4222a.m7191r(), this.f4223b.mo309b(bArr3, f4221c))).mo309b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
