package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* renamed from: j$.sun.nio.cs.e */
/* loaded from: classes2.dex */
public final class C3398e {

    /* renamed from: a */
    public CoderResult f18009a;

    /* renamed from: b */
    public boolean f18010b;

    /* renamed from: a */
    public final int m7806a(char c2, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c2)) {
            if (!charBuffer.hasRemaining()) {
                this.f18009a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c10 = charBuffer.get();
            if (Character.isLowSurrogate(c10)) {
                int codePoint = Character.toCodePoint(c2, c10);
                this.f18010b = true;
                this.f18009a = null;
                return codePoint;
            }
            this.f18009a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c2)) {
            this.f18009a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.f18010b = false;
        this.f18009a = null;
        return c2;
    }

    /* renamed from: b */
    public final int m7807b(char c2, char[] cArr, int i10, int i11) {
        if (!Character.isHighSurrogate(c2)) {
            if (Character.isLowSurrogate(c2)) {
                this.f18009a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f18010b = false;
            this.f18009a = null;
            return c2;
        }
        if (i11 - i10 < 2) {
            this.f18009a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c10 = cArr[i10 + 1];
        if (Character.isLowSurrogate(c10)) {
            int codePoint = Character.toCodePoint(c2, c10);
            this.f18010b = true;
            this.f18009a = null;
            return codePoint;
        }
        this.f18009a = CoderResult.malformedForLength(1);
        return -1;
    }
}
