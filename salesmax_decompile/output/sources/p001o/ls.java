package p001o;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import pub.devrel.easypermissions.DialogFragmentC18787d;

/* loaded from: classes6.dex */
public class ls extends m3d {
    public ls(Activity activity) {
        super(activity);
    }

    @Override // p001o.m3d
    /* renamed from: a */
    public void mo37852a(int i, String... strArr) {
        mn.m39367g((Activity) m38239c(), strArr, i);
    }

    @Override // p001o.m3d
    /* renamed from: b */
    public Context mo37853b() {
        return (Context) m38239c();
    }

    @Override // p001o.m3d
    /* renamed from: i */
    public boolean mo37854i(String str) {
        return mn.m39371k((Activity) m38239c(), str);
    }

    @Override // p001o.m3d
    /* renamed from: j */
    public void mo37855j(String str, String str2, String str3, int i, int i2, String... strArr) {
        FragmentManager fragmentManager = ((Activity) m38239c()).getFragmentManager();
        if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof DialogFragmentC18787d) {
            return;
        }
        DialogFragmentC18787d.m60225a(str2, str3, str, i, i2, strArr).m60226b(fragmentManager, "RationaleDialogFragment");
    }
}
