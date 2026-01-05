package p021w;

import android.hardware.camera2.CameraDevice;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.n */
/* loaded from: classes.dex */
public abstract class AbstractC7848n {

    /* renamed from: a */
    public Object f37615a;

    /* renamed from: b */
    public final Object f37616b;

    public AbstractC7848n(CameraDevice cameraDevice, C7847m c7847m) {
        cameraDevice.getClass();
        this.f37615a = cameraDevice;
        this.f37616b = c7847m;
    }

    /* renamed from: a */
    public abstract int[] mo14830a(int i10);

    /* renamed from: b */
    public int[] m14831b(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f37616b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    /* renamed from: c */
    public String m14832c() {
        String str = (String) this.f37615a;
        if (str != null) {
            return str;
        }
        AbstractC4154l.m8928k(TextBundle.TEXT_ENTRY);
        throw null;
    }

    /* renamed from: d */
    public abstract int[] mo14833d(int i10);

    public AbstractC7848n() {
        this.f37616b = new int[2];
    }
}
