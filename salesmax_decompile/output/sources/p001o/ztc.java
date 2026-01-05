package p001o;

import java.util.function.Consumer;
import type.CreateUploadedFileInput;

/* loaded from: classes.dex */
public final /* synthetic */ class ztc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ CreateUploadedFileInput.Builder f57683a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f57683a.fileStorageDestination((String) obj);
    }
}
