package p001o;

import java.util.Locale;
import p001o.ax7;

/* loaded from: classes3.dex */
public abstract class bx7 {
    /* renamed from: a */
    public static final byte[] m19909a(ax7 ax7Var, byte[] bArr) {
        sq8.m48649h(ax7Var, "fn");
        sq8.m48649h(bArr, "input");
        ax7.C12265a.m17935a(ax7Var, bArr, 0, 0, 6, null);
        return ax7Var.mo17932a();
    }

    /* renamed from: b */
    public static final byte[] m19910b(byte[] bArr, uk7 uk7Var) {
        sq8.m48649h(bArr, "<this>");
        sq8.m48649h(uk7Var, "hashSupplier");
        return m19909a((ax7) uk7Var.invoke(), bArr);
    }

    /* renamed from: c */
    public static final byte[] m19911c(byte[] bArr, ax7 ax7Var) {
        sq8.m48649h(bArr, "<this>");
        sq8.m48649h(ax7Var, "fn");
        return m19909a(ax7Var, bArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d */
    public static final ax7 m19912d(String str) {
        sq8.m48649h(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1352399984:
                if (lowerCase.equals("crc32c")) {
                    return new l94();
                }
                return null;
            case -903629273:
                if (lowerCase.equals("sha256")) {
                    return new okf();
                }
                return null;
            case 107902:
                if (lowerCase.equals("md5")) {
                    return new v0b();
                }
                return null;
            case 3528965:
                if (lowerCase.equals("sha1")) {
                    return new lkf();
                }
                return null;
            case 94921523:
                if (lowerCase.equals("crc32")) {
                    return new j94();
                }
                return null;
            default:
                return null;
        }
    }
}
