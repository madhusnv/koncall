package p001o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public abstract class nf2 {
    /* renamed from: a */
    public static int[] m40434a(int[] iArr) {
        sq8.m48649h(iArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return iArr;
    }

    /* renamed from: b */
    public static final int m40435b(int[] iArr, int i) {
        return iArr[i + m40436c(iArr)];
    }

    /* renamed from: c */
    public static final int m40436c(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: d */
    public static final void m40437d(int[] iArr, int i, int i2) {
        iArr[i + m40436c(iArr)] = i2;
    }
}
