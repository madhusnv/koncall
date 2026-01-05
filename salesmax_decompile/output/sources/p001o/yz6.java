package p001o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class yz6 extends xz6 {
    /* renamed from: a */
    public static final ByteBuffer m58551a(int i, CharsetEncoder charsetEncoder) {
        sq8.m48649h(charsetEncoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        sq8.m48648g(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    /* renamed from: b */
    public static final CharsetEncoder m58552b(Charset charset) {
        sq8.m48649h(charset, "<this>");
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    /* renamed from: c */
    public static final byte[] m58553c(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrM27256e = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrM27256e, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrM27256e = Arrays.copyOf(bArrM27256e, i3);
                sq8.m48648g(bArrM27256e, "copyOf(...)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    ep6 ep6Var = new ep6(8193);
                    ep6Var.write(i5);
                    wq1.m54801b(fileInputStream, ep6Var, 0, 2, null);
                    int size = ep6Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM25414a = ep6Var.m25414a();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrM27256e, size);
                    sq8.m48648g(bArrCopyOf, "copyOf(...)");
                    bArrM27256e = fp0.m27256e(bArrM25414a, bArrCopyOf, i, 0, ep6Var.size());
                }
            }
            tb3.m49666a(fileInputStream, null);
            return bArrM27256e;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tb3.m49666a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static final String m58554d(File file, Charset charset) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(file, "<this>");
        sq8.m48649h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM51644d = uih.m51644d(inputStreamReader);
            tb3.m49666a(inputStreamReader, null);
            return strM51644d;
        } finally {
        }
    }

    /* renamed from: e */
    public static /* synthetic */ String m58555e(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = sh2.f45422b;
        }
        return m58554d(file, charset);
    }

    /* renamed from: f */
    public static final void m58556f(File file, byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(file, "<this>");
        sq8.m48649h(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: g */
    public static final void m58557g(File file, String str, Charset charset) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(file, "<this>");
        sq8.m48649h(str, "text");
        sq8.m48649h(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m58559i(fileOutputStream, str, charset);
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m58558h(File file, String str, Charset charset, int i, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if ((i & 2) != 0) {
            charset = sh2.f45422b;
        }
        m58557g(file, str, charset);
    }

    /* renamed from: i */
    public static final void m58559i(OutputStream outputStream, String str, Charset charset) throws IOException {
        sq8.m48649h(outputStream, "<this>");
        sq8.m48649h(str, "text");
        sq8.m48649h(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            sq8.m48648g(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderM58552b = m58552b(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        sq8.m48646e(charsetEncoderM58552b);
        ByteBuffer byteBufferM58551a = m58551a(8192, charsetEncoderM58552b);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            sq8.m48648g(cArrArray, "array(...)");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderM58552b.encode(charBufferAllocate, byteBufferM58551a, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            outputStream.write(byteBufferM58551a.array(), 0, byteBufferM58551a.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferM58551a.clear();
            i = i3;
        }
    }
}
