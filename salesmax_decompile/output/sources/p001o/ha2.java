package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class ha2 {
    /* renamed from: a */
    public static int m30028a(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (wja.m54634h("CameraOrientationUtil")) {
            wja.m54627a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)));
        }
        return i3;
    }

    /* renamed from: b */
    public static int m30029b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return Opcodes.GETFIELD;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}
