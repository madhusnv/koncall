package mv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ex.InterfaceC2137a;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mv.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4888b implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f24403a;

    /* renamed from: b */
    public final /* synthetic */ Context f24404b;

    /* renamed from: c */
    public final /* synthetic */ w0 f24405c;

    public /* synthetic */ C4888b(Context context, w0 w0Var, int i10) {
        this.f24403a = i10;
        this.f24404b = context;
        this.f24405c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f24403a) {
            case 0:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context = this.f24404b;
                Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
                AbstractC4154l.m8922e(uriFromParts, "fromParts(...)");
                intent.setData(uriFromParts);
                context.startActivity(intent);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 1:
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context2 = this.f24404b;
                Uri uriFromParts2 = Uri.fromParts("package", context2.getPackageName(), null);
                AbstractC4154l.m8922e(uriFromParts2, "fromParts(...)");
                intent2.setData(uriFromParts2);
                context2.startActivity(intent2);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 2:
                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context3 = this.f24404b;
                Uri uriFromParts3 = Uri.fromParts("package", context3.getPackageName(), null);
                AbstractC4154l.m8922e(uriFromParts3, "fromParts(...)");
                intent3.setData(uriFromParts3);
                context3.startActivity(intent3);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            default:
                Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context4 = this.f24404b;
                Uri uriFromParts4 = Uri.fromParts("package", context4.getPackageName(), null);
                AbstractC4154l.m8922e(uriFromParts4, "fromParts(...)");
                intent4.setData(uriFromParts4);
                context4.startActivity(intent4);
                this.f24405c.setValue(Boolean.FALSE);
                break;
        }
        return a0.f30746a;
    }
}
