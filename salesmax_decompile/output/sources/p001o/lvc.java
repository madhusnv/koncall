package p001o;

import java.util.function.Consumer;
import type.UpdateUploadedFileInput;

/* loaded from: classes.dex */
public final /* synthetic */ class lvc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ UpdateUploadedFileInput.Builder f34425a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f34425a.uploadSource((String) obj);
    }
}
