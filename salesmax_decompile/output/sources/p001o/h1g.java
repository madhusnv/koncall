package p001o;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class h1g {

    /* renamed from: a */
    public final int f26101a;

    /* renamed from: b */
    public final int f26102b;

    /* renamed from: c */
    public final int f26103c;

    /* renamed from: d */
    public final int f26104d;

    /* renamed from: e */
    public final int f26105e;

    public h1g(int i, int i2, int i3, int i4, int i5) {
        this.f26101a = i;
        this.f26102b = i2;
        this.f26103c = i3;
        this.f26104d = i4;
        this.f26105e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h1g m29751a(String str) {
        op0.m42511a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strM35995e = kp0.m35995e(strArrSplit[i5].trim());
            strM35995e.hashCode();
            switch (strM35995e) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new h1g(i, i2, i3, i4, strArrSplit.length);
    }
}
