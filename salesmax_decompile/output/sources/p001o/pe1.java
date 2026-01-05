package p001o;

import androidx.fragment.app.FragmentManager;
import pub.devrel.easypermissions.RationaleDialogFragmentCompat;

/* loaded from: classes6.dex */
public abstract class pe1 extends m3d {
    public pe1(Object obj) {
        super(obj);
    }

    @Override // p001o.m3d
    /* renamed from: j */
    public void mo37855j(String str, String str2, String str3, int i, int i2, String... strArr) {
        FragmentManager fragmentManagerMo40672m = mo40672m();
        if (fragmentManagerMo40672m.m0("RationaleDialogFragmentCompat") instanceof RationaleDialogFragmentCompat) {
            return;
        }
        RationaleDialogFragmentCompat.H0(str, str2, str3, i, i2, strArr).I0(fragmentManagerMo40672m, "RationaleDialogFragmentCompat");
    }

    /* renamed from: m */
    public abstract FragmentManager mo40672m();
}
