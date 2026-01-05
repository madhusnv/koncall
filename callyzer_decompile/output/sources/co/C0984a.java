package co;

import ex.InterfaceC2139c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: co.a */
/* loaded from: classes3.dex */
public final class C0984a {
    /* renamed from: a */
    public static void m2788a(InputStream inputStream, File file, InterfaceC2139c interfaceC2139c) throws IOException {
        int i10;
        AbstractC4154l.m8923f(file, "file");
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            int i11 = 0;
            do {
                byte[] bArr = new byte[4096];
                i10 = inputStream.read(bArr);
                if (i10 > 0) {
                    fileOutputStream.write(bArr, 0, i10);
                    i11 += i10;
                }
                interfaceC2139c.invoke(Integer.valueOf(i11));
            } while (i10 > 0);
            file.toString();
        } catch (Exception e2) {
            e2.toString();
        }
    }
}
