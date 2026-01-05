package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import i0.C3076g;
import i0.j1;
import i0.o1;
import i0.s0;
import i0.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v0.C7622f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class AdvancedSessionProcessor$RequestAdapter implements y1 {
    private final RequestProcessorImpl.Request mImplRequest;
    private final s0 mParameters;
    private final List<Integer> mTargetOutputConfigIds;
    private final int mTemplateId;

    public AdvancedSessionProcessor$RequestAdapter(RequestProcessorImpl.Request request) {
        this.mImplRequest = request;
        ArrayList arrayList = new ArrayList();
        Iterator it = request.getTargetOutputConfigIds().iterator();
        while (it.hasNext()) {
            arrayList.add((Integer) it.next());
        }
        this.mTargetOutputConfigIds = arrayList;
        j1 j1VarM7349b = j1.m7349b();
        for (CaptureRequest.Key key : request.getParameters().keySet()) {
            j1VarM7349b.m7352n(new C3076g("camera2.captureRequest.option." + key.getName(), Object.class, key), request.getParameters().get(key));
        }
        o1 o1VarM7399a = o1.m7399a(j1VarM7349b);
        C7622f c7622f = new C7622f();
        c7622f.f36778a = o1VarM7399a;
        this.mParameters = c7622f;
        this.mTemplateId = request.getTemplateId().intValue();
    }

    public RequestProcessorImpl.Request getImplRequest() {
        return this.mImplRequest;
    }

    public s0 getParameters() {
        return this.mParameters;
    }

    public List<Integer> getTargetOutputConfigIds() {
        return this.mTargetOutputConfigIds;
    }

    public int getTemplateId() {
        return this.mTemplateId;
    }
}
