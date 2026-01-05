package pg;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.C7795b;
import vw.C7796c;
import vw.C7797d;
import vw.C7798e;
import ww.AbstractC8191a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static InterfaceC7559c m11795a(InterfaceC2141e interfaceC2141e, Object obj, InterfaceC7559c completion) {
        AbstractC4154l.m8923f(interfaceC2141e, "<this>");
        AbstractC4154l.m8923f(completion, "completion");
        if (interfaceC2141e instanceof AbstractC8191a) {
            return ((AbstractC8191a) interfaceC2141e).create(obj, completion);
        }
        InterfaceC7564h context = completion.getContext();
        return context == C7565i.f36440a ? new C7795b(interfaceC2141e, obj, completion) : new C7796c(completion, context, interfaceC2141e, obj);
    }

    /* renamed from: b */
    public static byte[] m11796b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = (byte) ((bArr[i10] << 1) & 254);
            bArr2[i10] = b10;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((byte) ((bArr[i10 + 1] >> 7) & 1)) | b10);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    /* renamed from: c */
    public static InterfaceC7559c m11797c(InterfaceC7559c interfaceC7559c) {
        InterfaceC7559c<Object> interfaceC7559cIntercepted;
        AbstractC4154l.m8923f(interfaceC7559c, "<this>");
        AbstractC8193c abstractC8193c = interfaceC7559c instanceof AbstractC8193c ? (AbstractC8193c) interfaceC7559c : null;
        return (abstractC8193c == null || (interfaceC7559cIntercepted = abstractC8193c.intercepted()) == null) ? interfaceC7559c : interfaceC7559cIntercepted;
    }

    /* renamed from: d */
    public static Object m11798d(InterfaceC2141e interfaceC2141e, Object obj, InterfaceC7559c interfaceC7559c) {
        AbstractC4154l.m8923f(interfaceC2141e, "<this>");
        InterfaceC7564h context = interfaceC7559c.getContext();
        Object c7797d = context == C7565i.f36440a ? new C7797d(interfaceC7559c) : new C7798e(interfaceC7559c, context);
        kotlin.jvm.internal.d0.m8907d(2, interfaceC2141e);
        return interfaceC2141e.invoke(obj, c7797d);
    }
}
