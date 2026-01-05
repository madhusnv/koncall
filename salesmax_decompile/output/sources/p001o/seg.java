package p001o;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class seg {

    /* renamed from: b */
    public static final Size f45325b = new Size(320, 240);

    /* renamed from: c */
    public static final Comparator f45326c = new nk3();

    /* renamed from: a */
    public final RepeatingStreamConstraintForVideoRecordingQuirk f45327a = (RepeatingStreamConstraintForVideoRecordingQuirk) zq5.m59712b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    /* renamed from: a */
    public Size[] m48285a(Size[] sizeArr) {
        if (this.f45327a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.m4620c()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f45326c.compare(size, f45325b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
