package j$.time.format;

/* renamed from: j$.time.format.l */
/* loaded from: classes2.dex */
public final class C3442l extends C3443m {
    @Override // j$.time.format.C3443m
    /* renamed from: d */
    public final C3443m mo7977d(String str, String str2, C3443m c3443m) {
        return new C3442l(str, str2, c3443m);
    }

    @Override // j$.time.format.C3443m
    /* renamed from: b */
    public final boolean mo7976b(char c2, char c10) {
        return C3451u.m7984b(c2, c10);
    }

    @Override // j$.time.format.C3443m
    /* renamed from: e */
    public final boolean mo7978e(CharSequence charSequence, int i10, int i11) {
        int length = this.f18174a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!C3451u.m7984b(this.f18174a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
