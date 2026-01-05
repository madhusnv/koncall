package p001o;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;

/* loaded from: classes2.dex */
public abstract class uwf {
    /* renamed from: a */
    public static int m52088a(int i, zwc zwcVar, int i2) {
        if (i == 12) {
            return 240;
        }
        if (i == 13) {
            return 120;
        }
        if (i == 21 && zwcVar.m60020a() >= 8 && zwcVar.m60025f() + 8 <= i2) {
            int iM60036q = zwcVar.m60036q();
            int iM60036q2 = zwcVar.m60036q();
            if (iM60036q >= 12 && iM60036q2 == 1936877170) {
                return zwcVar.m60005I();
            }
        }
        return -2147483647;
    }

    /* renamed from: b */
    public static Metadata m52089b(zwc zwcVar, int i) {
        zwcVar.m60018V(12);
        while (zwcVar.m60025f() < i) {
            int iM60025f = zwcVar.m60025f();
            int iM60036q = zwcVar.m60036q();
            if (zwcVar.m60036q() == 1935766900) {
                if (iM60036q < 16) {
                    return null;
                }
                zwcVar.m60018V(4);
                int i2 = -1;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    int iM60004H = zwcVar.m60004H();
                    int iM60004H2 = zwcVar.m60004H();
                    if (iM60004H == 0) {
                        i2 = iM60004H2;
                    } else if (iM60004H == 1) {
                        i3 = iM60004H2;
                    }
                }
                int iM52088a = m52088a(i2, zwcVar, i);
                if (iM52088a == -2147483647) {
                    return null;
                }
                return new Metadata(new SmtaMetadataEntry(iM52088a, i3));
            }
            zwcVar.m60017U(iM60025f + iM60036q);
        }
        return null;
    }
}
