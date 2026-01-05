package pg;

import android.net.Uri;
import android.view.InputEvent;
import ex.InterfaceC2137a;
import ic.InterfaceC3227e;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h6 {
    /* renamed from: b */
    public static final byte[] m11672b(byte[] key, byte[] bArr, InterfaceC2137a hashSupplier) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(hashSupplier, "hashSupplier");
        InterfaceC3227e hashFunction = (InterfaceC3227e) hashSupplier.invoke();
        AbstractC4154l.m8923f(hashFunction, "hashFunction");
        int iMo7579b = hashFunction.mo7579b();
        if (key.length > iMo7579b) {
            key = g6.m11647b(hashFunction, key);
        }
        if (key.length < iMo7579b) {
            key = Arrays.copyOf(key, iMo7579b);
            AbstractC4154l.m8922e(key, "copyOf(...)");
        }
        int length = key.length;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = (byte) (key[i10] ^ 54);
        }
        int length2 = key.length;
        byte[] bArr3 = new byte[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            bArr3[i11] = (byte) (key[i11] ^ 92);
        }
        hashFunction.update(bArr2, 0, length);
        hashFunction.update(bArr, 0, bArr.length);
        byte[] bArrMo7578a = hashFunction.mo7578a();
        hashFunction.update(bArr3, 0, length2);
        hashFunction.update(bArrMo7578a, 0, bArrMo7578a.length);
        return hashFunction.mo7578a();
    }

    /* renamed from: a */
    public abstract Object mo11673a(InterfaceC7559c interfaceC7559c);

    /* renamed from: c */
    public abstract Object mo11674c(Uri uri, InputEvent inputEvent, InterfaceC7559c interfaceC7559c);

    /* renamed from: d */
    public abstract Object mo11675d(Uri uri, InterfaceC7559c interfaceC7559c);
}
