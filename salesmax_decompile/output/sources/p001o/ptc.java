package p001o;

import java.util.function.Consumer;
import type.CreateUploadedFileInput;
import type.ScopeLevel;

/* loaded from: classes.dex */
public final /* synthetic */ class ptc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ CreateUploadedFileInput.Builder f40548a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f40548a.scopeLevel((ScopeLevel) obj);
    }
}
