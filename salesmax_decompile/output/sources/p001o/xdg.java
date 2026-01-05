package p001o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes6.dex */
public class xdg extends pe1 {
    public xdg(Fragment fragment) {
        super(fragment);
    }

    @Override // p001o.m3d
    /* renamed from: a */
    public void mo37852a(int i, String... strArr) {
        ((Fragment) m38239c()).requestPermissions(strArr, i);
    }

    @Override // p001o.m3d
    /* renamed from: b */
    public Context mo37853b() {
        return ((Fragment) m38239c()).getActivity();
    }

    @Override // p001o.m3d
    /* renamed from: i */
    public boolean mo37854i(String str) {
        return ((Fragment) m38239c()).shouldShowRequestPermissionRationale(str);
    }

    @Override // p001o.pe1
    /* renamed from: m */
    public FragmentManager mo40672m() {
        return ((Fragment) m38239c()).getChildFragmentManager();
    }
}
