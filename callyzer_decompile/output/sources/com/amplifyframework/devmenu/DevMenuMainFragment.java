package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.support.v4.media.session.AbstractC0222a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j0;
import com.amplifyframework.core.C1183R;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DevMenuMainFragment extends j0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$0(View view) {
        AbstractC0222a.m549b(view).m9186d(C1183R.id.show_env_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$1(View view) {
        AbstractC0222a.m549b(view).m9186d(C1183R.id.show_device_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$2(View view) {
        AbstractC0222a.m549b(view).m9186d(C1183R.id.show_logs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$3(View view) {
        AbstractC0222a.m549b(view).m9186d(C1183R.id.show_file_issue);
    }

    @Override // androidx.fragment.app.j0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i10 = 0;
        View viewInflate = layoutInflater.inflate(C1183R.layout.dev_menu_fragment_main, viewGroup, false);
        viewInflate.findViewById(C1183R.id.env_button).setOnClickListener(new View.OnClickListener() { // from class: com.amplifyframework.devmenu.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        DevMenuMainFragment.lambda$onCreateView$0(view);
                        break;
                    case 1:
                        DevMenuMainFragment.lambda$onCreateView$1(view);
                        break;
                    case 2:
                        DevMenuMainFragment.lambda$onCreateView$2(view);
                        break;
                    default:
                        DevMenuMainFragment.lambda$onCreateView$3(view);
                        break;
                }
            }
        });
        final int i11 = 1;
        viewInflate.findViewById(C1183R.id.device_button).setOnClickListener(new View.OnClickListener() { // from class: com.amplifyframework.devmenu.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        DevMenuMainFragment.lambda$onCreateView$0(view);
                        break;
                    case 1:
                        DevMenuMainFragment.lambda$onCreateView$1(view);
                        break;
                    case 2:
                        DevMenuMainFragment.lambda$onCreateView$2(view);
                        break;
                    default:
                        DevMenuMainFragment.lambda$onCreateView$3(view);
                        break;
                }
            }
        });
        final int i12 = 2;
        viewInflate.findViewById(C1183R.id.logs_button).setOnClickListener(new View.OnClickListener() { // from class: com.amplifyframework.devmenu.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        DevMenuMainFragment.lambda$onCreateView$0(view);
                        break;
                    case 1:
                        DevMenuMainFragment.lambda$onCreateView$1(view);
                        break;
                    case 2:
                        DevMenuMainFragment.lambda$onCreateView$2(view);
                        break;
                    default:
                        DevMenuMainFragment.lambda$onCreateView$3(view);
                        break;
                }
            }
        });
        final int i13 = 3;
        viewInflate.findViewById(C1183R.id.file_issue_button).setOnClickListener(new View.OnClickListener() { // from class: com.amplifyframework.devmenu.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        DevMenuMainFragment.lambda$onCreateView$0(view);
                        break;
                    case 1:
                        DevMenuMainFragment.lambda$onCreateView$1(view);
                        break;
                    case 2:
                        DevMenuMainFragment.lambda$onCreateView$2(view);
                        break;
                    default:
                        DevMenuMainFragment.lambda$onCreateView$3(view);
                        break;
                }
            }
        });
        return viewInflate;
    }
}
