package a6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a6.a */
/* loaded from: classes.dex */
public final class C0053a {

    /* renamed from: e */
    public static final byte[] f218e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f219a;

    /* renamed from: b */
    public final int f220b;

    /* renamed from: c */
    public int f221c;

    /* renamed from: d */
    public char f222d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f218e[i10] = Character.getDirectionality(i10);
        }
    }

    public C0053a(CharSequence charSequence) {
        this.f219a = charSequence;
        this.f220b = charSequence.length();
    }

    /* renamed from: a */
    public final byte m158a() {
        int i10 = this.f221c - 1;
        CharSequence charSequence = this.f219a;
        char cCharAt = charSequence.charAt(i10);
        this.f222d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f221c);
            this.f221c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f221c--;
        char c2 = this.f222d;
        return c2 < 1792 ? f218e[c2] : Character.getDirectionality(c2);
    }
}
