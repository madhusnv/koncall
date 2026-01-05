package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import z7.BinderC8883l;
import z7.RemoteCallbackListC8884m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    public int f2858a;

    /* renamed from: b */
    public final LinkedHashMap f2859b = new LinkedHashMap();

    /* renamed from: c */
    public final RemoteCallbackListC8884m f2860c = new RemoteCallbackListC8884m(this);

    /* renamed from: d */
    public final BinderC8883l f2861d = new BinderC8883l(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC4154l.m8923f(intent, "intent");
        return this.f2861d;
    }
}
