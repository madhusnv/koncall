package p001o;

import java.util.function.Consumer;
import type.UpdateUploadedFileInput;

/* loaded from: classes.dex */
public final /* synthetic */ class wsc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ UpdateUploadedFileInput.Builder f52618a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f52618a.fileMimeType((String) obj);
    }
}
