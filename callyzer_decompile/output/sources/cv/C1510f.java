package cv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1510f implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f7627a;

    /* renamed from: b */
    public final /* synthetic */ Context f7628b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f7629c;

    public /* synthetic */ C1510f(Context context, InterfaceC2137a interfaceC2137a, int i10) {
        this.f7627a = i10;
        this.f7628b = context;
        this.f7629c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f7627a) {
            case 0:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context = this.f7628b;
                Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
                AbstractC4154l.m8922e(uriFromParts, "fromParts(...)");
                intent.setData(uriFromParts);
                context.startActivity(intent);
                this.f7629c.invoke();
                break;
            default:
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context2 = this.f7628b;
                Uri uriFromParts2 = Uri.fromParts("package", context2.getPackageName(), null);
                AbstractC4154l.m8922e(uriFromParts2, "fromParts(...)");
                intent2.setData(uriFromParts2);
                context2.startActivity(intent2);
                this.f7629c.invoke();
                break;
        }
        return a0.f30746a;
    }
}
