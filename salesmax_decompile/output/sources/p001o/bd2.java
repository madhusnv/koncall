package p001o;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.k72;

/* loaded from: classes2.dex */
public abstract class bd2 {
    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m18628a(j72 j72Var) {
        if (j72Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m18629b(j72Var, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : n52.m40112a(arrayList);
    }

    /* renamed from: b */
    public static void m18629b(j72 j72Var, List list) {
        if (j72Var instanceof k72.C14722a) {
            Iterator it = ((k72.C14722a) j72Var).m35093e().iterator();
            while (it.hasNext()) {
                m18629b((j72) it.next(), list);
            }
        } else if (j72Var instanceof ad2) {
            list.add(((ad2) j72Var).m16893f());
        } else {
            list.add(new zc2(j72Var));
        }
    }
}
