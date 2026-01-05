package fk;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C2310p implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f10465a;

    /* renamed from: b */
    public final /* synthetic */ Context f10466b;

    public /* synthetic */ C2310p(Context context, int i10) {
        this.f10465a = i10;
        this.f10466b = context;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f10465a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                Context context = this.f10466b;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 4:
                Context context2 = this.f10466b;
                Toast.makeText(context2, context2.getString(R.string.no_application_to_open_file), 0).show();
                break;
            case 5:
                Context context3 = this.f10466b;
                Toast.makeText(context3, context3.getString(R.string.add_contacts_less_2_warning), 0).show();
                break;
            case 6:
                Context context4 = this.f10466b;
                Toast.makeText(context4, context4.getString(R.string.no_application_to_open_file), 0).show();
                break;
            default:
                Context context5 = this.f10466b;
                Toast.makeText(context5, context5.getString(R.string.no_application_to_open_file), 0).show();
                break;
        }
        return qw.a0.f30746a;
    }
}
