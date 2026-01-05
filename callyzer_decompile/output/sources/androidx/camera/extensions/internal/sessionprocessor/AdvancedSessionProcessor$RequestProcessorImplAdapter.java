package androidx.camera.extensions.internal.sessionprocessor;

import android.media.Image;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import i0.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import pg.z5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class AdvancedSessionProcessor$RequestProcessorImplAdapter implements RequestProcessorImpl {
    private final z1 mRequestProcessor;
    final /* synthetic */ AbstractC0230a this$0;

    public AdvancedSessionProcessor$RequestProcessorImplAdapter(AbstractC0230a abstractC0230a, z1 z1Var) {
        this.mRequestProcessor = z1Var;
    }

    public void abortCaptures() {
        throw null;
    }

    public void setImageProcessor(int i10, final ImageProcessorImpl imageProcessorImpl) {
        new Object(imageProcessorImpl) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageProcessorAdapter
            private final ImageProcessorImpl mImpl;

            {
                this.mImpl = imageProcessorImpl;
            }

            public void onNextImageAvailable(int i11, long j6, final InterfaceC0232c interfaceC0232c, String str) {
                this.mImpl.onNextImageAvailable(i11, j6, new ImageReferenceImpl(interfaceC0232c) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageReferenceImplAdapter
                    private final InterfaceC0232c mImageReference;

                    public boolean decrement() {
                        throw null;
                    }

                    public Image get() {
                        throw null;
                    }

                    public boolean increment() {
                        throw null;
                    }
                }, str);
            }
        };
        throw null;
    }

    public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
        new AdvancedSessionProcessor$RequestAdapter(request);
        new AdvancedSessionProcessor$CallbackAdapter(callback);
        throw null;
    }

    public void stopRepeating() {
        throw null;
    }

    public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
        z1 z1Var = this.mRequestProcessor;
        AdvancedSessionProcessor$RequestAdapter advancedSessionProcessor$RequestAdapter = new AdvancedSessionProcessor$RequestAdapter(request);
        AdvancedSessionProcessor$CallbackAdapter advancedSessionProcessor$CallbackAdapter = new AdvancedSessionProcessor$CallbackAdapter(callback);
        z5 z5Var = (z5) z1Var;
        z5Var.getClass();
        return z5Var.m11963b(Arrays.asList(advancedSessionProcessor$RequestAdapter), advancedSessionProcessor$CallbackAdapter);
    }

    public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
        ArrayList arrayList = new ArrayList();
        Iterator<RequestProcessorImpl.Request> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AdvancedSessionProcessor$RequestAdapter(it.next()));
        }
        return ((z5) this.mRequestProcessor).m11963b(arrayList, new AdvancedSessionProcessor$CallbackAdapter(callback));
    }
}
