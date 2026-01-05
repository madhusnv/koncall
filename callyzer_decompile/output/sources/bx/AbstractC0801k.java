package bx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;
import nx.AbstractC5178p;
import og.r1;
import og.s1;

/* renamed from: bx.k */
/* loaded from: classes3.dex */
public abstract class AbstractC0801k extends r1 {
    /* renamed from: c */
    public static void m2128c(File file) {
        EnumC0800j direction = EnumC0800j.BOTTOM_UP;
        AbstractC4154l.m8923f(direction, "direction");
        C0797g c0797g = new C0797g(new C0799i(0, file, direction));
        while (true) {
            boolean z6 = true;
            while (c0797g.hasNext()) {
                File file2 = (File) c0797g.next();
                if (!file2.delete() && file2.exists()) {
                    z6 = false;
                } else if (z6) {
                    break;
                } else {
                    z6 = false;
                }
            }
            return;
        }
    }

    /* renamed from: d */
    public static String m2129d(File file) {
        Charset charset = AbstractC5163a.f25245a;
        AbstractC4154l.m8923f(file, "<this>");
        AbstractC4154l.m8923f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM10887b = s1.m10887b(inputStreamReader);
            inputStreamReader.close();
            return strM10887b;
        } finally {
        }
    }

    /* renamed from: e */
    public static File m2130e(File file) {
        int length;
        int iM10098I;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        AbstractC4154l.m8922e(path, "getPath(...)");
        char c2 = File.separatorChar;
        int iM10098I2 = AbstractC5178p.m10098I(path, c2, 0, 4);
        if (iM10098I2 != 0) {
            length = (iM10098I2 <= 0 || path.charAt(iM10098I2 + (-1)) != ':') ? (iM10098I2 == -1 && AbstractC5178p.m10093D(path, ':')) ? path.length() : 0 : iM10098I2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c2 || (iM10098I = AbstractC5178p.m10098I(path, c2, 2, 4)) < 0) {
            length = 1;
        } else {
            int iM10098I3 = AbstractC5178p.m10098I(path, c2, iM10098I + 1, 4);
            length = iM10098I3 >= 0 ? iM10098I3 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        if ((string.length() == 0) || AbstractC5178p.m10093D(string, c2)) {
            return new File(string + file2);
        }
        return new File(string + c2 + file2);
    }

    /* renamed from: f */
    public static void m2131f(File file, String text) {
        Charset charset = AbstractC5163a.f25245a;
        AbstractC4154l.m8923f(file, "<this>");
        AbstractC4154l.m8923f(text, "text");
        AbstractC4154l.m8923f(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m2132g(fileOutputStream, text, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    /* renamed from: g */
    public static final void m2132g(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        AbstractC4154l.m8923f(text, "text");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            AbstractC4154l.m8922e(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        AbstractC4154l.m8920c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        AbstractC4154l.m8922e(byteBufferAllocate, "allocate(...)");
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC4154l.m8922e(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i10 = i12;
        }
    }
}
