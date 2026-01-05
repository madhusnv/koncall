package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.amplifyframework.core.C10546R;
import com.amplifyframework.devmenu.DevMenuMainFragment;
import p001o.fsb;

/* loaded from: classes5.dex */
public final class DevMenuMainFragment extends Fragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$0(View view) {
        fsb.m27448c(view).m8603T(C10546R.id.show_env_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$1(View view) {
        fsb.m27448c(view).m8603T(C10546R.id.show_device_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$2(View view) {
        fsb.m27448c(view).m8603T(C10546R.id.show_logs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$3(View view) {
        fsb.m27448c(view).m8603T(C10546R.id.show_file_issue);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C10546R.layout.dev_menu_fragment_main, viewGroup, false);
        viewInflate.findViewById(C10546R.id.env_button).setOnClickListener(new View.OnClickListener() { // from class: o.eq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevMenuMainFragment.lambda$onCreateView$0(view);
            }
        });
        viewInflate.findViewById(C10546R.id.device_button).setOnClickListener(new View.OnClickListener() { // from class: o.fq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevMenuMainFragment.lambda$onCreateView$1(view);
            }
        });
        viewInflate.findViewById(C10546R.id.logs_button).setOnClickListener(new View.OnClickListener() { // from class: o.gq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevMenuMainFragment.lambda$onCreateView$2(view);
            }
        });
        viewInflate.findViewById(C10546R.id.file_issue_button).setOnClickListener(new View.OnClickListener() { // from class: o.hq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevMenuMainFragment.lambda$onCreateView$3(view);
            }
        });
        return viewInflate;
    }
}
