package w3;

import p021w.AbstractC7848n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.e */
/* loaded from: classes.dex */
public final class C7887e extends AbstractC7848n {

    /* renamed from: c */
    public static C7887e f37773c;

    @Override // p021w.AbstractC7848n
    /* renamed from: a */
    public final int[] mo14830a(int i10) {
        int length = m14832c().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && m14832c().charAt(i10) == '\n' && (m14832c().charAt(i10) == '\n' || (i10 != 0 && m14832c().charAt(i10 - 1) != '\n'))) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !m14904e(i11)) {
            i11++;
        }
        return m14831b(i10, i11);
    }

    @Override // p021w.AbstractC7848n
    /* renamed from: d */
    public final int[] mo14833d(int i10) {
        int length = m14832c().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && m14832c().charAt(i10 - 1) == '\n' && !m14904e(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && (m14832c().charAt(i11) == '\n' || (i11 != 0 && m14832c().charAt(i11 - 1) != '\n'))) {
            i11--;
        }
        return m14831b(i11, i10);
    }

    /* renamed from: e */
    public final boolean m14904e(int i10) {
        if (i10 <= 0 || m14832c().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == m14832c().length() || m14832c().charAt(i10) == '\n';
    }
}
