package p001o;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class p2b {
    /* renamed from: a */
    public static void m42878a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m42879b(MediaFormat mediaFormat, ph3 ph3Var) {
        if (ph3Var != null) {
            m42881d(mediaFormat, "color-transfer", ph3Var.f40074c);
            m42881d(mediaFormat, "color-standard", ph3Var.f40072a);
            m42881d(mediaFormat, "color-range", ph3Var.f40073b);
            m42878a(mediaFormat, "hdr-static-info", ph3Var.f40075d);
        }
    }

    /* renamed from: c */
    public static void m42880c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: d */
    public static void m42881d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: e */
    public static void m42882e(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
