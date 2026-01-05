package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class bhh extends cr1 {
    @Override // p001o.cr1
    /* renamed from: c */
    public int mo19087c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        }
        if (c >= 'a' && c <= 'z') {
            sb.append((char) ((c - 'a') + 14));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        }
        if (c == '`') {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) ((c - 'A') + 1));
            return 2;
        }
        if (c < '{' || c > 127) {
            sb.append("\u0001\u001e");
            return mo19087c((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) ((c - Opcodes.LSHR) + 27));
        return 2;
    }

    @Override // p001o.cr1
    /* renamed from: e */
    public int mo19088e() {
        return 2;
    }
}
