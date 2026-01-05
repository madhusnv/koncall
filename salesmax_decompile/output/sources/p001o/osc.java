package p001o;

import java.util.function.Consumer;
import type.ScopeLevel;
import type.UpdateUploadedFileInput;

/* loaded from: classes.dex */
public final /* synthetic */ class osc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ UpdateUploadedFileInput.Builder f38825a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f38825a.scopeLevel((ScopeLevel) obj);
    }
}
