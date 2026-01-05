package p001o;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class vjg {
    /* renamed from: a */
    public static String m52893a(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return pnd.m43910a("|", arrayList);
    }

    /* renamed from: b */
    public static boolean m52894b(int i, int i2) {
        return (i & i2) == i2;
    }
}
