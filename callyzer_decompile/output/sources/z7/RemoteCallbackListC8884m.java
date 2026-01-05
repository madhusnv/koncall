package z7;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.m */
/* loaded from: classes.dex */
public final class RemoteCallbackListC8884m extends RemoteCallbackList {

    /* renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f42781a;

    public RemoteCallbackListC8884m(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f42781a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        InterfaceC8876e callback = (InterfaceC8876e) iInterface;
        AbstractC4154l.m8923f(callback, "callback");
        AbstractC4154l.m8923f(cookie, "cookie");
        this.f42781a.f2859b.remove((Integer) cookie);
    }
}
