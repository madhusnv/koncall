package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class p5 {

    /* renamed from: a */
    public static final Charset f6342a;

    /* renamed from: b */
    public static final byte[] f6343b;

    static {
        Charset.forName("US-ASCII");
        f6342a = Charset.forName("UTF-8");
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f6343b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
