package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.j0;
import com.amplifyframework.core.C1183R;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DevMenuDeviceFragment extends j0 {
    @Override // androidx.fragment.app.j0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C1183R.layout.dev_menu_fragment_device, viewGroup, false);
        ((TextView) viewInflate.findViewById(C1183R.id.device_info_text)).setText(new DeviceInfo().toString());
        return viewInflate;
    }
}
