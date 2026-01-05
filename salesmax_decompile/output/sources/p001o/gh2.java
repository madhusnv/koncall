package p001o;

import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class gh2 {

    /* renamed from: a */
    public static final gh2 f25152a;

    /* renamed from: b */
    public static final char[] f25153b;

    /* renamed from: c */
    public static final byte[] f25154c;

    static {
        gh2 gh2Var = new gh2();
        f25152a = gh2Var;
        f25153b = new char[Opcodes.LNEG];
        f25154c = new byte[126];
        gh2Var.m28655f();
        gh2Var.m28654e();
    }

    /* renamed from: a */
    public final void m28650a(char c, char c2) {
        m28651b(c, c2);
    }

    /* renamed from: b */
    public final void m28651b(int i, char c) {
        if (c != 'u') {
            f25153b[c] = (char) i;
        }
    }

    /* renamed from: c */
    public final void m28652c(char c, byte b) {
        m28653d(c, b);
    }

    /* renamed from: d */
    public final void m28653d(int i, byte b) {
        f25154c[i] = b;
    }

    /* renamed from: e */
    public final void m28654e() {
        for (int i = 0; i < 33; i++) {
            m28653d(i, (byte) 127);
        }
        m28653d(9, (byte) 3);
        m28653d(10, (byte) 3);
        m28653d(13, (byte) 3);
        m28653d(32, (byte) 3);
        m28652c(',', (byte) 4);
        m28652c(':', (byte) 5);
        m28652c('{', (byte) 6);
        m28652c('}', (byte) 7);
        m28652c('[', (byte) 8);
        m28652c(']', (byte) 9);
        m28652c(TokenParser.DQUOTE, (byte) 1);
        m28652c(TokenParser.ESCAPE, (byte) 2);
    }

    /* renamed from: f */
    public final void m28655f() {
        for (int i = 0; i < 32; i++) {
            m28651b(i, 'u');
        }
        m28651b(8, 'b');
        m28651b(9, 't');
        m28651b(10, 'n');
        m28651b(12, 'f');
        m28651b(13, 'r');
        m28650a('/', '/');
        m28650a(TokenParser.DQUOTE, TokenParser.DQUOTE);
        m28650a(TokenParser.ESCAPE, TokenParser.ESCAPE);
    }
}
