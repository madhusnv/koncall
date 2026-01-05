package p001o;

import com.google.firebase.perf.util.Constants;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class za1 implements f76 {
    /* renamed from: c */
    public static char m59036c(char c, int i) {
        int i2 = c + ((i * Opcodes.FCMPL) % Constants.MAX_HOST_LENGTH) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    @Override // p001o.f76
    /* renamed from: a */
    public void mo21605a(j76 j76Var) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!j76Var.m33349i()) {
                break;
            }
            sb.append(j76Var.m33343c());
            j76Var.f29915d++;
            if (py7.m44298n(j76Var.m33344d(), j76Var.f29915d, m59037b()) != m59037b()) {
                j76Var.m33355o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iM33341a = j76Var.m33341a() + length + 1;
        j76Var.m33357q(iM33341a);
        boolean z = j76Var.m33347g().m39007a() - iM33341a > 0;
        if (j76Var.m33349i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            j76Var.m33358r(m59036c(sb.charAt(i), j76Var.m33341a() + 1));
        }
    }

    /* renamed from: b */
    public int m59037b() {
        return 5;
    }
}
