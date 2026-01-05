package p001o;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC1782a;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public abstract class us5 {
    /* renamed from: e */
    public static /* synthetic */ void m51988e(DialogInterfaceC1782a.a aVar, ryh ryhVar) {
        aVar.mo3878k((CharSequence) ryhVar.f44265a, (DialogInterface.OnClickListener) ryhVar.f44266b);
    }

    /* renamed from: f */
    public static /* synthetic */ void m51989f(DialogInterfaceC1782a.a aVar, ryh ryhVar) {
        aVar.mo3874g((CharSequence) ryhVar.f44265a, (DialogInterface.OnClickListener) ryhVar.f44266b);
    }

    /* renamed from: g */
    public static /* synthetic */ void m51990g(DialogInterfaceC1782a.a aVar, ryh ryhVar) {
        aVar.mo3875h((CharSequence) ryhVar.f44265a, (DialogInterface.OnClickListener) ryhVar.f44266b);
    }

    /* renamed from: h */
    public static /* synthetic */ void m51991h(DialogInterfaceC1782a.a aVar, ryh ryhVar) {
        aVar.mo3876i((DialogInterface.OnCancelListener) ryhVar.f44266b);
    }

    /* renamed from: i */
    public static void m51992i(Context context, String str, String str2, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        final DialogInterfaceC1782a.a aVar = new DialogInterfaceC1782a.a(context);
        aVar.setTitle(str);
        aVar.mo3873f(str2);
        optional.ifPresent(new Consumer() { // from class: o.qs5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                us5.m51988e(aVar, (ryh) obj);
            }
        });
        optional2.ifPresent(new Consumer() { // from class: o.rs5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                us5.m51989f(aVar, (ryh) obj);
            }
        });
        optional3.ifPresent(new Consumer() { // from class: o.ss5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                us5.m51990g(aVar, (ryh) obj);
            }
        });
        optional4.ifPresent(new Consumer() { // from class: o.ts5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                us5.m51991h(aVar, (ryh) obj);
            }
        });
        aVar.create().show();
    }
}
