package p001o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public abstract class wq1 {
    /* renamed from: a */
    public static final long m54800a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        sq8.m48649h(inputStream, "<this>");
        sq8.m48649h(outputStream, "out");
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m54801b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m54800a(inputStream, outputStream, i);
    }

    /* renamed from: c */
    public static final byte[] m54802c(InputStream inputStream) {
        sq8.m48649h(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m54801b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        sq8.m48648g(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
