package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* loaded from: classes.dex */
public abstract class AbstractC1374a {
    protected int memoizedHashCode;

    /* renamed from: a */
    public abstract int mo4155a();

    /* renamed from: b */
    public final String m4156b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: c */
    public final byte[] m4157c() {
        try {
            int iMo4155a = mo4155a();
            byte[] bArr = new byte[iMo4155a];
            C1386m c1386m = new C1386m(bArr, iMo4155a);
            mo4158d(c1386m);
            if (iMo4155a - c1386m.f7076d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(m4156b("byte array"), e2);
        }
    }

    /* renamed from: d */
    public abstract void mo4158d(C1386m c1386m);
}
