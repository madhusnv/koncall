package p001o;

import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* loaded from: classes2.dex */
public final class rmb {

    /* renamed from: a */
    public final long f43811a;

    /* renamed from: b */
    public final List f43812b;

    /* renamed from: o.rmb$a */
    public static final class C16627a {

        /* renamed from: a */
        public final String f43813a;

        /* renamed from: b */
        public final String f43814b;

        /* renamed from: c */
        public final long f43815c;

        /* renamed from: d */
        public final long f43816d;

        public C16627a(String str, String str2, long j, long j2) {
            this.f43813a = str;
            this.f43814b = str2;
            this.f43815c = j;
            this.f43816d = j2;
        }
    }

    public rmb(long j, List list) {
        this.f43811a = j;
        this.f43812b = list;
    }

    /* renamed from: a */
    public MotionPhotoMetadata m46981a(long j) {
        long j2;
        if (this.f43812b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f43812b.size() - 1; size >= 0; size--) {
            C16627a c16627a = (C16627a) this.f43812b.get(size);
            boolean zEquals = "video/mp4".equals(c16627a.f43813a) | z;
            if (size == 0) {
                j3 -= c16627a.f43816d;
                j2 = 0;
            } else {
                j2 = j3 - c16627a.f43815c;
            }
            long j8 = j3;
            j3 = j2;
            if (!zEquals || j3 == j8) {
                z = zEquals;
            } else {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.f43811a, j6, j7);
    }
}
