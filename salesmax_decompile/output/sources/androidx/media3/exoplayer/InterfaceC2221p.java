package androidx.media3.exoplayer;

import androidx.media3.common.C2181a;

/* renamed from: androidx.media3.exoplayer.p */
/* loaded from: classes2.dex */
public interface InterfaceC2221p {

    /* renamed from: androidx.media3.exoplayer.p$a */
    public interface a {
        /* renamed from: a */
        void mo7450a(InterfaceC2218o interfaceC2218o);
    }

    /* renamed from: A */
    static int m7438A(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    /* renamed from: D */
    static int m7439D(int i) {
        return i & 64;
    }

    /* renamed from: O */
    static int m7440O(int i) {
        return i & 7;
    }

    /* renamed from: j */
    static int m7441j(int i) {
        return i & 384;
    }

    /* renamed from: k */
    static boolean m7442k(int i, boolean z) {
        int iM7440O = m7440O(i);
        return iM7440O == 4 || (z && iM7440O == 3);
    }

    /* renamed from: n */
    static int m7443n(int i, int i2, int i3, int i4, int i5) {
        return m7438A(i, i2, i3, i4, i5, 0);
    }

    /* renamed from: o */
    static int m7444o(int i, int i2, int i3, int i4) {
        return m7438A(i, i2, i3, 0, 128, i4);
    }

    /* renamed from: p */
    static int m7445p(int i) {
        return i & 32;
    }

    /* renamed from: r */
    static int m7446r(int i) {
        return i & 24;
    }

    /* renamed from: s */
    static int m7447s(int i) {
        return m7444o(i, 0, 0, 0);
    }

    /* renamed from: w */
    static int m7448w(int i) {
        return i & 3584;
    }

    /* renamed from: F */
    void mo6871F(a aVar);

    /* renamed from: J */
    int mo6872J();

    /* renamed from: a */
    int mo7449a(C2181a c2181a);

    /* renamed from: f */
    int mo6888f();

    String getName();

    /* renamed from: h */
    void mo6889h();
}
