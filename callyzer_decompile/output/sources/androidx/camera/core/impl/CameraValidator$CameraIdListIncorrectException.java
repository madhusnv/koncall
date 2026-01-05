package androidx.camera.core.impl;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CameraValidator$CameraIdListIncorrectException extends Exception {

    /* renamed from: a */
    public final int f1852a;

    public CameraValidator$CameraIdListIncorrectException(int i10, IllegalArgumentException illegalArgumentException) {
        super("Expected camera missing from device.", illegalArgumentException);
        this.f1852a = i10;
    }
}
