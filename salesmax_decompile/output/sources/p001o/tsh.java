package p001o;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;
import p001o.cd2;
import p001o.d72;

/* loaded from: classes2.dex */
public class tsh {

    /* renamed from: a */
    public final boolean f47676a;

    public tsh() {
        this.f47676a = zq5.m59712b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    /* renamed from: a */
    public cd2 m50438a(cd2 cd2Var) {
        cd2.C12638a c12638a = new cd2.C12638a();
        c12638a.m20911t(cd2Var.m20889k());
        Iterator it = cd2Var.m20887i().iterator();
        while (it.hasNext()) {
            c12638a.m20899f((yj5) it.next());
        }
        c12638a.m20898e(cd2Var.m20885g());
        d72.C12801a c12801a = new d72.C12801a();
        c12801a.m22395f(CaptureRequest.FLASH_MODE, 0);
        c12638a.m20898e(c12801a.m22392c());
        return c12638a.m20901h();
    }

    /* renamed from: b */
    public boolean m50439b(List list, boolean z) {
        if (!this.f47676a || !z) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
