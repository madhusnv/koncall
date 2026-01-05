package p001o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public abstract class wwf {
    /* renamed from: a */
    public static final void m55303a(int[] iArr, ol8 ol8Var) {
        sq8.m48649h(ol8Var, "diagonals");
        if (!m55308f(iArr)) {
            ol8Var.m42384g(m55310h(iArr), m55311i(iArr), m55306d(iArr) - m55310h(iArr));
            return;
        }
        if (m55309g(iArr)) {
            ol8Var.m42384g(m55310h(iArr), m55311i(iArr), m55305c(iArr));
        } else if (m55312j(iArr)) {
            ol8Var.m42384g(m55310h(iArr), m55311i(iArr) + 1, m55305c(iArr));
        } else {
            ol8Var.m42384g(m55310h(iArr) + 1, m55311i(iArr), m55305c(iArr));
        }
    }

    /* renamed from: b */
    public static int[] m55304b(int[] iArr) {
        sq8.m48649h(iArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return iArr;
    }

    /* renamed from: c */
    public static final int m55305c(int[] iArr) {
        return Math.min(m55306d(iArr) - m55310h(iArr), m55307e(iArr) - m55311i(iArr));
    }

    /* renamed from: d */
    public static final int m55306d(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: e */
    public static final int m55307e(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: f */
    public static final boolean m55308f(int[] iArr) {
        return m55307e(iArr) - m55311i(iArr) != m55306d(iArr) - m55310h(iArr);
    }

    /* renamed from: g */
    public static final boolean m55309g(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: h */
    public static final int m55310h(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: i */
    public static final int m55311i(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: j */
    public static final boolean m55312j(int[] iArr) {
        return m55307e(iArr) - m55311i(iArr) > m55306d(iArr) - m55310h(iArr);
    }
}
