package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.amplifyframework.core.C10546R;

/* loaded from: classes5.dex */
public final class DevMenuDeviceFragment extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C10546R.layout.dev_menu_fragment_device, viewGroup, false);
        ((TextView) viewInflate.findViewById(C10546R.id.device_info_text)).setText(new DeviceInfo().toString());
        return viewInflate;
    }
}
