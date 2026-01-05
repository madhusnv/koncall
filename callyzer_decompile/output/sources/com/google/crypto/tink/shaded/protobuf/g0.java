package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a */
    public static final Charset f7037a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f7038b;

    static {
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f7038b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw InvalidProtocolBufferException.m4154f();
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public static void m4228a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: b */
    public static int m4229b(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    /* renamed from: c */
    public static a0 m4230c(Object obj, Object obj2) {
        a0 a0Var = (a0) ((AbstractC1374a) obj);
        a0Var.getClass();
        AbstractC1397x abstractC1397x = (AbstractC1397x) a0Var.mo4165f(EnumC1399z.NEW_BUILDER);
        abstractC1397x.m4460c();
        AbstractC1397x.m4457d(abstractC1397x.f7128b, a0Var);
        AbstractC1374a abstractC1374a = (AbstractC1374a) obj2;
        if (!abstractC1397x.f7127a.getClass().isInstance(abstractC1374a)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC1397x.m4460c();
        AbstractC1397x.m4457d(abstractC1397x.f7128b, (a0) abstractC1374a);
        return abstractC1397x.m4459b();
    }
}
