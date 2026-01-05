package og;

import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ce {

    /* renamed from: a */
    public static final /* synthetic */ int f26364a = 0;

    /* renamed from: a */
    public static final char[] m10579a(int i10) {
        if (i10 >= 0 && i10 < 65536) {
            return new char[]{(char) i10};
        }
        if (65536 > i10 || i10 >= 1114112) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "invalid codepoint "));
        }
        int i11 = i10 - 65536;
        return new char[]{(char) (((i11 >>> 10) & 1023) + 55296), (char) ((i11 & 1023) + 56320)};
    }
}
